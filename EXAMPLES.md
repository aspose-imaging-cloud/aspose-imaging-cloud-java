### Imaging - Convert to another format (other operations are similar to use)
```java
// optional parameters are base URL, API version, authentication type and debug mode
// default base URL is https://api.aspose.cloud/
// default API version is v2
// default authentication type is OAuth2.0
// default debug mode is false
ImagingApi imagingApi = new ImagingApi("yourAppKey", "yourAppSID");

// this GET request converts image files
// nullable parameters are output file path, input file folder and Aspose storage name (if you have more than one storage and want to use non-default one) 
// if output file path is not set, resulting image is returned in a stream; otherwise, it's saved at the specified path in the storage and null is returned
GetImageSaveAsRequest getSaveRequest = new GetImageSaveAsRequest("inputImage.jpg", "png", "ResultFolder/resultImage.png", "InputFolder", null);

// returns ApiResponse with null response data value, saves result to storage
imagingApi.getImageSaveAs(getSaveRequest);

GetImageSaveAsRequest getStreamRequest = new GetImageSaveAsRequest("inputImage.jpg", "png", null, "InputFolder", null);

// returns ApiResponse with resulting image bytes
ApiResponse apiResponse = imagingApi.getImageSaveAs(getStreamRequest);

// process resulting bytes
byte[] responseData = apiResponse.getResponseData();

// another option is to use POST request and send image in a stream, if it's not present in your storage

InputStream inputStream = null;
byte[] inputBytes = null;
try
{
	File inputFile = new File("D:\\test\\localInputImage.jpg");
	inputBytes = new byte[(int) inputFile.length()];
	inputStream = new FileInputStream(inputFile);
	inputStream.read(inputBytes);
}
finally
{
	if (inputStream != null)
	{
		inputStream.close();
	}
}

PostImageSaveAsRequest postSaveRequest = new PostImageSaveAsRequest(inputBytes, "png", "ResultFolder/resultImage.png", null);
	
// returns ApiResponse with null response data value, saves result to storage
imagingApi.postImageSaveAs(postSaveRequest);

PostImageSaveAsRequest postStreamRequest = new PostImageSaveAsRequest(inputBytes, "png", null, null);
	
// returns ApiResponse with resulting image bytes
apiResponse = imagingApi.postImageSaveAs(postStreamRequest);

// process resulting bytes
responseData = apiResponse.getResponseData();

// another requests typically follow the same principles
```

### Imaging.AI - Compare two images
```java
// optional parameters are base URL, API version, authentication type and debug mode
// default base URL is https://api.aspose.cloud/
// default API version is v2
// default authentication type is OAuth2.0
// default debug mode is false
ImagingApi imagingApi = new ImagingApi("yourAppKey", "yourAppSID");
	 
// create search context or use existing search context ID if search context was created earlier
ApiResponse apiResponse = imagingApi.postCreateSearchContext(new PostCreateSearchContextRequest(null, null, null, null));
SearchContextStatus status = (SearchContextStatus) apiResponse.getSaaSposeResponse();
String searchContextId = status.getId();
	 
// specify images for comparing (image ID is a path to image in storage)
String imageInStorage1 = "WorkFolder/Image1.jpg";
String imageInStorage2 = "WorkFolder/Image2.jpg";
	  
// compare images
ApiResponse response = imagingApi.postSearchContextCompareImages(
            new PostSearchContextCompareImagesRequest(searchContextId, imageInStorage1, null, imageInStorage2, null, null));
SearchResultsSet result = (SearchResultsSet)response.getSaaSposeResponse();
Double similarity = result.getResults().get(0).getSimilarity();
```

### Imaging.AI - Find similar images
```java
// optional parameters are base URL, API version, authentication type and debug mode
// default base URL is https://api.aspose.cloud/
// default API version is v2
// default authentication type is OAuth2.0
// default debug mode is false
ImagingApi imagingApi = new ImagingApi("yourAppKey", "yourAppSID");
	 
// create search context or use existing search context ID if search context was created earlier
ApiResponse apiResponse = imagingApi.postCreateSearchContext(new PostCreateSearchContextRequest(null, null, null, null));
SearchContextStatus status = (SearchContextStatus) apiResponse.getSaaSposeResponse();
String searchContextId = status.getId();
	 
// extract images features if it was not done before
imagingApi.postSearchContextExtractImageFeatures(new PostSearchContextExtractImageFeaturesRequest(
		searchContextId, null, null, "WorkFolder", null, null));
	 
// wait 'till image features extraction is completed
String searchStatus = "unknown";
while (!"Idle".equalsIgnoreCase(searchStatus)) {
	ApiResponse response = imagingApi.getSearchContextStatus(
			new GetSearchContextStatusRequest(searchContextId, null, null));
	SearchContextStatus contextStatus = (SearchContextStatus) response.getSaaSposeResponse();
	searchStatus = contextStatus.getSearchStatus();
	Thread.sleep(10000);
}
	
Boolean imageFromStorage = true;
	 
SearchResultsSet results;
if (imageFromStorage)
{
    // use search image from storage
    String storageImageId = "searhImage.jpg";
    results = (SearchResultsSet) imagingApi.getSearchContextFindSimilar(
        new GetSearchContextFindSimilarRequest(searchContextId, 90.0, 5, null, storageImageId, null, null)).getSaaSposeResponse();
}
else
{
		
	// load search image as a stream
	FileInputStream inputStream = null;
	try
	{
		File inputFile = new File("D:\\test\\localInputImage.jpg");
		byte[] inputBytes = new byte[(int) inputFile.length()];
		inputStream = new FileInputStream(inputFile);
		inputStream.read(inputBytes);
		results = (SearchResultsSet) imagingApi.getSearchContextFindSimilar(
			       new GetSearchContextFindSimilarRequest(searchContextId, 90.0, 5, inputBytes, null, null, null)).getSaaSposeResponse();
	}
	finally
	{
		if (inputStream != null)
		{
			inputStream.close();
		}
	}
}
	             
// process search results
for (SearchResult searchResult : results.getResults())
{
	System.out.println("ImageName: " + searchResult.getImageId() + ", Similarity: " + searchResult.getSimilarity());
}
```

### Imaging.AI - Find duplicate images
```java
// optional parameters are base URL, API version, authentication type and debug mode
// default base URL is https://api.aspose.cloud/
// default API version is v2
// default authentication type is OAuth2.0
// default debug mode is false
ImagingApi imagingApi = new ImagingApi("yourAppKey", "yourAppSID");
	 
// create search context or use existing search context ID if search context was created earlier
ApiResponse apiResponse = imagingApi.postCreateSearchContext(new PostCreateSearchContextRequest(null, null, null, null));
SearchContextStatus status = (SearchContextStatus) apiResponse.getSaaSposeResponse();
String searchContextId = status.getId();
	 
// extract images features if it was not done before
imagingApi.postSearchContextExtractImageFeatures(new PostSearchContextExtractImageFeaturesRequest(
		searchContextId, null, null, "WorkFolder", null, null));
	 
// wait 'till image features extraction is completed
String searchStatus = "unknown";
while (!"Idle".equalsIgnoreCase(searchStatus)) {
	ApiResponse response = imagingApi.getSearchContextStatus(
			new GetSearchContextStatusRequest(searchContextId, null, null));
	SearchContextStatus contextStatus = (SearchContextStatus) response.getSaaSposeResponse();
	searchStatus = contextStatus.getSearchStatus();
	Thread.sleep(10000);
}  

// request finding duplicates
ApiResponse response = imagingApi.getSearchContextFindDuplicates(
    new GetSearchContextFindDuplicatesRequest(searchContextId, 90.0, null, null));
ImageDuplicatesSet result = (ImageDuplicatesSet)response.getSaaSposeResponse();

for (ImageDuplicates duplicates : result.getDuplicates())
{
	System.out.println("Duplicates:");
	for (SearchResult duplicate : duplicates.getDuplicateImages())
	{ 
		System.out.println("ImageName: " + duplicate.getImageId() + ", Similarity: " + duplicate.getSimilarity());
	}
}
```

### Imaging.AI - Search images by tags
```java
// optional parameters are base URL, API version, authentication type and debug mode
// default base URL is https://api.aspose.cloud/
// default API version is v2
// default authentication type is OAuth2.0
// default debug mode is false
ImagingApi imagingApi = new ImagingApi("yourAppKey", "yourAppSID");
	 
// create search context or use existing search context ID if search context was created earlier
ApiResponse apiResponse = imagingApi.postCreateSearchContext(new PostCreateSearchContextRequest(null, null, null, null));
SearchContextStatus status = (SearchContextStatus) apiResponse.getSaaSposeResponse();
String searchContextId = status.getId();
 
// extract images features if it was not done before
imagingApi.postSearchContextExtractImageFeatures(new PostSearchContextExtractImageFeaturesRequest(
		searchContextId, null, null, "WorkFolder", null, null));
	 
// wait 'till image features extraction is completed
String searchStatus = "unknown";
while (!"Idle".equalsIgnoreCase(searchStatus)) {
	ApiResponse response = imagingApi.getSearchContextStatus(
			new GetSearchContextStatusRequest(searchContextId, null, null));
	SearchContextStatus contextStatus = (SearchContextStatus) response.getSaaSposeResponse();
	searchStatus = contextStatus.getSearchStatus();
	Thread.sleep(10000);
}  
 
String tag = "MyTag";
	
// load tag image as a stream
FileInputStream inputStream = null;
try
{
	File inputFile = new File("D:\\test\\localInputImage.jpg");
	byte[] inputBytes = new byte[(int) inputFile.length()];
	inputStream = new FileInputStream(inputFile);
	inputStream.read(inputBytes);
	imagingApi.postSearchContextAddTag(
		       new PostSearchContextAddTagRequest(inputBytes, searchContextId, tag, null, null));
}
finally
{
	if (inputStream != null)
	{
		inputStream.close();
	}
}
	
// serialize search tags collection to JSON
List<String> tagsList = new ArrayList<String>();
tagsList.add(tag);
String tags = new Gson().toJson(tagsList);
	 
// search images by tags
ApiResponse response = imagingApi.postSearchContextFindByTags(
	new PostSearchContextFindByTagsRequest(tags, searchContextId, 90.0, 10, null, null));
SearchResultsSet result = (SearchResultsSet)response.getSaaSposeResponse(); 
    
// process search results
for (SearchResult searchResult : result.getResults())
{
	System.out.println("ImageName: " + searchResult.getImageId() + ", Similarity: " + searchResult.getSimilarity());
}
```

### Imaging.AI - Delete search context
```java
// search context is stored in the storage, and in case if search context is not needed anymore it should be removed
imagingApi.deleteSearchContext(new DeleteSearchContextRequest(searchContextId, null, null));
```
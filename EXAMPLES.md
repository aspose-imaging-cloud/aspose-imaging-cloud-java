### Imaging - Save as: convert image from storage to another format
```java
// optional parameters are base URL, API version and debug mode
ImagingApi imagingApi = new ImagingApi("yourAppKey", "yourAppSID");

try {
    // get local image
    File testFile = new File("test.png");
    FileInputStream localInputImageStream = new FileInputStream(testFile);
    try {
        byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

        // upload local image to storage
        UploadFileRequest uploadFileRequest = 
            new UploadFileRequest("ExampleFolderNet/inputImage.png", localInputImage, null);
        FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
        // inspect result.getErrors() list if there were any
        // inspect result.getUploaded() list for uploaded file names
    } finally {
        if (localInputImageStream != null) {
            localInputImageStream.close();
        }
    }
    
    // convert image from storage to JPEG
    SaveImageAsRequest saveAsRequest = new SaveImageAsRequest("inputImage.png", "jpg",
        "ExampleFolderNet", null);

    byte[] convertedImage = imagingApi.saveImageAs(saveAsRequest);

    // process resulting image
    // for example, save it to storage
    UploadFileRequest uploadFileRequest = new UploadFileRequest("ExampleFolderNet/resultImage.jpg",
        convertedImage, null);
    FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
    // inspect result.getErrors() list if there were any
    // inspect result.getUploaded() list for uploaded file names
} finally {
    // remove files from storage
    imagingApi.deleteFile(
        new DeleteFileRequest("ExampleFolderNet/inputImage.png", null, null));
    imagingApi.deleteFile(
        new DeleteFileRequest("ExampleFolderNet/resultImage.jpg", null, null));
}

// other Imaging requests typically follow the same principles regarding stream/storage relations
```

### Imaging - Save as: convert image from stream to another format
```java
// optional parameters are base URL, API version and debug mode
ImagingApi imagingApi = new ImagingApi("yourAppKey", "yourAppSID");

try {
    // get local image
    File testFile = new File("test.png");
    FileInputStream localInputImageStream = new FileInputStream(testFile);
    byte[] localInputImage;
    try {
        localInputImage = IOUtils.toByteArray(localInputImageStream);
    } finally {
        if (localInputImageStream != null) {
            localInputImageStream.close();
        }
    }

    // convert image from request stream to JPEG and save it to storage
    // please, use outPath parameter for saving the result to storage
    CreateSavedImageAsRequest saveAsToStorageRequest = 
        new CreateSavedImageAsRequest(localInputImage, "jpg", 
        "ExampleFolderNet/resultImage.png", null);

    imagingApi.createSavedImageAs(saveAsToStorageRequest);

    // download saved image from storage and process it
    byte[] savedFile = imagingApi.downloadFile(
        new DownloadFileRequest("ExampleFolderNet/resultImage.jpg", null, null));

    // convert image from request stream to JPEG and read it from resulting stream
    // please, set outPath parameter as null to return result in request stream
    // instead of saving to storage
    CreateSavedImageAsRequest saveAsToStreamRequest = 
        new CreateSavedImageAsRequest(localInputImage, "jpg", null, null);

    // process resulting image from response stream
    byte[] convertedImage = imagingApi.createSavedImageAs(saveAsToStreamRequest);
} finally {
    // remove file from storage
    imagingApi.deleteFile(
        new DeleteFileRequest("ExampleFolderNet/resultImage.jpg", null, null));
}

// other Imaging requests typically follow the same principles regarding stream/storage relations
```

### Imaging - Apply a filter to an image
```java
ImagingApi imagingApi = new ImagingApi("yourAppKey", "yourAppSID");

// set the filter properties
FilterPropertiesBase filterProperties = new GaussianBlurFilterProperties()
{{
    setRadius(2);
    setSigma(0.5);
}};

// apply the filter to the image and obtain the result
byte[] filteredImage = ImagingApi.filterEffectImage(
    new FilterEffectImageRequest(name, format, "GaussianBlur", filter, folder, storage));
```

### Imaging.AI - Compare two images
```java
ImagingApi imagingApi = new ImagingApi("yourAppKey", "yourAppSID");
     
// create search context or use existing search context ID if search context was created earlier
SearchContextStatus status = imagingApi.createImageSearch(
    new CreateImageSearchRequest(null, null, null, null));
String searchContextId = status.getId();
     
// specify images for comparing (image ID is a path to image in storage)
String imageInStorage1 = "WorkFolder/Image1.jpg";
String imageInStorage2 = "WorkFolder/Image2.jpg";
      
// compare images
SearchResultsSet result = imagingApi.compareImages(
    new CompareImagesRequest(
    searchContextId, imageInStorage1, null, imageInStorage2, null, null));
Double similarity = result.getResults().get(0).getSimilarity();
```

### Imaging.AI - Find similar images
```java
ImagingApi imagingApi = new ImagingApi("yourAppKey", "yourAppSID");
     
// create search context or use existing search context ID if search context was created earlier
SearchContextStatus status = imagingApi.createImageSearch(
    new CreateImageSearchRequest(null, null, null, null));
String searchContextId = status.getId();
     
// extract images features if it was not done before
imagingApi.createImageFeatures(new CreateImageFeaturesRequest(
    searchContextId, null, null, "WorkFolder", null, null));
     
// wait 'till image features extraction is completed
String searchStatus = "unknown";
while (!"Idle".equalsIgnoreCase(searchStatus)) {
    SearchContextStatus contextStatus = imagingApi.getImageSearchStatus(
        new GetImageSearchStatusRequest(searchContextId, null, null));
    searchStatus = contextStatus.getSearchStatus();
    Thread.sleep(10000);
}
    
Boolean imageFromStorage = true;
     
SearchResultsSet results;
if (imageFromStorage)
{
    // use search image from storage
    String storageImageId = "searhImage.jpg";
    results = imagingApi.findSimilarImages(
        new FindSimilarImagesRequest(
        searchContextId, 90.0, 5, null, storageImageId, null, null));
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
        results = imagingApi.findSimilarImages(
           new FindSimilarImagesRequest(
           searchContextId, 90.0, 5, inputBytes, null, null, null));
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
    System.out.println("ImageName: " + searchResult.getImageId() + 
        ", Similarity: " + searchResult.getSimilarity());
}
```

### Imaging.AI - Find duplicate images
```java
ImagingApi imagingApi = new ImagingApi("yourAppKey", "yourAppSID");
     
// create search context or use existing search context ID if search context was created earlier
SearchContextStatus status = imagingApi.createImageSearch(
    new CreateImageSearchRequest(null, null, null, null));
String searchContextId = status.getId();
     
// extract images features if it was not done before
imagingApi.createImageFeatures(
    new CreateImageFeaturesRequest(
    searchContextId, null, null, "WorkFolder", null, null));
     
// wait 'till image features extraction is completed
String searchStatus = "unknown";
while (!"Idle".equalsIgnoreCase(searchStatus)) {
    SearchContextStatus contextStatus = imagingApi.getImageSearchStatus(
        new GetImageSearchStatusRequest(searchContextId, null, null));
    searchStatus = contextStatus.getSearchStatus();
    Thread.sleep(10000);
}  

// request finding duplicates
ImageDuplicatesSet result = imagingApi.findImageDuplicates(
    new FindImageDuplicatesRequest(searchContextId, 90.0, null, null));

for (ImageDuplicates duplicates : result.getDuplicates())
{
    System.out.println("Duplicates:");
    for (SearchResult duplicate : duplicates.getDuplicateImages())
    { 
        System.out.println("ImageName: " + duplicate.getImageId() + 
            ", Similarity: " + duplicate.getSimilarity());
    }
}
```

### Imaging.AI - Search images by tags
```java
ImagingApi imagingApi = new ImagingApi("yourAppKey", "yourAppSID");
     
// create search context or use existing search context ID if search context was created earlier
SearchContextStatus status = imagingApi.createImageSearch(
    new CreateImageSearchRequest(null, null, null, null));
String searchContextId = status.getId();
 
// extract images features if it was not done before
imagingApi.createImageFeatures(new CreateImageFeaturesRequest(
    searchContextId, null, null, "WorkFolder", null, null));
     
// wait 'till image features extraction is completed
String searchStatus = "unknown";
while (!"Idle".equalsIgnoreCase(searchStatus)) {
    SearchContextStatus contextStatus = imagingApi.getImageSearchStatus(
        new GetImageSearchStatusRequest(searchContextId, null, null));
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
    imagingApi.createImageTag(
       new CreateImageTagRequest(inputBytes, searchContextId, tag, null, null));
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
SearchResultsSet result = imagingApi.findImagesByTags(
    new FindImagesByTagsRequest(tags, searchContextId, 90.0, 10, null, null));
    
// process search results
for (SearchResult searchResult : result.getResults())
{
    System.out.println("ImageName: " + searchResult.getImageId() + 
        ", Similarity: " + searchResult.getSimilarity());
}
```

### Imaging.AI - Delete search context
```java
// search context is stored in the storage, and in case if search context is not needed anymore it should be removed
imagingApi.deleteImageSearch(
    new DeleteImageSearchRequest(searchContextId, null, null));
```

### Exception handling and error codes
```java
try
{
    imagingApi.deleteImageSearch(
        new DeleteImageSearchRequest(searchContextId, null, null));
}
catch (ApiException ex) 
{
    System.out.println(ex.getErrorCode());
    System.out.println(ex.getMessage());
    // inspect ex.getApiError()
}
```
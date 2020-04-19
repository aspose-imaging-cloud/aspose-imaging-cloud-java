# com.aspose.imaging.cloud.sdk.api.ImagingApi

<a name="addSearchImage"></a>
## **addSearchImage**
> void addSearchImage(AddSearchImageRequest request)

Add image and images features to search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.

### **AddSearchImageRequest** Parameters
```java
AddSearchImageRequest(
    String searchContextId, 
    String imageId, 
    byte[] imageData, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| Search context identifier. |
 **imageId** | **String**| Image identifier. |
 **imageData** | **byte[]**| Input image | [optional]
 **folder** | **String**| Folder. | [optional]
 **storage** | **String**| Storage | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="appendTiff"></a>
## **appendTiff**
> void appendTiff(AppendTiffRequest request)

Appends existing TIFF image to another existing TIFF image (i.e. merges TIFF images).

### **AppendTiffRequest** Parameters
```java
AppendTiffRequest(
    String name, 
    String appendFile, 
    String storage, 
    String folder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Original image file name. |
 **appendFile** | **String**| Image file name to be appended to original one. |
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]
 **folder** | **String**| Folder with images to process. | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="compareImages"></a>
## **compareImages**
> [SearchResultsSet](SearchResultsSet.md) compareImages(CompareImagesRequest request)

Compare two images. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.

### **CompareImagesRequest** Parameters
```java
CompareImagesRequest(
    String searchContextId, 
    String imageId1, 
    byte[] imageData, 
    String imageId2, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| The search context identifier. |
 **imageId1** | **String**| The first image Id in storage. |
 **imageData** | **byte[]**| Input image | [optional]
 **imageId2** | **String**| The second image Id in storage or null (if image loading in request). | [optional]
 **folder** | **String**| The folder. | [optional]
 **storage** | **String**| The storage. | [optional]

### Return type

[**SearchResultsSet**](SearchResultsSet.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="convertTiffToFax"></a>
## **convertTiffToFax**
> byte[] convertTiffToFax(ConvertTiffToFaxRequest request)

Update parameters of existing TIFF image accordingly to fax parameters.

### **ConvertTiffToFaxRequest** Parameters
```java
ConvertTiffToFaxRequest(
    String name, 
    String storage, 
    String folder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]
 **folder** | **String**| Folder with image to process. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="copyFile"></a>
## **copyFile**
> void copyFile(CopyFileRequest request)

Copy file

### **CopyFileRequest** Parameters
```java
CopyFileRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/folder/file.ext&#39; |
 **destPath** | **String**| Destination file path |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to copy | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="copyFolder"></a>
## **copyFolder**
> void copyFolder(CopyFolderRequest request)

Copy folder

### **CopyFolderRequest** Parameters
```java
CopyFolderRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source folder path e.g. &#39;/src&#39; |
 **destPath** | **String**| Destination folder path e.g. &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createCroppedImage"></a>
## **createCroppedImage**
> byte[] createCroppedImage(CreateCroppedImageRequest request)

Crop an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateCroppedImageRequest** Parameters
```java
CreateCroppedImageRequest(
    byte[] imageData, 
    Integer x, 
    Integer y, 
    Integer width, 
    Integer height, 
    String format, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **x** | **Integer**| X position of start point for cropping rectangle. |
 **y** | **Integer**| Y position of start point for cropping rectangle. |
 **width** | **Integer**| Width of cropping rectangle. |
 **height** | **Integer**| Height of cropping rectangle. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createDeskewedImage"></a>
## **createDeskewedImage**
> byte[] createDeskewedImage(CreateDeskewedImageRequest request)

Deskew an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateDeskewedImageRequest** Parameters
```java
CreateDeskewedImageRequest(
    byte[] imageData, 
    Boolean resizeProportionally, 
    String bkColor, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **resizeProportionally** | **Boolean**| Resize proportionally |
 **bkColor** | **String**| Background color | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image) | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createFolder"></a>
## **createFolder**
> void createFolder(CreateFolderRequest request)

Create the folder

### **CreateFolderRequest** Parameters
```java
CreateFolderRequest(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path to create e.g. &#39;folder_1/folder_2/&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createGrayscaledImage"></a>
## **createGrayscaledImage**
> byte[] createGrayscaledImage(CreateGrayscaledImageRequest request)

Grayscales an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateGrayscaledImageRequest** Parameters
```java
CreateGrayscaledImageRequest(
    byte[] imageData, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image) | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createImageFeatures"></a>
## **createImageFeatures**
> void createImageFeatures(CreateImageFeaturesRequest request)

Extract images features and add them to search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateImageFeaturesRequest** Parameters
```java
CreateImageFeaturesRequest(
    String searchContextId, 
    byte[] imageData, 
    String imageId, 
    String imagesFolder, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| The search context identifier. |
 **imageData** | **byte[]**| Input image | [optional]
 **imageId** | **String**| The image identifier. | [optional]
 **imagesFolder** | **String**| Images source - a folder | [optional]
 **folder** | **String**| The folder. | [optional]
 **storage** | **String**| The storage. | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createImageFrame"></a>
## **createImageFrame**
> byte[] createImageFrame(CreateImageFrameRequest request)

Get separate frame from existing image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateImageFrameRequest** Parameters
```java
CreateImageFrameRequest(
    byte[] imageData, 
    Integer frameId, 
    Integer newWidth, 
    Integer newHeight, 
    Integer x, 
    Integer y, 
    Integer rectWidth, 
    Integer rectHeight, 
    String rotateFlipMethod, 
    Boolean saveOtherFrames, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **frameId** | **Integer**| Number of a frame. |
 **newWidth** | **Integer**| New width. | [optional]
 **newHeight** | **Integer**| New height. | [optional]
 **x** | **Integer**| X position of start point for cropping rectangle. | [optional]
 **y** | **Integer**| Y position of start point for cropping rectangle. | [optional]
 **rectWidth** | **Integer**| Width of cropping rectangle. | [optional]
 **rectHeight** | **Integer**| Height of cropping rectangle. | [optional]
 **rotateFlipMethod** | **String**| RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). Default is RotateNoneFlipNone. | [optional]
 **saveOtherFrames** | **Boolean**| If result will include all other frames or just a specified frame. | [optional] [default to false]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createImageFrameRange"></a>
## **createImageFrameRange**
> byte[] createImageFrameRange(CreateImageFrameRangeRequest request)

Get separate frame from existing image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateImageFrameRangeRequest** Parameters
```java
CreateImageFrameRangeRequest(
    byte[] imageData, 
    Integer startFrameId, 
    Integer endFrameId, 
    Integer newWidth, 
    Integer newHeight, 
    Integer x, 
    Integer y, 
    Integer rectWidth, 
    Integer rectHeight, 
    String rotateFlipMethod, 
    Boolean saveOtherFrames, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **startFrameId** | **Integer**| Index of the first frame in range. |
 **endFrameId** | **Integer**| Index of the last frame in range. |
 **newWidth** | **Integer**| New width. | [optional]
 **newHeight** | **Integer**| New height. | [optional]
 **x** | **Integer**| X position of start point for cropping rectangle. | [optional]
 **y** | **Integer**| Y position of start point for cropping rectangle. | [optional]
 **rectWidth** | **Integer**| Width of cropping rectangle. | [optional]
 **rectHeight** | **Integer**| Height of cropping rectangle. | [optional]
 **rotateFlipMethod** | **String**| RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). Default is RotateNoneFlipNone. | [optional]
 **saveOtherFrames** | **Boolean**| If result will include all other frames or just a specified frame. | [optional] [default to false]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createImageSearch"></a>
## **createImageSearch**
> [SearchContextStatus](SearchContextStatus.md) createImageSearch(CreateImageSearchRequest request)

Create new search context.

### **CreateImageSearchRequest** Parameters
```java
CreateImageSearchRequest(
    String detector, 
    String matchingAlgorithm, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **detector** | **String**| The image features detector. | [optional] [default to akaze]
 **matchingAlgorithm** | **String**| The matching algorithm. | [optional] [default to randomBinaryTree]
 **folder** | **String**| The folder. | [optional]
 **storage** | **String**| The storage. | [optional]

### Return type

[**SearchContextStatus**](SearchContextStatus.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createImageTag"></a>
## **createImageTag**
> void createImageTag(CreateImageTagRequest request)

Add tag and reference image to search context. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateImageTagRequest** Parameters
```java
CreateImageTagRequest(
    byte[] imageData, 
    String searchContextId, 
    String tagName, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **searchContextId** | **String**| The search context identifier. |
 **tagName** | **String**| The tag. |
 **folder** | **String**| The folder. | [optional]
 **storage** | **String**| The storage. | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createModifiedBmp"></a>
## **createModifiedBmp**
> byte[] createModifiedBmp(CreateModifiedBmpRequest request)

Update parameters of BMP image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateModifiedBmpRequest** Parameters
```java
CreateModifiedBmpRequest(
    byte[] imageData, 
    Integer bitsPerPixel, 
    Integer horizontalResolution, 
    Integer verticalResolution, 
    Boolean fromScratch, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **bitsPerPixel** | **Integer**| Color depth. |
 **horizontalResolution** | **Integer**| New horizontal resolution. |
 **verticalResolution** | **Integer**| New vertical resolution. |
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createModifiedEmf"></a>
## **createModifiedEmf**
> byte[] createModifiedEmf(CreateModifiedEmfRequest request)

Process existing EMF imaging using given parameters. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateModifiedEmfRequest** Parameters
```java
CreateModifiedEmfRequest(
    byte[] imageData, 
    String bkColor, 
    Integer pageWidth, 
    Integer pageHeight, 
    Integer borderX, 
    Integer borderY, 
    Boolean fromScratch, 
    String outPath, 
    String storage, 
    String format)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **bkColor** | **String**| Color of the background. |
 **pageWidth** | **Integer**| Width of the page. |
 **pageHeight** | **Integer**| Height of the page. |
 **borderX** | **Integer**| Border width. |
 **borderY** | **Integer**| Border height. |
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]
 **format** | **String**| Export format (PNG is the default one). Please, refer to the export table from https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional] [default to png]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createModifiedGif"></a>
## **createModifiedGif**
> byte[] createModifiedGif(CreateModifiedGifRequest request)

Update parameters of GIF image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateModifiedGifRequest** Parameters
```java
CreateModifiedGifRequest(
    byte[] imageData, 
    Integer backgroundColorIndex, 
    Integer colorResolution, 
    Boolean hasTrailer, 
    Boolean interlaced, 
    Boolean isPaletteSorted, 
    Integer pixelAspectRatio, 
    Boolean fromScratch, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **backgroundColorIndex** | **Integer**| Index of the background color. | [optional] [default to 32]
 **colorResolution** | **Integer**| Color resolution. | [optional] [default to 3]
 **hasTrailer** | **Boolean**| Specifies if image has trailer. | [optional] [default to true]
 **interlaced** | **Boolean**| Specifies if image is interlaced. | [optional] [default to true]
 **isPaletteSorted** | **Boolean**| Specifies if palette is sorted. | [optional] [default to false]
 **pixelAspectRatio** | **Integer**| Pixel aspect ratio. | [optional] [default to 3]
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to true]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createModifiedJpeg"></a>
## **createModifiedJpeg**
> byte[] createModifiedJpeg(CreateModifiedJpegRequest request)

Update parameters of JPEG image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateModifiedJpegRequest** Parameters
```java
CreateModifiedJpegRequest(
    byte[] imageData, 
    Integer quality, 
    String compressionType, 
    Boolean fromScratch, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **quality** | **Integer**| Quality of an image from 0 to 100. Default is 75. | [optional] [default to 75]
 **compressionType** | **String**| Compression type: baseline (default), progressive, lossless or jpegls. | [optional] [default to baseline]
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createModifiedJpeg2000"></a>
## **createModifiedJpeg2000**
> byte[] createModifiedJpeg2000(CreateModifiedJpeg2000Request request)

Update parameters of JPEG2000 image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateModifiedJpeg2000Request** Parameters
```java
CreateModifiedJpeg2000Request(
    byte[] imageData, 
    String comment, 
    String codec, 
    Boolean fromScratch, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **comment** | **String**| The comment (can be either single or comma-separated). |
 **codec** | **String**| The codec (j2k or jp2). | [optional] [default to j2k]
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createModifiedPsd"></a>
## **createModifiedPsd**
> byte[] createModifiedPsd(CreateModifiedPsdRequest request)

Update parameters of PSD image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateModifiedPsdRequest** Parameters
```java
CreateModifiedPsdRequest(
    byte[] imageData, 
    Integer channelsCount, 
    String compressionMethod, 
    Boolean fromScratch, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **channelsCount** | **Integer**| Count of color channels. | [optional] [default to 4]
 **compressionMethod** | **String**| Compression method (for now, raw and RLE are supported). | [optional] [default to rle]
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createModifiedSvg"></a>
## **createModifiedSvg**
> byte[] createModifiedSvg(CreateModifiedSvgRequest request)

Update parameters of SVG image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateModifiedSvgRequest** Parameters
```java
CreateModifiedSvgRequest(
    byte[] imageData, 
    String colorType, 
    Boolean textAsShapes, 
    Double scaleX, 
    Double scaleY, 
    Integer pageWidth, 
    Integer pageHeight, 
    Integer borderX, 
    Integer borderY, 
    String bkColor, 
    Boolean fromScratch, 
    String outPath, 
    String storage, 
    String format)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **colorType** | **String**| Color type for SVG image. Only RGB is supported for now. | [optional] [default to Rgb]
 **textAsShapes** | **Boolean**| Whether text must be converted as shapes. true if all text is turned into SVG shapes in the convertion; otherwise, false | [optional] [default to false]
 **scaleX** | **Double**| Scale X. | [optional] [default to 0.0]
 **scaleY** | **Double**| Scale Y. | [optional] [default to 0.0]
 **pageWidth** | **Integer**| Width of the page. | [optional]
 **pageHeight** | **Integer**| Height of the page. | [optional]
 **borderX** | **Integer**| Border width. Only 0 is supported for now. | [optional]
 **borderY** | **Integer**| Border height. Only 0 is supported for now. | [optional]
 **bkColor** | **String**| Background color (Default is white). | [optional] [default to white]
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]
 **format** | **String**| Export format (PNG is the default one). Please, refer to the export table from https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional] [default to png]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createModifiedTiff"></a>
## **createModifiedTiff**
> byte[] createModifiedTiff(CreateModifiedTiffRequest request)

Update parameters of TIFF image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateModifiedTiffRequest** Parameters
```java
CreateModifiedTiffRequest(
    byte[] imageData, 
    Integer bitDepth, 
    String compression, 
    String resolutionUnit, 
    Double horizontalResolution, 
    Double verticalResolution, 
    Boolean fromScratch, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **bitDepth** | **Integer**| Bit depth. |
 **compression** | **String**| Compression (none is default). Please, refer to https://apireference.aspose.com/net/imaging/aspose.imaging.fileformats.tiff.enums/tiffcompressions for all possible values. | [optional]
 **resolutionUnit** | **String**| New resolution unit (none - the default one, inch or centimeter). | [optional]
 **horizontalResolution** | **Double**| New horizontal resolution. | [optional] [default to 0.0]
 **verticalResolution** | **Double**| New vertical resolution. | [optional] [default to 0.0]
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createModifiedWebP"></a>
## **createModifiedWebP**
> byte[] createModifiedWebP(CreateModifiedWebPRequest request)

Update parameters of WEBP image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateModifiedWebPRequest** Parameters
```java
CreateModifiedWebPRequest(
    byte[] imageData, 
    Boolean lossLess, 
    Integer quality, 
    Integer animLoopCount, 
    String animBackgroundColor, 
    Boolean fromScratch, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **lossLess** | **Boolean**| If WEBP should be in lossless format. |
 **quality** | **Integer**| Quality (0-100). |
 **animLoopCount** | **Integer**| The animation loop count. |
 **animBackgroundColor** | **String**| Color of the animation background. |
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createModifiedWmf"></a>
## **createModifiedWmf**
> byte[] createModifiedWmf(CreateModifiedWmfRequest request)

Process existing WMF image using given parameters. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateModifiedWmfRequest** Parameters
```java
CreateModifiedWmfRequest(
    byte[] imageData, 
    String bkColor, 
    Integer pageWidth, 
    Integer pageHeight, 
    Integer borderX, 
    Integer borderY, 
    Boolean fromScratch, 
    String outPath, 
    String storage, 
    String format)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **bkColor** | **String**| Color of the background. |
 **pageWidth** | **Integer**| Width of the page. |
 **pageHeight** | **Integer**| Height of the page. |
 **borderX** | **Integer**| Border width. |
 **borderY** | **Integer**| Border height. |
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]
 **format** | **String**| Export format (PNG is the default one). Please, refer to the export table from https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional] [default to png]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createResizedImage"></a>
## **createResizedImage**
> byte[] createResizedImage(CreateResizedImageRequest request)

Resize an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateResizedImageRequest** Parameters
```java
CreateResizedImageRequest(
    byte[] imageData, 
    Integer newWidth, 
    Integer newHeight, 
    String format, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **newWidth** | **Integer**| New width. |
 **newHeight** | **Integer**| New height. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createRotateFlippedImage"></a>
## **createRotateFlippedImage**
> byte[] createRotateFlippedImage(CreateRotateFlippedImageRequest request)

Rotate and/or flip an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateRotateFlippedImageRequest** Parameters
```java
CreateRotateFlippedImageRequest(
    byte[] imageData, 
    String method, 
    String format, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **method** | **String**| RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createSavedImageAs"></a>
## **createSavedImageAs**
> byte[] createSavedImageAs(CreateSavedImageAsRequest request)

Export existing image to another format. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.             

### **CreateSavedImageAsRequest** Parameters
```java
CreateSavedImageAsRequest(
    byte[] imageData, 
    String format, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. |
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createUpdatedImage"></a>
## **createUpdatedImage**
> byte[] createUpdatedImage(CreateUpdatedImageRequest request)

Perform scaling, cropping and flipping of an image in a single request. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **CreateUpdatedImageRequest** Parameters
```java
CreateUpdatedImageRequest(
    byte[] imageData, 
    Integer newWidth, 
    Integer newHeight, 
    Integer x, 
    Integer y, 
    Integer rectWidth, 
    Integer rectHeight, 
    String rotateFlipMethod, 
    String format, 
    String outPath, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **newWidth** | **Integer**| New width of the scaled image. |
 **newHeight** | **Integer**| New height of the scaled image. |
 **x** | **Integer**| X position of start point for cropping rectangle. |
 **y** | **Integer**| Y position of start point for cropping rectangle. |
 **rectWidth** | **Integer**| Width of cropping rectangle. |
 **rectHeight** | **Integer**| Height of cropping rectangle. |
 **rotateFlipMethod** | **String**| RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). Default is RotateNoneFlipNone. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **outPath** | **String**| Path to updated file (if this is empty, response contains streamed image). | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="createWebSiteImageFeatures"></a>
## **createWebSiteImageFeatures**
> void createWebSiteImageFeatures(CreateWebSiteImageFeaturesRequest request)

Extract images features from web page and add them to search context

### **CreateWebSiteImageFeaturesRequest** Parameters
```java
CreateWebSiteImageFeaturesRequest(
    String searchContextId, 
    String imagesSource, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| The search context identifier. |
 **imagesSource** | **String**| Images source - a web page |
 **folder** | **String**| The folder. | [optional]
 **storage** | **String**| The storage. | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="cropImage"></a>
## **cropImage**
> byte[] cropImage(CropImageRequest request)

Crop an existing image.

### **CropImageRequest** Parameters
```java
CropImageRequest(
    String name, 
    Integer x, 
    Integer y, 
    Integer width, 
    Integer height, 
    String format, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an image. |
 **x** | **Integer**| X position of start point for cropping rectangle. |
 **y** | **Integer**| Y position of start point for cropping rectangle. |
 **width** | **Integer**| Width of cropping rectangle |
 **height** | **Integer**| Height of cropping rectangle. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="deleteFile"></a>
## **deleteFile**
> void deleteFile(DeleteFileRequest request)

Delete file

### **DeleteFileRequest** Parameters
```java
DeleteFileRequest(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to delete | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="deleteFolder"></a>
## **deleteFolder**
> void deleteFolder(DeleteFolderRequest request)

Delete folder

### **DeleteFolderRequest** Parameters
```java
DeleteFolderRequest(
    String path, 
    String storageName, 
    Boolean recursive)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **recursive** | **Boolean**| Enable to delete folders, subfolders and files | [optional] [default to false]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="deleteImageFeatures"></a>
## **deleteImageFeatures**
> void deleteImageFeatures(DeleteImageFeaturesRequest request)

Deletes image features from search context.

### **DeleteImageFeaturesRequest** Parameters
```java
DeleteImageFeaturesRequest(
    String searchContextId, 
    String imageId, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| The search context identifier. |
 **imageId** | **String**| The image identifier. |
 **folder** | **String**| The folder. | [optional]
 **storage** | **String**| The storage. | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="deleteImageSearch"></a>
## **deleteImageSearch**
> void deleteImageSearch(DeleteImageSearchRequest request)

Deletes the search context.

### **DeleteImageSearchRequest** Parameters
```java
DeleteImageSearchRequest(
    String searchContextId, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| The search context identifier. |
 **folder** | **String**| The folder. | [optional]
 **storage** | **String**| The storage. | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="deleteSearchImage"></a>
## **deleteSearchImage**
> void deleteSearchImage(DeleteSearchImageRequest request)

Delete image and images features from search context

### **DeleteSearchImageRequest** Parameters
```java
DeleteSearchImageRequest(
    String searchContextId, 
    String imageId, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| Search context identifier. |
 **imageId** | **String**| Image identifier. |
 **folder** | **String**| Folder. | [optional]
 **storage** | **String**| Storage | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="deskewImage"></a>
## **deskewImage**
> byte[] deskewImage(DeskewImageRequest request)

Deskew an existing image.

### **DeskewImageRequest** Parameters
```java
DeskewImageRequest(
    String name, 
    Boolean resizeProportionally, 
    String bkColor, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Image file name. |
 **resizeProportionally** | **Boolean**| Resize proportionally |
 **bkColor** | **String**| Background color | [optional]
 **folder** | **String**| Folder | [optional]
 **storage** | **String**| Storage | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="downloadFile"></a>
## **downloadFile**
> byte[] downloadFile(DownloadFileRequest request)

Download file

### **DownloadFileRequest** Parameters
```java
DownloadFileRequest(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to download | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="extractImageFeatures"></a>
## **extractImageFeatures**
> [ImageFeatures](ImageFeatures.md) extractImageFeatures(ExtractImageFeaturesRequest request)

Extract features from image without adding to search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.

### **ExtractImageFeaturesRequest** Parameters
```java
ExtractImageFeaturesRequest(
    String searchContextId, 
    String imageId, 
    byte[] imageData, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| The search context identifier. |
 **imageId** | **String**| The image identifier. |
 **imageData** | **byte[]**| Input image | [optional]
 **folder** | **String**| The folder. | [optional]
 **storage** | **String**| The storage. | [optional]

### Return type

[**ImageFeatures**](ImageFeatures.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="extractImageFrameProperties"></a>
## **extractImageFrameProperties**
> [ImagingResponse](ImagingResponse.md) extractImageFrameProperties(ExtractImageFramePropertiesRequest request)

Get separate frame properties of existing image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **ExtractImageFramePropertiesRequest** Parameters
```java
ExtractImageFramePropertiesRequest(
    byte[] imageData, 
    Integer frameId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |
 **frameId** | **Integer**| Number of a frame. |

### Return type

[**ImagingResponse**](ImagingResponse.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="extractImageProperties"></a>
## **extractImageProperties**
> [ImagingResponse](ImagingResponse.md) extractImageProperties(ExtractImagePropertiesRequest request)

Get properties of an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.

### **ExtractImagePropertiesRequest** Parameters
```java
ExtractImagePropertiesRequest(
    byte[] imageData)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageData** | **byte[]**| Input image |

### Return type

[**ImagingResponse**](ImagingResponse.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="filterEffectImage"></a>
## **filterEffectImage**
> byte[] filterEffectImage(FilterEffectImageRequest request)

Apply filtering effects to an existing image.

### **FilterEffectImageRequest** Parameters
```java
FilterEffectImageRequest(
    String name, 
    String filterType, 
    FilterPropertiesBase filterProperties, 
    String format, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an image. |
 **filterType** | **String**| Filter type (BigRectangular, SmallRectangular, Median, GaussWiener, MotionWiener, GaussianBlur, Sharpen, BilateralSmoothing). |
 **filterProperties** | [**FilterPropertiesBase**](FilterPropertiesBase.md)| Filter properties. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="findImageDuplicates"></a>
## **findImageDuplicates**
> [ImageDuplicatesSet](ImageDuplicatesSet.md) findImageDuplicates(FindImageDuplicatesRequest request)

Find images duplicates.

### **FindImageDuplicatesRequest** Parameters
```java
FindImageDuplicatesRequest(
    String searchContextId, 
    Double similarityThreshold, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| The search context identifier. |
 **similarityThreshold** | **Double**| The similarity threshold. |
 **folder** | **String**| The folder. | [optional]
 **storage** | **String**| The storage. | [optional]

### Return type

[**ImageDuplicatesSet**](ImageDuplicatesSet.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="findImagesByTags"></a>
## **findImagesByTags**
> [SearchResultsSet](SearchResultsSet.md) findImagesByTags(FindImagesByTagsRequest request)

Find images by tags. Tags JSON string is passed as zero-indexed multipart/form-data content or as raw body stream.

### **FindImagesByTagsRequest** Parameters
```java
FindImagesByTagsRequest(
    String tags, 
    String searchContextId, 
    Double similarityThreshold, 
    Integer maxCount, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **String**| Tags array for searching |
 **searchContextId** | **String**| The search context identifier. |
 **similarityThreshold** | **Double**| The similarity threshold. |
 **maxCount** | **Integer**| The maximum count. |
 **folder** | **String**| The folder. | [optional]
 **storage** | **String**| The storage. | [optional]

### Return type

[**SearchResultsSet**](SearchResultsSet.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="findSimilarImages"></a>
## **findSimilarImages**
> [SearchResultsSet](SearchResultsSet.md) findSimilarImages(FindSimilarImagesRequest request)

Find similar images. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.

### **FindSimilarImagesRequest** Parameters
```java
FindSimilarImagesRequest(
    String searchContextId, 
    Double similarityThreshold, 
    Integer maxCount, 
    byte[] imageData, 
    String imageId, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| The search context identifier. |
 **similarityThreshold** | **Double**| The similarity threshold. |
 **maxCount** | **Integer**| The maximum count. |
 **imageData** | **byte[]**| Input image | [optional]
 **imageId** | **String**| The search image identifier. | [optional]
 **folder** | **String**| The folder. | [optional]
 **storage** | **String**| The storage. | [optional]

### Return type

[**SearchResultsSet**](SearchResultsSet.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getDiscUsage"></a>
## **getDiscUsage**
> [DiscUsage](DiscUsage.md) getDiscUsage(GetDiscUsageRequest request)

Get disc usage

### **GetDiscUsageRequest** Parameters
```java
GetDiscUsageRequest(
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name | [optional]

### Return type

[**DiscUsage**](DiscUsage.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getFileVersions"></a>
## **getFileVersions**
> [FileVersions](FileVersions.md) getFileVersions(GetFileVersionsRequest request)

Get file versions

### **GetFileVersionsRequest** Parameters
```java
GetFileVersionsRequest(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FileVersions**](FileVersions.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getFilesList"></a>
## **getFilesList**
> [FilesList](FilesList.md) getFilesList(GetFilesListRequest request)

Get all files and folders within a folder

### **GetFilesListRequest** Parameters
```java
GetFilesListRequest(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesList**](FilesList.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getImageFeatures"></a>
## **getImageFeatures**
> [ImageFeatures](ImageFeatures.md) getImageFeatures(GetImageFeaturesRequest request)

Gets image features from search context.

### **GetImageFeaturesRequest** Parameters
```java
GetImageFeaturesRequest(
    String searchContextId, 
    String imageId, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| The search context identifier. |
 **imageId** | **String**| The image identifier. |
 **folder** | **String**| The folder. | [optional]
 **storage** | **String**| The storage. | [optional]

### Return type

[**ImageFeatures**](ImageFeatures.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getImageFrame"></a>
## **getImageFrame**
> byte[] getImageFrame(GetImageFrameRequest request)

Get separate frame from existing image.

### **GetImageFrameRequest** Parameters
```java
GetImageFrameRequest(
    String name, 
    Integer frameId, 
    Integer newWidth, 
    Integer newHeight, 
    Integer x, 
    Integer y, 
    Integer rectWidth, 
    Integer rectHeight, 
    String rotateFlipMethod, 
    Boolean saveOtherFrames, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **frameId** | **Integer**| Number of a frame. |
 **newWidth** | **Integer**| New width. | [optional]
 **newHeight** | **Integer**| New height. | [optional]
 **x** | **Integer**| X position of start point for cropping rectangle. | [optional]
 **y** | **Integer**| Y position of start point for cropping rectangle. | [optional]
 **rectWidth** | **Integer**| Width of cropping rectangle. | [optional]
 **rectHeight** | **Integer**| Height of cropping rectangle. | [optional]
 **rotateFlipMethod** | **String**| RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). Default is RotateNoneFlipNone. | [optional]
 **saveOtherFrames** | **Boolean**| If result will include all other frames or just a specified frame. | [optional] [default to false]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getImageFrameProperties"></a>
## **getImageFrameProperties**
> [ImagingResponse](ImagingResponse.md) getImageFrameProperties(GetImageFramePropertiesRequest request)

Get separate frame properties of existing image.

### **GetImageFramePropertiesRequest** Parameters
```java
GetImageFramePropertiesRequest(
    String name, 
    Integer frameId, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename with image. |
 **frameId** | **Integer**| Number of a frame. |
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

[**ImagingResponse**](ImagingResponse.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getImageFrameRange"></a>
## **getImageFrameRange**
> byte[] getImageFrameRange(GetImageFrameRangeRequest request)

Get frames range from existing image.

### **GetImageFrameRangeRequest** Parameters
```java
GetImageFrameRangeRequest(
    String name, 
    Integer startFrameId, 
    Integer endFrameId, 
    Integer newWidth, 
    Integer newHeight, 
    Integer x, 
    Integer y, 
    Integer rectWidth, 
    Integer rectHeight, 
    String rotateFlipMethod, 
    Boolean saveOtherFrames, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **startFrameId** | **Integer**| Index of the first frame in range. |
 **endFrameId** | **Integer**| Index of the last frame in range. |
 **newWidth** | **Integer**| New width. | [optional]
 **newHeight** | **Integer**| New height. | [optional]
 **x** | **Integer**| X position of start point for cropping rectangle. | [optional]
 **y** | **Integer**| Y position of start point for cropping rectangle. | [optional]
 **rectWidth** | **Integer**| Width of cropping rectangle. | [optional]
 **rectHeight** | **Integer**| Height of cropping rectangle. | [optional]
 **rotateFlipMethod** | **String**| RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). Default is RotateNoneFlipNone. | [optional]
 **saveOtherFrames** | **Boolean**| If result will include all other frames or just a specified frame. | [optional] [default to false]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getImageProperties"></a>
## **getImageProperties**
> [ImagingResponse](ImagingResponse.md) getImageProperties(GetImagePropertiesRequest request)

Get properties of an image.

### **GetImagePropertiesRequest** Parameters
```java
GetImagePropertiesRequest(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an image. |
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

[**ImagingResponse**](ImagingResponse.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getImageSearchStatus"></a>
## **getImageSearchStatus**
> [SearchContextStatus](SearchContextStatus.md) getImageSearchStatus(GetImageSearchStatusRequest request)

Gets the search context status.

### **GetImageSearchStatusRequest** Parameters
```java
GetImageSearchStatusRequest(
    String searchContextId, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| The search context identifier. |
 **folder** | **String**| The folder. | [optional]
 **storage** | **String**| The storage. | [optional]

### Return type

[**SearchContextStatus**](SearchContextStatus.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="getSearchImage"></a>
## **getSearchImage**
> byte[] getSearchImage(GetSearchImageRequest request)

Get image from search context

### **GetSearchImageRequest** Parameters
```java
GetSearchImageRequest(
    String searchContextId, 
    String imageId, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| Search context identifier. |
 **imageId** | **String**| Image identifier. |
 **folder** | **String**| Folder. | [optional]
 **storage** | **String**| Storage | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="grayscaleImage"></a>
## **grayscaleImage**
> byte[] grayscaleImage(GrayscaleImageRequest request)

Grayscale an existing image.

### **GrayscaleImageRequest** Parameters
```java
GrayscaleImageRequest(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Image file name. |
 **folder** | **String**| Folder | [optional]
 **storage** | **String**| Storage | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="modifyBmp"></a>
## **modifyBmp**
> byte[] modifyBmp(ModifyBmpRequest request)

Update parameters of existing BMP image.

### **ModifyBmpRequest** Parameters
```java
ModifyBmpRequest(
    String name, 
    Integer bitsPerPixel, 
    Integer horizontalResolution, 
    Integer verticalResolution, 
    Boolean fromScratch, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **bitsPerPixel** | **Integer**| Color depth. |
 **horizontalResolution** | **Integer**| New horizontal resolution. |
 **verticalResolution** | **Integer**| New vertical resolution. |
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="modifyEmf"></a>
## **modifyEmf**
> byte[] modifyEmf(ModifyEmfRequest request)

Process existing EMF imaging using given parameters.

### **ModifyEmfRequest** Parameters
```java
ModifyEmfRequest(
    String name, 
    String bkColor, 
    Integer pageWidth, 
    Integer pageHeight, 
    Integer borderX, 
    Integer borderY, 
    Boolean fromScratch, 
    String folder, 
    String storage, 
    String format)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **bkColor** | **String**| Color of the background. |
 **pageWidth** | **Integer**| Width of the page. |
 **pageHeight** | **Integer**| Height of the page. |
 **borderX** | **Integer**| Border width. |
 **borderY** | **Integer**| Border height. |
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]
 **format** | **String**| Export format (PNG is the default one). Please, refer to the export table from https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional] [default to png]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="modifyGif"></a>
## **modifyGif**
> byte[] modifyGif(ModifyGifRequest request)

Update parameters of existing GIF image.

### **ModifyGifRequest** Parameters
```java
ModifyGifRequest(
    String name, 
    Integer backgroundColorIndex, 
    Integer colorResolution, 
    Boolean hasTrailer, 
    Boolean interlaced, 
    Boolean isPaletteSorted, 
    Integer pixelAspectRatio, 
    Boolean fromScratch, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **backgroundColorIndex** | **Integer**| Index of the background color. | [optional] [default to 32]
 **colorResolution** | **Integer**| Color resolution. | [optional] [default to 3]
 **hasTrailer** | **Boolean**| Specifies if image has trailer. | [optional] [default to true]
 **interlaced** | **Boolean**| Specifies if image is interlaced. | [optional] [default to true]
 **isPaletteSorted** | **Boolean**| Specifies if palette is sorted. | [optional] [default to false]
 **pixelAspectRatio** | **Integer**| Pixel aspect ratio. | [optional] [default to 3]
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to true]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="modifyJpeg"></a>
## **modifyJpeg**
> byte[] modifyJpeg(ModifyJpegRequest request)

Update parameters of existing JPEG image.

### **ModifyJpegRequest** Parameters
```java
ModifyJpegRequest(
    String name, 
    Integer quality, 
    String compressionType, 
    Boolean fromScratch, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **quality** | **Integer**| Quality of an image from 0 to 100. Default is 75. | [optional] [default to 75]
 **compressionType** | **String**| Compression type: baseline (default), progressive, lossless or jpegls. | [optional] [default to baseline]
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="modifyJpeg2000"></a>
## **modifyJpeg2000**
> byte[] modifyJpeg2000(ModifyJpeg2000Request request)

Update parameters of existing JPEG2000 image.

### **ModifyJpeg2000Request** Parameters
```java
ModifyJpeg2000Request(
    String name, 
    String comment, 
    String codec, 
    Boolean fromScratch, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **comment** | **String**| The comment (can be either single or comma-separated). |
 **codec** | **String**| The codec (j2k or jp2). | [optional] [default to j2k]
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="modifyPsd"></a>
## **modifyPsd**
> byte[] modifyPsd(ModifyPsdRequest request)

Update parameters of existing PSD image.

### **ModifyPsdRequest** Parameters
```java
ModifyPsdRequest(
    String name, 
    Integer channelsCount, 
    String compressionMethod, 
    Boolean fromScratch, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **channelsCount** | **Integer**| Count of color channels. | [optional] [default to 4]
 **compressionMethod** | **String**| Compression method (for now, raw and RLE are supported). | [optional] [default to rle]
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="modifySvg"></a>
## **modifySvg**
> byte[] modifySvg(ModifySvgRequest request)

Update parameters of existing SVG image.

### **ModifySvgRequest** Parameters
```java
ModifySvgRequest(
    String name, 
    String colorType, 
    Boolean textAsShapes, 
    Double scaleX, 
    Double scaleY, 
    Integer pageWidth, 
    Integer pageHeight, 
    Integer borderX, 
    Integer borderY, 
    String bkColor, 
    Boolean fromScratch, 
    String folder, 
    String storage, 
    String format)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **colorType** | **String**| Color type for SVG image. Only RGB is supported for now. | [optional] [default to Rgb]
 **textAsShapes** | **Boolean**| Whether text must be converted as shapes. true if all text is turned into SVG shapes in the convertion; otherwise, false | [optional] [default to false]
 **scaleX** | **Double**| Scale X. | [optional] [default to 0.0]
 **scaleY** | **Double**| Scale Y. | [optional] [default to 0.0]
 **pageWidth** | **Integer**| Width of the page. | [optional]
 **pageHeight** | **Integer**| Height of the page. | [optional]
 **borderX** | **Integer**| Border width. Only 0 is supported for now. | [optional]
 **borderY** | **Integer**| Border height. Only 0 is supported for now. | [optional]
 **bkColor** | **String**| Background color (Default is white). | [optional] [default to white]
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]
 **format** | **String**| Export format (PNG is the default one). Please, refer to the export table from https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional] [default to svg]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="modifyTiff"></a>
## **modifyTiff**
> byte[] modifyTiff(ModifyTiffRequest request)

Update parameters of existing TIFF image.

### **ModifyTiffRequest** Parameters
```java
ModifyTiffRequest(
    String name, 
    Integer bitDepth, 
    String compression, 
    String resolutionUnit, 
    Double horizontalResolution, 
    Double verticalResolution, 
    Boolean fromScratch, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **bitDepth** | **Integer**| Bit depth. |
 **compression** | **String**| Compression (none is default). Please, refer to https://apireference.aspose.com/net/imaging/aspose.imaging.fileformats.tiff.enums/tiffcompressions for all possible values. | [optional]
 **resolutionUnit** | **String**| New resolution unit (none - the default one, inch or centimeter). | [optional]
 **horizontalResolution** | **Double**| New horizontal resolution. | [optional] [default to 0.0]
 **verticalResolution** | **Double**| New vertical resolution. | [optional] [default to 0.0]
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="modifyWebP"></a>
## **modifyWebP**
> byte[] modifyWebP(ModifyWebPRequest request)

Update parameters of existing WEBP image.

### **ModifyWebPRequest** Parameters
```java
ModifyWebPRequest(
    String name, 
    Boolean lossLess, 
    Integer quality, 
    Integer animLoopCount, 
    String animBackgroundColor, 
    Boolean fromScratch, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **lossLess** | **Boolean**| If WEBP should be in lossless format. |
 **quality** | **Integer**| Quality (0-100). |
 **animLoopCount** | **Integer**| The animation loop count. |
 **animBackgroundColor** | **String**| Color of the animation background. |
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="modifyWmf"></a>
## **modifyWmf**
> byte[] modifyWmf(ModifyWmfRequest request)

Process existing WMF image using given parameters.

### **ModifyWmfRequest** Parameters
```java
ModifyWmfRequest(
    String name, 
    String bkColor, 
    Integer pageWidth, 
    Integer pageHeight, 
    Integer borderX, 
    Integer borderY, 
    Boolean fromScratch, 
    String folder, 
    String storage, 
    String format)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **bkColor** | **String**| Color of the background. |
 **pageWidth** | **Integer**| Width of the page. |
 **pageHeight** | **Integer**| Height of the page. |
 **borderX** | **Integer**| Border width. |
 **borderY** | **Integer**| Border height. |
 **fromScratch** | **Boolean**| Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false. | [optional] [default to false]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]
 **format** | **String**| Export format (PNG is the default one). Please, refer to the export table from https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional] [default to png]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="moveFile"></a>
## **moveFile**
> void moveFile(MoveFileRequest request)

Move file

### **MoveFileRequest** Parameters
```java
MoveFileRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/src.ext&#39; |
 **destPath** | **String**| Destination file path e.g. &#39;/dest.ext&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to move | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="moveFolder"></a>
## **moveFolder**
> void moveFolder(MoveFolderRequest request)

Move folder

### **MoveFolderRequest** Parameters
```java
MoveFolderRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Folder path to move e.g. &#39;/folder&#39; |
 **destPath** | **String**| Destination folder path to move to e.g &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="objectExists"></a>
## **objectExists**
> [ObjectExist](ObjectExist.md) objectExists(ObjectExistsRequest request)

Check if file or folder exists

### **ObjectExistsRequest** Parameters
```java
ObjectExistsRequest(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File or folder path e.g. &#39;/file.ext&#39; or &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID | [optional]

### Return type

[**ObjectExist**](ObjectExist.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="resizeImage"></a>
## **resizeImage**
> byte[] resizeImage(ResizeImageRequest request)

Resize an existing image.

### **ResizeImageRequest** Parameters
```java
ResizeImageRequest(
    String name, 
    Integer newWidth, 
    Integer newHeight, 
    String format, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an image. |
 **newWidth** | **Integer**| New width. |
 **newHeight** | **Integer**| New height. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="rotateFlipImage"></a>
## **rotateFlipImage**
> byte[] rotateFlipImage(RotateFlipImageRequest request)

Rotate and/or flip an existing image.

### **RotateFlipImageRequest** Parameters
```java
RotateFlipImageRequest(
    String name, 
    String method, 
    String format, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an image. |
 **method** | **String**| RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="saveImageAs"></a>
## **saveImageAs**
> byte[] saveImageAs(SaveImageAsRequest request)

Export existing image to another format.

### **SaveImageAsRequest** Parameters
```java
SaveImageAsRequest(
    String name, 
    String format, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of image. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. |
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="storageExists"></a>
## **storageExists**
> [StorageExist](StorageExist.md) storageExists(StorageExistsRequest request)

Check if storage exists

### **StorageExistsRequest** Parameters
```java
StorageExistsRequest(
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name |

### Return type

[**StorageExist**](StorageExist.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="updateImage"></a>
## **updateImage**
> byte[] updateImage(UpdateImageRequest request)

Perform scaling, cropping and flipping of an existing image in a single request.

### **UpdateImageRequest** Parameters
```java
UpdateImageRequest(
    String name, 
    Integer newWidth, 
    Integer newHeight, 
    Integer x, 
    Integer y, 
    Integer rectWidth, 
    Integer rectHeight, 
    String rotateFlipMethod, 
    String format, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Filename of an image. |
 **newWidth** | **Integer**| New width of the scaled image. |
 **newHeight** | **Integer**| New height of the scaled image. |
 **x** | **Integer**| X position of start point for cropping rectangle. |
 **y** | **Integer**| Y position of start point for cropping rectangle. |
 **rectWidth** | **Integer**| Width of cropping rectangle. |
 **rectHeight** | **Integer**| Height of cropping rectangle. |
 **rotateFlipMethod** | **String**| RotateFlip method (Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY). Default is RotateNoneFlipNone. |
 **format** | **String**| Resulting image format. Please, refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-CommonOperationsFormatSupportMap for possible use-cases. | [optional]
 **folder** | **String**| Folder with image to process. | [optional]
 **storage** | **String**| Your Aspose Cloud Storage name. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="updateImageFeatures"></a>
## **updateImageFeatures**
> void updateImageFeatures(UpdateImageFeaturesRequest request)

Update images features in search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.

### **UpdateImageFeaturesRequest** Parameters
```java
UpdateImageFeaturesRequest(
    String searchContextId, 
    String imageId, 
    byte[] imageData, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| The search context identifier. |
 **imageId** | **String**| The image identifier. |
 **imageData** | **byte[]**| Input image | [optional]
 **folder** | **String**| The folder. | [optional]
 **storage** | **String**| The storage. | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="updateSearchImage"></a>
## **updateSearchImage**
> void updateSearchImage(UpdateSearchImageRequest request)

Update image and images features in search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.

### **UpdateSearchImageRequest** Parameters
```java
UpdateSearchImageRequest(
    String searchContextId, 
    String imageId, 
    byte[] imageData, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchContextId** | **String**| Search context identifier. |
 **imageId** | **String**| Image identifier. |
 **imageData** | **byte[]**| Input image | [optional]
 **folder** | **String**| Folder. | [optional]
 **storage** | **String**| Storage | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)

<a name="uploadFile"></a>
## **uploadFile**
> [FilesUploadResult](FilesUploadResult.md) uploadFile(UploadFileRequest request)

Upload file

### **UploadFileRequest** Parameters
```java
UploadFileRequest(
    String path, 
    byte[] file, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.              |
 **file** | **byte[]**| File to upload |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesUploadResult**](FilesUploadResult.md)

[[Back to top]](#) [[Back to API list]](API_README.md#documentation-for-api-endpoints) [[Back to Model list]](API_README.md#documentation-for-models) [[Back to API_README]](API_README.md)


<a name="documentation-for-api-endpoints"></a>
## Documentation for API endpoints

All URIs are relative to *https://api.aspose.cloud/v3.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ImagingApi* | [**addSearchImage**](ImagingApi.md#addsearchimage) | **POST** /imaging/ai/imageSearch/{searchContextId}/image | Add image and images features to search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**appendTiff**](ImagingApi.md#appendtiff) | **POST** /imaging/tiff/{name}/appendTiff | Appends existing TIFF image to another existing TIFF image (i.e. merges TIFF images).
*ImagingApi* | [**compareImages**](ImagingApi.md#compareimages) | **POST** /imaging/ai/imageSearch/{searchContextId}/compare | Compare two images. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**convertImage**](ImagingApi.md#convertimage) | **GET** /imaging/{name}/convert | Convert existing image to another format.
*ImagingApi* | [**convertTiffToFax**](ImagingApi.md#converttifftofax) | **GET** /imaging/tiff/{name}/toFax | Update parameters of existing TIFF image accordingly to fax parameters.
*ImagingApi* | [**copyFile**](ImagingApi.md#copyfile) | **PUT** /imaging/storage/file/copy/{srcPath} | Copy file
*ImagingApi* | [**copyFolder**](ImagingApi.md#copyfolder) | **PUT** /imaging/storage/folder/copy/{srcPath} | Copy folder
*ImagingApi* | [**createConvertedImage**](ImagingApi.md#createconvertedimage) | **POST** /imaging/convert | Convert existing image to another format. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.             
*ImagingApi* | [**createCroppedImage**](ImagingApi.md#createcroppedimage) | **POST** /imaging/crop | Crop an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createDeskewedImage**](ImagingApi.md#createdeskewedimage) | **POST** /imaging/deskew | Deskew an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createFaxTiff**](ImagingApi.md#createfaxtiff) | **POST** /imaging/tiff/toFax | Update parameters of TIFF image accordingly to fax parameters. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createFolder**](ImagingApi.md#createfolder) | **PUT** /imaging/storage/folder/{path} | Create the folder
*ImagingApi* | [**createGrayscaledImage**](ImagingApi.md#creategrayscaledimage) | **POST** /imaging/grayscale | Grayscales an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createImageFeatures**](ImagingApi.md#createimagefeatures) | **POST** /imaging/ai/imageSearch/{searchContextId}/features | Extract images features and add them to search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createImageFrame**](ImagingApi.md#createimageframe) | **POST** /imaging/frames/{frameId} | Get separate frame from existing image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createImageFrameRange**](ImagingApi.md#createimageframerange) | **POST** /imaging/frames/range | Get frames range from existing image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createImageSearch**](ImagingApi.md#createimagesearch) | **POST** /imaging/ai/imageSearch/create | Create new search context.
*ImagingApi* | [**createImageTag**](ImagingApi.md#createimagetag) | **POST** /imaging/ai/imageSearch/{searchContextId}/addTag | Add tag and reference image to search context. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createModifiedBmp**](ImagingApi.md#createmodifiedbmp) | **POST** /imaging/bmp | Update parameters of BMP image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createModifiedEmf**](ImagingApi.md#createmodifiedemf) | **POST** /imaging/emf | Process existing EMF imaging using given parameters. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createModifiedGif**](ImagingApi.md#createmodifiedgif) | **POST** /imaging/gif | Update parameters of GIF image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createModifiedJpeg**](ImagingApi.md#createmodifiedjpeg) | **POST** /imaging/jpg | Update parameters of JPEG image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createModifiedJpeg2000**](ImagingApi.md#createmodifiedjpeg2000) | **POST** /imaging/jpg2000 | Update parameters of JPEG2000 image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createModifiedPsd**](ImagingApi.md#createmodifiedpsd) | **POST** /imaging/psd | Update parameters of PSD image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createModifiedSvg**](ImagingApi.md#createmodifiedsvg) | **POST** /imaging/svg | Update parameters of SVG image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createModifiedTiff**](ImagingApi.md#createmodifiedtiff) | **POST** /imaging/tiff | Update parameters of TIFF image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createModifiedWebP**](ImagingApi.md#createmodifiedwebp) | **POST** /imaging/webp | Update parameters of WEBP image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createModifiedWmf**](ImagingApi.md#createmodifiedwmf) | **POST** /imaging/wmf | Process existing WMF image using given parameters. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createObjectBounds**](ImagingApi.md#createobjectbounds) | **POST** /imaging/ai/objectdetection/bounds | Detects objects bounds. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createResizedImage**](ImagingApi.md#createresizedimage) | **POST** /imaging/resize | Resize an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createRotateFlippedImage**](ImagingApi.md#createrotateflippedimage) | **POST** /imaging/rotateflip | Rotate and/or flip an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createSavedImageAs**](ImagingApi.md#createsavedimageas) | **POST** /imaging/saveAs | Export existing image to another format. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.             
*ImagingApi* | [**createUpdatedImage**](ImagingApi.md#createupdatedimage) | **POST** /imaging/updateImage | Perform scaling, cropping and flipping of an image in a single request. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**createVisualObjectBounds**](ImagingApi.md#createvisualobjectbounds) | **POST** /imaging/ai/objectdetection/visualbounds | Detects objects bounds and draw them on the original image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream
*ImagingApi* | [**createWebSiteImageFeatures**](ImagingApi.md#createwebsiteimagefeatures) | **POST** /imaging/ai/imageSearch/{searchContextId}/features/web | Extract images features from web page and add them to search context
*ImagingApi* | [**cropImage**](ImagingApi.md#cropimage) | **GET** /imaging/{name}/crop | Crop an existing image.
*ImagingApi* | [**deleteFile**](ImagingApi.md#deletefile) | **DELETE** /imaging/storage/file/{path} | Delete file
*ImagingApi* | [**deleteFolder**](ImagingApi.md#deletefolder) | **DELETE** /imaging/storage/folder/{path} | Delete folder
*ImagingApi* | [**deleteImageFeatures**](ImagingApi.md#deleteimagefeatures) | **DELETE** /imaging/ai/imageSearch/{searchContextId}/features | Deletes image features from search context.
*ImagingApi* | [**deleteImageSearch**](ImagingApi.md#deleteimagesearch) | **DELETE** /imaging/ai/imageSearch/{searchContextId} | Deletes the search context.
*ImagingApi* | [**deleteSearchImage**](ImagingApi.md#deletesearchimage) | **DELETE** /imaging/ai/imageSearch/{searchContextId}/image | Delete image and images features from search context
*ImagingApi* | [**deskewImage**](ImagingApi.md#deskewimage) | **GET** /imaging/{name}/deskew | Deskew an existing image.
*ImagingApi* | [**downloadFile**](ImagingApi.md#downloadfile) | **GET** /imaging/storage/file/{path} | Download file
*ImagingApi* | [**extractImageFeatures**](ImagingApi.md#extractimagefeatures) | **GET** /imaging/ai/imageSearch/{searchContextId}/image2features | Extract features from image without adding to search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**extractImageFrameProperties**](ImagingApi.md#extractimageframeproperties) | **POST** /imaging/frames/{frameId}/properties | Get separate frame properties of existing image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**extractImageProperties**](ImagingApi.md#extractimageproperties) | **POST** /imaging/properties | Get properties of an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**filterEffectImage**](ImagingApi.md#filtereffectimage) | **PUT** /imaging/{name}/filterEffect | Apply filtering effects to an existing image.
*ImagingApi* | [**findImageDuplicates**](ImagingApi.md#findimageduplicates) | **GET** /imaging/ai/imageSearch/{searchContextId}/findDuplicates | Find images duplicates.
*ImagingApi* | [**findImagesByTags**](ImagingApi.md#findimagesbytags) | **POST** /imaging/ai/imageSearch/{searchContextId}/findByTags | Find images by tags. Tags JSON string is passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**findSimilarImages**](ImagingApi.md#findsimilarimages) | **GET** /imaging/ai/imageSearch/{searchContextId}/findSimilar | Find similar images. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**getAvailableLabels**](ImagingApi.md#getavailablelabels) | **GET** /imaging/ai/objectdetection/availablelabels/{method} | Detects objects bounds and draw them on the original image
*ImagingApi* | [**getDiscUsage**](ImagingApi.md#getdiscusage) | **GET** /imaging/storage/disc | Get disc usage
*ImagingApi* | [**getFileVersions**](ImagingApi.md#getfileversions) | **GET** /imaging/storage/version/{path} | Get file versions
*ImagingApi* | [**getFilesList**](ImagingApi.md#getfileslist) | **GET** /imaging/storage/folder/{path} | Get all files and folders within a folder
*ImagingApi* | [**getImageFeatures**](ImagingApi.md#getimagefeatures) | **GET** /imaging/ai/imageSearch/{searchContextId}/features | Gets image features from search context.
*ImagingApi* | [**getImageFrame**](ImagingApi.md#getimageframe) | **GET** /imaging/{name}/frames/{frameId} | Get separate frame from existing image.
*ImagingApi* | [**getImageFrameProperties**](ImagingApi.md#getimageframeproperties) | **GET** /imaging/{name}/frames/{frameId}/properties | Get separate frame properties of existing image.
*ImagingApi* | [**getImageFrameRange**](ImagingApi.md#getimageframerange) | **GET** /imaging/{name}/frames/range | Get frames range from existing image.
*ImagingApi* | [**getImageProperties**](ImagingApi.md#getimageproperties) | **GET** /imaging/{name}/properties | Get properties of an image.
*ImagingApi* | [**getImageSearchStatus**](ImagingApi.md#getimagesearchstatus) | **GET** /imaging/ai/imageSearch/{searchContextId}/status | Gets the search context status.
*ImagingApi* | [**getObjectBounds**](ImagingApi.md#getobjectbounds) | **GET** /imaging/ai/objectdetection/{name}/bounds | Detects objects&#39; bounds
*ImagingApi* | [**getSearchImage**](ImagingApi.md#getsearchimage) | **GET** /imaging/ai/imageSearch/{searchContextId}/image | Get image from search context
*ImagingApi* | [**getVisualObjectBounds**](ImagingApi.md#getvisualobjectbounds) | **GET** /imaging/ai/objectdetection/{name}/visualbounds | Detects objects bounds and draw them on the original image
*ImagingApi* | [**grayscaleImage**](ImagingApi.md#grayscaleimage) | **GET** /imaging/{name}/grayscale | Grayscale an existing image.
*ImagingApi* | [**modifyBmp**](ImagingApi.md#modifybmp) | **GET** /imaging/{name}/bmp | Update parameters of existing BMP image.
*ImagingApi* | [**modifyEmf**](ImagingApi.md#modifyemf) | **GET** /imaging/{name}/emf | Process existing EMF imaging using given parameters.
*ImagingApi* | [**modifyGif**](ImagingApi.md#modifygif) | **GET** /imaging/{name}/gif | Update parameters of existing GIF image.
*ImagingApi* | [**modifyJpeg**](ImagingApi.md#modifyjpeg) | **GET** /imaging/{name}/jpg | Update parameters of existing JPEG image.
*ImagingApi* | [**modifyJpeg2000**](ImagingApi.md#modifyjpeg2000) | **GET** /imaging/{name}/jpg2000 | Update parameters of existing JPEG2000 image.
*ImagingApi* | [**modifyPsd**](ImagingApi.md#modifypsd) | **GET** /imaging/{name}/psd | Update parameters of existing PSD image.
*ImagingApi* | [**modifySvg**](ImagingApi.md#modifysvg) | **GET** /imaging/{name}/svg | Update parameters of existing SVG image.
*ImagingApi* | [**modifyTiff**](ImagingApi.md#modifytiff) | **GET** /imaging/{name}/tiff | Update parameters of existing TIFF image.
*ImagingApi* | [**modifyWebP**](ImagingApi.md#modifywebp) | **GET** /imaging/{name}/webp | Update parameters of existing WEBP image.
*ImagingApi* | [**modifyWmf**](ImagingApi.md#modifywmf) | **GET** /imaging/{name}/wmf | Process existing WMF image using given parameters.
*ImagingApi* | [**moveFile**](ImagingApi.md#movefile) | **PUT** /imaging/storage/file/move/{srcPath} | Move file
*ImagingApi* | [**moveFolder**](ImagingApi.md#movefolder) | **PUT** /imaging/storage/folder/move/{srcPath} | Move folder
*ImagingApi* | [**objectExists**](ImagingApi.md#objectexists) | **GET** /imaging/storage/exist/{path} | Check if file or folder exists
*ImagingApi* | [**resizeImage**](ImagingApi.md#resizeimage) | **GET** /imaging/{name}/resize | Resize an existing image.
*ImagingApi* | [**rotateFlipImage**](ImagingApi.md#rotateflipimage) | **GET** /imaging/{name}/rotateflip | Rotate and/or flip an existing image.
*ImagingApi* | [**saveImageAs**](ImagingApi.md#saveimageas) | **GET** /imaging/{name}/saveAs | Export existing image to another format.
*ImagingApi* | [**storageExists**](ImagingApi.md#storageexists) | **GET** /imaging/storage/{storageName}/exist | Check if storage exists
*ImagingApi* | [**updateImage**](ImagingApi.md#updateimage) | **GET** /imaging/{name}/updateImage | Perform scaling, cropping and flipping of an existing image in a single request.
*ImagingApi* | [**updateImageFeatures**](ImagingApi.md#updateimagefeatures) | **PUT** /imaging/ai/imageSearch/{searchContextId}/features | Update images features in search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**updateSearchImage**](ImagingApi.md#updatesearchimage) | **PUT** /imaging/ai/imageSearch/{searchContextId}/image | Update image and images features in search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
*ImagingApi* | [**uploadFile**](ImagingApi.md#uploadfile) | **PUT** /imaging/storage/file/{path} | Upload file


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.aspose.imaging.cloud.sdk.model.AvailableLabelsList](AvailableLabelsList.md)
 - [com.aspose.imaging.cloud.sdk.model.BmpProperties](BmpProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.DetectedObject](DetectedObject.md)
 - [com.aspose.imaging.cloud.sdk.model.DetectedObjectList](DetectedObjectList.md)
 - [com.aspose.imaging.cloud.sdk.model.DicomProperties](DicomProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.DiscUsage](DiscUsage.md)
 - [com.aspose.imaging.cloud.sdk.model.DjvuProperties](DjvuProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.DngProperties](DngProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.Error](Error.md)
 - [com.aspose.imaging.cloud.sdk.model.ErrorDetails](ErrorDetails.md)
 - [com.aspose.imaging.cloud.sdk.model.ExifData](ExifData.md)
 - [com.aspose.imaging.cloud.sdk.model.FileVersions](FileVersions.md)
 - [com.aspose.imaging.cloud.sdk.model.FilesList](FilesList.md)
 - [com.aspose.imaging.cloud.sdk.model.FilesUploadResult](FilesUploadResult.md)
 - [com.aspose.imaging.cloud.sdk.model.FilterPropertiesBase](FilterPropertiesBase.md)
 - [com.aspose.imaging.cloud.sdk.model.GifProperties](GifProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.ImageDuplicates](ImageDuplicates.md)
 - [com.aspose.imaging.cloud.sdk.model.ImageDuplicatesSet](ImageDuplicatesSet.md)
 - [com.aspose.imaging.cloud.sdk.model.ImageFeatures](ImageFeatures.md)
 - [com.aspose.imaging.cloud.sdk.model.ImagingResponse](ImagingResponse.md)
 - [com.aspose.imaging.cloud.sdk.model.Jpeg2000Properties](Jpeg2000Properties.md)
 - [com.aspose.imaging.cloud.sdk.model.JpegProperties](JpegProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.ObjectExist](ObjectExist.md)
 - [com.aspose.imaging.cloud.sdk.model.OdgMetadata](OdgMetadata.md)
 - [com.aspose.imaging.cloud.sdk.model.OdgPage](OdgPage.md)
 - [com.aspose.imaging.cloud.sdk.model.OdgProperties](OdgProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.PngProperties](PngProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.PsdProperties](PsdProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.Rectangle](Rectangle.md)
 - [com.aspose.imaging.cloud.sdk.model.SearchContextStatus](SearchContextStatus.md)
 - [com.aspose.imaging.cloud.sdk.model.SearchResult](SearchResult.md)
 - [com.aspose.imaging.cloud.sdk.model.SearchResultsSet](SearchResultsSet.md)
 - [com.aspose.imaging.cloud.sdk.model.StorageExist](StorageExist.md)
 - [com.aspose.imaging.cloud.sdk.model.StorageFile](StorageFile.md)
 - [com.aspose.imaging.cloud.sdk.model.SvgProperties](SvgProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.TiffFrame](TiffFrame.md)
 - [com.aspose.imaging.cloud.sdk.model.TiffOptions](TiffOptions.md)
 - [com.aspose.imaging.cloud.sdk.model.TiffProperties](TiffProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.WebPProperties](WebPProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.BigRectangularFilterProperties](BigRectangularFilterProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.BilateralSmoothingFilterProperties](BilateralSmoothingFilterProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.ConvolutionFilterProperties](ConvolutionFilterProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.DeconvolutionFilterProperties](DeconvolutionFilterProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.FileVersion](FileVersion.md)
 - [com.aspose.imaging.cloud.sdk.model.JpegExifData](JpegExifData.md)
 - [com.aspose.imaging.cloud.sdk.model.MedianFilterProperties](MedianFilterProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.SmallRectangularFilterProperties](SmallRectangularFilterProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.GaussWienerFilterProperties](GaussWienerFilterProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.GaussianBlurFilterProperties](GaussianBlurFilterProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.MotionWienerFilterProperties](MotionWienerFilterProperties.md)
 - [com.aspose.imaging.cloud.sdk.model.SharpenFilterProperties](SharpenFilterProperties.md)


# Aspose.Imaging for Cloud Java SDK
[Aspose.Imaging for Cloud](https://products.aspose.cloud/imaging/cloud) is a true REST API that enables you to perform a wide range of image processing operations including creation, manipulation and conversion in the cloud, with zero initial costs. Our Cloud SDKs are wrappers around REST API in various programming languages, allowing you to process images in language of your choice quickly and easily, gaining all benefits of strong types and IDE highlights. 

This repository contains Aspose.Imaging for Cloud Java SDK source code. This SDK allows you to work with Aspose.Imaging for Cloud REST APIs in your Java applications quickly and easily, with zero initial cost.

To use this SDK, you will need App SID and App Key which can be looked up at [Aspose Cloud Dashboard](https://dashboard.aspose.cloud/#/apps) (free registration in Aspose Cloud is required for this).

The solution is updated using [code generator](https://github.com/aspose-imaging-cloud/aspose-imaging-cloud-codegen).

# Android compatibility
Aspose.Imaging for Cloud Java SDK sources are fully compatible with Android and internally tested on a real device for each release along with automated testing on AVD.

To be able to use them in your own Android application, the following steps are required.

1. Since this library is consuming Aspose.Imaging for Cloud web APIs, please add *android.permission.INTERNET* to your manifest.
2. Add gradle dependencies:
- implementation group: 'org.apache.commons', name: 'commons-lang3', version: '3.3.2'
- implementation group: 'commons-io', name: 'commons-io', version: '2.4'
- implementation group: 'com.brsanthu', name: 'migbase64', version: '2.2'
- implementation group: 'com.fasterxml.jackson.jaxrs', name: 'jackson-jaxrs-json-provider', version: '2.6.4'
- implementation group: 'com.fasterxml.jackson.core', name: 'jackson-core', version: '2.6.4'
- implementation group: 'com.fasterxml.jackson.core', name: 'jackson-annotations', version: '2.6.4'
- implementation group: 'com.fasterxml.jackson.core', name: 'jackson-databind', version: '2.6.4'

This is also true for a ready-to-go package from our [Aspose Cloud repository](https://artifact.aspose.cloud/repo/).

# Example
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

# Tests 
Tests from this repo are intended for internal usage only.

# Licensing
All Aspose.Imaging for Cloud SDKs, helper scripts and templates are licensed under [MIT License](LICENSE).

# Resources
+ [**Web API reference**](https://apireference.aspose.cloud/imaging/)
+ [**Website**](https://www.aspose.cloud)
+ [**Product Home**](https://products.aspose.cloud/imaging/cloud)
+ [**Documentation**](https://docs.aspose.cloud/display/imagingcloud/Home)
+ [**Free Support Forum**](https://forum.aspose.cloud/c/imaging)
+ [**Paid Support Helpdesk**](https://helpdesk.aspose.imaging/)
+ [**Blog**](https://blog.aspose.cloud/category/aspose-products/aspose.imaging-cloud/)
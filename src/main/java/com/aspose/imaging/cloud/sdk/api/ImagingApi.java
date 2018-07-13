/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ImagingApi.java">
*   Copyright (c) 2018 Aspose Pty Ltd.
* </copyright>
* <summary>
*   Permission is hereby granted, free of charge, to any person obtaining a copy
*  of this software and associated documentation files (the "Software"), to deal
*  in the Software without restriction, including without limitation the rights
*  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*  copies of the Software, and to permit persons to whom the Software is
*  furnished to do so, subject to the following conditions:
* 
*  The above copyright notice and this permission notice shall be included in all
*  copies or substantial portions of the Software.
* 
*  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*  SOFTWARE.
* </summary>
* --------------------------------------------------------------------------------------------------------------------
*/
package com.aspose.imaging.cloud.sdk.api;

import com.aspose.imaging.cloud.sdk.model.*;
import com.aspose.imaging.cloud.sdk.invoker.*;
import com.aspose.imaging.cloud.sdk.invoker.internal.*;
import com.aspose.imaging.cloud.sdk.invoker.internal.requesthandlers.*;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.sdk.stablemodel.*;
import java.io.File;

import java.util.HashMap;

/**
 * Aspose.Imaging for Cloud API
 */
public class ImagingApi 
{
	/**
	 * Current SDK version
	 */
	public static final String Version = "18.6";

	/**
	 * The API invoker
	 */
    private ApiInvoker apiInvoker;

    /**
     * The configuration
     */
    private Configuration configuration;

    /**
     * Initializes a new instance of the ImagingApi class.
     * @param appKey The app key.
     * @param appSid The app SID.
     */
    public ImagingApi(String appKey, String appSid)
    {
		Configuration config = new Configuration();
		config.AppKey = appKey;
		config.AppSid = appSid;
	    this.initImagingApi(config);
    }

    /**
     * Initializes a new instance of the ImagingApi class.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     */
    public ImagingApi(String appKey, String appSid, String baseUrl)
    {
	    Configuration config = new Configuration();
		config.AppKey = appKey;
		config.AppSid = appSid;
		config.setApiBaseUrl(baseUrl);
		this.initImagingApi(config);
    }

    /**
     * Initializes a new instance of the ImagingApi class.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     */
    public ImagingApi(String appKey, String appSid, String baseUrl, String apiVersion)
    {
	    Configuration config = new Configuration();
		config.AppKey = appKey;
		config.AppSid = appSid;
		config.setApiBaseUrl(baseUrl);
		config.setApiVersion(apiVersion);
		this.initImagingApi(config);
    }

    /**
     * Initializes a new instance of the ImagingApi class.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param debug If debug mode is enabled.
     */
    public ImagingApi(String appKey, String appSid, String baseUrl, String apiVersion, Boolean debug)
    {
	    Configuration config = new Configuration();
		config.AppKey = appKey;
		config.AppSid = appSid;
		config.setApiBaseUrl(baseUrl);
		config.setApiVersion(apiVersion);
		config.setDebugMode(debug);
		this.initImagingApi(config);
    }
    
    /**
     * Initializes a new instance of the ImagingApi class.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param authType Authentication type.
     * @param debug If debug mode is enabled.
     */
    public ImagingApi(String appKey, String appSid, String baseUrl, String apiVersion, AuthType authType, Boolean debug)
    {
	    Configuration config = new Configuration();
		config.AppKey = appKey;
		config.AppSid = appSid;
		config.setApiBaseUrl(baseUrl);
		config.setApiVersion(apiVersion);
		config.setDebugMode(debug);
		config.AuthType = authType;
		this.initImagingApi(config);
    }

    /**
     * Initializes a new instance of the ImagingApi class.
     * @param configuration Configuration settings.
     */
    private void initImagingApi(Configuration configuration)
    {
        this.configuration = configuration;
		IRequestHandler[] requestHandlers = new IRequestHandler[4];
		requestHandlers[0] = new OAuthRequestHandler(this.configuration);
        requestHandlers[1] = new DebugLogRequestHandler(this.configuration);
        requestHandlers[2] = new ApiExceptionRequestHandler();
        requestHandlers[3] = new AuthWithSignatureRequestHandler(this.configuration);
        this.apiInvoker = new ApiInvoker(requestHandlers);
    }
	
    /**
     * Deletes the search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse deleteSearchContext(DeleteSearchContextRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling deleteSearchContext");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "DELETE", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Delete image and images features from search context
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse deleteSearchContextImage(DeleteSearchContextImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling deleteSearchContextImage");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling deleteSearchContextImage");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/image";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "DELETE", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Deletes image features from search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SaaSposeResponse
     * @throws Exception 
     */
    public ApiResponse deleteSearchContextImageFeatures(DeleteSearchContextImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling deleteSearchContextImageFeatures");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling deleteSearchContextImageFeatures");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/features";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "DELETE", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (SaaSposeResponse.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (SaaSposeResponse.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (SaaSposeResponse.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (SaaSposeResponse.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (SaaSposeResponse.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (SaaSposeResponse.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (SaaSposeResponse.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of existing BMP image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageBmp(GetImageBmpRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageBmp");
      }
       // verify the required parameter 'request.bitsPerPixel' is set
      if (request.bitsPerPixel == null) {
        throw new ApiException(400, "Missing the required parameter 'request.bitsPerPixel' when calling getImageBmp");
      }
       // verify the required parameter 'request.horizontalResolution' is set
      if (request.horizontalResolution == null) {
        throw new ApiException(400, "Missing the required parameter 'request.horizontalResolution' when calling getImageBmp");
      }
       // verify the required parameter 'request.verticalResolution' is set
      if (request.verticalResolution == null) {
        throw new ApiException(400, "Missing the required parameter 'request.verticalResolution' when calling getImageBmp");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/bmp";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bitsPerPixel", request.bitsPerPixel);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "horizontalResolution", request.horizontalResolution);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "verticalResolution", request.verticalResolution);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Crop an existing image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageCrop(GetImageCropRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageCrop");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getImageCrop");
      }
       // verify the required parameter 'request.x' is set
      if (request.x == null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling getImageCrop");
      }
       // verify the required parameter 'request.y' is set
      if (request.y == null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling getImageCrop");
      }
       // verify the required parameter 'request.width' is set
      if (request.width == null) {
        throw new ApiException(400, "Missing the required parameter 'request.width' when calling getImageCrop");
      }
       // verify the required parameter 'request.height' is set
      if (request.height == null) {
        throw new ApiException(400, "Missing the required parameter 'request.height' when calling getImageCrop");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/crop";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "x", request.x);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "y", request.y);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "width", request.width);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "height", request.height);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Rasterize existing DICOM image to PNG using given parameters.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageDicom(GetImageDicomRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageDicom");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/dicom";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Rasterize existing DNG image to PNG using given parameters.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageDng(GetImageDngRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageDng");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/dng";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Rasterize existing EMF image to PNG using given parameters.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageEmf(GetImageEmfRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageEmf");
      }
       // verify the required parameter 'request.bkColor' is set
      if (request.bkColor == null) {
        throw new ApiException(400, "Missing the required parameter 'request.bkColor' when calling getImageEmf");
      }
       // verify the required parameter 'request.pageWidth' is set
      if (request.pageWidth == null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageWidth' when calling getImageEmf");
      }
       // verify the required parameter 'request.pageHeight' is set
      if (request.pageHeight == null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageHeight' when calling getImageEmf");
      }
       // verify the required parameter 'request.borderX' is set
      if (request.borderX == null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderX' when calling getImageEmf");
      }
       // verify the required parameter 'request.borderY' is set
      if (request.borderY == null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderY' when calling getImageEmf");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/emf";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bkColor", request.bkColor);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageWidth", request.pageWidth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageHeight", request.pageHeight);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderX", request.borderX);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderY", request.borderY);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Get separate frame from existing TIFF image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageFrame(GetImageFrameRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageFrame");
      }
       // verify the required parameter 'request.frameId' is set
      if (request.frameId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.frameId' when calling getImageFrame");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/frames/{frameId}";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "frameId", request.frameId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "x", request.x);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "y", request.y);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rectWidth", request.rectWidth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rectHeight", request.rectHeight);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rotateFlipMethod", request.rotateFlipMethod);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "saveOtherFrames", request.saveOtherFrames);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Get separate frame properties of existing TIFF image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImagingResponse
     * @throws Exception 
     */
    public ApiResponse getImageFrameProperties(GetImageFramePropertiesRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageFrameProperties");
      }
       // verify the required parameter 'request.frameId' is set
      if (request.frameId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.frameId' when calling getImageFrameProperties");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/frames/{frameId}/properties";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "frameId", request.frameId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (ImagingResponse.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (ImagingResponse.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (ImagingResponse.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (ImagingResponse.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (ImagingResponse.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (ImagingResponse.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (ImagingResponse.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of existing GIF image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageGif(GetImageGifRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageGif");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/gif";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "backgroundColorIndex", request.backgroundColorIndex);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "colorResolution", request.colorResolution);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "hasTrailer", request.hasTrailer);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "interlaced", request.interlaced);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "isPaletteSorted", request.isPaletteSorted);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pixelAspectRatio", request.pixelAspectRatio);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of existing JPEG2000 image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageJpeg2000(GetImageJpeg2000Request request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageJpeg2000");
      }
       // verify the required parameter 'request.comment' is set
      if (request.comment == null) {
        throw new ApiException(400, "Missing the required parameter 'request.comment' when calling getImageJpeg2000");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/jpg2000";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "comment", request.comment);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "codec", request.codec);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of existing JPEG image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageJpg(GetImageJpgRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageJpg");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/jpg";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "quality", request.quality);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "compressionType", request.compressionType);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Rasterize existing ODG image to PNG using given parameters.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageOdg(GetImageOdgRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageOdg");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/odg";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of existing PNG image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImagePng(GetImagePngRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImagePng");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/png";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Get properties of an image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImagingResponse
     * @throws Exception 
     */
    public ApiResponse getImageProperties(GetImagePropertiesRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageProperties");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/properties";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (ImagingResponse.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (ImagingResponse.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (ImagingResponse.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (ImagingResponse.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (ImagingResponse.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (ImagingResponse.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (ImagingResponse.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of existing PSD image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImagePsd(GetImagePsdRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImagePsd");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/psd";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "channelsCount", request.channelsCount);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "compressionMethod", request.compressionMethod);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Resize an existing image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageResize(GetImageResizeRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageResize");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getImageResize");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth == null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling getImageResize");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight == null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling getImageResize");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/resize";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Rotate and/or flip an existing image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageRotateFlip(GetImageRotateFlipRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageRotateFlip");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getImageRotateFlip");
      }
       // verify the required parameter 'request.method' is set
      if (request.method == null) {
        throw new ApiException(400, "Missing the required parameter 'request.method' when calling getImageRotateFlip");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/rotateflip";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "method", request.method);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Export existing image to another format.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageSaveAs(GetImageSaveAsRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageSaveAs");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getImageSaveAs");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/saveAs";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of existing TIFF image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageTiff(GetImageTiffRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageTiff");
      }
       // verify the required parameter 'request.compression' is set
      if (request.compression == null) {
        throw new ApiException(400, "Missing the required parameter 'request.compression' when calling getImageTiff");
      }
       // verify the required parameter 'request.resolutionUnit' is set
      if (request.resolutionUnit == null) {
        throw new ApiException(400, "Missing the required parameter 'request.resolutionUnit' when calling getImageTiff");
      }
       // verify the required parameter 'request.bitDepth' is set
      if (request.bitDepth == null) {
        throw new ApiException(400, "Missing the required parameter 'request.bitDepth' when calling getImageTiff");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/tiff";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "compression", request.compression);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "resolutionUnit", request.resolutionUnit);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bitDepth", request.bitDepth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "horizontalResolution", request.horizontalResolution);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "verticalResolution", request.verticalResolution);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Perform scaling, cropping and flipping of an existing image in a single request.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageUpdate(GetImageUpdateRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageUpdate");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getImageUpdate");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth == null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling getImageUpdate");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight == null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling getImageUpdate");
      }
       // verify the required parameter 'request.x' is set
      if (request.x == null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling getImageUpdate");
      }
       // verify the required parameter 'request.y' is set
      if (request.y == null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling getImageUpdate");
      }
       // verify the required parameter 'request.rectWidth' is set
      if (request.rectWidth == null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectWidth' when calling getImageUpdate");
      }
       // verify the required parameter 'request.rectHeight' is set
      if (request.rectHeight == null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectHeight' when calling getImageUpdate");
      }
       // verify the required parameter 'request.rotateFlipMethod' is set
      if (request.rotateFlipMethod == null) {
        throw new ApiException(400, "Missing the required parameter 'request.rotateFlipMethod' when calling getImageUpdate");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/updateImage";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "x", request.x);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "y", request.y);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rectWidth", request.rectWidth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rectHeight", request.rectHeight);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rotateFlipMethod", request.rotateFlipMethod);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of existing WEBP image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageWebP(GetImageWebPRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageWebP");
      }
       // verify the required parameter 'request.lossLess' is set
      if (request.lossLess == null) {
        throw new ApiException(400, "Missing the required parameter 'request.lossLess' when calling getImageWebP");
      }
       // verify the required parameter 'request.quality' is set
      if (request.quality == null) {
        throw new ApiException(400, "Missing the required parameter 'request.quality' when calling getImageWebP");
      }
       // verify the required parameter 'request.animLoopCount' is set
      if (request.animLoopCount == null) {
        throw new ApiException(400, "Missing the required parameter 'request.animLoopCount' when calling getImageWebP");
      }
       // verify the required parameter 'request.animBackgroundColor' is set
      if (request.animBackgroundColor == null) {
        throw new ApiException(400, "Missing the required parameter 'request.animBackgroundColor' when calling getImageWebP");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/webp";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "lossLess", request.lossLess);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "quality", request.quality);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "animLoopCount", request.animLoopCount);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "animBackgroundColor", request.animBackgroundColor);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Rasterize existing WMF image to PNG using given parameters.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getImageWmf(GetImageWmfRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageWmf");
      }
       // verify the required parameter 'request.bkColor' is set
      if (request.bkColor == null) {
        throw new ApiException(400, "Missing the required parameter 'request.bkColor' when calling getImageWmf");
      }
       // verify the required parameter 'request.pageWidth' is set
      if (request.pageWidth == null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageWidth' when calling getImageWmf");
      }
       // verify the required parameter 'request.pageHeight' is set
      if (request.pageHeight == null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageHeight' when calling getImageWmf");
      }
       // verify the required parameter 'request.borderX' is set
      if (request.borderX == null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderX' when calling getImageWmf");
      }
       // verify the required parameter 'request.borderY' is set
      if (request.borderY == null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderY' when calling getImageWmf");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/{name}/wmf";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bkColor", request.bkColor);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageWidth", request.pageWidth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageHeight", request.pageHeight);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderX", request.borderX);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderY", request.borderY);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Extract features from image without adding to search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImageFeatures
     * @throws Exception 
     */
    public ApiResponse getSearchContextExtractImageFeatures(GetSearchContextExtractImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getSearchContextExtractImageFeatures");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling getSearchContextExtractImageFeatures");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/image2features";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (ImageFeatures.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (ImageFeatures.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (ImageFeatures.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (ImageFeatures.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (ImageFeatures.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (ImageFeatures.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (ImageFeatures.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Find images duplicates.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImageDuplicatesSet
     * @throws Exception 
     */
    public ApiResponse getSearchContextFindDuplicates(GetSearchContextFindDuplicatesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getSearchContextFindDuplicates");
      }
       // verify the required parameter 'request.similarityThreshold' is set
      if (request.similarityThreshold == null) {
        throw new ApiException(400, "Missing the required parameter 'request.similarityThreshold' when calling getSearchContextFindDuplicates");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/findDuplicates";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "similarityThreshold", request.similarityThreshold);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (ImageDuplicatesSet.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (ImageDuplicatesSet.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (ImageDuplicatesSet.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (ImageDuplicatesSet.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (ImageDuplicatesSet.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (ImageDuplicatesSet.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (ImageDuplicatesSet.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Find similar images.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchResultsSet
     * @throws Exception 
     */
    public ApiResponse getSearchContextFindSimilar(GetSearchContextFindSimilarRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getSearchContextFindSimilar");
      }
       // verify the required parameter 'request.similarityThreshold' is set
      if (request.similarityThreshold == null) {
        throw new ApiException(400, "Missing the required parameter 'request.similarityThreshold' when calling getSearchContextFindSimilar");
      }
       // verify the required parameter 'request.maxCount' is set
      if (request.maxCount == null) {
        throw new ApiException(400, "Missing the required parameter 'request.maxCount' when calling getSearchContextFindSimilar");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/findSimilar";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "similarityThreshold", request.similarityThreshold);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "maxCount", request.maxCount);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (SearchResultsSet.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (SearchResultsSet.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (SearchResultsSet.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (SearchResultsSet.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (SearchResultsSet.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (SearchResultsSet.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (SearchResultsSet.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Get image from search context
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getSearchContextImage(GetSearchContextImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getSearchContextImage");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling getSearchContextImage");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/image";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Gets image features from search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImageFeatures
     * @throws Exception 
     */
    public ApiResponse getSearchContextImageFeatures(GetSearchContextImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getSearchContextImageFeatures");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling getSearchContextImageFeatures");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/features";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (ImageFeatures.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (ImageFeatures.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (ImageFeatures.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (ImageFeatures.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (ImageFeatures.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (ImageFeatures.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (ImageFeatures.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Gets the search context status.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchContextStatus
     * @throws Exception 
     */
    public ApiResponse getSearchContextStatus(GetSearchContextStatusRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getSearchContextStatus");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/status";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (SearchContextStatus.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (SearchContextStatus.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (SearchContextStatus.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (SearchContextStatus.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (SearchContextStatus.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (SearchContextStatus.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (SearchContextStatus.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of existing TIFF image accordingly to fax parameters.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse getTiffToFax(GetTiffToFaxRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getTiffToFax");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/tiff/{name}/toFax";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "GET", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Create new search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchContextStatus
     * @throws Exception 
     */
    public ApiResponse postCreateSearchContext(PostCreateSearchContextRequest request) throws Exception 
    {
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/create";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "detector", request.detector);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "matchingAlgorithm", request.matchingAlgorithm);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (SearchContextStatus.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (SearchContextStatus.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (SearchContextStatus.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (SearchContextStatus.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (SearchContextStatus.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (SearchContextStatus.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (SearchContextStatus.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of BMP image. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageBmp(PostImageBmpRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageBmp");
      }
       // verify the required parameter 'request.bitsPerPixel' is set
      if (request.bitsPerPixel == null) {
        throw new ApiException(400, "Missing the required parameter 'request.bitsPerPixel' when calling postImageBmp");
      }
       // verify the required parameter 'request.horizontalResolution' is set
      if (request.horizontalResolution == null) {
        throw new ApiException(400, "Missing the required parameter 'request.horizontalResolution' when calling postImageBmp");
      }
       // verify the required parameter 'request.verticalResolution' is set
      if (request.verticalResolution == null) {
        throw new ApiException(400, "Missing the required parameter 'request.verticalResolution' when calling postImageBmp");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/bmp";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bitsPerPixel", request.bitsPerPixel);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "horizontalResolution", request.horizontalResolution);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "verticalResolution", request.verticalResolution);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Crop an image. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageCrop(PostImageCropRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageCrop");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling postImageCrop");
      }
       // verify the required parameter 'request.x' is set
      if (request.x == null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling postImageCrop");
      }
       // verify the required parameter 'request.y' is set
      if (request.y == null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling postImageCrop");
      }
       // verify the required parameter 'request.width' is set
      if (request.width == null) {
        throw new ApiException(400, "Missing the required parameter 'request.width' when calling postImageCrop");
      }
       // verify the required parameter 'request.height' is set
      if (request.height == null) {
        throw new ApiException(400, "Missing the required parameter 'request.height' when calling postImageCrop");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/crop";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "x", request.x);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "y", request.y);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "width", request.width);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "height", request.height);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Rasterize DICOM image to PNG using given parameters. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageDicom(PostImageDicomRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageDicom");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/dicom";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Rasterize DNG image to PNG using given parameters. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageDng(PostImageDngRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageDng");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/dng";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Rasterize EMF image to PNG using given parameters. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageEmf(PostImageEmfRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageEmf");
      }
       // verify the required parameter 'request.bkColor' is set
      if (request.bkColor == null) {
        throw new ApiException(400, "Missing the required parameter 'request.bkColor' when calling postImageEmf");
      }
       // verify the required parameter 'request.pageWidth' is set
      if (request.pageWidth == null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageWidth' when calling postImageEmf");
      }
       // verify the required parameter 'request.pageHeight' is set
      if (request.pageHeight == null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageHeight' when calling postImageEmf");
      }
       // verify the required parameter 'request.borderX' is set
      if (request.borderX == null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderX' when calling postImageEmf");
      }
       // verify the required parameter 'request.borderY' is set
      if (request.borderY == null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderY' when calling postImageEmf");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/emf";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bkColor", request.bkColor);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageWidth", request.pageWidth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageHeight", request.pageHeight);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderX", request.borderX);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderY", request.borderY);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of GIF image. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageGif(PostImageGifRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageGif");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/gif";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "backgroundColorIndex", request.backgroundColorIndex);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "colorResolution", request.colorResolution);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "hasTrailer", request.hasTrailer);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "interlaced", request.interlaced);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "isPaletteSorted", request.isPaletteSorted);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pixelAspectRatio", request.pixelAspectRatio);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of JPEG2000 image. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageJpeg2000(PostImageJpeg2000Request request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageJpeg2000");
      }
       // verify the required parameter 'request.comment' is set
      if (request.comment == null) {
        throw new ApiException(400, "Missing the required parameter 'request.comment' when calling postImageJpeg2000");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/jpg2000";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "comment", request.comment);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "codec", request.codec);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of JPEG image. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageJpg(PostImageJpgRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageJpg");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/jpg";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "quality", request.quality);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "compressionType", request.compressionType);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Rasterize ODG image to PNG using given parameters. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageOdg(PostImageOdgRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageOdg");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/odg";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of PNG image. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImagePng(PostImagePngRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImagePng");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/png";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of PSD image. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImagePsd(PostImagePsdRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImagePsd");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/psd";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "channelsCount", request.channelsCount);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "compressionMethod", request.compressionMethod);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Resize an image. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageResize(PostImageResizeRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageResize");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling postImageResize");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth == null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling postImageResize");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight == null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling postImageResize");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/resize";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Rotate and/or flip an image. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageRotateFlip(PostImageRotateFlipRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageRotateFlip");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling postImageRotateFlip");
      }
       // verify the required parameter 'request.method' is set
      if (request.method == null) {
        throw new ApiException(400, "Missing the required parameter 'request.method' when calling postImageRotateFlip");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/rotateflip";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "method", request.method);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Export existing image to another format. Image is passed in a request stream.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageSaveAs(PostImageSaveAsRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageSaveAs");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling postImageSaveAs");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/saveAs";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of TIFF image. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageTiff(PostImageTiffRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageTiff");
      }
       // verify the required parameter 'request.compression' is set
      if (request.compression == null) {
        throw new ApiException(400, "Missing the required parameter 'request.compression' when calling postImageTiff");
      }
       // verify the required parameter 'request.resolutionUnit' is set
      if (request.resolutionUnit == null) {
        throw new ApiException(400, "Missing the required parameter 'request.resolutionUnit' when calling postImageTiff");
      }
       // verify the required parameter 'request.bitDepth' is set
      if (request.bitDepth == null) {
        throw new ApiException(400, "Missing the required parameter 'request.bitDepth' when calling postImageTiff");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/tiff";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "compression", request.compression);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "resolutionUnit", request.resolutionUnit);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bitDepth", request.bitDepth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "horizontalResolution", request.horizontalResolution);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "verticalResolution", request.verticalResolution);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Perform scaling, cropping and flipping of an image in a single request. Image is passed in a request stream.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageUpdate(PostImageUpdateRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageUpdate");
      }
       // verify the required parameter 'request.format' is set
      if (request.format == null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling postImageUpdate");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth == null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling postImageUpdate");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight == null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling postImageUpdate");
      }
       // verify the required parameter 'request.x' is set
      if (request.x == null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling postImageUpdate");
      }
       // verify the required parameter 'request.y' is set
      if (request.y == null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling postImageUpdate");
      }
       // verify the required parameter 'request.rectWidth' is set
      if (request.rectWidth == null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectWidth' when calling postImageUpdate");
      }
       // verify the required parameter 'request.rectHeight' is set
      if (request.rectHeight == null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectHeight' when calling postImageUpdate");
      }
       // verify the required parameter 'request.rotateFlipMethod' is set
      if (request.rotateFlipMethod == null) {
        throw new ApiException(400, "Missing the required parameter 'request.rotateFlipMethod' when calling postImageUpdate");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/updateImage";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "x", request.x);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "y", request.y);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rectWidth", request.rectWidth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rectHeight", request.rectHeight);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "rotateFlipMethod", request.rotateFlipMethod);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update parameters of WEBP image. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageWebP(PostImageWebPRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageWebP");
      }
       // verify the required parameter 'request.lossLess' is set
      if (request.lossLess == null) {
        throw new ApiException(400, "Missing the required parameter 'request.lossLess' when calling postImageWebP");
      }
       // verify the required parameter 'request.quality' is set
      if (request.quality == null) {
        throw new ApiException(400, "Missing the required parameter 'request.quality' when calling postImageWebP");
      }
       // verify the required parameter 'request.animLoopCount' is set
      if (request.animLoopCount == null) {
        throw new ApiException(400, "Missing the required parameter 'request.animLoopCount' when calling postImageWebP");
      }
       // verify the required parameter 'request.animBackgroundColor' is set
      if (request.animBackgroundColor == null) {
        throw new ApiException(400, "Missing the required parameter 'request.animBackgroundColor' when calling postImageWebP");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/webp";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "lossLess", request.lossLess);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "quality", request.quality);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "animLoopCount", request.animLoopCount);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "animBackgroundColor", request.animBackgroundColor);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Rasterize WMF image to PNG using given parameters. Image is passed in a request stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postImageWmf(PostImageWmfRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageWmf");
      }
       // verify the required parameter 'request.bkColor' is set
      if (request.bkColor == null) {
        throw new ApiException(400, "Missing the required parameter 'request.bkColor' when calling postImageWmf");
      }
       // verify the required parameter 'request.pageWidth' is set
      if (request.pageWidth == null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageWidth' when calling postImageWmf");
      }
       // verify the required parameter 'request.pageHeight' is set
      if (request.pageHeight == null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageHeight' when calling postImageWmf");
      }
       // verify the required parameter 'request.borderX' is set
      if (request.borderX == null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderX' when calling postImageWmf");
      }
       // verify the required parameter 'request.borderY' is set
      if (request.borderY == null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderY' when calling postImageWmf");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/wmf";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bkColor", request.bkColor);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageWidth", request.pageWidth);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageHeight", request.pageHeight);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderX", request.borderX);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderY", request.borderY);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Add image and images features to search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postSearchContextAddImage(PostSearchContextAddImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling postSearchContextAddImage");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling postSearchContextAddImage");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/image";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Add tag and reference image to search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postSearchContextAddTag(PostSearchContextAddTagRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postSearchContextAddTag");
      }
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling postSearchContextAddTag");
      }
       // verify the required parameter 'request.tagName' is set
      if (request.tagName == null) {
        throw new ApiException(400, "Missing the required parameter 'request.tagName' when calling postSearchContextAddTag");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/addTag";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "tagName", request.tagName);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Compare two images.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchResultsSet
     * @throws Exception 
     */
    public ApiResponse postSearchContextCompareImages(PostSearchContextCompareImagesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling postSearchContextCompareImages");
      }
       // verify the required parameter 'request.imageId1' is set
      if (request.imageId1 == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId1' when calling postSearchContextCompareImages");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/compare";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId1", request.imageId1);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId2", request.imageId2);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (SearchResultsSet.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (SearchResultsSet.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (SearchResultsSet.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (SearchResultsSet.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (SearchResultsSet.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (SearchResultsSet.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (SearchResultsSet.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Extract images features and add them to search context
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse postSearchContextExtractImageFeatures(PostSearchContextExtractImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling postSearchContextExtractImageFeatures");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/features";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imagesFolder", request.imagesFolder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Find images by tag.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchResultsSet
     * @throws Exception 
     */
    public ApiResponse postSearchContextFindByTags(PostSearchContextFindByTagsRequest request) throws Exception 
    {
       // verify the required parameter 'request.tags' is set
      if (request.tags == null) {
        throw new ApiException(400, "Missing the required parameter 'request.tags' when calling postSearchContextFindByTags");
      }
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling postSearchContextFindByTags");
      }
       // verify the required parameter 'request.similarityThreshold' is set
      if (request.similarityThreshold == null) {
        throw new ApiException(400, "Missing the required parameter 'request.similarityThreshold' when calling postSearchContextFindByTags");
      }
       // verify the required parameter 'request.maxCount' is set
      if (request.maxCount == null) {
        throw new ApiException(400, "Missing the required parameter 'request.maxCount' when calling postSearchContextFindByTags");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/findByTags";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "similarityThreshold", request.similarityThreshold);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "maxCount", request.maxCount);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.tags != null) 
      {
          formParams.put("tags", request.tags); // form parameter
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (SearchResultsSet.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (SearchResultsSet.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (SearchResultsSet.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (SearchResultsSet.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (SearchResultsSet.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (SearchResultsSet.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (SearchResultsSet.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Appends existing TIFF image to another existing TIFF image (i.e. merges TIFF images).
     * 
     * @param request Holds parameters for this request invocation.
     * @return SaaSposeResponse
     * @throws Exception 
     */
    public ApiResponse postTiffAppend(PostTiffAppendRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name == null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postTiffAppend");
      }
       // verify the required parameter 'request.appendFile' is set
      if (request.appendFile == null) {
        throw new ApiException(400, "Missing the required parameter 'request.appendFile' when calling postTiffAppend");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/tiff/{name}/appendTiff";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "appendFile", request.appendFile);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  
	  
	  
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "POST", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (SaaSposeResponse.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (SaaSposeResponse.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (SaaSposeResponse.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (SaaSposeResponse.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (SaaSposeResponse.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (SaaSposeResponse.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (SaaSposeResponse.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update image and images features in search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse putSearchContextImage(PutSearchContextImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling putSearchContextImage");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling putSearchContextImage");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/image";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "PUT", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
    /**
     * Update images features in search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public ApiResponse putSearchContextImageFeatures(PutSearchContextImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling putSearchContextImageFeatures");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId == null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling putSearchContextImageFeatures");
      }
      // create path and map variables
      String resourcePath = this.configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/features";
	  
	  HashMap<String, Object> formParams = new HashMap<String, Object>();
	  resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
	  resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
	  
	  
	  if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
	
	  try 
      {                               
	      byte[] response = this.apiInvoker.invokeApi(
              resourcePath, 
              "PUT", 
              null, 
              null, 
              formParams);
				
		  if (response == null)
		  {
			  return null;
		  }
		
	      ApiResponse finalResponse; 
		  if (File.class.getName().equals(File.class.getName()))
		  {
			  finalResponse = new ApiResponse(response, null, null);
		  }
		  else if (File.class.getName().equals(ImagingResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, null, SerializationHelper.deserialize(new String(response), ImagingResponse.class));
		  }
		  else if (File.class.getName().equals(SaaSposeResponse.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SaaSposeResponse.class), null);
		  }
		  else if (File.class.getName().equals(ImageDuplicatesSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class), null);
		  }
		  else if (File.class.getName().equals(ImageFeatures.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), ImageFeatures.class), null);
		  }
		  else if (File.class.getName().equals(SearchContextStatus.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchContextStatus.class), null);
		  }
		  else if (File.class.getName().equals(SearchResultsSet.class.getName()))
		  {
			  finalResponse = new ApiResponse(null, SerializationHelper.deserialize(new String(response), SearchResultsSet.class), null);
		  }
		  else
		  {
		  	  finalResponse = new ApiResponse(null, null, null);
		  }
				
		  return finalResponse;
      } 
      catch (ApiException ex) 
      {
          if (ex.ErrorCode == 404) 
          {
              return null;
          }
                
          throw ex;                
      }
    }
  
}

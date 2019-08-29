/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ImagingApi.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
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

import java.util.HashMap;

/**
 * Aspose.Imaging Cloud API
 */
public class ImagingApi 
{
    /**
     * Current SDK version
     */
    public static final String Version = "19.8";

    /**
     * The configuration
     */
    public Configuration Configuration;
    
    /**
     * The API invoker
     */
    private ApiInvoker apiInvoker;
       
    /**
     * Initializes a new instance of the ImagingApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     */
    public ImagingApi(String baseUrl)
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.OnPremise = true;
        this.initImagingApi(config);
    }

    /**
     * Initializes a new instance of the ImagingApi class for Aspose Cloud-hosted service usage.
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
     * Initializes a new instance of the ImagingApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     *  @param apiVersion API version.
     *  @param debug If debug mode is enabled.
     * @throws Exception 
     */
    public ImagingApi(String baseUrl, String apiVersion, Boolean debugMode) throws Exception
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debugMode);
        config.OnPremise = true;
        this.initImagingApi(config);
    }

    /**
     * Initializes a new instance of the ImagingApi class for Aspose Cloud-hosted service usage.
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
     * Initializes a new instance of the ImagingApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     */
    public ImagingApi(String appKey, String appSid, String baseUrl, String apiVersion) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        this.initImagingApi(config);
    }

    /**
     * Initializes a new instance of the ImagingApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param debug If debug mode is enabled.
     */
    public ImagingApi(String appKey, String appSid, String baseUrl, String apiVersion, Boolean debug) throws Exception
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
     * @param configuration Configuration settings.
     */
    private void initImagingApi(Configuration configuration)
    {
        this.Configuration = configuration;
        int handlersCount = configuration.OnPremise ? 2 : 3;
        IRequestHandler[] requestHandlers = new IRequestHandler[handlersCount];
        requestHandlers[--handlersCount] = new ApiExceptionRequestHandler();
        requestHandlers[--handlersCount] = new DebugLogRequestHandler(this.Configuration);
        if (!configuration.OnPremise)
        {
            requestHandlers[--handlersCount] = new AuthRequestHandler(this.Configuration);
        }
        
        this.apiInvoker = new ApiInvoker(requestHandlers, this.Configuration);
    }
    
    /**
     * Add image and images features to search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void addSearchImage(AddSearchImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling addSearchImage");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling addSearchImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/image";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Appends existing TIFF image to another existing TIFF image (i.e. merges TIFF images).
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void appendTiff(AppendTiffRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling appendTiff");
      }
       // verify the required parameter 'request.appendFile' is set
      if (request.appendFile== null) {
        throw new ApiException(400, "Missing the required parameter 'request.appendFile' when calling appendTiff");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/tiff/{name}/appendTiff";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "appendFile", request.appendFile);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      
      
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Compare two images. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchResultsSet
     * @throws Exception 
     */
    public SearchResultsSet compareImages(CompareImagesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling compareImages");
      }
       // verify the required parameter 'request.imageId1' is set
      if (request.imageId1== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId1' when calling compareImages");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/compare";
      
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
      
      return SerializationHelper.deserialize(new String(response), SearchResultsSet.class);
    }
  
    /**
     * Update parameters of existing TIFF image accordingly to fax parameters.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] convertTiffToFax(ConvertTiffToFaxRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling convertTiffToFax");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/tiff/{name}/toFax";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Copy file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void copyFile(CopyFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.srcPath' is set
      if (request.srcPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling copyFile");
      }
       // verify the required parameter 'request.destPath' is set
      if (request.destPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling copyFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/storage/file/copy/{srcPath}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
      
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Copy folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void copyFolder(CopyFolderRequest request) throws Exception 
    {
       // verify the required parameter 'request.srcPath' is set
      if (request.srcPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling copyFolder");
      }
       // verify the required parameter 'request.destPath' is set
      if (request.destPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling copyFolder");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/storage/folder/copy/{srcPath}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
      
      
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Crop an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createCroppedImage(CreateCroppedImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createCroppedImage");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling createCroppedImage");
      }
       // verify the required parameter 'request.x' is set
      if (request.x== null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling createCroppedImage");
      }
       // verify the required parameter 'request.y' is set
      if (request.y== null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling createCroppedImage");
      }
       // verify the required parameter 'request.width' is set
      if (request.width== null) {
        throw new ApiException(400, "Missing the required parameter 'request.width' when calling createCroppedImage");
      }
       // verify the required parameter 'request.height' is set
      if (request.height== null) {
        throw new ApiException(400, "Missing the required parameter 'request.height' when calling createCroppedImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/crop";
      
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
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Create the folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void createFolder(CreateFolderRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling createFolder");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/storage/folder/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
      
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Extract images features and add them to search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void createImageFeatures(CreateImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling createImageFeatures");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/features";
      
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
      this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Get separate frame from existing TIFF image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createImageFrame(CreateImageFrameRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createImageFrame");
      }
       // verify the required parameter 'request.frameId' is set
      if (request.frameId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.frameId' when calling createImageFrame");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/frames/{frameId}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
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
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Create new search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchContextStatus
     * @throws Exception 
     */
    public SearchContextStatus createImageSearch(CreateImageSearchRequest request) throws Exception 
    {
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/create";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "detector", request.detector);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "matchingAlgorithm", request.matchingAlgorithm);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
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
      
      return SerializationHelper.deserialize(new String(response), SearchContextStatus.class);
    }
  
    /**
     * Add tag and reference image to search context. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void createImageTag(CreateImageTagRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createImageTag");
      }
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling createImageTag");
      }
       // verify the required parameter 'request.tagName' is set
      if (request.tagName== null) {
        throw new ApiException(400, "Missing the required parameter 'request.tagName' when calling createImageTag");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/addTag";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "tagName", request.tagName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Update parameters of BMP image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createModifiedBmp(CreateModifiedBmpRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createModifiedBmp");
      }
       // verify the required parameter 'request.bitsPerPixel' is set
      if (request.bitsPerPixel== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bitsPerPixel' when calling createModifiedBmp");
      }
       // verify the required parameter 'request.horizontalResolution' is set
      if (request.horizontalResolution== null) {
        throw new ApiException(400, "Missing the required parameter 'request.horizontalResolution' when calling createModifiedBmp");
      }
       // verify the required parameter 'request.verticalResolution' is set
      if (request.verticalResolution== null) {
        throw new ApiException(400, "Missing the required parameter 'request.verticalResolution' when calling createModifiedBmp");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/bmp";
      
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
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Process existing EMF imaging using given parameters. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createModifiedEmf(CreateModifiedEmfRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createModifiedEmf");
      }
       // verify the required parameter 'request.bkColor' is set
      if (request.bkColor== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bkColor' when calling createModifiedEmf");
      }
       // verify the required parameter 'request.pageWidth' is set
      if (request.pageWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageWidth' when calling createModifiedEmf");
      }
       // verify the required parameter 'request.pageHeight' is set
      if (request.pageHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageHeight' when calling createModifiedEmf");
      }
       // verify the required parameter 'request.borderX' is set
      if (request.borderX== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderX' when calling createModifiedEmf");
      }
       // verify the required parameter 'request.borderY' is set
      if (request.borderY== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderY' when calling createModifiedEmf");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/emf";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bkColor", request.bkColor);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageWidth", request.pageWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageHeight", request.pageHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderX", request.borderX);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderY", request.borderY);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      
      
      if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of GIF image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createModifiedGif(CreateModifiedGifRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createModifiedGif");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/gif";
      
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
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of JPEG image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createModifiedJpeg(CreateModifiedJpegRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createModifiedJpeg");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/jpg";
      
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
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of JPEG2000 image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createModifiedJpeg2000(CreateModifiedJpeg2000Request request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createModifiedJpeg2000");
      }
       // verify the required parameter 'request.comment' is set
      if (request.comment== null) {
        throw new ApiException(400, "Missing the required parameter 'request.comment' when calling createModifiedJpeg2000");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/jpg2000";
      
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
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of PSD image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createModifiedPsd(CreateModifiedPsdRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createModifiedPsd");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/psd";
      
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
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of SVG image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createModifiedSvg(CreateModifiedSvgRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createModifiedSvg");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/svg";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "colorType", request.colorType);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "textAsShapes", request.textAsShapes);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "scaleX", request.scaleX);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "scaleY", request.scaleY);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageWidth", request.pageWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageHeight", request.pageHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderX", request.borderX);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderY", request.borderY);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bkColor", request.bkColor);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      
      
      if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of TIFF image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createModifiedTiff(CreateModifiedTiffRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createModifiedTiff");
      }
       // verify the required parameter 'request.bitDepth' is set
      if (request.bitDepth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bitDepth' when calling createModifiedTiff");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/tiff";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bitDepth", request.bitDepth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "compression", request.compression);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "resolutionUnit", request.resolutionUnit);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "horizontalResolution", request.horizontalResolution);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "verticalResolution", request.verticalResolution);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of WEBP image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createModifiedWebP(CreateModifiedWebPRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createModifiedWebP");
      }
       // verify the required parameter 'request.lossLess' is set
      if (request.lossLess== null) {
        throw new ApiException(400, "Missing the required parameter 'request.lossLess' when calling createModifiedWebP");
      }
       // verify the required parameter 'request.quality' is set
      if (request.quality== null) {
        throw new ApiException(400, "Missing the required parameter 'request.quality' when calling createModifiedWebP");
      }
       // verify the required parameter 'request.animLoopCount' is set
      if (request.animLoopCount== null) {
        throw new ApiException(400, "Missing the required parameter 'request.animLoopCount' when calling createModifiedWebP");
      }
       // verify the required parameter 'request.animBackgroundColor' is set
      if (request.animBackgroundColor== null) {
        throw new ApiException(400, "Missing the required parameter 'request.animBackgroundColor' when calling createModifiedWebP");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/webp";
      
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
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Process existing WMF image using given parameters. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createModifiedWmf(CreateModifiedWmfRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createModifiedWmf");
      }
       // verify the required parameter 'request.bkColor' is set
      if (request.bkColor== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bkColor' when calling createModifiedWmf");
      }
       // verify the required parameter 'request.pageWidth' is set
      if (request.pageWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageWidth' when calling createModifiedWmf");
      }
       // verify the required parameter 'request.pageHeight' is set
      if (request.pageHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageHeight' when calling createModifiedWmf");
      }
       // verify the required parameter 'request.borderX' is set
      if (request.borderX== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderX' when calling createModifiedWmf");
      }
       // verify the required parameter 'request.borderY' is set
      if (request.borderY== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderY' when calling createModifiedWmf");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/wmf";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bkColor", request.bkColor);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageWidth", request.pageWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageHeight", request.pageHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderX", request.borderX);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderY", request.borderY);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      
      
      if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Resize an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createResizedImage(CreateResizedImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createResizedImage");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling createResizedImage");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling createResizedImage");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling createResizedImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/resize";
      
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
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Rotate and/or flip an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createRotateFlippedImage(CreateRotateFlippedImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createRotateFlippedImage");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling createRotateFlippedImage");
      }
       // verify the required parameter 'request.method' is set
      if (request.method== null) {
        throw new ApiException(400, "Missing the required parameter 'request.method' when calling createRotateFlippedImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/rotateflip";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "method", request.method);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export existing image to another format. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createSavedImageAs(CreateSavedImageAsRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createSavedImageAs");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling createSavedImageAs");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/saveAs";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Perform scaling, cropping and flipping of an image in a single request. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] createUpdatedImage(CreateUpdatedImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.x' is set
      if (request.x== null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.y' is set
      if (request.y== null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.rectWidth' is set
      if (request.rectWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectWidth' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.rectHeight' is set
      if (request.rectHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectHeight' when calling createUpdatedImage");
      }
       // verify the required parameter 'request.rotateFlipMethod' is set
      if (request.rotateFlipMethod== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rotateFlipMethod' when calling createUpdatedImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/updateImage";
      
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
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Crop an existing image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] cropImage(CropImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling cropImage");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling cropImage");
      }
       // verify the required parameter 'request.x' is set
      if (request.x== null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling cropImage");
      }
       // verify the required parameter 'request.y' is set
      if (request.y== null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling cropImage");
      }
       // verify the required parameter 'request.width' is set
      if (request.width== null) {
        throw new ApiException(400, "Missing the required parameter 'request.width' when calling cropImage");
      }
       // verify the required parameter 'request.height' is set
      if (request.height== null) {
        throw new ApiException(400, "Missing the required parameter 'request.height' when calling cropImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/crop";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "x", request.x);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "y", request.y);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "width", request.width);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "height", request.height);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Delete file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteFile(DeleteFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling deleteFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/storage/file/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
      
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "DELETE", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Delete folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteFolder(DeleteFolderRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling deleteFolder");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/storage/folder/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "recursive", request.recursive);
      
      
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "DELETE", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Deletes image features from search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteImageFeatures(DeleteImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling deleteImageFeatures");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling deleteImageFeatures");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/features";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "DELETE", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Deletes the search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteImageSearch(DeleteImageSearchRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling deleteImageSearch");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "DELETE", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Delete image and images features from search context
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteSearchImage(DeleteSearchImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling deleteSearchImage");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling deleteSearchImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/image";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "DELETE", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Download file
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] downloadFile(DownloadFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling downloadFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/storage/file/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Extract features from image without adding to search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImageFeatures
     * @throws Exception 
     */
    public ImageFeatures extractImageFeatures(ExtractImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling extractImageFeatures");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling extractImageFeatures");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/image2features";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
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
      
      return SerializationHelper.deserialize(new String(response), ImageFeatures.class);
    }
  
    /**
     * Get separate frame properties of existing TIFF image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImagingResponse
     * @throws Exception 
     */
    public ImagingResponse extractImageFrameProperties(ExtractImageFramePropertiesRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling extractImageFrameProperties");
      }
       // verify the required parameter 'request.frameId' is set
      if (request.frameId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.frameId' when calling extractImageFrameProperties");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/frames/{frameId}/properties";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "frameId", request.frameId);
      
      
      
      if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
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
      
      return SerializationHelper.deserialize(new String(response), ImagingResponse.class);
    }
  
    /**
     * Get properties of an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImagingResponse
     * @throws Exception 
     */
    public ImagingResponse extractImageProperties(ExtractImagePropertiesRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling extractImageProperties");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/properties";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
      
      if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
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
      
      return SerializationHelper.deserialize(new String(response), ImagingResponse.class);
    }
  
    /**
     * Find images duplicates.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImageDuplicatesSet
     * @throws Exception 
     */
    public ImageDuplicatesSet findImageDuplicates(FindImageDuplicatesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling findImageDuplicates");
      }
       // verify the required parameter 'request.similarityThreshold' is set
      if (request.similarityThreshold== null) {
        throw new ApiException(400, "Missing the required parameter 'request.similarityThreshold' when calling findImageDuplicates");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/findDuplicates";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "similarityThreshold", request.similarityThreshold);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
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
      
      return SerializationHelper.deserialize(new String(response), ImageDuplicatesSet.class);
    }
  
    /**
     * Find images by tags. Tags JSON string is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchResultsSet
     * @throws Exception 
     */
    public SearchResultsSet findImagesByTags(FindImagesByTagsRequest request) throws Exception 
    {
       // verify the required parameter 'request.tags' is set
      if (request.tags== null) {
        throw new ApiException(400, "Missing the required parameter 'request.tags' when calling findImagesByTags");
      }
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling findImagesByTags");
      }
       // verify the required parameter 'request.similarityThreshold' is set
      if (request.similarityThreshold== null) {
        throw new ApiException(400, "Missing the required parameter 'request.similarityThreshold' when calling findImagesByTags");
      }
       // verify the required parameter 'request.maxCount' is set
      if (request.maxCount== null) {
        throw new ApiException(400, "Missing the required parameter 'request.maxCount' when calling findImagesByTags");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/findByTags";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "similarityThreshold", request.similarityThreshold);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "maxCount", request.maxCount);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      if (request.tags != null) 
      {
          formParams.put("tags", request.tags);
      }
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
      
      return SerializationHelper.deserialize(new String(response), SearchResultsSet.class);
    }
  
    /**
     * Find similar images. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchResultsSet
     * @throws Exception 
     */
    public SearchResultsSet findSimilarImages(FindSimilarImagesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling findSimilarImages");
      }
       // verify the required parameter 'request.similarityThreshold' is set
      if (request.similarityThreshold== null) {
        throw new ApiException(400, "Missing the required parameter 'request.similarityThreshold' when calling findSimilarImages");
      }
       // verify the required parameter 'request.maxCount' is set
      if (request.maxCount== null) {
        throw new ApiException(400, "Missing the required parameter 'request.maxCount' when calling findSimilarImages");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/findSimilar";
      
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
      
      return SerializationHelper.deserialize(new String(response), SearchResultsSet.class);
    }
  
    /**
     * Get disc usage
     * 
     * @param request Holds parameters for this request invocation.
     * @return DiscUsage
     * @throws Exception 
     */
    public DiscUsage getDiscUsage(GetDiscUsageRequest request) throws Exception 
    {
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/storage/disc";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
      
      
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
      
      return SerializationHelper.deserialize(new String(response), DiscUsage.class);
    }
  
    /**
     * Get file versions
     * 
     * @param request Holds parameters for this request invocation.
     * @return FileVersions
     * @throws Exception 
     */
    public FileVersions getFileVersions(GetFileVersionsRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling getFileVersions");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/storage/version/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
      
      
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
      
      return SerializationHelper.deserialize(new String(response), FileVersions.class);
    }
  
    /**
     * Get all files and folders within a folder
     * 
     * @param request Holds parameters for this request invocation.
     * @return FilesList
     * @throws Exception 
     */
    public FilesList getFilesList(GetFilesListRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling getFilesList");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/storage/folder/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
      
      
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
      
      return SerializationHelper.deserialize(new String(response), FilesList.class);
    }
  
    /**
     * Gets image features from search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImageFeatures
     * @throws Exception 
     */
    public ImageFeatures getImageFeatures(GetImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getImageFeatures");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling getImageFeatures");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/features";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
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
      
      return SerializationHelper.deserialize(new String(response), ImageFeatures.class);
    }
  
    /**
     * Get separate frame from existing TIFF image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] getImageFrame(GetImageFrameRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageFrame");
      }
       // verify the required parameter 'request.frameId' is set
      if (request.frameId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.frameId' when calling getImageFrame");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/frames/{frameId}";
      
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
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Get separate frame properties of existing TIFF image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImagingResponse
     * @throws Exception 
     */
    public ImagingResponse getImageFrameProperties(GetImageFramePropertiesRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageFrameProperties");
      }
       // verify the required parameter 'request.frameId' is set
      if (request.frameId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.frameId' when calling getImageFrameProperties");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/frames/{frameId}/properties";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "frameId", request.frameId);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
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
      
      return SerializationHelper.deserialize(new String(response), ImagingResponse.class);
    }
  
    /**
     * Get properties of an image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImagingResponse
     * @throws Exception 
     */
    public ImagingResponse getImageProperties(GetImagePropertiesRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageProperties");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/properties";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
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
      
      return SerializationHelper.deserialize(new String(response), ImagingResponse.class);
    }
  
    /**
     * Gets the search context status.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchContextStatus
     * @throws Exception 
     */
    public SearchContextStatus getImageSearchStatus(GetImageSearchStatusRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getImageSearchStatus");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/status";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
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
      
      return SerializationHelper.deserialize(new String(response), SearchContextStatus.class);
    }
  
    /**
     * Get image from search context
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] getSearchImage(GetSearchImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getSearchImage");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling getSearchImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/image";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of existing BMP image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] modifyBmp(ModifyBmpRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling modifyBmp");
      }
       // verify the required parameter 'request.bitsPerPixel' is set
      if (request.bitsPerPixel== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bitsPerPixel' when calling modifyBmp");
      }
       // verify the required parameter 'request.horizontalResolution' is set
      if (request.horizontalResolution== null) {
        throw new ApiException(400, "Missing the required parameter 'request.horizontalResolution' when calling modifyBmp");
      }
       // verify the required parameter 'request.verticalResolution' is set
      if (request.verticalResolution== null) {
        throw new ApiException(400, "Missing the required parameter 'request.verticalResolution' when calling modifyBmp");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/bmp";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bitsPerPixel", request.bitsPerPixel);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "horizontalResolution", request.horizontalResolution);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "verticalResolution", request.verticalResolution);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Process existing EMF imaging using given parameters.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] modifyEmf(ModifyEmfRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling modifyEmf");
      }
       // verify the required parameter 'request.bkColor' is set
      if (request.bkColor== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bkColor' when calling modifyEmf");
      }
       // verify the required parameter 'request.pageWidth' is set
      if (request.pageWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageWidth' when calling modifyEmf");
      }
       // verify the required parameter 'request.pageHeight' is set
      if (request.pageHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageHeight' when calling modifyEmf");
      }
       // verify the required parameter 'request.borderX' is set
      if (request.borderX== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderX' when calling modifyEmf");
      }
       // verify the required parameter 'request.borderY' is set
      if (request.borderY== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderY' when calling modifyEmf");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/emf";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bkColor", request.bkColor);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageWidth", request.pageWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageHeight", request.pageHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderX", request.borderX);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderY", request.borderY);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of existing GIF image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] modifyGif(ModifyGifRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling modifyGif");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/gif";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "backgroundColorIndex", request.backgroundColorIndex);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "colorResolution", request.colorResolution);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "hasTrailer", request.hasTrailer);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "interlaced", request.interlaced);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "isPaletteSorted", request.isPaletteSorted);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pixelAspectRatio", request.pixelAspectRatio);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of existing JPEG image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] modifyJpeg(ModifyJpegRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling modifyJpeg");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/jpg";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "quality", request.quality);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "compressionType", request.compressionType);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of existing JPEG2000 image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] modifyJpeg2000(ModifyJpeg2000Request request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling modifyJpeg2000");
      }
       // verify the required parameter 'request.comment' is set
      if (request.comment== null) {
        throw new ApiException(400, "Missing the required parameter 'request.comment' when calling modifyJpeg2000");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/jpg2000";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "comment", request.comment);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "codec", request.codec);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of existing PSD image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] modifyPsd(ModifyPsdRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling modifyPsd");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/psd";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "channelsCount", request.channelsCount);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "compressionMethod", request.compressionMethod);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of existing SVG image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] modifySvg(ModifySvgRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling modifySvg");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/svg";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "colorType", request.colorType);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "textAsShapes", request.textAsShapes);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "scaleX", request.scaleX);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "scaleY", request.scaleY);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageWidth", request.pageWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageHeight", request.pageHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderX", request.borderX);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderY", request.borderY);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bkColor", request.bkColor);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of existing TIFF image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] modifyTiff(ModifyTiffRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling modifyTiff");
      }
       // verify the required parameter 'request.bitDepth' is set
      if (request.bitDepth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bitDepth' when calling modifyTiff");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/tiff";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bitDepth", request.bitDepth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "compression", request.compression);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "resolutionUnit", request.resolutionUnit);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "horizontalResolution", request.horizontalResolution);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "verticalResolution", request.verticalResolution);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update parameters of existing WEBP image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] modifyWebP(ModifyWebPRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling modifyWebP");
      }
       // verify the required parameter 'request.lossLess' is set
      if (request.lossLess== null) {
        throw new ApiException(400, "Missing the required parameter 'request.lossLess' when calling modifyWebP");
      }
       // verify the required parameter 'request.quality' is set
      if (request.quality== null) {
        throw new ApiException(400, "Missing the required parameter 'request.quality' when calling modifyWebP");
      }
       // verify the required parameter 'request.animLoopCount' is set
      if (request.animLoopCount== null) {
        throw new ApiException(400, "Missing the required parameter 'request.animLoopCount' when calling modifyWebP");
      }
       // verify the required parameter 'request.animBackgroundColor' is set
      if (request.animBackgroundColor== null) {
        throw new ApiException(400, "Missing the required parameter 'request.animBackgroundColor' when calling modifyWebP");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/webp";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "lossLess", request.lossLess);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "quality", request.quality);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "animLoopCount", request.animLoopCount);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "animBackgroundColor", request.animBackgroundColor);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Process existing WMF image using given parameters.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] modifyWmf(ModifyWmfRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling modifyWmf");
      }
       // verify the required parameter 'request.bkColor' is set
      if (request.bkColor== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bkColor' when calling modifyWmf");
      }
       // verify the required parameter 'request.pageWidth' is set
      if (request.pageWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageWidth' when calling modifyWmf");
      }
       // verify the required parameter 'request.pageHeight' is set
      if (request.pageHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageHeight' when calling modifyWmf");
      }
       // verify the required parameter 'request.borderX' is set
      if (request.borderX== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderX' when calling modifyWmf");
      }
       // verify the required parameter 'request.borderY' is set
      if (request.borderY== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderY' when calling modifyWmf");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/wmf";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bkColor", request.bkColor);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageWidth", request.pageWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageHeight", request.pageHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderX", request.borderX);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "borderY", request.borderY);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Move file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void moveFile(MoveFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.srcPath' is set
      if (request.srcPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling moveFile");
      }
       // verify the required parameter 'request.destPath' is set
      if (request.destPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling moveFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/storage/file/move/{srcPath}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
      
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Move folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void moveFolder(MoveFolderRequest request) throws Exception 
    {
       // verify the required parameter 'request.srcPath' is set
      if (request.srcPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling moveFolder");
      }
       // verify the required parameter 'request.destPath' is set
      if (request.destPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling moveFolder");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/storage/folder/move/{srcPath}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
      
      
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Check if file or folder exists
     * 
     * @param request Holds parameters for this request invocation.
     * @return ObjectExist
     * @throws Exception 
     */
    public ObjectExist objectExists(ObjectExistsRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling objectExists");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/storage/exist/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
      
      
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
      
      return SerializationHelper.deserialize(new String(response), ObjectExist.class);
    }
  
    /**
     * Resize an existing image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] resizeImage(ResizeImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling resizeImage");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling resizeImage");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling resizeImage");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling resizeImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/resize";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Rotate and/or flip an existing image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] rotateFlipImage(RotateFlipImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling rotateFlipImage");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling rotateFlipImage");
      }
       // verify the required parameter 'request.method' is set
      if (request.method== null) {
        throw new ApiException(400, "Missing the required parameter 'request.method' when calling rotateFlipImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/rotateflip";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "method", request.method);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Export existing image to another format.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] saveImageAs(SaveImageAsRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling saveImageAs");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling saveImageAs");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/saveAs";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Check if storage exists
     * 
     * @param request Holds parameters for this request invocation.
     * @return StorageExist
     * @throws Exception 
     */
    public StorageExist storageExists(StorageExistsRequest request) throws Exception 
    {
       // verify the required parameter 'request.storageName' is set
      if (request.storageName== null) {
        throw new ApiException(400, "Missing the required parameter 'request.storageName' when calling storageExists");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/storage/{storageName}/exist";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "storageName", request.storageName);
      
      
      
      
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
      
      return SerializationHelper.deserialize(new String(response), StorageExist.class);
    }
  
    /**
     * Perform scaling, cropping and flipping of an existing image in a single request.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] updateImage(UpdateImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling updateImage");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling updateImage");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling updateImage");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling updateImage");
      }
       // verify the required parameter 'request.x' is set
      if (request.x== null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling updateImage");
      }
       // verify the required parameter 'request.y' is set
      if (request.y== null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling updateImage");
      }
       // verify the required parameter 'request.rectWidth' is set
      if (request.rectWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectWidth' when calling updateImage");
      }
       // verify the required parameter 'request.rectHeight' is set
      if (request.rectHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectHeight' when calling updateImage");
      }
       // verify the required parameter 'request.rotateFlipMethod' is set
      if (request.rotateFlipMethod== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rotateFlipMethod' when calling updateImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/updateImage";
      
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
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Update images features in search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void updateImageFeatures(UpdateImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling updateImageFeatures");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling updateImageFeatures");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/features";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Update image and images features in search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void updateSearchImage(UpdateSearchImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling updateSearchImage");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling updateSearchImage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/ai/imageSearch/{searchContextId}/image";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "searchContextId", request.searchContextId);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "imageId", request.imageId);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      
      
      if (request.imageData != null) 
      {
          formParams.put("imageData", this.apiInvoker.toFileInfo(request.imageData, "imageData"));
      }
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Upload file
     * 
     * @param request Holds parameters for this request invocation.
     * @return FilesUploadResult
     * @throws Exception 
     */
    public FilesUploadResult uploadFile(UploadFileRequest request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling uploadFile");
      }
       // verify the required parameter 'request.file' is set
      if (request.File== null) {
        throw new ApiException(400, "Missing the required parameter 'request.file' when calling uploadFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/storage/file/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
      
      if (request.File != null) 
      {
          formParams.put("file", this.apiInvoker.toFileInfo(request.File, "File"));
      }
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
      
      return SerializationHelper.deserialize(new String(response), FilesUploadResult.class);
    }
  
}

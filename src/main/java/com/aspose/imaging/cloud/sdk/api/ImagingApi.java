/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ImagingApi.java">
*   Copyright (c) 2019 Aspose Pty Ltd. All rights reserved.
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
    public static final String Version = "19.4";

    /**
     * The configuration
     */
    public Configuration Configuration;
    
    /**
     * The API invoker
     */
    private ApiInvoker apiInvoker;

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
     * Initializes a new instance of the ImagingApi class.
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
        IRequestHandler[] requestHandlers = new IRequestHandler[3];
        requestHandlers[0] = new AuthRequestHandler(this.Configuration);
        requestHandlers[1] = new DebugLogRequestHandler(this.Configuration);
        requestHandlers[2] = new ApiExceptionRequestHandler();
        this.apiInvoker = new ApiInvoker(requestHandlers, this.Configuration);
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
          "POST", 
          null, 
          null, 
          formParams);
          
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
     * Deletes the search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteSearchContext(DeleteSearchContextRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling deleteSearchContext");
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
    public void deleteSearchContextImage(DeleteSearchContextImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling deleteSearchContextImage");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling deleteSearchContextImage");
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
     * Deletes image features from search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteSearchContextImageFeatures(DeleteSearchContextImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling deleteSearchContextImageFeatures");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling deleteSearchContextImageFeatures");
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
     * Update parameters of existing BMP image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] getImageBmp(GetImageBmpRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageBmp");
      }
       // verify the required parameter 'request.bitsPerPixel' is set
      if (request.bitsPerPixel== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bitsPerPixel' when calling getImageBmp");
      }
       // verify the required parameter 'request.horizontalResolution' is set
      if (request.horizontalResolution== null) {
        throw new ApiException(400, "Missing the required parameter 'request.horizontalResolution' when calling getImageBmp");
      }
       // verify the required parameter 'request.verticalResolution' is set
      if (request.verticalResolution== null) {
        throw new ApiException(400, "Missing the required parameter 'request.verticalResolution' when calling getImageBmp");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/bmp";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "bitsPerPixel", request.bitsPerPixel);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "horizontalResolution", request.horizontalResolution);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "verticalResolution", request.verticalResolution);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
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
     * Crop an existing image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] getImageCrop(GetImageCropRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageCrop");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getImageCrop");
      }
       // verify the required parameter 'request.x' is set
      if (request.x== null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling getImageCrop");
      }
       // verify the required parameter 'request.y' is set
      if (request.y== null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling getImageCrop");
      }
       // verify the required parameter 'request.width' is set
      if (request.width== null) {
        throw new ApiException(400, "Missing the required parameter 'request.width' when calling getImageCrop");
      }
       // verify the required parameter 'request.height' is set
      if (request.height== null) {
        throw new ApiException(400, "Missing the required parameter 'request.height' when calling getImageCrop");
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
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
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
    public byte[] getImageEmf(GetImageEmfRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageEmf");
      }
       // verify the required parameter 'request.bkColor' is set
      if (request.bkColor== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bkColor' when calling getImageEmf");
      }
       // verify the required parameter 'request.pageWidth' is set
      if (request.pageWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageWidth' when calling getImageEmf");
      }
       // verify the required parameter 'request.pageHeight' is set
      if (request.pageHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageHeight' when calling getImageEmf");
      }
       // verify the required parameter 'request.borderX' is set
      if (request.borderX== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderX' when calling getImageEmf");
      }
       // verify the required parameter 'request.borderY' is set
      if (request.borderY== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderY' when calling getImageEmf");
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
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
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
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
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
     * Update parameters of existing GIF image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] getImageGif(GetImageGifRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageGif");
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
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
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
    public byte[] getImageJpeg2000(GetImageJpeg2000Request request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageJpeg2000");
      }
       // verify the required parameter 'request.comment' is set
      if (request.comment== null) {
        throw new ApiException(400, "Missing the required parameter 'request.comment' when calling getImageJpeg2000");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/jpg2000";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "comment", request.comment);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "codec", request.codec);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
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
    public byte[] getImageJpg(GetImageJpgRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageJpg");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/jpg";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "quality", request.quality);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "compressionType", request.compressionType);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
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
     * Update parameters of existing PSD image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] getImagePsd(GetImagePsdRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImagePsd");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/psd";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "channelsCount", request.channelsCount);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "compressionMethod", request.compressionMethod);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromScratch", request.fromScratch);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
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
     * Resize an existing image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] getImageResize(GetImageResizeRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageResize");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getImageResize");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling getImageResize");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling getImageResize");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/resize";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newWidth", request.newWidth);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "newHeight", request.newHeight);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
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
    public byte[] getImageRotateFlip(GetImageRotateFlipRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageRotateFlip");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getImageRotateFlip");
      }
       // verify the required parameter 'request.method' is set
      if (request.method== null) {
        throw new ApiException(400, "Missing the required parameter 'request.method' when calling getImageRotateFlip");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/rotateflip";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "method", request.method);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
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
    public byte[] getImageSaveAs(GetImageSaveAsRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageSaveAs");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getImageSaveAs");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/saveAs";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
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
     * Update parameters of existing TIFF image.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] getImageTiff(GetImageTiffRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageTiff");
      }
       // verify the required parameter 'request.compression' is set
      if (request.compression== null) {
        throw new ApiException(400, "Missing the required parameter 'request.compression' when calling getImageTiff");
      }
       // verify the required parameter 'request.resolutionUnit' is set
      if (request.resolutionUnit== null) {
        throw new ApiException(400, "Missing the required parameter 'request.resolutionUnit' when calling getImageTiff");
      }
       // verify the required parameter 'request.bitDepth' is set
      if (request.bitDepth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bitDepth' when calling getImageTiff");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/{name}/tiff";
      
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
      
      
      
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Perform scaling, cropping and flipping of an existing image in a single request.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] getImageUpdate(GetImageUpdateRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageUpdate");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getImageUpdate");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling getImageUpdate");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling getImageUpdate");
      }
       // verify the required parameter 'request.x' is set
      if (request.x== null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling getImageUpdate");
      }
       // verify the required parameter 'request.y' is set
      if (request.y== null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling getImageUpdate");
      }
       // verify the required parameter 'request.rectWidth' is set
      if (request.rectWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectWidth' when calling getImageUpdate");
      }
       // verify the required parameter 'request.rectHeight' is set
      if (request.rectHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectHeight' when calling getImageUpdate");
      }
       // verify the required parameter 'request.rotateFlipMethod' is set
      if (request.rotateFlipMethod== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rotateFlipMethod' when calling getImageUpdate");
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
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
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
    public byte[] getImageWebP(GetImageWebPRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageWebP");
      }
       // verify the required parameter 'request.lossLess' is set
      if (request.lossLess== null) {
        throw new ApiException(400, "Missing the required parameter 'request.lossLess' when calling getImageWebP");
      }
       // verify the required parameter 'request.quality' is set
      if (request.quality== null) {
        throw new ApiException(400, "Missing the required parameter 'request.quality' when calling getImageWebP");
      }
       // verify the required parameter 'request.animLoopCount' is set
      if (request.animLoopCount== null) {
        throw new ApiException(400, "Missing the required parameter 'request.animLoopCount' when calling getImageWebP");
      }
       // verify the required parameter 'request.animBackgroundColor' is set
      if (request.animBackgroundColor== null) {
        throw new ApiException(400, "Missing the required parameter 'request.animBackgroundColor' when calling getImageWebP");
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
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
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
    public byte[] getImageWmf(GetImageWmfRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getImageWmf");
      }
       // verify the required parameter 'request.bkColor' is set
      if (request.bkColor== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bkColor' when calling getImageWmf");
      }
       // verify the required parameter 'request.pageWidth' is set
      if (request.pageWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageWidth' when calling getImageWmf");
      }
       // verify the required parameter 'request.pageHeight' is set
      if (request.pageHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageHeight' when calling getImageWmf");
      }
       // verify the required parameter 'request.borderX' is set
      if (request.borderX== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderX' when calling getImageWmf");
      }
       // verify the required parameter 'request.borderY' is set
      if (request.borderY== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderY' when calling getImageWmf");
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
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
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
     * Extract features from image without adding to search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImageFeatures
     * @throws Exception 
     */
    public ImageFeatures getSearchContextExtractImageFeatures(GetSearchContextExtractImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getSearchContextExtractImageFeatures");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling getSearchContextExtractImageFeatures");
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
     * Find images duplicates.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImageDuplicatesSet
     * @throws Exception 
     */
    public ImageDuplicatesSet getSearchContextFindDuplicates(GetSearchContextFindDuplicatesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getSearchContextFindDuplicates");
      }
       // verify the required parameter 'request.similarityThreshold' is set
      if (request.similarityThreshold== null) {
        throw new ApiException(400, "Missing the required parameter 'request.similarityThreshold' when calling getSearchContextFindDuplicates");
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
     * Find similar images. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchResultsSet
     * @throws Exception 
     */
    public SearchResultsSet getSearchContextFindSimilar(GetSearchContextFindSimilarRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getSearchContextFindSimilar");
      }
       // verify the required parameter 'request.similarityThreshold' is set
      if (request.similarityThreshold== null) {
        throw new ApiException(400, "Missing the required parameter 'request.similarityThreshold' when calling getSearchContextFindSimilar");
      }
       // verify the required parameter 'request.maxCount' is set
      if (request.maxCount== null) {
        throw new ApiException(400, "Missing the required parameter 'request.maxCount' when calling getSearchContextFindSimilar");
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
     * Get image from search context
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] getSearchContextImage(GetSearchContextImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getSearchContextImage");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling getSearchContextImage");
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
     * Gets image features from search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImageFeatures
     * @throws Exception 
     */
    public ImageFeatures getSearchContextImageFeatures(GetSearchContextImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getSearchContextImageFeatures");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling getSearchContextImageFeatures");
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
     * Gets the search context status.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchContextStatus
     * @throws Exception 
     */
    public SearchContextStatus getSearchContextStatus(GetSearchContextStatusRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling getSearchContextStatus");
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
     * Update parameters of existing TIFF image accordingly to fax parameters.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] getTiffToFax(GetTiffToFaxRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getTiffToFax");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/tiff/{name}/toFax";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "outPath", request.outPath);
      
      
      
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
     * Create new search context.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchContextStatus
     * @throws Exception 
     */
    public SearchContextStatus postCreateSearchContext(PostCreateSearchContextRequest request) throws Exception 
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
     * Update parameters of BMP image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postImageBmp(PostImageBmpRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageBmp");
      }
       // verify the required parameter 'request.bitsPerPixel' is set
      if (request.bitsPerPixel== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bitsPerPixel' when calling postImageBmp");
      }
       // verify the required parameter 'request.horizontalResolution' is set
      if (request.horizontalResolution== null) {
        throw new ApiException(400, "Missing the required parameter 'request.horizontalResolution' when calling postImageBmp");
      }
       // verify the required parameter 'request.verticalResolution' is set
      if (request.verticalResolution== null) {
        throw new ApiException(400, "Missing the required parameter 'request.verticalResolution' when calling postImageBmp");
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
     * Crop an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postImageCrop(PostImageCropRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageCrop");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling postImageCrop");
      }
       // verify the required parameter 'request.x' is set
      if (request.x== null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling postImageCrop");
      }
       // verify the required parameter 'request.y' is set
      if (request.y== null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling postImageCrop");
      }
       // verify the required parameter 'request.width' is set
      if (request.width== null) {
        throw new ApiException(400, "Missing the required parameter 'request.width' when calling postImageCrop");
      }
       // verify the required parameter 'request.height' is set
      if (request.height== null) {
        throw new ApiException(400, "Missing the required parameter 'request.height' when calling postImageCrop");
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
     * Process existing EMF imaging using given parameters. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postImageEmf(PostImageEmfRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageEmf");
      }
       // verify the required parameter 'request.bkColor' is set
      if (request.bkColor== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bkColor' when calling postImageEmf");
      }
       // verify the required parameter 'request.pageWidth' is set
      if (request.pageWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageWidth' when calling postImageEmf");
      }
       // verify the required parameter 'request.pageHeight' is set
      if (request.pageHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageHeight' when calling postImageEmf");
      }
       // verify the required parameter 'request.borderX' is set
      if (request.borderX== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderX' when calling postImageEmf");
      }
       // verify the required parameter 'request.borderY' is set
      if (request.borderY== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderY' when calling postImageEmf");
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
     * Get separate frame from existing TIFF image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postImageFrame(PostImageFrameRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageFrame");
      }
       // verify the required parameter 'request.frameId' is set
      if (request.frameId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.frameId' when calling postImageFrame");
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
     * Get separate frame properties of existing TIFF image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImagingResponse
     * @throws Exception 
     */
    public ImagingResponse postImageFrameProperties(PostImageFramePropertiesRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageFrameProperties");
      }
       // verify the required parameter 'request.frameId' is set
      if (request.frameId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.frameId' when calling postImageFrameProperties");
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
     * Update parameters of GIF image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postImageGif(PostImageGifRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageGif");
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
     * Update parameters of JPEG2000 image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postImageJpeg2000(PostImageJpeg2000Request request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageJpeg2000");
      }
       // verify the required parameter 'request.comment' is set
      if (request.comment== null) {
        throw new ApiException(400, "Missing the required parameter 'request.comment' when calling postImageJpeg2000");
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
     * Update parameters of JPEG image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postImageJpg(PostImageJpgRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageJpg");
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
     * Get properties of an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return ImagingResponse
     * @throws Exception 
     */
    public ImagingResponse postImageProperties(PostImagePropertiesRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageProperties");
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
     * Update parameters of PSD image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postImagePsd(PostImagePsdRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImagePsd");
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
     * Resize an image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postImageResize(PostImageResizeRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageResize");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling postImageResize");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling postImageResize");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling postImageResize");
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
    public byte[] postImageRotateFlip(PostImageRotateFlipRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageRotateFlip");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling postImageRotateFlip");
      }
       // verify the required parameter 'request.method' is set
      if (request.method== null) {
        throw new ApiException(400, "Missing the required parameter 'request.method' when calling postImageRotateFlip");
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
    public byte[] postImageSaveAs(PostImageSaveAsRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageSaveAs");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling postImageSaveAs");
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
     * Update parameters of TIFF image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postImageTiff(PostImageTiffRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageTiff");
      }
       // verify the required parameter 'request.compression' is set
      if (request.compression== null) {
        throw new ApiException(400, "Missing the required parameter 'request.compression' when calling postImageTiff");
      }
       // verify the required parameter 'request.resolutionUnit' is set
      if (request.resolutionUnit== null) {
        throw new ApiException(400, "Missing the required parameter 'request.resolutionUnit' when calling postImageTiff");
      }
       // verify the required parameter 'request.bitDepth' is set
      if (request.bitDepth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bitDepth' when calling postImageTiff");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/imaging/tiff";
      
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
    public byte[] postImageUpdate(PostImageUpdateRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageUpdate");
      }
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling postImageUpdate");
      }
       // verify the required parameter 'request.newWidth' is set
      if (request.newWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newWidth' when calling postImageUpdate");
      }
       // verify the required parameter 'request.newHeight' is set
      if (request.newHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.newHeight' when calling postImageUpdate");
      }
       // verify the required parameter 'request.x' is set
      if (request.x== null) {
        throw new ApiException(400, "Missing the required parameter 'request.x' when calling postImageUpdate");
      }
       // verify the required parameter 'request.y' is set
      if (request.y== null) {
        throw new ApiException(400, "Missing the required parameter 'request.y' when calling postImageUpdate");
      }
       // verify the required parameter 'request.rectWidth' is set
      if (request.rectWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectWidth' when calling postImageUpdate");
      }
       // verify the required parameter 'request.rectHeight' is set
      if (request.rectHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rectHeight' when calling postImageUpdate");
      }
       // verify the required parameter 'request.rotateFlipMethod' is set
      if (request.rotateFlipMethod== null) {
        throw new ApiException(400, "Missing the required parameter 'request.rotateFlipMethod' when calling postImageUpdate");
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
     * Update parameters of WEBP image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] postImageWebP(PostImageWebPRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageWebP");
      }
       // verify the required parameter 'request.lossLess' is set
      if (request.lossLess== null) {
        throw new ApiException(400, "Missing the required parameter 'request.lossLess' when calling postImageWebP");
      }
       // verify the required parameter 'request.quality' is set
      if (request.quality== null) {
        throw new ApiException(400, "Missing the required parameter 'request.quality' when calling postImageWebP");
      }
       // verify the required parameter 'request.animLoopCount' is set
      if (request.animLoopCount== null) {
        throw new ApiException(400, "Missing the required parameter 'request.animLoopCount' when calling postImageWebP");
      }
       // verify the required parameter 'request.animBackgroundColor' is set
      if (request.animBackgroundColor== null) {
        throw new ApiException(400, "Missing the required parameter 'request.animBackgroundColor' when calling postImageWebP");
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
    public byte[] postImageWmf(PostImageWmfRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postImageWmf");
      }
       // verify the required parameter 'request.bkColor' is set
      if (request.bkColor== null) {
        throw new ApiException(400, "Missing the required parameter 'request.bkColor' when calling postImageWmf");
      }
       // verify the required parameter 'request.pageWidth' is set
      if (request.pageWidth== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageWidth' when calling postImageWmf");
      }
       // verify the required parameter 'request.pageHeight' is set
      if (request.pageHeight== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageHeight' when calling postImageWmf");
      }
       // verify the required parameter 'request.borderX' is set
      if (request.borderX== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderX' when calling postImageWmf");
      }
       // verify the required parameter 'request.borderY' is set
      if (request.borderY== null) {
        throw new ApiException(400, "Missing the required parameter 'request.borderY' when calling postImageWmf");
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
     * Add image and images features to search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void postSearchContextAddImage(PostSearchContextAddImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling postSearchContextAddImage");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling postSearchContextAddImage");
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
     * Add tag and reference image to search context. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void postSearchContextAddTag(PostSearchContextAddTagRequest request) throws Exception 
    {
       // verify the required parameter 'request.imageData' is set
      if (request.imageData== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageData' when calling postSearchContextAddTag");
      }
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling postSearchContextAddTag");
      }
       // verify the required parameter 'request.tagName' is set
      if (request.tagName== null) {
        throw new ApiException(400, "Missing the required parameter 'request.tagName' when calling postSearchContextAddTag");
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
     * Compare two images. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchResultsSet
     * @throws Exception 
     */
    public SearchResultsSet postSearchContextCompareImages(PostSearchContextCompareImagesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling postSearchContextCompareImages");
      }
       // verify the required parameter 'request.imageId1' is set
      if (request.imageId1== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId1' when calling postSearchContextCompareImages");
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
     * Extract images features and add them to search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void postSearchContextExtractImageFeatures(PostSearchContextExtractImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling postSearchContextExtractImageFeatures");
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
     * Find images by tags. Tags JSON string is passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @return SearchResultsSet
     * @throws Exception 
     */
    public SearchResultsSet postSearchContextFindByTags(PostSearchContextFindByTagsRequest request) throws Exception 
    {
       // verify the required parameter 'request.tags' is set
      if (request.tags== null) {
        throw new ApiException(400, "Missing the required parameter 'request.tags' when calling postSearchContextFindByTags");
      }
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling postSearchContextFindByTags");
      }
       // verify the required parameter 'request.similarityThreshold' is set
      if (request.similarityThreshold== null) {
        throw new ApiException(400, "Missing the required parameter 'request.similarityThreshold' when calling postSearchContextFindByTags");
      }
       // verify the required parameter 'request.maxCount' is set
      if (request.maxCount== null) {
        throw new ApiException(400, "Missing the required parameter 'request.maxCount' when calling postSearchContextFindByTags");
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
     * Appends existing TIFF image to another existing TIFF image (i.e. merges TIFF images).
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void postTiffAppend(PostTiffAppendRequest request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling postTiffAppend");
      }
       // verify the required parameter 'request.appendFile' is set
      if (request.appendFile== null) {
        throw new ApiException(400, "Missing the required parameter 'request.appendFile' when calling postTiffAppend");
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
     * Update image and images features in search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void putSearchContextImage(PutSearchContextImageRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling putSearchContextImage");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling putSearchContextImage");
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
     * Update images features in search context. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void putSearchContextImageFeatures(PutSearchContextImageFeaturesRequest request) throws Exception 
    {
       // verify the required parameter 'request.searchContextId' is set
      if (request.searchContextId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.searchContextId' when calling putSearchContextImageFeatures");
      }
       // verify the required parameter 'request.imageId' is set
      if (request.imageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.imageId' when calling putSearchContextImageFeatures");
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
          "POST", 
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

/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ApiTester.java">
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

package com.aspose.imaging.cloud.test.base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;

import com.aspose.imaging.cloud.sdk.invoker.ApiResponse;
import com.aspose.imaging.cloud.sdk.invoker.AuthType;
import com.aspose.imaging.cloud.sdk.invoker.JSON;
import com.aspose.imaging.cloud.sdk.invoker.internal.SerializationHelper;
import com.aspose.imaging.cloud.sdk.invoker.internal.StreamHelper;
import com.aspose.imaging.cloud.sdk.model.requests.GetImagePropertiesRequest;
import com.aspose.imaging.cloud.sdk.stablemodel.ImagingResponse;
import com.aspose.storage.model.MoveFileResponse;
import com.aspose.storage.model.ResponseMessage;

/**
 * API tester base class.
 */
public abstract class ApiTester
{
    /**
     * The local test folder
     */
    protected final static String LocalTestFolder = "testData";

    /**
     * The cloud storage test folder
     */
    protected final static String CloudTestFolder = "ImagingCloudTestJava";
    
    /**
     * The cloud references folder
     */
    protected final static String CloudReferencesFolder = "ImagingCloudSdkTestReferences";

    /**
     * The default cloud storage
     */
    protected final static String DefaultStorage = "Imaging-QA";
    
    /**
     * Original data folder.
     */
    protected final static String OriginalDataFolder = "ImagingCloudSdkInputTestData";
    
    /**
     * Input test files info
     */
    protected static List<StorageFileInfo> InputTestFiles;

    /**
     * Aspose.Imaging API
     */
    protected static com.aspose.imaging.cloud.sdk.api.ImagingApi ImagingApi;

    /**
     * Aspose.Storage API
     */
    protected static com.aspose.storage.api.StorageApi StorageApi;
	
	/**
	 * The server access file
	 */
    private final static String ServerAccessFile = "serverAccess.json";
    
    /**
	 * The API version
	 */
    private final static String ApiVersion = "v2.0";

    /**
     * The application key
     */
    private final static String AppKey = "xxx";

    /**
     * The application SID
     */
    private final static String AppSid = "xxx";

    /**
     * The base URL
     */
    private final static String BaseUrl = "http://api.aspose.cloud/";
    
    /**
     * Temporary file name
     */
    private final static String tempFileName = "imagingJavaSdkTempFile";
    
    /**
     * Current test storage
     */
    protected static String TestStorage;

    /**
     * Gets or sets a value indicating whether resulting images should be removed from cloud storage.
     */
    public Boolean RemoveResult = true;

    /**
     * Gets or sets a value indicating whether to automatic recover reference (i.e. if resulting images of failed tests are considered as new valid references).
     * Please, change this value ONLY if you clearly understand the consequences, or it may lead to replacement of the images you need, so they will be lost.
     */
    public Boolean AutoRecoverReference = false;
    
    /**
     * The size difference division
     */
    protected final long SizeDiffDivision = 20;

    /**
     * The basic export formats
     */
    protected final String[] BasicExportFormats = new String[]
    {
        "bmp",
        "gif",
        "jpg",
        "png",
        "psd",
        "tiff"
    };

    /**
     * API call retry count
     */
    private final int retryCount = 5;
    
    /**
     * API call retry time (in seconds)
     */
    private final int retryTime = 3;

    /**
     * Initializes tester class.
     * @throws Exception
     */
    @BeforeClass
    public static void initTester() throws Exception
    {
        TestStorage = System.getenv("StorageName");

        if (isNullOrEmpty(TestStorage))
        {
            System.out.println("Storage name is not set by environment variable. Using the default one.");
            TestStorage = DefaultStorage;
        }
        
    	createApiInstances();
    	finilizeTester();
    }
    
    /**
     * Finalizes tester class.
     */
    @AfterClass
    public static void finilizeTester()
    {
    	File tempFile = new File(tempFileName);
    	if (tempFile.exists())
    	{
    		tempFile.delete();
    	}
    	
    	if (StorageApi.GetIsExist(CloudTestFolder, "", TestStorage).getFileExist().getIsExist())
        {
            StorageApi.DeleteFolder(CloudTestFolder, TestStorage, true);
        }
    }

    /**
     * Creates the API instances using default access parameters.
     * @throws Exception 
     */
    protected static void createApiInstances() throws Exception
    {
        createApiInstances(AppKey, AppSid, BaseUrl, ApiVersion, AuthType.OAuth2, false);
    }
    
    /**
     * Creates the API instances using given access parameters.
     * @param appKey The application key.
     * @param appSid The application SID.
     * @param baseUrl The base URL.
     * @param apiVersion The API version.
     * @param authType Type of the authentication.
     * @param debug If set to true, debug.
     * @throws Exception 
     */
    protected static void createApiInstances(String appKey, String appSid, String baseUrl, String apiVersion, AuthType authType, Boolean debug) throws Exception
    {
    	 if (appKey.equals(AppKey) || appSid.equals(AppSid))
         {
    		 System.out.println("Access data isn't set explicitly. Trying to obtain it from environment variables.");

             appKey = System.getenv("AppKEY");
             appSid = System.getenv("AppSID");
             baseUrl = System.getenv("ApiEndpoint");
             apiVersion = System.getenv("ApiVersion");
         }

         if (isNullOrEmpty(appKey) || isNullOrEmpty(appSid) || isNullOrEmpty(baseUrl) || isNullOrEmpty(apiVersion))
         {
        	 System.out.println("Access data isn't set completely by environment variables. Filling unset data with default values.");
         }

         if (isNullOrEmpty(apiVersion))
         {
             apiVersion = ApiVersion;
             System.out.println("Set default API version");
         }
    	
         File serverAccessFile = new File(LocalTestFolder, ServerAccessFile);
         if (serverAccessFile.exists() && serverAccessFile.length() > 0)
         {
             String serverCredentials = FileUtils.readFileToString(serverAccessFile);
             ServerAccessData accessData = JSON.deserialize(serverCredentials, ServerAccessData.class);
             if (isNullOrEmpty(appKey))
             {
                 appKey = accessData.AppKey;
                 System.out.println("Set default App key");
             }

             if (isNullOrEmpty(appSid))
             {
                 appSid = accessData.AppSid;
                 System.out.println("Set default App SID");
             }

             if (isNullOrEmpty(baseUrl))
             {
                 baseUrl = accessData.BaseURL;
                 System.out.println("Set default base URL");
             }
         }
         else
         {
             throw new Exception("Please, specify valid access data (AppKey, AppSid, Base URL)");
         }
         
         System.out.println("App key: " + appKey);
         System.out.println("App SID: " + appSid);
         System.out.println("Storage: " + TestStorage);
         System.out.println("Base URL: " + baseUrl);
         System.out.println("API version: " + apiVersion);

         ImagingApi = new com.aspose.imaging.cloud.sdk.api.ImagingApi(appKey, appSid, baseUrl, apiVersion, authType, debug);
         StorageApi = new com.aspose.storage.api.StorageApi(baseUrl + "v2", appKey, appSid);
         
         InputTestFiles = fetchInputTestFilesInfo();
    }
    
    /**
     * Checks if string is null or empty.
     * @param str String to check.
     * @return If string is null or empty
     */
    private static Boolean isNullOrEmpty(String str)
    {
    	return str == null || str == "";
    }
    
    /**
     * Tests the typical GET request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param localSubfolder The local subfolder.
     * @param requestInvoker The request invoker.
     * @param propertiesTester The properties tester.
     * @throws Exception 
     */
    protected void testGetRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, String localSubfolder, Method requestInvoker, Method propertiesTester) throws NoSuchMethodException, Exception
    {
        this.testGetRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName, localSubfolder,
        		requestInvoker, propertiesTester, CloudTestFolder, DefaultStorage);
    }
    
    /**
     * Tests the typical GET request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param localSubfolder The local subfolder.
     * @param requestInvoker The request invoker.
     * @param propertiesTester The properties tester.
     * @param folder The folder.
     * @param storage The storage.
     * @throws Exception 
     */
    protected void testGetRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, String localSubfolder, Method requestInvoker, Method propertiesTester, String folder, String storage) throws NoSuchMethodException, Exception
    {
		final Boolean finalSaveResultToStorage = saveResultToStorage;
		final String finalFolder = folder;
		final String finalResultFileName = resultFileName;
		final String finalInputFileName = inputFileName;
		final Method finalRequestInvoker = requestInvoker;
		final Method obtainMethod = ApiTester.class.getDeclaredMethod("obtainGetResponseLength", String.class, String.class, Method.class);
		obtainMethod.setAccessible(true);
		final Object thisReference = this;
		
        this.testRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName, localSubfolder,
            new Callable<Long>() 
            {
            	public Long call() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
            	{
            		String outPath = finalSaveResultToStorage ? String.format("%s/%s", finalFolder, finalResultFileName) : null;
            		Object result = obtainMethod.invoke(thisReference, finalInputFileName, outPath, finalRequestInvoker);
            		return (Long)result;
                }
            }, 
            propertiesTester, folder, storage);
    }

    /**
     * Tests the typical POST request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param localSubfolder The local subfolder.
     * @param requestInvoker The request invoker.
     * @param propertiesTester The properties tester.
     * @throws Exception 
     */
    protected void testPostRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, String localSubfolder, Method requestInvoker, Method propertiesTester) throws NoSuchMethodException, Exception
    {
        this.testPostRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName, localSubfolder,
        		requestInvoker, propertiesTester, CloudTestFolder, DefaultStorage);
    }
    
    /**
     * Tests the typical POST request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param localSubfolder The local subfolder.
     * @param requestInvoker The request invoker.
     * @param propertiesTester The properties tester.
     * @param folder The folder.
     * @param storage The storage.
     * @throws Exception 
     * @throws NoSuchMethodException 
     */
    protected void testPostRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, String localSubfolder, Method requestInvoker, Method propertiesTester, String folder, String storage) throws NoSuchMethodException, Exception
    {
    	final Boolean finalSaveResultToStorage = saveResultToStorage;
		final String finalFolder = folder;
		final String finalResultFileName = resultFileName;
		final String finalInputFileName = inputFileName;
		final Method finalRequestInvoker = requestInvoker;
		final String finalStorage = storage;
		final Method obtainMethod = ApiTester.class.getDeclaredMethod("obtainPostResponseLength", String.class, String.class, String.class, 
				Method.class);
		obtainMethod.setAccessible(true);
		final Object thisReference = this;
		
        this.testRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName, localSubfolder,
            new Callable<Long>() 
            {
            	public Long call() throws Exception
            	{
            		String outPath = finalSaveResultToStorage ? String.format("%s/%s", finalFolder, finalResultFileName) : null;
            		return (Long)obtainMethod.invoke(thisReference, finalFolder + "/" + finalInputFileName, outPath, finalStorage, finalRequestInvoker);
                }
            }, 
            propertiesTester, folder, storage);
        }

    /**
     * Checks the size difference.
     * @param size1 The size 1.
     * @param size2 The size 2.
     * @throws Exception 
     */
    protected void checkSizeDiff(long size1, long size2) throws Exception
    {
        this.checkSizeDiff(size1, size2, SizeDiffDivision);
    }
    
    /**
     * Checks the size difference.
     * @param size1 The size 1.
     * @param size2 The size 2.
     * @param diffDivision The difference division.
     * @throws Exception 
     */
    protected void checkSizeDiff(long size1, long size2, long diffDivision) throws Exception
    {
        long avg = (size1 + size2) / 2;
        long diffVal = avg / diffDivision;
        if (Math.abs(size1 - size2) > diffVal)
        {
            throw new Exception(String.format("Size differs by more than %s percent: %s bytes VS %s bytes",
            		100 / diffDivision, size1, size2));
        }
    }

    /**
     * Checks if input file exists.
     * @param inputFileName Name of the input file.
     * @return
     */
    protected Boolean checkInputFileExists(String inputFileName)
    {
        for (StorageFileInfo storageFileInfo : InputTestFiles)
        {
            if (storageFileInfo.getName().equals(inputFileName))
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Gets the storage file information.
     * @param folder The folder which contains a file.
     * @param fileName Name of the file.
     * @param storage The storage.
     * @return The storage file information.
     * @throws Exception 
     */
    protected static StorageFileInfo getStorageFileInfo(String folder, String fileName,
        String storage) throws Exception
    {
        FilesList references = getStorageFolderInfo(folder, storage);
        for (StorageFileInfo storageFileInfo : references.Files)
        {
            if (storageFileInfo.getName().equals(fileName))
            {
                return storageFileInfo;
            }
        }

        return null;
    }
    
    /**
     * Gets the storage file information.
     * @param folder The folder which contains a file.
     * @param fileName Name of the file.
     * @param storage The storage.
     * @return The storage file information.
     * @throws Exception 
     */
    protected static FilesList getStorageFolderInfo(String folder, String storage) throws Exception
    {
        ResponseMessage fileListResponse = StorageApi.GetListFiles(folder, storage);
        Assert.assertEquals(200, (int)fileListResponse.getCode());
        InputStream stream = fileListResponse.getInputStream();
        byte[] stringBytes = StreamHelper.readAsBytes(stream);
        stream.close();
        
        String responseString = new String(stringBytes);
        return SerializationHelper.deserialize(responseString, FilesList.class);
    }

    /**
     * Fetches the input test files info.
     * @return The input test files info.
     * @throws Exception 
     */
    private static List<StorageFileInfo> fetchInputTestFilesInfo() throws Exception
    {
        ResponseMessage filesResponse = StorageApi.GetListFiles(OriginalDataFolder, TestStorage);
        Assert.assertEquals(200, (int)filesResponse.getCode());
        InputStream stream = filesResponse.getInputStream();
        byte[] stringBytes = StreamHelper.readAsBytes(stream);
        stream.close();
        
        String responseString = new String(stringBytes);
        FilesList filesList = SerializationHelper.deserialize(responseString, FilesList.class);
        return filesList.Files;
    }

    /**
     * Obtains the length of the typical GET request response. Used indirectly by method reference.
     * @param inputFileName Name of the input file.
     * @param outPath The request invoker.
     * @param requestInvoker The output path to save the result.
     * @return Typical GET request response.
     * @throws Exception 
     */
    private long obtainGetResponseLength(String inputFileName, String outPath, Method requestInvoker) throws Exception
    {
    	byte[] result = null;
    	Object responseObject = requestInvoker.invoke(this, inputFileName, outPath);

    	Assert.assertNotNull(responseObject);
    	ApiResponse response = (ApiResponse)responseObject;
    	if (response != null)
    	{
    		result = response.getResponseData();
    	}
    	
    	if (outPath == null || outPath.equals(""))
        {
            Assert.assertNotNull(result);
            return result.length;
        }

        return 0;
    }

    /**
     * Obtains the length of the typical POST request response. Used indirectly by method reference.
     * @param inputPath The input path.
     * @param outPath The output path to save the result.
     * @param storage The storage.
     * @param requestInvoker The request invoker.
     * @return Typical POST request response.
     * @throws Exception 
     */
    private long obtainPostResponseLength(String inputPath, String outPath, String storage, Method requestInvoker) throws Exception
    {
        ResponseMessage inputDownloadResponse = StorageApi.GetDownload(inputPath, "", storage);
        Assert.assertEquals((int)inputDownloadResponse.getCode(), 200);
        InputStream stream = null;
        byte[] result = null;
        try 
        {
        	stream = inputDownloadResponse.getInputStream();
        	Object responseObject = requestInvoker.invoke(this, StreamHelper.readAsBytes(stream), outPath);
        	Assert.assertNotNull(responseObject);
        	ApiResponse response = (ApiResponse)responseObject;
        	if (response != null)
        	{
        		result = response.getResponseData();
        	}
        }
        finally
        {
        	if (stream != null)
        	{
        		stream.close();
        	}
        }
        
        if (outPath == null || outPath.equals(""))
        {
            Assert.assertNotNull(result);
            return result.length;
        }

        return 0;
    }

    /**
     * Tests the typical request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param referenceSubfolder The result reference subfolder.
     * @param invokeRequestFunc The invoke request function that returns response length.
     * @param propertiesTester The properties tester.
     * @throws Exception 
     */
    private void testRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, String referenceSubfolder, Callable<Long> invokeRequestFunc, Method propertiesTester) throws Exception
    {
        this.testRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName, 
        		referenceSubfolder, invokeRequestFunc, propertiesTester, CloudTestFolder, DefaultStorage);
    }
    
    /**
     * Tests the typical request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param referenceSubfolder The result reference subfolder.
     * @param invokeRequestFunc The invoke request function that returns response length.
     * @param propertiesTester The properties tester.
     * @param folder The folder.
     * @param storage The storage.
     * @throws Exception 
     */
    private void testRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, String referenceSubfolder, Callable<Long> invokeRequestFunc, Method propertiesTester, 
    		String folder, String storage) throws Exception
    {
        System.out.println("Test method: " + testMethodName);

        if (!checkInputFileExists(inputFileName))
        {
            throw new Exception(
            		String.format("Input file %s doesn't exist in the specified storage folder: %s. Please, upload it first.",
            				inputFileName, folder));
        }
        
        if (!StorageApi.GetIsExist(folder + "/" + inputFileName, "", storage).getFileExist().getIsExist())
        {
        	File tempFile = new File(tempFileName);
        	if (tempFile.exists())
        	{
        		tempFile.delete();
        	}
        	
        	ResponseMessage downResponse = StorageApi.GetDownload(OriginalDataFolder + "/" + inputFileName, "", storage);
            Assert.assertEquals("OK", downResponse.getStatus().toUpperCase());
            InputStream downStream = null;
            FileOutputStream outStream = null;
            
            try {
                 outStream = new FileOutputStream(tempFileName);
                 outStream.write(StreamHelper.readAsBytes(downResponse.getInputStream()));
                 
			} finally {
				if (outStream != null)
				{
					outStream.close();
				}
				
				if (downStream != null)
				{
					downStream.close();
				}
			}
        	
            ResponseMessage putResponse = StorageApi.PutCreate(folder + "/" + inputFileName, "", storage, new File(tempFileName));
            Assert.assertEquals("OK", putResponse.getStatus().toUpperCase());
            Assert.assertTrue(StorageApi.GetIsExist(folder + "/" + inputFileName, "", storage).getFileExist().getIsExist());
        }

        Boolean passed = false;
        String outPath = null;
        String referencePath = CloudReferencesFolder + "/" + referenceSubfolder;

        try
        {
            System.out.println(parametersLine);
            
            if (saveResultToStorage)
            {
                outPath = folder + "/" + resultFileName;
                // remove output file from the storage (if exists)
                if (StorageApi.GetIsExist(outPath, "", storage).getFileExist().getIsExist())
                {
                    StorageApi.DeleteFile(outPath, "", storage);
                }
            }

            StorageFileInfo referenceInfo = getStorageFileInfo(referencePath, resultFileName, storage);
            if (referenceInfo == null)
            {
                throw new Exception(
                		String.format("Reference result file %s doesn't exist in the specified storage folder: %s. Please, upload it first.", 
                				resultFileName, referencePath));
            }

            long referenceLength = referenceInfo.getSize();
            long responseLength = this.invokeRequestWithRetry(invokeRequestFunc, this.retryCount);
            
            if (saveResultToStorage)
            {
                StorageFileInfo resultInfo = getStorageFileInfo(folder, resultFileName, storage);
                if (resultInfo == null)
                {
                    throw new Exception(
                        String.format("Result file %s doesn't exist in the specified storage folder: %s. Result isn't present in the storage by an unknown reason.", 
                        		resultFileName, folder));
                }

                this.checkSizeDiff(referenceLength, resultInfo.getSize());

                ImagingResponse resultProperties =
                    ImagingApi.getImageProperties(new GetImagePropertiesRequest(resultFileName, folder, storage)).getImagingResponse();
                Assert.assertNotNull(resultProperties);
                Assert.assertTrue(StorageApi.GetIsExist(folder + "/" + inputFileName, "", storage).getFileExist().getIsExist());
                ImagingResponse originalProperties =
                    ImagingApi.getImageProperties(new GetImagePropertiesRequest(inputFileName, folder, storage)).getImagingResponse();
                Assert.assertNotNull(originalProperties);

                if (propertiesTester != null)
                {
                	propertiesTester.invoke(this, originalProperties, resultProperties);
                }
            }
            else
            {
                // check resulting image from response stream
                this.checkSizeDiff(referenceLength, responseLength);
            }

            passed = true;
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            throw ex;
        }
        finally
        {
            if (saveResultToStorage && !passed && this.AutoRecoverReference && StorageApi.GetIsExist(outPath, "", storage).getFileExist().getIsExist())
            {
                MoveFileResponse moveFileResponse = StorageApi.PostMoveFile(outPath, referencePath + resultFileName, "", storage, storage);
                Assert.assertEquals("OK", moveFileResponse.getStatus());
            }
            else if (saveResultToStorage && this.RemoveResult && StorageApi.GetIsExist(outPath, "", storage).getFileExist().getIsExist())
            {
                StorageApi.DeleteFile(outPath, "", storage);
            }

            System.out.println("Test passed: " + passed);
        }
    }
    
    /**
     * Invokes test request with attempts to retry on fail.
     * @param invokeRequestFunc Request.
     * @param currentRetryCount Retry count that's left.
     * @return Result of the request invocation.
     * @throws Exception
     */
    private long invokeRequestWithRetry(Callable<Long> invokeRequestFunc, int currentRetryCount) throws Exception
    {
    	try
        {
            return invokeRequestFunc.call();
        }
        catch (java.lang.reflect.InvocationTargetException exception)
        {
        	if (--currentRetryCount > 0)
        	{
        		Thread.sleep(this.retryTime * 1000);
            	System.out.println("Retrying request invocation");
        		return this.invokeRequestWithRetry(invokeRequestFunc, currentRetryCount);
        	}
        	else
        	{
        		System.out.println(exception.getCause().getStackTrace().toString());
        		throw exception;
        	}
        }
    }
}
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ApiTester.java">
*   Copyright (c) 2018 Aspose Pty Ltd. All rights reserved.
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
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.Callable;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;

import com.aspose.imaging.cloud.sdk.invoker.AuthType;
import com.aspose.imaging.cloud.sdk.invoker.JSON;
import com.aspose.imaging.cloud.sdk.invoker.internal.SerializationHelper;
import com.aspose.imaging.cloud.sdk.invoker.internal.StreamHelper;
import com.aspose.imaging.cloud.sdk.model.requests.GetImagePropertiesRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PostImagePropertiesRequest;
import com.aspose.imaging.cloud.sdk.stablemodel.ImagingResponse;
import com.aspose.storage.model.ResponseMessage;

/**
 * API tester base class.
 */
public abstract class ApiTester
{
    /**
     * The default cloud storage
     */
    protected final static String DefaultStorage = "Imaging-QA";

    /**
     * Original data folder.
     */
    protected final static String OriginalDataFolder = "ImagingCloudSdkInputTestData";
    
    /**
     * If program runs in Android environment
     */
    protected static Boolean IsAndroid = !isNullOrEmpty(System.getenv("ANDROID_BOOTLOGO"));
    
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
     * Current test storage
     */
    protected static String TestStorage;

    /**
     * If any test failed
     */
    protected static Boolean failedAnyTest = false;

    /**
     * Gets or sets a value indicating whether resulting images should be removed from cloud storage.
     */
    public static Boolean RemoveResult = true;

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
    	finalizeTester();
    }
    
    /**
     * Finalizes tester class.
     */
    @AfterClass
    public static void finalizeTester()
    {
        File tempFile = new File(getTempFile());
        if (tempFile.exists())
        {
            tempFile.delete();
        }

        if (!failedAnyTest && RemoveResult && StorageApi.GetIsExist(getTempFolder(), "", TestStorage).getFileExist().getIsExist())
        {
            StorageApi.DeleteFolder(getTempFolder(), TestStorage, true);
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
     * Checks if string is null or empty.
     * @param str String to check.
     * @return If string is null or empty
     */
    protected static Boolean isNullOrEmpty(String str)
    {
        return str == null || str == "";
    }

    /**
     * If extended test set is enabled.
     * @return if extended test set is enabled.
     */
    protected static Boolean isExtendedTests()
    {
        String envValue = System.getenv("ExtendedTests");
        if (!isNullOrEmpty(envValue) && envValue.equals("true"))
        {
            return true;
        }

        return false;
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
            System.out.println("Access data isn't set completely by environment variables. Filling unset data with server cred file values.");
        }

        if (isNullOrEmpty(apiVersion))
        {
            apiVersion = ApiVersion;
            System.out.println("Set default API version");
        }

        File serverAccessFile = new File(getLocalTestFolder(), ServerAccessFile);
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
            
            if (IsAndroid)
            {
            	if (!isNullOrEmpty(accessData.ApiVersion))
            	{
            		apiVersion = accessData.ApiVersion;
            	}
            	
            	if (!isNullOrEmpty(accessData.StorageName))
            	{
            		TestStorage = accessData.StorageName;
            	}
            }
        }
        else
        {
            throw new Exception("Please, specify valid access data (AppKey, AppSid, Base URL)" + "; androidTest value: " 
        	    + System.getenv("androidTest") + "; Server access creds file: " + serverAccessFile.getCanonicalPath());
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
     * Retrieves temp folder ID for dynamic name generation.
     * @return Temp folder ID.
     */
    protected static String getTempFolderId()
    {
        String id = System.getenv("BUILD_NUMBER");
        if (isNullOrEmpty(id))
        {
            id = System.getProperty("user.name");
        }

        return id;
    }
    
    /**
     * Retrieves folder for local test data.
     * @return Local test data folder.
     */
    protected static String getLocalTestFolder()
    {
        String folder;
        if (!IsAndroid) {
        	folder = "testData";
        }
        else {
        	folder = "/data/local/tmp";
        }
        
        return folder;
    }
    
    /**
     * Retrieves temp folder for dynamic name generation.
     * @return Temp folder name.
     */
    protected static String getTempFolder()
    {
        String folder;
        if (!IsAndroid) {
        	folder = "ImagingCloudTestJava_";
        }
        else {
        	folder = "ImagingCloudTestAndroid_";
        }
        
        return folder + getTempFolderId();
    }
    
    /**
     * Retrieves temp file for test purposes.
     * @return Temp file.
     */
    protected static String getTempFile()
    {
        String file;
        if (!IsAndroid) {
        	file = "imagingJavaSdkTempFile";
        }
        else {
        	file = "/data/data/com.aspose.imaging.android.test" + File.separator + "imagingAndroidSdkTempFile";
        }
        
        return file;
    }

    /**
     * Tests the typical GET request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param requestInvoker The request invoker.
     * @param propertiesTester The properties tester.
     * @throws Exception 
     */
    protected void testGetRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, Method requestInvoker, Method propertiesTester) throws Exception
    {
        this.testGetRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName,
        		requestInvoker, propertiesTester, getTempFolder(), TestStorage);
    }
    
    /**
     * Tests the typical GET request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param requestInvoker The request invoker.
     * @param propertiesTester The properties tester.
     * @param folder The folder.
     * @param storage The storage.
     * @throws Exception 
     */
    protected void testGetRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, Method requestInvoker, Method propertiesTester, String folder, String storage) throws Exception
    {
		final Boolean finalSaveResultToStorage = saveResultToStorage;
		final String finalFolder = folder;
		final String finalResultFileName = resultFileName;
		final String finalInputFileName = inputFileName;
		final Method finalRequestInvoker = requestInvoker;
		final Method obtainMethod = ApiTester.class.getDeclaredMethod("obtainGetResponse", String.class, String.class, Method.class);
		obtainMethod.setAccessible(true);
		final Object thisReference = this;
		
        this.testRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName,
            new Callable<byte[]>()
            {
            	public byte[] call() throws RuntimeException
            	{
            		String outPath = finalSaveResultToStorage ? String.format("%s/%s", finalFolder, finalResultFileName) : null;
                    try {
                        return (byte[])obtainMethod.invoke(thisReference, finalInputFileName, outPath, finalRequestInvoker);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
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
     * @param requestInvoker The request invoker.
     * @param propertiesTester The properties tester.
     * @throws Exception 
     */
    protected void testPostRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, Method requestInvoker, Method propertiesTester) throws Exception
    {
        this.testPostRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName,
        		requestInvoker, propertiesTester, getTempFolder(), TestStorage);
    }
    
    /**
     * Tests the typical POST request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param requestInvoker The request invoker.
     * @param propertiesTester The properties tester.
     * @param folder The folder.
     * @param storage The storage.
     * @throws Exception 
     * @throws NoSuchMethodException 
     */
    protected void testPostRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, Method requestInvoker, Method propertiesTester, String folder, String storage) throws NoSuchMethodException, Exception
    {
    	final Boolean finalSaveResultToStorage = saveResultToStorage;
		final String finalFolder = folder;
		final String finalResultFileName = resultFileName;
		final String finalInputFileName = inputFileName;
		final Method finalRequestInvoker = requestInvoker;
		final String finalStorage = storage;
		final Method obtainMethod = ApiTester.class.getDeclaredMethod("obtainPostResponse", String.class, String.class, String.class,
				Method.class);
		obtainMethod.setAccessible(true);
		final Object thisReference = this;
		
        this.testRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName,
            new Callable<byte[]>()
            {
            	public byte[] call() throws RuntimeException
            	{
            		String outPath = finalSaveResultToStorage ? String.format("%s/%s", finalFolder, finalResultFileName) : null;
            		try {
                        return (byte[])obtainMethod.invoke(thisReference, finalFolder + "/" + finalInputFileName, outPath, finalStorage, finalRequestInvoker);
                    } catch (Exception e) {
            		    throw new RuntimeException(e);
                    }
                }
            }, 
            propertiesTester, folder, storage);
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
     * 
     * @param inputFileName Input file name.
     * @param folder Output folder.
     * @param storage Storage name.
     * @throws Exception
     */
    protected void copyInputFileToFolder(String inputFileName, String folder, String storage) throws Exception
    {
    	if (!StorageApi.GetIsExist(folder + "/" + inputFileName, "", storage).getFileExist().getIsExist())
        {
            File tempFile = new File(getTempFile());
            if (tempFile.exists())
            {
                tempFile.delete();
            }

            ResponseMessage downResponse = StorageApi.GetDownload(OriginalDataFolder + "/" + inputFileName, "", storage);
            Assert.assertEquals("OK", downResponse.getStatus().toUpperCase());
            FileOutputStream outStream = null;

            try {
                outStream = new FileOutputStream(getTempFile());
                outStream.write(StreamHelper.readAsBytes(downResponse.getInputStream()));

            } finally {
                if (outStream != null)
                {
                    outStream.close();
                }
            }

            ResponseMessage putResponse = StorageApi.PutCreate(folder + "/" + inputFileName, "", storage, new File(getTempFile()));
            Assert.assertEquals("OK", putResponse.getStatus().toUpperCase());
            Assert.assertTrue(StorageApi.GetIsExist(folder + "/" + inputFileName, "", storage).getFileExist().getIsExist());
        }
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
     * Obtains the typical GET request response. Used indirectly by method reference.
     * @param inputFileName Name of the input file.
     * @param outPath The request invoker.
     * @param requestInvoker The output path to save the result.
     * @return Response data.
     * @throws Exception
     */
    private byte[] obtainGetResponse(String inputFileName, String outPath, Method requestInvoker) throws Exception
    {
    	byte[] result = null;
    	Object responseObject = requestInvoker.invoke(this, inputFileName, outPath);

    	Assert.assertNotNull(responseObject);
    	result = (byte[])responseObject;

    	if (outPath == null || outPath.equals(""))
        {
            Assert.assertNotNull(result);
            Assert.assertTrue(result.length > 0);
        }
    	
    	return result;
    }

    /**
     * Obtains the typical POST request response. Used indirectly by method reference.
     * @param inputPath The input path.
     * @param outPath The output path to save the result.
     * @param storage The storage.
     * @param requestInvoker The request invoker.
     * @return Response data.
     * @throws Exception
     */
    private byte[] obtainPostResponse(String inputPath, String outPath, String storage, Method requestInvoker) throws Exception
    {
        ResponseMessage inputDownloadResponse = StorageApi.GetDownload(inputPath, "", storage);
        Assert.assertEquals((int)inputDownloadResponse.getCode(), 200);
        InputStream stream = null;
        try {
        	stream = inputDownloadResponse.getInputStream();
        	Object responseObject = requestInvoker.invoke(this, StreamHelper.readAsBytes(stream), outPath);
        	Assert.assertNotNull(responseObject);
        	byte[] result = (byte[])responseObject;
            
            if (outPath == null || outPath.equals(""))
            {
                Assert.assertNotNull(result);
                Assert.assertTrue(result.length > 0);
            }
            
            return result;
		} finally {
			if (stream != null) {
				stream.close();
			}
		}
    }

    /**
     * Tests the typical request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param invokeRequestAction The invoke request action.
     * @param propertiesTester The properties tester.
     * @throws Exception 
     */
    private void testRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName, 
    		String resultFileName, Callable<byte[]> invokeRequestAction, Method propertiesTester) throws Exception
    {
        this.testRequest(testMethodName, saveResultToStorage, parametersLine, inputFileName, resultFileName, 
        		invokeRequestAction, propertiesTester, getTempFolder(), TestStorage);
    }

    /**
     * Tests the typical request.
     * @param testMethodName Name of the test method.
     * @param saveResultToStorage If set to true, save result to storage.
     * @param parametersLine The parameters line.
     * @param inputFileName Name of the input file.
     * @param resultFileName Name of the result file.
     * @param invokeRequestAction The invoke request action.
     * @param propertiesTester The properties tester.
     * @param folder The folder.
     * @param storage The storage.
     * @throws Exception
     */
    private void testRequest(String testMethodName, Boolean saveResultToStorage, String parametersLine, String inputFileName,
                             String resultFileName, Callable<byte[]> invokeRequestAction, Method propertiesTester,
                             String folder, String storage) throws Exception
    {
        System.out.println("Test method: " + testMethodName);

        if (!checkInputFileExists(inputFileName))
        {
            throw new Exception(
                    String.format("Input file %s doesn't exist in the specified storage folder: %s. Please, upload it first.",
                            inputFileName, folder));
        }
        
        this.copyInputFileToFolder(inputFileName, folder, storage);
        
        Boolean passed = false;
        String outPath = null;

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

            byte[] response = this.invokeRequestWithRetry(invokeRequestAction, this.retryCount);
            ImagingResponse resultProperties = null;
            
            if (saveResultToStorage)
            {
                StorageFileInfo resultInfo = getStorageFileInfo(folder, resultFileName, storage);
                if (resultInfo == null)
                {
                    throw new Exception(
                            String.format("Result file %s doesn't exist in the specified storage folder: %s. Result isn't present in the storage by an unknown reason.",
                                    resultFileName, folder));
                }
                
                resultProperties = ImagingApi.getImageProperties(new GetImagePropertiesRequest(resultFileName, folder, storage));
                Assert.assertNotNull(resultProperties);
            }
            else if (!ImagingApi.Configuration.getApiVersion().contains("v1."))
            {
                resultProperties =
                    ImagingApi.postImageProperties(new PostImagePropertiesRequest(response));
                Assert.assertNotNull(resultProperties);
            }
            
            Assert.assertTrue(StorageApi.GetIsExist(folder + "/" + inputFileName, "", storage).getFileExist().getIsExist());
            ImagingResponse originalProperties =
                    ImagingApi.getImageProperties(new GetImagePropertiesRequest(inputFileName, folder, storage));
            Assert.assertNotNull(originalProperties);

            if (resultProperties != null && propertiesTester != null)
            {
                propertiesTester.invoke(this, originalProperties, resultProperties, response);
            }

            passed = true;
        }
        catch (Exception ex)
        {
            failedAnyTest = true;
            System.out.println(ex.getMessage());
            throw ex;
        }
        finally
        {
            if (passed && saveResultToStorage && RemoveResult && StorageApi.GetIsExist(outPath, "", storage).getFileExist().getIsExist())
            {
                StorageApi.DeleteFile(outPath, "", storage);
            }

            System.out.println("Test passed: " + passed);
        }
    }

    /**
     * Invokes test request with attempts to retry on fail.
     * @param invokeRequestAction Request.
     * @param currentRetryCount Retry count that's left.
     * @throws Exception
     */
    private byte[] invokeRequestWithRetry(Callable<byte[]> invokeRequestAction, int currentRetryCount) throws Exception
    {
        try
        {
            return invokeRequestAction.call();
        }
        catch (RuntimeException exception)
        {
            if (--currentRetryCount > 0)
            {
                Thread.sleep(this.retryTime * 1000);
                System.out.println("Retrying request invocation");
                return this.invokeRequestWithRetry(invokeRequestAction, currentRetryCount);
            }
            else
            {
                System.out.println(exception.getCause().getStackTrace().toString());
                throw exception;
            }
        }
    }
}
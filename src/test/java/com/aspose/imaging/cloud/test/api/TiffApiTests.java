/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TiffApiTests.java">
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
package com.aspose.imaging.cloud.test.api;

import com.aspose.imaging.cloud.sdk.invoker.ApiResponse;
import com.aspose.imaging.cloud.sdk.invoker.internal.StreamHelper;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.sdk.stablemodel.*;
import com.aspose.imaging.cloud.test.base.ApiTester;
import com.aspose.imaging.cloud.test.base.StorageFileInfo;
import com.aspose.storage.model.ResponseMessage;

import junitparams.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.Before;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;

/**
 * Class for testing TIFF-related API calls
 */
@RunWith(JUnitParamsRunner.class)
public class TiffApiTests extends ApiTester {

	private GetImageTiffRequest getImageTiffRequest;
	private PostImageTiffRequest postImageTiffRequest;
	private GetTiffToFaxRequest getTiffToFaxRequest;
	
    /**
     * Test operation: Update parameters of existing TIFF image.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void getImageTiffTest(Boolean saveResultToStorage) throws Exception {
    	String name = "test.tiff";
    	String compression = "adobedeflate";
    	String resolutionUnit = "inch";
        int bitDepth = 1;
        double horizontalResolution = 150;
        double verticalResolution = 150;
        Boolean fromScratch = null;
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
		String outName = name + "_specific." + "tiff";
		getImageTiffRequest = new GetImageTiffRequest(name, compression, resolutionUnit, bitDepth, fromScratch, 
				horizontalResolution, verticalResolution, outPath, folder, storage);
		
		Method propertiesTester = TiffApiTests.class.getDeclaredMethod("getImageTiffPropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = TiffApiTests.class.getDeclaredMethod("getImageTiffGetRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImageTiffTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Compression: %s; Resolution unit: %s; Bit depth: %s; Horizontal resolution: %s; Vertical resolution: %s",
            		name, compression, resolutionUnit, bitDepth, horizontalResolution, verticalResolution),
            name,
            outName,
            "Tiff",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
	
    /**
     * Test operation: Update parameters of TIFF image. Image is passed in a request stream.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void postImageTiffTest(Boolean saveResultToStorage) throws Exception {
        byte[] imageData = null;
    	String compression = "adobedeflate";
    	String resolutionUnit = "inch";
        int bitDepth = 1;
        double horizontalResolution = 150;
        double verticalResolution = 150;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = DefaultStorage;
        String folder = CloudTestFolder;
        String name = "test.tiff";
		String outName = name + "_specific." + "tiff";
		postImageTiffRequest = new PostImageTiffRequest(imageData, compression, resolutionUnit, bitDepth, fromScratch, 
				horizontalResolution, verticalResolution, outPath, storage);
		
		Method propertiesTester = TiffApiTests.class.getDeclaredMethod("postImageTiffPropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = TiffApiTests.class.getDeclaredMethod("postImageTiffPostRequestInvoker", byte[].class, String.class);
		requestInvoker.setAccessible(true);
	    this.testPostRequest(
            "postImageTiffTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Compression: %s; Resolution unit: %s; Bit depth: %s; Horizontal resolution: %s; Vertical resolution: %s",
            		name, compression, resolutionUnit, bitDepth, horizontalResolution, verticalResolution),
            name,
            outName,
            "Tiff",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Test operation: Update parameters of existing TIFF image accordingly to fax parameters.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTiffToFaxTest() throws Exception {
    	String name = "test.tiff";
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
		String outName = name + "_fax." + "tiff";
		getTiffToFaxRequest = new GetTiffToFaxRequest(name, storage, folder, outPath);
		
		Method propertiesTester = TiffApiTests.class.getDeclaredMethod("getTiffToFaxPropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = TiffApiTests.class.getDeclaredMethod("getTiffToFaxGetRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getTiffToFaxTest", 
            true,
            String.format("Input image: %s",
            		name),
            name,
            outName,
            "Tiff",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Test operation: Appends existing TIFF image to another existing TIFF image (i.e. merges TIFF images).
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postTiffAppendTest() throws Exception {
    	Boolean passed = false;
        System.out.println("Test method: postTiffAppendTest");

        String inputFileName = "test.tiff";
        String folder = CloudTestFolder;

        if (!checkInputFileExists(inputFileName))
        {
            throw new Exception(
            		String.format("Input file %s doesn't exist in the specified storage folder: %s. Please, upload it first.",
            				inputFileName, folder));
        }

        String resultFileName = inputFileName + "_merged.tiff";
        String outPath = null;
        String inputPath = CloudTestFolder + "/" + inputFileName;
        String storage = DefaultStorage;
        String referencePath = CloudReferencesFolder + "/Tiff";

        try
        {
        	System.out.println("Input image: " + inputFileName);

            outPath = folder + "/" + resultFileName;

            // remove output file from the storage (if exists)
            if (StorageApi.GetIsExist(outPath, "", storage).getFileExist().getIsExist())
            {
                StorageApi.DeleteFile(outPath, "", storage);
            }
          
            ResponseMessage downloadMessage = StorageApi.GetDownload(inputPath, "", storage);
            Assert.assertNotNull(downloadMessage);
            Assert.assertEquals(200, (int)downloadMessage.getCode());
            File targetFile = new File(resultFileName);
            Assert.assertTrue(targetFile.createNewFile());
            
            InputStream streamToRead = downloadMessage.getInputStream();
            FileOutputStream outStream = new FileOutputStream(targetFile);
            outStream.write(StreamHelper.readAsBytes(streamToRead));
            streamToRead.close();
            outStream.flush();
            outStream.close();
            
            ResponseMessage storageResponseMessage = StorageApi.PutCreate(outPath, "", storage, targetFile);
            Assert.assertNotNull(storageResponseMessage);
            Assert.assertEquals(200, (int)storageResponseMessage.getCode());
            Assert.assertTrue(StorageApi.GetIsExist(outPath, "", storage).getFileExist().getIsExist());
            
            PostTiffAppendRequest request = new PostTiffAppendRequest(resultFileName, inputFileName, storage, folder);
            ApiResponse response = ImagingApi.postTiffAppend(request);
            Assert.assertNotNull(response);
            Assert.assertNotNull(response.getSaaSposeResponse());
            Assert.assertEquals(200, (int)response.getSaaSposeResponse().getCode());

            StorageFileInfo referenceInfo = getStorageFileInfo(referencePath, resultFileName, storage);
            if (referenceInfo == null)
            {
            	throw new Exception(
                		String.format("Reference result file %s doesn't exist in the specified storage folder: %s. Please, upload it first.", 
                				resultFileName, referencePath));
            }

            long referenceLength = referenceInfo.getSize();

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
            ImagingResponse originalProperties =
                ImagingApi.getImageProperties(new GetImagePropertiesRequest(inputFileName, folder, storage)).getImagingResponse();
            Assert.assertNotNull(originalProperties);

            Assert.assertNotNull(resultProperties.getTiffProperties());
            Assert.assertNotNull(originalProperties.getTiffProperties());
            Assert.assertEquals(originalProperties.getTiffProperties().getFrames().size() * 2, 
            		resultProperties.getTiffProperties().getFrames().size());
            Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
            Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());

            passed = true;
        }
        catch (Exception ex)
        {
        	 System.out.println(ex.getMessage());
             throw ex;
        }
        finally
        {
            if (this.RemoveResult && StorageApi.GetIsExist(outPath, "", storage).getFileExist().getIsExist())
            {
                StorageApi.DeleteFile(outPath, "", storage);
            }
            
            File removeFile = new File(resultFileName);
            if (removeFile.isFile())
            {
            	Assert.assertTrue(removeFile.delete());
            }

            System.out.println("Test passed: " + passed);
        }
    }
    
	/**
	 * Invokes GET request for getImageTiff operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse getImageTiffGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageTiffRequest.name = name;
		getImageTiffRequest.outPath = outPath;
        return ImagingApi.getImageTiff(getImageTiffRequest);
	}
	
	/**
	 * Invokes POST request for postImageTiff operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse postImageTiffPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageTiffRequest.imageData = imageData;
		postImageTiffRequest.outPath = outPath;
        return ImagingApi.postImageTiff(postImageTiffRequest);
	}
	
	/**
	 * Invokes GET request for getTiffToFax operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse getTiffToFaxGetRequestInvoker(String name, String outPath) throws Exception
	{
		getTiffToFaxRequest.name = name;
		getTiffToFaxRequest.outPath = outPath;
        return ImagingApi.getTiffToFax(getTiffToFaxRequest);
	}
	
	/**
	 * Tests properties for getImageTiff operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImageTiffPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertNotNull(resultProperties.getTiffProperties());
		Integer bitDepth = getImageTiffRequest.bitDepth > 1 ? getImageTiffRequest.bitDepth * 4 : getImageTiffRequest.bitDepth;
        Assert.assertEquals(bitDepth, resultProperties.getBitsPerPixel());
        Assert.assertEquals((int)Math.ceil((double)getImageTiffRequest.verticalResolution),
        		(int)Math.ceil((double)resultProperties.getVerticalResolution()));
        Assert.assertEquals((int)Math.ceil((double)getImageTiffRequest.horizontalResolution),
        		(int)Math.ceil((double)resultProperties.getHorizontalResolution()));

        Assert.assertNotNull(originalProperties.getTiffProperties());
        Assert.assertEquals(originalProperties.getTiffProperties().getFrames().size(), resultProperties.getTiffProperties().getFrames().size());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
	}
	
	/**
	 * Tests properties for postImageTiff operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImageTiffPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertNotNull(resultProperties.getTiffProperties());
		Integer bitDepth = postImageTiffRequest.bitDepth > 1 ? postImageTiffRequest.bitDepth * 4 : postImageTiffRequest.bitDepth;
        Assert.assertEquals(bitDepth, resultProperties.getBitsPerPixel());
        Assert.assertEquals((int)Math.ceil((double)postImageTiffRequest.verticalResolution),
        		(int)Math.ceil((double)resultProperties.getVerticalResolution()));
        Assert.assertEquals((int)Math.ceil((double)postImageTiffRequest.horizontalResolution),
        		(int)Math.ceil((double)resultProperties.getHorizontalResolution()));

        Assert.assertNotNull(originalProperties.getTiffProperties());
        Assert.assertEquals(originalProperties.getTiffProperties().getFrames().size(), resultProperties.getTiffProperties().getFrames().size());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
	}
	
	/**
	 * Tests properties for getTiffToFax operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getTiffToFaxPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertNotNull(resultProperties.getTiffProperties());
        Assert.assertEquals(1, (int)resultProperties.getBitsPerPixel());
        Assert.assertEquals(196, (int)Math.ceil((double)resultProperties.getVerticalResolution()));
        Assert.assertEquals(204, (int)Math.ceil((double)resultProperties.getHorizontalResolution()));
        Assert.assertEquals(1728, (int)resultProperties.getWidth());
        Assert.assertEquals(2200, (int)resultProperties.getHeight());
	}
}

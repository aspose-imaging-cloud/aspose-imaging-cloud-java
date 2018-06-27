/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="JpgApiTests.java">
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
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.sdk.stablemodel.*;
import com.aspose.imaging.cloud.test.base.ApiTester;

import junitparams.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.Before;
import java.lang.reflect.Method;

/**
 * Class for testing JPG-related API calls
 */
@RunWith(JUnitParamsRunner.class)
public class JpgApiTests extends ApiTester {

	private GetImageJpgRequest getImageJpgRequest;
	private PostImageJpgRequest postImageJpgRequest;
	
    /**
     * Test operation: Update parameters of existing JPG image.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void getImageJpgTest(Boolean saveResultToStorage) throws Exception {
    	String name = "test.jpg";
    	int quality = 65;
        String compressionType = "progressive";
        Boolean fromScratch = null;
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
		String outName = name + "_specific." + "jpg";
		getImageJpgRequest = new GetImageJpgRequest(name, quality, compressionType, fromScratch, outPath, folder, storage);
		
		Method propertiesTester = JpgApiTests.class.getDeclaredMethod("getImageJpgPropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = JpgApiTests.class.getDeclaredMethod("getImageJpgGetRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImageJpgTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Quality: %s; Compression type: %s",
            		name, quality, compressionType),
            name,
            outName,
            "Jpg",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
	
    /**
     * Test operation: Update parameters of JPG image. Image is passed in a request stream.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void postImageJpgTest(Boolean saveResultToStorage) throws Exception {
        byte[] imageData = null;
        int quality = 65;
        String compressionType = "progressive";
        Boolean fromScratch = null;
        String outPath = null;
        String storage = DefaultStorage;
        String folder = CloudTestFolder;
        String name = "test.jpg";
		String outName = name + "_specific." + "jpg";
		postImageJpgRequest = new PostImageJpgRequest(imageData, quality, compressionType, fromScratch, outPath, storage);
		
		Method propertiesTester = JpgApiTests.class.getDeclaredMethod("postImageJpgPropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = JpgApiTests.class.getDeclaredMethod("postImageJpgPostRequestInvoker", byte[].class, String.class);
		requestInvoker.setAccessible(true);
	    this.testPostRequest(
            "postImageJpgTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Quality: %s; Compression type: %s",
            		name, quality, compressionType),
            name,
            outName,
            "Jpg",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
	/**
	 * Invokes GET request for getImageJpg operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse getImageJpgGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageJpgRequest.name = name;
		getImageJpgRequest.outPath = outPath;
        return ImagingApi.getImageJpg(getImageJpgRequest);
	}
	
	/**
	 * Invokes POST request for postImageJpg operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse postImageJpgPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageJpgRequest.imageData = imageData;
		postImageJpgRequest.outPath = outPath;
        return ImagingApi.postImageJpg(postImageJpgRequest);
	}
	
	/**
	 * Tests properties for getImageJpg operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImageJpgPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertNotNull(resultProperties.getJpegProperties());

        Assert.assertNotNull(originalProperties.getJpegProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
	}
	
	/**
	 * Tests properties for postImageJpg operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImageJpgPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
        Assert.assertNotNull(resultProperties.getJpegProperties());

        Assert.assertNotNull(originalProperties.getJpegProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
	}
}
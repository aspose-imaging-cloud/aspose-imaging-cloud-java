/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="BmpApiTests.java">
*   Copyright (c) 2018 Aspose.Imaging for Cloud
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
 * Class for testing BMP-related API calls
 */
@RunWith(JUnitParamsRunner.class)
public class BmpApiTests extends ApiTester {

	private GetImageBmpRequest getImageBmpRequest;
	private PostImageBmpRequest postImageBmpRequest;
	
	@Before
    public void setUp() throws Exception { 
	    this.createApiInstances();
    }
	
    /**
     * Test operation: Update parameters of existing BMP image.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void getImageBmpTest(Boolean saveResultToStorage) throws Exception {
    	String name = "test.bmp";
        Integer bitsPerPixel = 32;
        Integer horizontalResolution = 300;
        Integer verticalResolution = 300;
        Boolean fromScratch = null;
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
		String outName = name + "_specific." + "bmp";
		getImageBmpRequest = new GetImageBmpRequest(name, bitsPerPixel, horizontalResolution, verticalResolution, fromScratch, outPath, folder, storage);
		
		Method propertiesTester = BmpApiTests.class.getDeclaredMethod("getImageBmpPropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = BmpApiTests.class.getDeclaredMethod("getImageBmpGetRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImageBmpTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Bits per pixel: %s; Horizontal resolution: %s; Vertical resolution: %s",
            		name, bitsPerPixel, horizontalResolution, verticalResolution),
            name,
            outName,
            "Bmp",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
	
    /**
     * Test operation: Update parameters of BMP image. Image is passed in a request stream.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void postImageBmpTest(Boolean saveResultToStorage) throws Exception {
        byte[] imageData = null;
        Integer bitsPerPixel = 32;
        Integer horizontalResolution = 300;
        Integer verticalResolution = 300;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = DefaultStorage;
        String folder = CloudTestFolder;
        String name = "test.bmp";
		String outName = name + "_specific." + "bmp";
		postImageBmpRequest = new PostImageBmpRequest(imageData, bitsPerPixel, horizontalResolution, verticalResolution, fromScratch, outPath, storage);
		
		Method propertiesTester = BmpApiTests.class.getDeclaredMethod("postImageBmpPropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = BmpApiTests.class.getDeclaredMethod("postImageBmpPostRequestInvoker", byte[].class, String.class);
		requestInvoker.setAccessible(true);
	    this.testPostRequest(
            "postImageBmpTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Bits per pixel: %s; Horizontal resolution: %s; Vertical resolution: %s",
            		name, bitsPerPixel, horizontalResolution, verticalResolution),
            name,
            outName,
            "Bmp",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
	/**
	 * Invokes GET request for getImageBmp operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse getImageBmpGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageBmpRequest.name = name;
		getImageBmpRequest.outPath = outPath;
        return ImagingApi.getImageBmp(getImageBmpRequest);
	}
	
	/**
	 * Invokes POST request for postImageBmp operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse postImageBmpPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageBmpRequest.imageData = imageData;
		postImageBmpRequest.outPath = outPath;
        return ImagingApi.postImageBmp(postImageBmpRequest);
	}
	
	/**
	 * Tests properties for getImageBmp operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImageBmpPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertNotNull(resultProperties.getBmpProperties());
        Assert.assertEquals(resultProperties.getBitsPerPixel(), getImageBmpRequest.bitsPerPixel);
        Assert.assertEquals((int)Math.ceil(resultProperties.getVerticalResolution()), (int)getImageBmpRequest.verticalResolution);
        Assert.assertEquals((int)Math.ceil(resultProperties.getHorizontalResolution()), (int)getImageBmpRequest.horizontalResolution);

        Assert.assertNotNull(originalProperties.getBmpProperties());
        Assert.assertEquals(originalProperties.getBmpProperties().getCompression(), resultProperties.getBmpProperties().getCompression());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
	}
	
	/**
	 * Tests properties for postImageBmp operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImageBmpPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertNotNull(resultProperties.getBmpProperties());
        Assert.assertEquals(resultProperties.getBitsPerPixel(), postImageBmpRequest.bitsPerPixel);
        Assert.assertEquals((int)Math.ceil(resultProperties.getVerticalResolution()), (int)postImageBmpRequest.verticalResolution);
        Assert.assertEquals((int)Math.ceil(resultProperties.getHorizontalResolution()), (int)postImageBmpRequest.horizontalResolution);

        Assert.assertNotNull(originalProperties.getBmpProperties());
        Assert.assertEquals(originalProperties.getBmpProperties().getCompression(), resultProperties.getBmpProperties().getCompression());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
	}
}

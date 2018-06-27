/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PngApiTests.java">
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
 * Class for testing PNG-related API calls
 */
@RunWith(JUnitParamsRunner.class)
public class PngApiTests extends ApiTester {

	private GetImagePngRequest getImagePngRequest;
	private PostImagePngRequest postImagePngRequest;
	
    /**
     * Test operation: Update parameters of existing PNG image.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void getImagePngTest(Boolean saveResultToStorage) throws Exception {
    	String name = "test.png";
        Boolean fromScratch = false;
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
		String outName = name + "_specific." + "png";
		getImagePngRequest = new GetImagePngRequest(name, fromScratch, outPath, folder, storage);
		
		Method propertiesTester = PngApiTests.class.getDeclaredMethod("getImagePngPropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = PngApiTests.class.getDeclaredMethod("getImagePngGetRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImagePngTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s",
            		name),
            name,
            outName,
            "Png",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
	
    /**
     * Test operation: Update parameters of PNG image. Image is passed in a request stream.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void postImagePngTest(Boolean saveResultToStorage) throws Exception {
        byte[] imageData = null;
        Boolean fromScratch = false;
        String outPath = null;
        String storage = DefaultStorage;
        String folder = CloudTestFolder;
        String name = "test.png";
		String outName = name + "_specific." + "png";
		postImagePngRequest = new PostImagePngRequest(imageData, fromScratch, outPath, storage);
		
		Method propertiesTester = PngApiTests.class.getDeclaredMethod("postImagePngPropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = PngApiTests.class.getDeclaredMethod("postImagePngPostRequestInvoker", byte[].class, String.class);
		requestInvoker.setAccessible(true);
	    this.testPostRequest(
            "postImagePngTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s",
            		name),
            name,
            outName,
            "Png",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
	/**
	 * Invokes GET request for getImagePng operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse getImagePngGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImagePngRequest.name = name;
		getImagePngRequest.outPath = outPath;
        return ImagingApi.getImagePng(getImagePngRequest);
	}
	
	/**
	 * Invokes POST request for postImagePng operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse postImagePngPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImagePngRequest.imageData = imageData;
		postImagePngRequest.outPath = outPath;
        return ImagingApi.postImagePng(postImagePngRequest);
	}
	
	/**
	 * Tests properties for getImagePng operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImagePngPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertNotNull(resultProperties.getPngProperties());
		Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
        
        // TODO: this should be uncommented when IMAGINGCLOUD-48 is done
        //Assert.assertEquals(originalProperties.getBitsPerPixel(), resultProperties.getBitsPerPixel());
        Assert.assertEquals(originalProperties.getHorizontalResolution(), resultProperties.getHorizontalResolution());
        Assert.assertEquals(originalProperties.getVerticalResolution(), resultProperties.getVerticalResolution());
	}
	
	/**
	 * Tests properties for postImagePng operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImagePngPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertNotNull(resultProperties.getPngProperties());
		Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
		
		// TODO: this should be uncommented when IMAGINGCLOUD-48 is done
        //Assert.assertEquals(originalProperties.getBitsPerPixel(), resultProperties.getBitsPerPixel());
        Assert.assertEquals(originalProperties.getHorizontalResolution(), resultProperties.getHorizontalResolution());
        Assert.assertEquals(originalProperties.getVerticalResolution(), resultProperties.getVerticalResolution());
	}
}
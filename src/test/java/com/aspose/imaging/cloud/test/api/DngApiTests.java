/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DngApiTests.java">
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

import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.sdk.stablemodel.*;
import com.aspose.imaging.cloud.test.base.ApiTester;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.Parameters;

import java.lang.Iterable;
import java.util.Arrays;
import java.lang.reflect.Method;

/**
 * Class for testing DNG-related API calls
 */
@RunWith(Parameterized.class)
public class DngApiTests extends ApiTester {

	private GetImageDngRequest getImageDngRequest;
	private PostImageDngRequest postImageDngRequest;

	@Parameters
	public static Iterable<Object> data() {
		return Arrays.asList(new Object[] { true, false });
	}

	private Boolean saveResultToStorage;

	public DngApiTests(Boolean saveResult)
	{
		this.saveResultToStorage = saveResult;
	}
	
    /**
     * Test operation: Rasterize existing DNG image to PNG using given parameters. 
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImageDngTest() throws Exception {
    	String name = "test.dng";
        Boolean fromScratch = null;
        String outPath = null;
        String folder = getTempFolder();
        String storage = TestStorage;
		String outName = name + "_specific." + "png";
		getImageDngRequest = new GetImageDngRequest(name, fromScratch, outPath, folder, storage);
		
		Method propertiesTester = DngApiTests.class.getDeclaredMethod("getImageDngPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = DngApiTests.class.getDeclaredMethod("getImageDngGetRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImageDngTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s",
            		name),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
	
    /**
     * Test operation: Rasterize DNG image to PNG using given parameters. Image is passed in a request stream.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postImageDngTest() throws Exception {
        byte[] imageData = null;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "test.dng";
		String outName = name + "_specific." + "png";
		postImageDngRequest = new PostImageDngRequest(imageData, fromScratch, outPath, storage);
		
		Method propertiesTester = DngApiTests.class.getDeclaredMethod("postImageDngPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = DngApiTests.class.getDeclaredMethod("postImageDngPostRequestInvoker", byte[].class, String.class);
		requestInvoker.setAccessible(true);
	    this.testPostRequest(
            "postImageDngTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s",
            		name),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
	/**
	 * Invokes GET request for getImageDng operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] getImageDngGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageDngRequest.name = name;
		getImageDngRequest.outPath = outPath;
        return ImagingApi.getImageDng(getImageDngRequest);
	}
	
	/**
	 * Invokes POST request for postImageDng operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] postImageDngPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageDngRequest.imageData = imageData;
		postImageDngRequest.outPath = outPath;
        return ImagingApi.postImageDng(postImageDngRequest);
	}
	
	/**
	 * Tests properties for getImageDng operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void getImageDngPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
		Assert.assertNotNull(resultProperties.getPngProperties());
		Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
        Assert.assertNotNull(originalProperties.getDngProperties());
	}
	
	/**
	 * Tests properties for postImageDng operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void postImageDngPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
		Assert.assertNotNull(resultProperties.getPngProperties());
		Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
        Assert.assertNotNull(originalProperties.getDngProperties());
	}
}
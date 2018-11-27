/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="WebpApiTests.java">
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
 * Class for testing WEBP-related API calls
 */
@RunWith(Parameterized.class)
public class WebpApiTests extends ApiTester {

	private GetImageWebPRequest getImageWebPRequest;
	private PostImageWebPRequest postImageWebPRequest;

	@Parameters
	public static Iterable<Object> data() {
		return Arrays.asList(new Object[] { true, false });
	}

	private Boolean saveResultToStorage;

	public WebpApiTests(Boolean saveResult)
	{
		this.saveResultToStorage = saveResult;
	}
	
    /**
     * Test operation: Update parameters of existing WEBP image.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImageWebPTest() throws Exception {
    	String name = "Animation.webp";
    	Boolean lossless = true;
        Integer quality = 90;
        Integer animLoopCount = 5;
        String animBackgroundColor = "gray";
        Boolean fromScratch = null;
        String outPath = null;
        String folder = getTempFolder();
        String storage = TestStorage;
		String outName = name + "_specific." + "webp";
		getImageWebPRequest = new GetImageWebPRequest(name, lossless, quality, animLoopCount, animBackgroundColor, fromScratch, outPath, folder, storage);
		
		Method propertiesTester = WebpApiTests.class.getDeclaredMethod("getImageWebPPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = WebpApiTests.class.getDeclaredMethod("getImageWebPGetRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImageWebPTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; AnimBackgroundColor: %s; Lossless: %s; Quality: %s; AnimLoopCount: %s; ",
            		name, animBackgroundColor, lossless, quality, animLoopCount),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
	
    /**
     * Test operation: Update parameters of WEBP image. Image is passed in a request stream.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postImageWebPTest() throws Exception {
        byte[] imageData = null;
        Boolean lossless = true;
        Integer quality = 90;
        Integer animLoopCount = 5;
        String animBackgroundColor = "gray";
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "Animation.webp";
		String outName = name + "_specific." + "webp";
		postImageWebPRequest = new PostImageWebPRequest(imageData, lossless, quality, animLoopCount, animBackgroundColor, fromScratch, outPath, storage);
		
		Method propertiesTester = WebpApiTests.class.getDeclaredMethod("postImageWebPPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = WebpApiTests.class.getDeclaredMethod("postImageWebPPostRequestInvoker", byte[].class, String.class);
		requestInvoker.setAccessible(true);
	    this.testPostRequest(
            "postImageWebPTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; AnimBackgroundColor: %s; Lossless: %s; Quality: %s; AnimLoopCount: %s; ",
            		name, animBackgroundColor, lossless, quality, animLoopCount),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
	/**
	 * Invokes GET request for getImageWebP operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] getImageWebPGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageWebPRequest.name = name;
		getImageWebPRequest.outPath = outPath;
        return ImagingApi.getImageWebP(getImageWebPRequest);
	}
	
	/**
	 * Invokes POST request for postImageWebP operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] postImageWebPPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageWebPRequest.imageData = imageData;
		postImageWebPRequest.outPath = outPath;
        return ImagingApi.postImageWebP(postImageWebPRequest);
	}
	
	/**
	 * Tests properties for getImageWebP operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void getImageWebPPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
		Assert.assertNotNull(resultProperties.getWebPProperties());

        Assert.assertNotNull(originalProperties.getWebPProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
	}
	
	/**
	 * Tests properties for postImageWebP operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void postImageWebPPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
        Assert.assertNotNull(resultProperties.getWebPProperties());

        Assert.assertNotNull(originalProperties.getWebPProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
	}
}

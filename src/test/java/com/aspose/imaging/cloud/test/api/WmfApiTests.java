/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="WmfApiTests.java">
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
 * Class for testing WMF-related API calls
 */
@RunWith(Parameterized.class)
public class WmfApiTests extends ApiTester {

	private GetImageWmfRequest getImageWmfRequest;
	private PostImageWmfRequest postImageWmfRequest;

	@Parameters
	public static Iterable<Object> data() {
		return Arrays.asList(new Object[] { true, false });
	}

	private Boolean saveResultToStorage;

	public WmfApiTests(Boolean saveResult)
	{
		this.saveResultToStorage = saveResult;
	}

    /**
     * Test operation: Rasterize existing WMF image to PNG using given parameters.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImageWmfTest() throws Exception {
    	String name = "test.wmf";
        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        Integer borderX = 50;
        Integer borderY = 50;
        Boolean fromScratch = null;
        String outPath = null;
        String folder = getTempFolder();
        String storage = TestStorage;
		String outName = name + "_specific." + "png";
		getImageWmfRequest = new GetImageWmfRequest(name, bkColor, pageWidth, pageHeight, borderX, borderY, fromScratch, outPath, folder, storage);
		
		Method propertiesTester = WmfApiTests.class.getDeclaredMethod("getImageWmfPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = WmfApiTests.class.getDeclaredMethod("getImageWmfGetRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImageWmfTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; BackColor: %s; Page width: %s; Page height: %s; BorderX: %s; BorderY: %s",
            		name, bkColor, pageWidth, pageHeight, borderX, borderY),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
	
    /**
     * Test operation: Rasterize WMF image to PNG using given parameters. Image is passed in a request stream.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postImageWmfTest() throws Exception {
        byte[] imageData = null;
        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        Integer borderX = 50;
        Integer borderY = 50;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "test.wmf";
		String outName = name + "_specific." + "png";
		postImageWmfRequest = new PostImageWmfRequest(imageData, bkColor, pageWidth, pageHeight, borderX, borderY, fromScratch, outPath, storage);
		
		Method propertiesTester = WmfApiTests.class.getDeclaredMethod("postImageWmfPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = WmfApiTests.class.getDeclaredMethod("postImageWmfPostRequestInvoker", byte[].class, String.class);
		requestInvoker.setAccessible(true);
	    this.testPostRequest(
            "postImageWmfTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; BackColor: %s; Page width: %s; Page height: %s; BorderX: %s; BorderY: %s",
            		name, bkColor, pageWidth, pageHeight, borderX, borderY),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
	/**
	 * Invokes GET request for getImageWmf operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] getImageWmfGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageWmfRequest.name = name;
		getImageWmfRequest.outPath = outPath;
        return ImagingApi.getImageWmf(getImageWmfRequest);
	}
	
	/**
	 * Invokes POST request for postImageWmf operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] postImageWmfPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageWmfRequest.imageData = imageData;
		postImageWmfRequest.outPath = outPath;
        return ImagingApi.postImageWmf(postImageWmfRequest);
	}
	
	/**
	 * Tests properties for getImageWmf operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImageWmfPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
		Assert.assertNotNull(resultProperties.getPngProperties());
        Assert.assertEquals((int)(getImageWmfRequest.pageWidth + getImageWmfRequest.borderX * 2),
        		(int)resultProperties.getWidth());
        Assert.assertEquals((int)(getImageWmfRequest.pageHeight + getImageWmfRequest.borderY * 2),
        		(int)resultProperties.getHeight());
	}
	
	/**
	 * Tests properties for postImageWmf operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void postImageWmfPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
		Assert.assertNotNull(resultProperties.getPngProperties());
        Assert.assertEquals((int)(postImageWmfRequest.pageWidth + postImageWmfRequest.borderX * 2),
        		(int)resultProperties.getWidth());
        Assert.assertEquals((int)(postImageWmfRequest.pageHeight + postImageWmfRequest.borderY * 2),
        		(int)resultProperties.getHeight());
	}
}
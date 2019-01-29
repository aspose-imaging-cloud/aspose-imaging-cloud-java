/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PsdApiTests.java">
*   Copyright (c) 2019 Aspose Pty Ltd.
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
 * Class for testing PSD-related API calls
 */
@RunWith(Parameterized.class)
public class PsdApiTests extends ApiTester {

	private GetImagePsdRequest getImagePsdRequest;
	private PostImagePsdRequest postImagePsdRequest;

	@Parameters
	public static Iterable<Object> data() {
		return Arrays.asList(new Object[] { true, false });
	}

	private Boolean saveResultToStorage;

	public PsdApiTests(Boolean saveResult)
	{
		this.saveResultToStorage = saveResult;
	}
	
    /**
     * Test operation: Update parameters of existing PSD image.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImagePsdTest() throws Exception {
    	String name = "test.psd";
    	int channelsCount = 3;
        String compressionMethod = "raw";
        Boolean fromScratch = null;
        String outPath = null;
        String folder = getTempFolder();
        String storage = TestStorage;
		String outName = name + "_specific." + "psd";
		getImagePsdRequest = new GetImagePsdRequest(name, channelsCount, compressionMethod, fromScratch, outPath, folder, storage);
		
		Method propertiesTester = PsdApiTests.class.getDeclaredMethod("getImagePsdPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = PsdApiTests.class.getDeclaredMethod("getImagePsdGetRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImagePsdTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Channels count: %s; Compression method: %s",
            		name, channelsCount, compressionMethod),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
	
    /**
     * Test operation: Update parameters of PSD image. Image is passed in a request stream.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postImagePsdTest() throws Exception {
        byte[] imageData = null;
        int channelsCount = 3;
        String compressionMethod = "raw";
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "test.psd";
		String outName = name + "_specific." + "psd";
		postImagePsdRequest = new PostImagePsdRequest(imageData, channelsCount, compressionMethod, fromScratch, outPath, storage);
		
		Method propertiesTester = PsdApiTests.class.getDeclaredMethod("postImagePsdPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = PsdApiTests.class.getDeclaredMethod("postImagePsdPostRequestInvoker", byte[].class, String.class);
		requestInvoker.setAccessible(true);
	    this.testPostRequest(
            "postImagePsdTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Channels count: %s; Compression method: %s",
            		name, channelsCount, compressionMethod),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
	/**
	 * Invokes GET request for getImagePsd operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] getImagePsdGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImagePsdRequest.name = name;
		getImagePsdRequest.outPath = outPath;
        return ImagingApi.getImagePsd(getImagePsdRequest);
	}
	
	/**
	 * Invokes POST request for postImagePsd operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] postImagePsdPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImagePsdRequest.imageData = imageData;
		postImagePsdRequest.outPath = outPath;
        return ImagingApi.postImagePsd(postImagePsdRequest);
	}
	
	/**
	 * Tests properties for getImagePsd operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void getImagePsdPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
		Assert.assertNotNull(resultProperties.getPsdProperties());
        Assert.assertEquals(getImagePsdRequest.compressionMethod, resultProperties.getPsdProperties().getCompression().toLowerCase());
        Assert.assertEquals(getImagePsdRequest.channelsCount, resultProperties.getPsdProperties().getChannelsCount());

        Assert.assertNotNull(originalProperties.getPsdProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
        Assert.assertEquals(originalProperties.getPsdProperties().getBitsPerChannel(), resultProperties.getPsdProperties().getBitsPerChannel());
	}
	
	/**
	 * Tests properties for postImagePsd operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void postImagePsdPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
		Assert.assertNotNull(resultProperties.getPsdProperties());
		Assert.assertEquals(postImagePsdRequest.compressionMethod, resultProperties.getPsdProperties().getCompression().toLowerCase());
        Assert.assertEquals(postImagePsdRequest.channelsCount, resultProperties.getPsdProperties().getChannelsCount());

        Assert.assertNotNull(originalProperties.getPsdProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
        Assert.assertEquals(originalProperties.getPsdProperties().getBitsPerChannel(), resultProperties.getPsdProperties().getBitsPerChannel());
	}
}

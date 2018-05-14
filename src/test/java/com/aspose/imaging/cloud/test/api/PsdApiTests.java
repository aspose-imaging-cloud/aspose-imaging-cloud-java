/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PsdApiTests.java">
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
 * Class for testing PSD-related API calls
 */
@RunWith(JUnitParamsRunner.class)
public class PsdApiTests extends ApiTester {

	private GetImagePsdRequest getImagePsdRequest;
	private PostImagePsdRequest postImagePsdRequest;
	
	@Before
    public void setUp() throws Exception { 
	    this.createApiInstances();
    }
	
    /**
     * Test operation: Update parameters of existing PSD image.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void getImagePsdTest(Boolean saveResultToStorage) throws Exception {
    	String name = "test.psd";
    	int channelsCount = 3;
        String compressionMethod = "raw";
        Boolean fromScratch = null;
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
		String outName = name + "_specific." + "psd";
		getImagePsdRequest = new GetImagePsdRequest(name, channelsCount, compressionMethod, fromScratch, outPath, folder, storage);
		
		Method propertiesTester = PsdApiTests.class.getDeclaredMethod("getImagePsdPropertiesTester", ImagingResponse.class, ImagingResponse.class);
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
            "Psd",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
	
    /**
     * Test operation: Update parameters of PSD image. Image is passed in a request stream.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void postImagePsdTest(Boolean saveResultToStorage) throws Exception {
        byte[] imageData = null;
        int channelsCount = 3;
        String compressionMethod = "raw";
        Boolean fromScratch = null;
        String outPath = null;
        String storage = DefaultStorage;
        String folder = CloudTestFolder;
        String name = "test.psd";
		String outName = name + "_specific." + "psd";
		postImagePsdRequest = new PostImagePsdRequest(imageData, channelsCount, compressionMethod, fromScratch, outPath, storage);
		
		Method propertiesTester = PsdApiTests.class.getDeclaredMethod("postImagePsdPropertiesTester", ImagingResponse.class, ImagingResponse.class);
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
            "Psd",
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
	private ApiResponse getImagePsdGetRequestInvoker(String name, String outPath) throws Exception
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
	private ApiResponse postImagePsdPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImagePsdRequest.imageData = imageData;
		postImagePsdRequest.outPath = outPath;
        return ImagingApi.postImagePsd(postImagePsdRequest);
	}
	
	/**
	 * Tests properties for getImagePsd operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImagePsdPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertNotNull(resultProperties.getPsdProperties());
        Assert.assertEquals(resultProperties.getPsdProperties().getCompression().toLowerCase(), getImagePsdRequest.compressionMethod);
        Assert.assertEquals(resultProperties.getPsdProperties().getChannelsCount(), getImagePsdRequest.channelsCount);

        Assert.assertNotNull(originalProperties.getPsdProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
        Assert.assertEquals(originalProperties.getPsdProperties().getBitsPerChannel(), resultProperties.getPsdProperties().getBitsPerChannel());
	}
	
	/**
	 * Tests properties for postImagePsd operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImagePsdPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertNotNull(resultProperties.getPsdProperties());
        Assert.assertEquals(resultProperties.getPsdProperties().getCompression().toLowerCase(), postImagePsdRequest.compressionMethod);
        Assert.assertEquals(resultProperties.getPsdProperties().getChannelsCount(), postImagePsdRequest.channelsCount);

        Assert.assertNotNull(originalProperties.getPsdProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
        Assert.assertEquals(originalProperties.getPsdProperties().getBitsPerChannel(), resultProperties.getPsdProperties().getBitsPerChannel());
	}
}

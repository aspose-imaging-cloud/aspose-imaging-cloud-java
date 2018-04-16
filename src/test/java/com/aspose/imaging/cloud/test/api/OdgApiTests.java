/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="OdgApiTests.java">
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
 * Class for testing ODG-related API calls
 */
@RunWith(JUnitParamsRunner.class)
public class OdgApiTests extends ApiTester {

	private GetImageOdgRequest getImageOdgRequest;
	private PostImageOdgRequest postImageOdgRequest;
	
	@Before
    public void setUp() throws Exception { 
	    this.createApiInstances();
    }
	
    /**
     * Test operation: Rasterize existing ODG image to PNG using given parameters. 
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void getImageOdgTest(Boolean saveResultToStorage) throws Exception {
    	String name = "test.odg";
        Boolean fromScratch = null;
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
		String outName = name + "_specific." + "png";
		getImageOdgRequest = new GetImageOdgRequest(name, fromScratch, outPath, folder, storage);
		
		Method propertiesTester = OdgApiTests.class.getDeclaredMethod("getImageOdgPropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = OdgApiTests.class.getDeclaredMethod("getImageOdgGetRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImageOdgTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s",
            		name),
            name,
            outName,
            "Odg",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
	
    /**
     * Test operation: Rasterize ODG image to PNG using given parameters. Image is passed in a request stream.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void postImageOdgTest(Boolean saveResultToStorage) throws Exception {
        byte[] imageData = null;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = DefaultStorage;
        String folder = CloudTestFolder;
        String name = "test.odg";
		String outName = name + "_specific." + "png";
		postImageOdgRequest = new PostImageOdgRequest(imageData, fromScratch, outPath, storage);
		
		Method propertiesTester = OdgApiTests.class.getDeclaredMethod("postImageOdgPropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = OdgApiTests.class.getDeclaredMethod("postImageOdgPostRequestInvoker", byte[].class, String.class);
		requestInvoker.setAccessible(true);
	    this.testPostRequest(
            "postImageOdgTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s",
            		name),
            name,
            outName,
            "Odg",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
	/**
	 * Invokes GET request for getImageOdg operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse getImageOdgGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageOdgRequest.name = name;
		getImageOdgRequest.outPath = outPath;
        return ImagingApi.getImageOdg(getImageOdgRequest);
	}
	
	/**
	 * Invokes POST request for postImageOdg operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse postImageOdgPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageOdgRequest.imageData = imageData;
		postImageOdgRequest.outPath = outPath;
        return ImagingApi.postImageOdg(postImageOdgRequest);
	}
	
	/**
	 * Tests properties for getImageOdg operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImageOdgPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertNotNull(resultProperties.getPngProperties());
		Assert.assertEquals((int)resultProperties.getWidth(), originalProperties.getWidth() + 1);
        Assert.assertEquals((int)resultProperties.getHeight(), originalProperties.getHeight() + 1);
        Assert.assertNotNull(originalProperties.getOdgProperties());
        Assert.assertNotNull(originalProperties.getOdgProperties().getPages());
        Assert.assertEquals((int)originalProperties.getOdgProperties().getPageCount(), 2);
        Assert.assertEquals(originalProperties.getOdgProperties().getPages().get(0).getWidth(), originalProperties.getWidth());
        Assert.assertEquals(originalProperties.getOdgProperties().getPages().get(0).getHeight(), originalProperties.getHeight());
        Assert.assertEquals(originalProperties.getOdgProperties().getPages().get(1).getWidth(), originalProperties.getWidth());
        Assert.assertEquals(originalProperties.getOdgProperties().getPages().get(1).getHeight(), originalProperties.getHeight());
	}
	
	/**
	 * Tests properties for postImageOdg operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImageOdgPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertNotNull(resultProperties.getPngProperties());
		Assert.assertEquals((int)resultProperties.getWidth(), originalProperties.getWidth() + 1);
        Assert.assertEquals((int)resultProperties.getHeight(), originalProperties.getHeight() + 1);
        Assert.assertNotNull(originalProperties.getOdgProperties());
        Assert.assertNotNull(originalProperties.getOdgProperties().getPages());
        Assert.assertEquals((int)originalProperties.getOdgProperties().getPageCount(), 2);
        Assert.assertEquals(originalProperties.getOdgProperties().getPages().get(0).getWidth(), originalProperties.getWidth());
        Assert.assertEquals(originalProperties.getOdgProperties().getPages().get(0).getHeight(), originalProperties.getHeight());
        Assert.assertEquals(originalProperties.getOdgProperties().getPages().get(1).getWidth(), originalProperties.getWidth());
        Assert.assertEquals(originalProperties.getOdgProperties().getPages().get(1).getHeight(), originalProperties.getHeight());
	}
}
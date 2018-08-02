/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmfApiTests.java">
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
import com.aspose.imaging.cloud.test.categories.EmfTestCategory;

import junitparams.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.Assert;
import java.lang.reflect.Method;

/**
 * Class for testing EMF-related API calls
 */
@Category(EmfTestCategory.class)
@RunWith(JUnitParamsRunner.class)
public class EmfApiTests extends ApiTester {

	private GetImageEmfRequest getImageEmfRequest;
	private PostImageEmfRequest postImageEmfRequest;
	
    /**
     * Test operation: Rasterize existing EMF image to PNG using given parameters.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void getImageEmfTest(Boolean saveResultToStorage) throws Exception {
    	String name = "test.emf";
        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        Integer borderX = 50;
        Integer borderY = 50;
        Boolean fromScratch = null;
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = TestStorage;
		String outName = name + "_specific." + "png";
		getImageEmfRequest = new GetImageEmfRequest(name, bkColor, pageWidth, pageHeight, borderX, borderY, fromScratch, outPath, folder, storage);
		
		Method propertiesTester = EmfApiTests.class.getDeclaredMethod("getImageEmfPropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = EmfApiTests.class.getDeclaredMethod("getImageEmfGetRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImageEmfTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; BackColor: %s; Page width: %s; Page height: %s; BorderX: %s; BorderY: %s",
            		name, bkColor, pageWidth, pageHeight, borderX, borderY),
            name,
            outName,
            "Emf",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
	
    /**
     * Test operation: Rasterize EMF image to PNG using given parameters. Image is passed in a request stream.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void postImageEmfTest(Boolean saveResultToStorage) throws Exception {
        byte[] imageData = null;
        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        Integer borderX = 50;
        Integer borderY = 50;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = CloudTestFolder;
        String name = "test.emf";
		String outName = name + "_specific." + "png";
		postImageEmfRequest = new PostImageEmfRequest(imageData, bkColor, pageWidth, pageHeight, borderX, borderY, fromScratch, outPath, storage);
		
		Method propertiesTester = EmfApiTests.class.getDeclaredMethod("postImageEmfPropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = EmfApiTests.class.getDeclaredMethod("postImageEmfPostRequestInvoker", byte[].class, String.class);
		requestInvoker.setAccessible(true);
	    this.testPostRequest(
            "postImageEmfTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; BackColor: %s; Page width: %s; Page height: %s; BorderX: %s; BorderY: %s",
            		name, bkColor, pageWidth, pageHeight, borderX, borderY),
            name,
            outName,
            "Emf",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
	/**
	 * Invokes GET request for getImageEmf operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse getImageEmfGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageEmfRequest.name = name;
		getImageEmfRequest.outPath = outPath;
        return ImagingApi.getImageEmf(getImageEmfRequest);
	}
	
	/**
	 * Invokes POST request for postImageEmf operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse postImageEmfPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageEmfRequest.imageData = imageData;
		postImageEmfRequest.outPath = outPath;
        return ImagingApi.postImageEmf(postImageEmfRequest);
	}
	
	/**
	 * Tests properties for getImageEmf operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImageEmfPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertNotNull(resultProperties.getPngProperties());
        Assert.assertEquals((int)((getImageEmfRequest.pageWidth + getImageEmfRequest.borderX * 2) * (resultProperties.getHorizontalResolution() / 72)),
        		(int)resultProperties.getWidth());
        Assert.assertEquals((int)((getImageEmfRequest.pageHeight + getImageEmfRequest.borderY * 2) * (resultProperties.getVerticalResolution() / 72)),
        		(int)resultProperties.getHeight());
	}
	
	/**
	 * Tests properties for postImageEmf operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImageEmfPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertNotNull(resultProperties.getPngProperties());
        Assert.assertEquals((int)((postImageEmfRequest.pageWidth + postImageEmfRequest.borderX * 2) * (resultProperties.getHorizontalResolution() / 72)),
        		(int)resultProperties.getWidth());
        Assert.assertEquals((int)((postImageEmfRequest.pageHeight + postImageEmfRequest.borderY * 2) * (resultProperties.getVerticalResolution() / 72)),
        		(int)resultProperties.getHeight());
	}
}
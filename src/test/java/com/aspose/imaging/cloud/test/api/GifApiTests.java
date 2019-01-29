/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GifApiTests.java">
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
 * Class for testing GIF-related API calls
 */
@RunWith(Parameterized.class)
public class GifApiTests extends ApiTester {

	private GetImageGifRequest getImageGifRequest;
	private PostImageGifRequest postImageGifRequest;

	@Parameters
	public static Iterable<Object> data() {
		return Arrays.asList(new Object[] { true, false });
	}

	private Boolean saveResultToStorage;

	public GifApiTests(Boolean saveResult)
	{
		this.saveResultToStorage = saveResult;
	}
	
    /**
     * Test operation: Update parameters of existing GIF image.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImageGifTest() throws Exception {
    	String name = "test.gif";
        Integer backgroundColorIndex = 5;
        Integer colorResolution = 4;
        Boolean hasTrailer = true;
        Boolean interlaced = false;
        Boolean isPaletteSorted = true;
        Integer pixelAspectRatio = 4;
        Boolean fromScratch = null;
        String outPath = null;
        String folder = getTempFolder();
        String storage = TestStorage;
		String outName = name + "_specific." + "gif";
		getImageGifRequest = new GetImageGifRequest(name, backgroundColorIndex, colorResolution, hasTrailer, interlaced, isPaletteSorted, 
				pixelAspectRatio, fromScratch, outPath, folder, storage);
		
		Method propertiesTester = GifApiTests.class.getDeclaredMethod("getImageGifPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = GifApiTests.class.getDeclaredMethod("getImageGifGetRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImageGifTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Back color index: %s; Color resolution: %s; Has trailer: %s; Interlaced: %s; "
            		+ "Is palette sorted: %s; Pixel aspect ratio: %s",
            		name, backgroundColorIndex, colorResolution, hasTrailer, interlaced, isPaletteSorted, pixelAspectRatio),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
	
    /**
     * Test operation: Update parameters of GIF image. Image is passed in a request stream.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postImageGifTest() throws Exception {
        byte[] imageData = null;
        Integer backgroundColorIndex = 5;
        Integer colorResolution = 4;
        Boolean hasTrailer = true;
        Boolean interlaced = false;
        Boolean isPaletteSorted = true;
        Integer pixelAspectRatio = 4;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "test.gif";
		String outName = name + "_specific." + "gif";
		postImageGifRequest = new PostImageGifRequest(imageData, backgroundColorIndex, colorResolution, hasTrailer, interlaced, isPaletteSorted, 
				pixelAspectRatio, fromScratch, outPath, storage);
		
		Method propertiesTester = GifApiTests.class.getDeclaredMethod("postImageGifPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = GifApiTests.class.getDeclaredMethod("postImageGifPostRequestInvoker", byte[].class, String.class);
		requestInvoker.setAccessible(true);
	    this.testPostRequest(
            "postImageGifTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Back color index: %s; Color resolution: %s; Has trailer: %s; Interlaced: %s; "
            		+ "Is palette sorted: %s; Pixel aspect ratio: %s",
            		name, backgroundColorIndex, colorResolution, hasTrailer, interlaced, isPaletteSorted, pixelAspectRatio),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
	/**
	 * Invokes GET request for getImageGif operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] getImageGifGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageGifRequest.name = name;
		getImageGifRequest.outPath = outPath;
        return ImagingApi.getImageGif(getImageGifRequest);
	}
	
	/**
	 * Invokes POST request for postImageGif operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] postImageGifPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageGifRequest.imageData = imageData;
		postImageGifRequest.outPath = outPath;
        return ImagingApi.postImageGif(postImageGifRequest);
	}
	
	/**
	 * Tests properties for getImageGif operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void getImageGifPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
        Assert.assertNotNull(resultProperties.getGifProperties());

        //Assert.assertEquals(hasTrailer, outProperties.getGifProperties().getHasTrailer());
        Assert.assertEquals(getImageGifRequest.pixelAspectRatio, resultProperties.getGifProperties().getPixelAspectRatio());

        Assert.assertNotNull(originalProperties.getGifProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
	}
	
	/**
	 * Tests properties for postImageGif operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void postImageGifPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
		Assert.assertNotNull(resultProperties.getGifProperties());

        //Assert.assertEquals(hasTrailer, outProperties.getGifProperties().getHasTrailer());
        Assert.assertEquals(postImageGifRequest.pixelAspectRatio, resultProperties.getGifProperties().getPixelAspectRatio());

        Assert.assertNotNull(originalProperties.getGifProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
	}
}

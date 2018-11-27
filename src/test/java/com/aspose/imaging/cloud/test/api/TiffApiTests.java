/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TiffApiTests.java">
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
 * Class for testing TIFF-related API calls
 */
@RunWith(Parameterized.class)
public class TiffApiTests extends ApiTester {

	private GetImageTiffRequest getImageTiffRequest;
	private PostImageTiffRequest postImageTiffRequest;

    @Parameters
    public static Iterable<Object> data() {
        return Arrays.asList(new Object[] { true, false });
    }

    private Boolean saveResultToStorage;

    public TiffApiTests(Boolean saveResult)
    {
        this.saveResultToStorage = saveResult;
    }
	
    /**
     * Test operation: Update parameters of existing TIFF image.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImageTiffTest() throws Exception {
    	String name = "test.tiff";
    	String compression = "adobedeflate";
    	String resolutionUnit = "inch";
        int bitDepth = 1;
        double horizontalResolution = 150;
        double verticalResolution = 150;
        Boolean fromScratch = null;
        String outPath = null;
        String folder = getTempFolder();
        String storage = TestStorage;
		String outName = name + "_specific." + "tiff";
		getImageTiffRequest = new GetImageTiffRequest(name, compression, resolutionUnit, bitDepth, fromScratch, 
				horizontalResolution, verticalResolution, outPath, folder, storage);
		
		Method propertiesTester = TiffApiTests.class.getDeclaredMethod("getImageTiffPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = TiffApiTests.class.getDeclaredMethod("getImageTiffGetRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImageTiffTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Compression: %s; Resolution unit: %s; Bit depth: %s; Horizontal resolution: %s; Vertical resolution: %s",
            		name, compression, resolutionUnit, bitDepth, horizontalResolution, verticalResolution),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
	
    /**
     * Test operation: Update parameters of TIFF image. Image is passed in a request stream.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postImageTiffTest() throws Exception {
        byte[] imageData = null;
    	String compression = "adobedeflate";
    	String resolutionUnit = "inch";
        int bitDepth = 1;
        double horizontalResolution = 150;
        double verticalResolution = 150;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "test.tiff";
		String outName = name + "_specific." + "tiff";
		postImageTiffRequest = new PostImageTiffRequest(imageData, compression, resolutionUnit, bitDepth, fromScratch, 
				horizontalResolution, verticalResolution, outPath, storage);
		
		Method propertiesTester = TiffApiTests.class.getDeclaredMethod("postImageTiffPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = TiffApiTests.class.getDeclaredMethod("postImageTiffPostRequestInvoker", byte[].class, String.class);
		requestInvoker.setAccessible(true);
	    this.testPostRequest(
            "postImageTiffTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Compression: %s; Resolution unit: %s; Bit depth: %s; Horizontal resolution: %s; Vertical resolution: %s",
            		name, compression, resolutionUnit, bitDepth, horizontalResolution, verticalResolution),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }  
    
	/**
	 * Invokes GET request for getImageTiff operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] getImageTiffGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageTiffRequest.name = name;
		getImageTiffRequest.outPath = outPath;
        return ImagingApi.getImageTiff(getImageTiffRequest);
	}
	
	/**
	 * Invokes POST request for postImageTiff operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] postImageTiffPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageTiffRequest.imageData = imageData;
		postImageTiffRequest.outPath = outPath;
        return ImagingApi.postImageTiff(postImageTiffRequest);
	}
	
	/**
	 * Tests properties for getImageTiff operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void getImageTiffPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
		Assert.assertNotNull(resultProperties.getTiffProperties());
		Integer bitDepth = getImageTiffRequest.bitDepth > 1 ? getImageTiffRequest.bitDepth * 4 : getImageTiffRequest.bitDepth;
        Assert.assertEquals(bitDepth, resultProperties.getBitsPerPixel());
        Assert.assertEquals((int)Math.ceil((double)getImageTiffRequest.verticalResolution),
        		(int)Math.ceil((double)resultProperties.getVerticalResolution()));
        Assert.assertEquals((int)Math.ceil((double)getImageTiffRequest.horizontalResolution),
        		(int)Math.ceil((double)resultProperties.getHorizontalResolution()));

        Assert.assertNotNull(originalProperties.getTiffProperties());
        Assert.assertEquals(originalProperties.getTiffProperties().getFrames().size(), resultProperties.getTiffProperties().getFrames().size());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
	}
	
	/**
	 * Tests properties for postImageTiff operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void postImageTiffPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
		Assert.assertNotNull(resultProperties.getTiffProperties());
		Integer bitDepth = postImageTiffRequest.bitDepth > 1 ? postImageTiffRequest.bitDepth * 4 : postImageTiffRequest.bitDepth;
        Assert.assertEquals(bitDepth, resultProperties.getBitsPerPixel());
        Assert.assertEquals((int)Math.ceil((double)postImageTiffRequest.verticalResolution),
        		(int)Math.ceil((double)resultProperties.getVerticalResolution()));
        Assert.assertEquals((int)Math.ceil((double)postImageTiffRequest.horizontalResolution),
        		(int)Math.ceil((double)resultProperties.getHorizontalResolution()));

        Assert.assertNotNull(originalProperties.getTiffProperties());
        Assert.assertEquals(originalProperties.getTiffProperties().getFrames().size(), resultProperties.getTiffProperties().getFrames().size());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
	}
}

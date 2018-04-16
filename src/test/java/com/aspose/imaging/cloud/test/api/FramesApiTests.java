/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FramesApiTests.java">
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
 * Class for testing TIFF frames related API calls
 */
@RunWith(JUnitParamsRunner.class)
public class FramesApiTests extends ApiTester {

	private GetImageFrameRequest getImageFrameRequest;
	
	@Before
    public void setUp() throws Exception { 
	    this.createApiInstances();
    }
	
    /**
     * Test operation: Get separate frame from existing TIFF image.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void getImageSingleFrameTest(Boolean saveResultToStorage) throws Exception {
    	String name = "test.tiff";
    	Integer frameId = 2;
        Integer newWidth = 300;
        Integer newHeight = 450;
        Integer x = 10;
        Integer y = 10;
        Integer rectWidth = 200;
        Integer rectHeight = 300;
        String rotateFlipMethod = "Rotate90FlipX";
        Boolean saveOtherFrames = false;
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
		String outName = name + "_singleFrame." + "tiff";
		getImageFrameRequest = new GetImageFrameRequest(name, frameId, newWidth, newHeight, x, y, 
				rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames, outPath, folder, storage);
		
		Method propertiesTester = FramesApiTests.class.getDeclaredMethod("getImageFramePropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = FramesApiTests.class.getDeclaredMethod("getImageFrameRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImageSingleFrameTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Frame ID: %s; New width: %s; New height: %s; Rotate/flip method: %s; Save other frames: %s; X: %s; Y: %s; "
            		+ "Rect width: %s; Rect height: %s",
            		name, frameId, newWidth, newHeight, rotateFlipMethod, saveOtherFrames, x, y, rectWidth, rectHeight),
            name,
            outName,
            "Tiff",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Test operation: Get all frames from existing TIFF image.
     * 
     * @param saveResultToStorage If result should be saved to storage
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({"true", "false"})
    public void getImageAllFramesTest(Boolean saveResultToStorage) throws Exception {
    	String name = "test.tiff";
    	Integer frameId = 2;
        Integer newWidth = 300;
        Integer newHeight = 450;
        Integer x = 10;
        Integer y = 10;
        Integer rectWidth = 200;
        Integer rectHeight = 300;
        String rotateFlipMethod = "Rotate90FlipX";
        Boolean saveOtherFrames = true;
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
		String outName = name + "_allFrames." + "tiff";
		getImageFrameRequest = new GetImageFrameRequest(name, frameId, newWidth, newHeight, x, y, 
				rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames, outPath, folder, storage);
		
		Method propertiesTester = FramesApiTests.class.getDeclaredMethod("getImageFramesPropertiesTester", ImagingResponse.class, ImagingResponse.class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = FramesApiTests.class.getDeclaredMethod("getImageFrameRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImageAllFramesTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Frame ID: %s; New width: %s; New height: %s; Rotate/flip method: %s; Save other frames: %s; X: %s; Y: %s; "
            		+ "Rect width: %s; Rect height: %s",
            		name, frameId, newWidth, newHeight, rotateFlipMethod, saveOtherFrames, x, y, rectWidth, rectHeight),
            name,
            outName,
            "Tiff",
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
	
	/**
	 * Invokes GET request for getImageFrame operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse getImageFrameRequestInvoker(String name, String outPath) throws Exception
	{
		getImageFrameRequest.name = name;
		getImageFrameRequest.outPath = outPath;
        return ImagingApi.getImageFrame(getImageFrameRequest);
	}
	
	/**
	 * Tests properties for getImageFrame operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @throws Exception 
	 */
	private void getImageFramePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties) throws Exception
	{
		Assert.assertNotNull(resultProperties.getTiffProperties());
        Assert.assertNotNull(resultProperties.getTiffProperties().getFrames());
        Assert.assertEquals(resultProperties.getTiffProperties().getFrames().size(), 1);

        // please note that rotation was performed, so switching of width and height comparison is valid
        Assert.assertEquals(resultProperties.getTiffProperties().getFrames().get(0).getWidth(), getImageFrameRequest.rectHeight);
        Assert.assertEquals(resultProperties.getTiffProperties().getFrames().get(0).getHeight(), getImageFrameRequest.rectWidth);
        Assert.assertEquals((long)resultProperties.getTiffProperties().getFrames().get(0).getFrameOptions().getImageWidth(),
        		(long)getImageFrameRequest.rectHeight);
        Assert.assertEquals((long)resultProperties.getTiffProperties().getFrames().get(0).getFrameOptions().getImageLength(), 
        		(long)getImageFrameRequest.rectWidth);
        Assert.assertEquals(resultProperties.getWidth(), getImageFrameRequest.rectHeight);
        Assert.assertEquals(resultProperties.getHeight(), getImageFrameRequest.rectWidth);
        
        GetImageFramePropertiesRequest framePropertiesRequest = new GetImageFramePropertiesRequest(getImageFrameRequest.name + "_singleFrame." + "tiff", 0, 
        		getImageFrameRequest.folder, getImageFrameRequest.storage);
        ImagingResponse framePropertiesResponse = ImagingApi.getImageFrameProperties(framePropertiesRequest).getImagingResponse();
        Assert.assertNotNull(framePropertiesResponse);
        Assert.assertNotNull(framePropertiesResponse.getTiffProperties());
        Assert.assertNotNull(framePropertiesResponse.getTiffProperties().getFrames());
        Assert.assertEquals(getImageFrameRequest.rectHeight, framePropertiesResponse.getWidth());
        Assert.assertEquals(getImageFrameRequest.rectWidth, framePropertiesResponse.getHeight());
        Assert.assertEquals(framePropertiesResponse.getTiffProperties().getFrames().get(0).getWidth(), framePropertiesResponse.getWidth());
        Assert.assertEquals(framePropertiesResponse.getTiffProperties().getFrames().get(0).getHeight(), framePropertiesResponse.getHeight());
        Assert.assertEquals((long)framePropertiesResponse.getTiffProperties().getFrames().get(0).getFrameOptions().getImageWidth(), 
        		(long)framePropertiesResponse.getWidth());
        Assert.assertEquals((long)framePropertiesResponse.getTiffProperties().getFrames().get(0).getFrameOptions().getImageLength(), 
        		(long)framePropertiesResponse.getHeight());
	}
	
	/**
	 * Tests properties for getImageFrame operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @throws Exception 
	 */
	private void getImageFramesPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties) throws Exception
	{
		Assert.assertNotNull(originalProperties);
		Assert.assertNotNull(originalProperties.getTiffProperties());
        Assert.assertNotNull(originalProperties.getTiffProperties().getFrames());

        Assert.assertNotNull(resultProperties);
        Assert.assertNotNull(resultProperties.getTiffProperties());
        Assert.assertNotNull(resultProperties.getTiffProperties().getFrames());
        Assert.assertEquals(resultProperties.getTiffProperties().getFrames().size(), originalProperties.getTiffProperties().getFrames().size());
        Assert.assertEquals(resultProperties.getWidth(), originalProperties.getWidth());
        Assert.assertEquals(resultProperties.getHeight(), originalProperties.getHeight());

        // please note that rotation was performed, so switching of width and height comparison is valid
        Assert.assertEquals(resultProperties.getTiffProperties().getFrames().get(getImageFrameRequest.frameId).getWidth(), 
        		getImageFrameRequest.rectHeight);
        Assert.assertEquals(resultProperties.getTiffProperties().getFrames().get(getImageFrameRequest.frameId).getHeight(),
        		getImageFrameRequest.rectWidth);
        Assert.assertEquals((long)resultProperties.getTiffProperties().getFrames().get(getImageFrameRequest.frameId).getFrameOptions().getImageWidth(), 
        		(long)getImageFrameRequest.rectHeight);
        Assert.assertEquals((long)resultProperties.getTiffProperties().getFrames().get(getImageFrameRequest.frameId).getFrameOptions().getImageLength(), 
        		(long)getImageFrameRequest.rectWidth);

        for (int frameIndex = 0; frameIndex < resultProperties.getTiffProperties().getFrames().size(); frameIndex++)
        {
        	GetImageFramePropertiesRequest framePropertiesRequest = new GetImageFramePropertiesRequest(getImageFrameRequest.name + 
        			"_allFrames." + "tiff", frameIndex, getImageFrameRequest.folder, getImageFrameRequest.storage);
            ImagingResponse framePropertiesResponse = ImagingApi.getImageFrameProperties(framePropertiesRequest).getImagingResponse();
            Assert.assertNotNull(framePropertiesResponse);
            Assert.assertNotNull(framePropertiesResponse.getTiffProperties());
            Assert.assertNotNull(framePropertiesResponse.getTiffProperties().getFrames());
            Assert.assertEquals(framePropertiesResponse.getTiffProperties().getFrames().size(), 1);
            Assert.assertEquals(resultProperties.getTiffProperties().getFrames().get(frameIndex).getWidth(), 
            		framePropertiesResponse.getTiffProperties().getFrames().get(0).getWidth());
            Assert.assertEquals(resultProperties.getTiffProperties().getFrames().get(frameIndex).getHeight(), 
            		framePropertiesResponse.getTiffProperties().getFrames().get(0).getHeight());
            Assert.assertEquals((long)resultProperties.getTiffProperties().getFrames().get(frameIndex).getWidth(),
            		(long)framePropertiesResponse.getTiffProperties().getFrames().get(0).getFrameOptions().getImageWidth());
            Assert.assertEquals((long)resultProperties.getTiffProperties().getFrames().get(frameIndex).getHeight(), 
            		(long)framePropertiesResponse.getTiffProperties().getFrames().get(0).getFrameOptions().getImageLength());

            if (getImageFrameRequest.frameId == frameIndex)
            {
                Assert.assertNotEquals(resultProperties.getTiffProperties().getFrames().get(frameIndex).getWidth(),
                		originalProperties.getTiffProperties().getFrames().get(frameIndex).getWidth());
                Assert.assertNotEquals(resultProperties.getTiffProperties().getFrames().get(frameIndex).getHeight(), 
                		originalProperties.getTiffProperties().getFrames().get(frameIndex).getHeight());
                Assert.assertNotEquals((long)resultProperties.getTiffProperties().getFrames().get(frameIndex).getFrameOptions().getImageWidth(), 
                		(long)originalProperties.getTiffProperties().getFrames().get(frameIndex).getFrameOptions().getImageWidth());
                Assert.assertNotEquals((long)resultProperties.getTiffProperties().getFrames().get(frameIndex).getFrameOptions().getImageLength(), 
                		(long)originalProperties.getTiffProperties().getFrames().get(frameIndex).getFrameOptions().getImageLength());
            }
            else
            {
            	Assert.assertEquals(resultProperties.getTiffProperties().getFrames().get(frameIndex).getWidth(),
                		originalProperties.getTiffProperties().getFrames().get(frameIndex).getWidth());
                Assert.assertEquals(resultProperties.getTiffProperties().getFrames().get(frameIndex).getHeight(), 
                		originalProperties.getTiffProperties().getFrames().get(frameIndex).getHeight());
                Assert.assertEquals((long)resultProperties.getTiffProperties().getFrames().get(frameIndex).getFrameOptions().getImageWidth(), 
                		(long)originalProperties.getTiffProperties().getFrames().get(frameIndex).getFrameOptions().getImageWidth());
                Assert.assertEquals((long)resultProperties.getTiffProperties().getFrames().get(frameIndex).getFrameOptions().getImageLength(), 
                		(long)originalProperties.getTiffProperties().getFrames().get(frameIndex).getFrameOptions().getImageLength());
            }
        }
	}
}
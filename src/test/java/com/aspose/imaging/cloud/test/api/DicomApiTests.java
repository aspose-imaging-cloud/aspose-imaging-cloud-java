/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DicomApiTests.java">
*   Copyright (c) 2018 2018 Aspose Pty Ltd.
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
 * Class for testing DICOM-related API calls
 */
@RunWith(Parameterized.class)
public class DicomApiTests extends ApiTester {

	private GetImageDicomRequest getImageDicomRequest;
	private PostImageDicomRequest postImageDicomRequest;

	@Parameters
	public static Iterable<Object> data() {
		return Arrays.asList(new Object[] { true, false });
	}

	private Boolean saveResultToStorage;

	public DicomApiTests(Boolean saveResult)
	{
		this.saveResultToStorage = saveResult;
	}
	
    /**
     * Test operation: Rasterize existing DICOM image to PNG using given parameters. 
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImageDicomTest() throws Exception {
    	String name = "test.dicom";
        Boolean fromScratch = null;
        String outPath = null;
        String folder = getTempFolder();
        String storage = TestStorage;
		String outName = name + "_specific." + "png";
		getImageDicomRequest = new GetImageDicomRequest(name, fromScratch, outPath, folder, storage);
		
		Method propertiesTester = DicomApiTests.class.getDeclaredMethod("getImageDicomPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = DicomApiTests.class.getDeclaredMethod("getImageDicomGetRequestInvoker", String.class, String.class);
		requestInvoker.setAccessible(true);
	    this.testGetRequest(
            "getImageDicomTest; save result to storage: " + saveResultToStorage, 
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
     * Test operation: Rasterize DICOM image to PNG using given parameters. Image is passed in a request stream.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postImageDicomTest() throws Exception {
        byte[] imageData = null;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "test.dicom";
		String outName = name + "_specific." + "png";
		postImageDicomRequest = new PostImageDicomRequest(imageData, fromScratch, outPath, storage);
		
		Method propertiesTester = DicomApiTests.class.getDeclaredMethod("postImageDicomPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
		propertiesTester.setAccessible(true);
		Method requestInvoker = DicomApiTests.class.getDeclaredMethod("postImageDicomPostRequestInvoker", byte[].class, String.class);
		requestInvoker.setAccessible(true);
	    this.testPostRequest(
            "postImageDicomTest; save result to storage: " + saveResultToStorage, 
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
	 * Invokes GET request for getImageDicom operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] getImageDicomGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageDicomRequest.name = name;
		getImageDicomRequest.outPath = outPath;
        return ImagingApi.getImageDicom(getImageDicomRequest);
	}
	
	/**
	 * Invokes POST request for postImageDicom operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] postImageDicomPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageDicomRequest.imageData = imageData;
		postImageDicomRequest.outPath = outPath;
        return ImagingApi.postImageDicom(postImageDicomRequest);
	}
	
	/**
	 * Tests properties for getImageDicom operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void getImageDicomPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
		Assert.assertNotNull(resultProperties.getPngProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
        Assert.assertNotNull(originalProperties.getDicomProperties());
        Assert.assertEquals(10, (int)originalProperties.getDicomProperties().getNumberOfFrames());
        Assert.assertEquals(originalProperties.getWidth(), originalProperties.getDicomProperties().getWidth());
        Assert.assertEquals(originalProperties.getHeight(), originalProperties.getDicomProperties().getHeight());
	}
	
	/**
	 * Tests properties for postImageDicom operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void postImageDicomPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
		Assert.assertNotNull(resultProperties.getPngProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
        Assert.assertNotNull(originalProperties.getDicomProperties());
        Assert.assertEquals(10, (int)originalProperties.getDicomProperties().getNumberOfFrames());
        Assert.assertEquals(originalProperties.getWidth(), originalProperties.getDicomProperties().getWidth());
        Assert.assertEquals(originalProperties.getHeight(), originalProperties.getDicomProperties().getHeight());
	}
}

/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="RotateFlipApiTests.java">
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
import com.aspose.imaging.cloud.test.base.StorageFileInfo;

import junitparams.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Class for testing crop-related API calls
 */
@RunWith(JUnitParamsRunner.class)
public class RotateFlipApiTests extends ApiTester {

	private GetImageRotateFlipRequest getImageRotateFlipRequest;
	private PostImageRotateFlipRequest postImageRotateFlipRequest;
	
    /**
     * Test operation: RotateFlip an existing image.
     * 
     * @param formatExtension Format extension to search for input images in the test folder
     * @param saveResultToStorage If result should be saved to storage
     * @param additionalExportFormats Additional formats to export to
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({
		".jpg, true,", 
		".jpg, false,",
		})
    public void getImageRotateFlipTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        String name = null;
        String method = "Rotate90FlipX";
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
		String outName = null;
		
		ArrayList<String> formatsToExport = new ArrayList<String>();
		Collections.addAll(formatsToExport, this.BasicExportFormats);
		for (String additionalExportFormat : additionalExportFormats)
        {
            if (additionalExportFormat != null && !additionalExportFormat.trim().equals("") && !formatsToExport.contains(additionalExportFormat))
            {
                formatsToExport.add(additionalExportFormat);
            }
        }
		
		for (StorageFileInfo inputFile : InputTestFiles)
		{
			if (inputFile.getName().endsWith(formatExtension))
            {
                name = inputFile.getName();
            }
            else
            {
                continue;
            }
			
			for (String format : formatsToExport)
            {
				getImageRotateFlipRequest = new GetImageRotateFlipRequest(name, format, method, outPath, folder, storage);
				outName = name + "_rotateFlip." + format;
				
				Method propertiesTester = RotateFlipApiTests.class.getDeclaredMethod("getImageRotateFlipPropertiesTester", ImagingResponse.class, ImagingResponse.class);
				propertiesTester.setAccessible(true);
				Method requestInvoker = RotateFlipApiTests.class.getDeclaredMethod("getImageRotateFlipGetRequestInvoker", String.class, String.class);
				requestInvoker.setAccessible(true);
			    this.testGetRequest(
		            "getImageRotateFlipTest; save result to storage: " + saveResultToStorage, 
		            saveResultToStorage,
		            String.format("Input image: %s; Output format: %s; Method: %s",
		            		name, format, method),
		            name,
		            outName,
		            "RotateFlip",
		            requestInvoker,
		            propertiesTester,
		            folder,
		            storage);
            }
		}
    }
    
    /**
     * Test operation: RotateFlip an image. Image is passed in a request stream.
     * 
     * @param formatExtension Format extension to search for input images in the test folder
     * @param saveResultToStorage If result should be saved to storage
     * @param additionalExportFormats Additional formats to export to
     * @throws Exception
     *          if the Api call fails
     */
    @Test
	@Parameters({
		".jpg, true,", 
		".jpg, false,",
		})
    public void postImageRotateFlipTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
    	byte[] imageData = null;
		String name = null;
		String method = "Rotate90FlipX";
        String outPath = null;
        String folder = CloudTestFolder;
        String storage = DefaultStorage;
		String outName = null;
		
		ArrayList<String> formatsToExport = new ArrayList<String>();
		Collections.addAll(formatsToExport, this.BasicExportFormats);
		for (String additionalExportFormat : additionalExportFormats)
        {
            if (additionalExportFormat != null && !additionalExportFormat.trim().equals("") && !formatsToExport.contains(additionalExportFormat))
            {
                formatsToExport.add(additionalExportFormat);
            }
        }
		
		for (StorageFileInfo inputFile : InputTestFiles)
		{
			if (inputFile.getName().endsWith(formatExtension))
            {
                name = inputFile.getName();
            }
            else
            {
                continue;
            }
			
			for (String format : formatsToExport)
            {
				postImageRotateFlipRequest = new PostImageRotateFlipRequest(imageData, format, method, outPath, storage);
				outName = name + "_rotateFlip." + format;
				
				Method propertiesTester = RotateFlipApiTests.class.getDeclaredMethod("postImageRotateFlipPropertiesTester", ImagingResponse.class, ImagingResponse.class);
				propertiesTester.setAccessible(true);
				Method requestInvoker = RotateFlipApiTests.class.getDeclaredMethod("postImageRotateFlipPostRequestInvoker", byte[].class, String.class);
				requestInvoker.setAccessible(true);
			    this.testPostRequest(
		            "postImageRotateFlipTest; save result to storage: " + saveResultToStorage,  
		            saveResultToStorage,
		            String.format("Input image: %s; Output format: %s; Method: %s",
		            		name, format, method),
		            name,
		            outName,
		            "RotateFlip",
		            requestInvoker,
		            propertiesTester,
		            folder,
		            storage);
            }
		}
    }
	
    /**
	 * Invokes GET request for getImageRotateFlip operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse getImageRotateFlipGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageRotateFlipRequest.name = name;
		getImageRotateFlipRequest.outPath = outPath;
        return ImagingApi.getImageRotateFlip(getImageRotateFlipRequest);
	}
	
	/**
	 * Invokes POST request for postImageRotateFlip operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse postImageRotateFlipPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageRotateFlipRequest.imageData = imageData;
		postImageRotateFlipRequest.outPath = outPath;
        return ImagingApi.postImageRotateFlip(postImageRotateFlipRequest);
	}
	
	/**
	 * Tests properties for getImageRotateFlip operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImageRotateFlipPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		try
        {
            Assert.assertEquals(originalProperties.getHeight(), resultProperties.getWidth());
        }
        catch (AssertionError e)
        {
            Assert.assertEquals((int)originalProperties.getHeight(), (int)resultProperties.getWidth() + 1);
        }

		try
        {
            Assert.assertEquals(originalProperties.getWidth(), resultProperties.getHeight());
        }
        catch (AssertionError e)
        {
            Assert.assertEquals((int)originalProperties.getWidth(), (int)resultProperties.getHeight() + 1);
        }
	}
	
	/**
	 * Tests properties for postImageRotateFlip operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImageRotateFlipPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		try
        {
            Assert.assertEquals(originalProperties.getHeight(), resultProperties.getWidth());
        }
        catch (AssertionError e)
        {
            Assert.assertEquals((int)originalProperties.getHeight(), (int)resultProperties.getWidth() + 1);
        }

		try
        {
            Assert.assertEquals(originalProperties.getWidth(), resultProperties.getHeight());
        }
        catch (AssertionError e)
        {
            Assert.assertEquals((int)originalProperties.getWidth(), (int)resultProperties.getHeight() + 1);
        }
	}
}
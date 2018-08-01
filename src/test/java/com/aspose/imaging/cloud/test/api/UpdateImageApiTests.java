/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ImageUpdateApiTests.java">
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
import com.aspose.imaging.cloud.test.categories.UpdateTestCategory;

import junitparams.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.Assert;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Class for testing crop-related API calls
 */
@Category(UpdateTestCategory.class)
@RunWith(JUnitParamsRunner.class)
public class UpdateImageApiTests extends ApiTester {

	private GetImageUpdateRequest getImageUpdateRequest;
	private PostImageUpdateRequest postImageUpdateRequest;
	
    /**
     * Test operation: Update an existing image.
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
    public void getImageUpdateTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        String name = null;
        String outPath = null;
        Integer newWidth = 300;
        Integer newHeight = 450;
        Integer x = 10;
        Integer y = 10;
        Integer rectWidth = 200;
        Integer rectHeight = 300;
        String rotateFlipMethod = "Rotate90FlipX";
        String folder = TempFolder;
        String storage = TestStorage;
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
				getImageUpdateRequest = new GetImageUpdateRequest(name, format, newWidth, newHeight, x, y, rectWidth, rectHeight, rotateFlipMethod, outPath, folder, storage);
				outName = name + "_update." + format;
				
				Method propertiesTester = UpdateImageApiTests.class.getDeclaredMethod("getImageUpdatePropertiesTester", ImagingResponse.class, ImagingResponse.class);
				propertiesTester.setAccessible(true);
				Method requestInvoker = UpdateImageApiTests.class.getDeclaredMethod("getImageUpdateGetRequestInvoker", String.class, String.class);
				requestInvoker.setAccessible(true);
			    this.testGetRequest(
		            "getImageUpdateTest; save result to storage: " + saveResultToStorage, 
		            saveResultToStorage,
		            String.format("Input image: %s; Output format: %s; New width: %s; New height: %s; "
		            		+ "Rotate/flip method: %s; X: %s; Y: %s; Rect width: %s; Rect height: %s",
		            		name, format, newWidth, newHeight, rotateFlipMethod, x, y, rectWidth, rectHeight),
		            name,
		            outName,
		            "Update",
		            requestInvoker,
		            propertiesTester,
		            folder,
		            storage);
            }
		}
    }
    
    /**
     * Test operation: Update an image. Image is passed in a request stream.
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
    public void postImageUpdateTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
    	byte[] imageData = null;
		String name = null;
        String outPath = null;
        Integer newWidth = 300;
        Integer newHeight = 450;
        Integer x = 10;
        Integer y = 10;
        Integer rectWidth = 200;
        Integer rectHeight = 300;
        String rotateFlipMethod = "Rotate90FlipX";
        String folder = TempFolder;
        String storage = TestStorage;
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
				postImageUpdateRequest = new PostImageUpdateRequest(imageData, format, newWidth, newHeight, x, y, rectWidth, rectHeight, 
						rotateFlipMethod, outPath, storage);
				outName = name + "_update." + format;
				
				Method propertiesTester = UpdateImageApiTests.class.getDeclaredMethod("postImageUpdatePropertiesTester", ImagingResponse.class, ImagingResponse.class);
				propertiesTester.setAccessible(true);
				Method requestInvoker = UpdateImageApiTests.class.getDeclaredMethod("postImageUpdatePostRequestInvoker", byte[].class, String.class);
				requestInvoker.setAccessible(true);
			    this.testPostRequest(
		            "postImageUpdateTest; save result to storage: " + saveResultToStorage,  
		            saveResultToStorage,
		            String.format("Input image: %s; Output format: %s; New width: %s; New height: %s; "
		            		+ "Rotate/flip method: %s; X: %s; Y: %s; Rect width: %s; Rect height: %s",
		            		name, format, newWidth, newHeight, rotateFlipMethod, x, y, rectWidth, rectHeight),
		            name,
		            outName,
		            "Update",
		            requestInvoker,
		            propertiesTester,
		            folder,
		            storage);
            }
		}
    }
    
    /**
     * Extended test set for Update operation.
     * @throws Exception
     */
    @Test
    public void ExtendedUpdateTests() throws Exception
    {
		if (isExtendedTests())
    	{
    		this.getImageUpdateTest(".bmp", true);
    		this.getImageUpdateTest(".bmp", false);
    		this.postImageUpdateTest(".bmp", true);
    		this.postImageUpdateTest(".bmp", false);
    		this.getImageUpdateTest(".dicom", true);
    		this.getImageUpdateTest(".dicom", false);
    		this.postImageUpdateTest(".dicom", true);
    		this.postImageUpdateTest(".dicom", false);
    		/* TODO: enable after IMAGINGCLOUD-51 is resolved
    		this.getImageUpdateTest(".gif", true);
    		this.getImageUpdateTest(".gif", false);
    		this.postImageUpdateTest(".gif", true);
    		this.postImageUpdateTest(".gif", false);
    		*/
    		this.getImageUpdateTest(".j2k", true);
    		this.getImageUpdateTest(".j2k", false);
    		this.postImageUpdateTest(".j2k", true);
    		this.postImageUpdateTest(".j2k", false);
    		this.getImageUpdateTest(".png", true);
    		this.getImageUpdateTest(".png", false);
    		this.postImageUpdateTest(".png", true);
    		this.postImageUpdateTest(".png", false);
    		this.getImageUpdateTest(".psd", true);
    		this.getImageUpdateTest(".psd", false);
    		this.postImageUpdateTest(".psd", true);
    		this.postImageUpdateTest(".psd", false);
    		this.getImageUpdateTest(".tiff", true);
    		this.getImageUpdateTest(".tiff", false);
    		this.postImageUpdateTest(".tiff", true);
    		this.postImageUpdateTest(".tiff", false);
    		this.getImageUpdateTest(".webp", true);
    		this.getImageUpdateTest(".webp", false);
    		this.postImageUpdateTest(".webp", true);
    		this.postImageUpdateTest(".webp", false);
    	}
		else
		{
			System.out.println("Extended tests had been disabled");
		}
    }
	
    /**
	 * Invokes GET request for getImageUpdate operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse getImageUpdateGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageUpdateRequest.name = name;
		getImageUpdateRequest.outPath = outPath;
        return ImagingApi.getImageUpdate(getImageUpdateRequest);
	}
	
	/**
	 * Invokes POST request for postImageUpdate operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse postImageUpdatePostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageUpdateRequest.imageData = imageData;
		postImageUpdateRequest.outPath = outPath;
        return ImagingApi.postImageUpdate(postImageUpdateRequest);
	}
	
	/**
	 * Tests properties for getImageUpdate operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImageUpdatePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertEquals(getImageUpdateRequest.rectHeight, resultProperties.getWidth());
        Assert.assertEquals(getImageUpdateRequest.rectWidth, resultProperties.getHeight());
	}
	
	/**
	 * Tests properties for postImageUpdate operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImageUpdatePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertEquals(postImageUpdateRequest.rectHeight, resultProperties.getWidth());
        Assert.assertEquals(postImageUpdateRequest.rectWidth, resultProperties.getHeight());
	}
}
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CropApiTests.java">
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
import com.aspose.imaging.cloud.test.categories.CropTestCategory;

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
@Category(CropTestCategory.class)
@RunWith(JUnitParamsRunner.class)
public class CropApiTests extends ApiTester {

	private GetImageCropRequest getImageCropRequest;
	private PostImageCropRequest postImageCropRequest;

    /**
     * Test operation: Crop an existing image.
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
    public void getImageCropTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        String name = null;
        Integer x = 10;
        Integer y = 10;
        Integer width = 100;
        Integer height = 150;
        String outPath = null;
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
				getImageCropRequest = new GetImageCropRequest(name, format, x, y, width, height, outPath, folder, storage);
				outName = name + "_crop." + format;
				
				Method propertiesTester = CropApiTests.class.getDeclaredMethod("getImageCropPropertiesTester", ImagingResponse.class, ImagingResponse.class);
				propertiesTester.setAccessible(true);
				Method requestInvoker = CropApiTests.class.getDeclaredMethod("getImageCropGetRequestInvoker", String.class, String.class);
				requestInvoker.setAccessible(true);
			    this.testGetRequest(
		            "getImageCropTest; save result to storage: " + saveResultToStorage, 
		            saveResultToStorage,
		            String.format("Input image: %s; Output format: %s; Width: %s; Height: %s; X: %s; Y: %s",
		            		name, format, width, height, x, y),
		            name,
		            outName,
		            "Crop",
		            requestInvoker,
		            propertiesTester,
		            folder,
		            storage);
            }
		}
    }
    
    /**
     * Test operation: Crop an image. Image is passed in a request stream.
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
    public void postImageCropTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
    	byte[] imageData = null;
		String name = null;
        Integer x = 10;
        Integer y = 10;
        Integer width = 100;
        Integer height = 150;
        String outPath = null;
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
				postImageCropRequest = new PostImageCropRequest(imageData, format, x, y, width, height, outPath, storage);
				outName = name + "_crop." + format;
				
				Method propertiesTester = CropApiTests.class.getDeclaredMethod("postImageCropPropertiesTester", ImagingResponse.class, ImagingResponse.class);
				propertiesTester.setAccessible(true);
				Method requestInvoker = CropApiTests.class.getDeclaredMethod("postImageCropPostRequestInvoker", byte[].class, String.class);
				requestInvoker.setAccessible(true);
			    this.testPostRequest(
		            "postImageCropTest; save result to storage: " + saveResultToStorage,  
		            saveResultToStorage,
		            String.format("Input image: %s; Output format: %s; Width: %s; Height: %s; X: %s; Y: %s",
		            		name, format, width, height, x, y),
		            name,
		            outName,
		            "Crop",
		            requestInvoker,
		            propertiesTester,
		            folder,
		            storage);
            }
		}
    }
    
    /**
     * Extended test set for Crop operation.
     * @throws Exception
     */
    @Test
    public void ExtendedCropTests() throws Exception
    {
		if (isExtendedTests())
    	{
    		this.getImageCropTest(".bmp", true);
    		this.getImageCropTest(".bmp", false);
    		this.postImageCropTest(".bmp", true);
    		this.postImageCropTest(".bmp", false);
    		this.getImageCropTest(".dicom", true);
    		this.getImageCropTest(".dicom", false);
    		this.postImageCropTest(".dicom", true);
    		this.postImageCropTest(".dicom", false);
    		/* TODO: enable after IMAGINGCLOUD-51 is resolved
    		this.getImageCropTest(".gif", true);
    		this.getImageCropTest(".gif", false);
    		this.postImageCropTest(".gif", true);
    		this.postImageCropTest(".gif", false);
    		*/
    		this.getImageCropTest(".j2k", true);
    		this.getImageCropTest(".j2k", false);
    		this.postImageCropTest(".j2k", true);
    		this.postImageCropTest(".j2k", false);
    		this.getImageCropTest(".png", true);
    		this.getImageCropTest(".png", false);
    		this.postImageCropTest(".png", true);
    		this.postImageCropTest(".png", false);
    		this.getImageCropTest(".psd", true);
    		this.getImageCropTest(".psd", false);
    		this.postImageCropTest(".psd", true);
    		this.postImageCropTest(".psd", false);
    		this.getImageCropTest(".tiff", true);
    		this.getImageCropTest(".tiff", false);
    		this.postImageCropTest(".tiff", true);
    		this.postImageCropTest(".tiff", false);
    		this.getImageCropTest(".webp", true);
    		this.getImageCropTest(".webp", false);
    		this.postImageCropTest(".webp", true);
    		this.postImageCropTest(".webp", false);
    	}
		else
		{
			System.out.println("Extended tests had been disabled");
		}
    }
	
    /**
	 * Invokes GET request for getImageCrop operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse getImageCropGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageCropRequest.name = name;
		getImageCropRequest.outPath = outPath;
        return ImagingApi.getImageCrop(getImageCropRequest);
	}
	
	/**
	 * Invokes POST request for postImageCrop operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse postImageCropPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageCropRequest.imageData = imageData;
		postImageCropRequest.outPath = outPath;
        return ImagingApi.postImageCrop(postImageCropRequest);
	}
	
	/**
	 * Tests properties for getImageCrop operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImageCropPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertEquals(getImageCropRequest.width, resultProperties.getWidth());
        Assert.assertEquals(getImageCropRequest.height, resultProperties.getHeight());
	}
	
	/**
	 * Tests properties for postImageCrop operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImageCropPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertEquals(postImageCropRequest.width, resultProperties.getWidth());
        Assert.assertEquals(postImageCropRequest.height, resultProperties.getHeight());
	}
}
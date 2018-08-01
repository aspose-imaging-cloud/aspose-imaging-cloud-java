/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SaveAsApiTests.java">
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
import com.aspose.imaging.cloud.test.categories.SaveAsTestCategory;

import junitparams.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Class for testing crop-related API calls
 */
@Category(SaveAsTestCategory.class)
@RunWith(JUnitParamsRunner.class)
public class SaveAsApiTests extends ApiTester {

	private GetImageSaveAsRequest getImageSaveAsRequest;
	private PostImageSaveAsRequest postImageSaveAsRequest;

    /**
     * Test operation: SaveAs an existing image.
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
    public void getImageSaveAsTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        String name = null;
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
				getImageSaveAsRequest = new GetImageSaveAsRequest(name, format, outPath, folder, storage);
				outName = name + "." + format;
				
				Method propertiesTester = SaveAsApiTests.class.getDeclaredMethod("getImageSaveAsPropertiesTester", ImagingResponse.class, ImagingResponse.class);
				propertiesTester.setAccessible(true);
				Method requestInvoker = SaveAsApiTests.class.getDeclaredMethod("getImageSaveAsGetRequestInvoker", String.class, String.class);
				requestInvoker.setAccessible(true);
			    this.testGetRequest(
		            "getImageSaveAsTest; save result to storage: " + saveResultToStorage, 
		            saveResultToStorage,
		            String.format("Input image: %s; Output format: %s",
		            		name, format),
		            name,
		            outName,
		            "Common",
		            requestInvoker,
		            propertiesTester,
		            folder,
		            storage);
            }
		}
    }
    
    /**
     * Test operation: SaveAs an image. Image is passed in a request stream.
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
    public void postImageSaveAsTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
    	byte[] imageData = null;
		String name = null;
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
				postImageSaveAsRequest = new PostImageSaveAsRequest(imageData, format, outPath, storage);
				outName = name + "." + format;
				
				Method propertiesTester = SaveAsApiTests.class.getDeclaredMethod("postImageSaveAsPropertiesTester", ImagingResponse.class, ImagingResponse.class);
				propertiesTester.setAccessible(true);
				Method requestInvoker = SaveAsApiTests.class.getDeclaredMethod("postImageSaveAsPostRequestInvoker", byte[].class, String.class);
				requestInvoker.setAccessible(true);
			    this.testPostRequest(
		            "postImageSaveAsTest; save result to storage: " + saveResultToStorage,  
		            saveResultToStorage,
		            String.format("Input image: %s; Output format: %s",
		            		name, format),
		            name,
		            outName,
		            "Common",
		            requestInvoker,
		            propertiesTester,
		            folder,
		            storage);
            }
		}
    }
    
    /**
     * Extended test set for SaveAs operation.
     * @throws Exception
     */
    @Test
    public void ExtendedSaveAsTests() throws Exception
    {
		if (isExtendedTests())
    	{
    		this.getImageSaveAsTest(".bmp", true);
    		this.getImageSaveAsTest(".bmp", false);
    		this.postImageSaveAsTest(".bmp", true);
    		this.postImageSaveAsTest(".bmp", false);
    		this.getImageSaveAsTest(".dicom", true);
    		this.getImageSaveAsTest(".dicom", false);
    		this.postImageSaveAsTest(".dicom", true);
    		this.postImageSaveAsTest(".dicom", false);
    		/* TODO: enable after IMAGINGCLOUD-51 is resolved
    		this.getImageSaveAsTest(".gif", true);
    		this.getImageSaveAsTest(".gif", false);
    		this.postImageSaveAsTest(".gif", true);
    		this.postImageSaveAsTest(".gif", false);
    		*/
    		this.getImageSaveAsTest(".j2k", true);
    		this.getImageSaveAsTest(".j2k", false);
    		this.postImageSaveAsTest(".j2k", true);
    		this.postImageSaveAsTest(".j2k", false);
    		this.getImageSaveAsTest(".png", true);
    		this.getImageSaveAsTest(".png", false);
    		this.postImageSaveAsTest(".png", true);
    		this.postImageSaveAsTest(".png", false);
    		this.getImageSaveAsTest(".psd", true);
    		this.getImageSaveAsTest(".psd", false);
    		this.postImageSaveAsTest(".psd", true);
    		this.postImageSaveAsTest(".psd", false);
    		this.getImageSaveAsTest(".tiff", true);
    		this.getImageSaveAsTest(".tiff", false);
    		this.postImageSaveAsTest(".tiff", true);
    		this.postImageSaveAsTest(".tiff", false);
    		this.getImageSaveAsTest(".webp", true);
    		this.getImageSaveAsTest(".webp", false);
    		this.postImageSaveAsTest(".webp", true);
    		this.postImageSaveAsTest(".webp", false);
    	}
		else
		{
			System.out.println("Extended tests had been disabled");
		}
    }
	
    /**
	 * Invokes GET request for getImageSaveAs operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse getImageSaveAsGetRequestInvoker(String name, String outPath) throws Exception
	{
		getImageSaveAsRequest.name = name;
		getImageSaveAsRequest.outPath = outPath;
        return ImagingApi.getImageSaveAs(getImageSaveAsRequest);
	}
	
	/**
	 * Invokes POST request for postImageSaveAs operation. Used indirectly by method reference.
	 * @param imageData Image data
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private ApiResponse postImageSaveAsPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageSaveAsRequest.imageData = imageData;
		postImageSaveAsRequest.outPath = outPath;
        return ImagingApi.postImageSaveAs(postImageSaveAsRequest);
	}
	
	/**
	 * Tests properties for getImageSaveAs operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void getImageSaveAsPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
	}
	
	/**
	 * Tests properties for postImageSaveAs operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImageSaveAsPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
	}
}
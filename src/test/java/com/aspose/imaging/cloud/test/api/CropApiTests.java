/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CropApiTests.java">
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
import com.aspose.imaging.cloud.test.base.StorageFileInfo;

import junitparams.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.Before;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Class for testing crop-related API calls
 */
@RunWith(JUnitParamsRunner.class)
public class CropApiTests extends ApiTester {

	private GetImageCropRequest getImageCropRequest;
	private PostImageCropRequest postImageCropRequest;
	
	@Before
    public void setUp() throws Exception { 
	    this.createApiInstances();
    }

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
		".bmp, true,", 
		".bmp, false,",
		".dng, true,", 
		".dng, false,",
		//".gif, true,", TODO: enable after IMAGINGCLOUD-51 is resolved
		//".gif, false,",
		".png, true,", 
		".png, false,",
		".jpg, true,", 
		".jpg, false,",
		".jpeg, true,", 
		".jpeg, false,",
		".tif, true,", 
		".tif, false,",
		".tiff, true,", 
		".tiff, false,",
		".webp, true,", 
		".webp, false,",
		".j2k, true,", 
		".j2k, false,",
		".jpf, true,", 
		".jpf, false,",
		".jpx, true,", 
		".jpx, false,",
		".jpm, true,", 
		".jpm, false,",
		".mj2, true,", 
		".mj2, false,",
		".jpg2, true,", 
		".jpg2, false,"
		})
    public void getImageCropTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
        String name = null;
        Integer x = 10;
        Integer y = 10;
        Integer width = 100;
        Integer height = 150;
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
		".bmp, true,", 
		".bmp, false,",
		".dng, true,", 
		".dng, false,",
		//".gif, true,", TODO: enable after IMAGINGCLOUD-51 is resolved
		//".gif, false,",
		".png, true,", 
		".png, false,",
		".jpg, true,", 
		".jpg, false,",
		".jpeg, true,", 
		".jpeg, false,",
		".tif, true,", 
		".tif, false,",
		".tiff, true,", 
		".tiff, false,",
		".webp, true,", 
		".webp, false,",
		".j2k, true,", 
		".j2k, false,",
		".jpf, true,", 
		".jpf, false,",
		".jpx, true,", 
		".jpx, false,",
		".jpm, true,", 
		".jpm, false,",
		".mj2, true,", 
		".mj2, false,",
		".jpg2, true,", 
		".jpg2, false,"
		})
    public void postImageCropTest(String formatExtension, Boolean saveResultToStorage, String... additionalExportFormats) throws Exception {
    	byte[] imageData = null;
		String name = null;
        Integer x = 10;
        Integer y = 10;
        Integer width = 100;
        Integer height = 150;
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
		Assert.assertEquals(resultProperties.getWidth(), getImageCropRequest.width);
        Assert.assertEquals(resultProperties.getHeight(), getImageCropRequest.height);
	}
	
	/**
	 * Tests properties for postImageCrop operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 */
	private void postImageCropPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties)
	{
		Assert.assertEquals(resultProperties.getWidth(), postImageCropRequest.width);
        Assert.assertEquals(resultProperties.getHeight(), postImageCropRequest.height);
	}
}
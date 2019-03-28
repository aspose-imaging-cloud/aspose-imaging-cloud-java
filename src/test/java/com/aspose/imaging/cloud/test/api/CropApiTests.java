/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CropApiTests.java">
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

import com.aspose.imaging.cloud.sdk.model.StorageFile;
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
import java.util.ArrayList;
import java.util.Collections;

/**
 * Class for testing crop-related API calls
 */
@RunWith(Parameterized.class)
public class CropApiTests extends ApiTester {

	private GetImageCropRequest getImageCropRequest;
	private PostImageCropRequest postImageCropRequest;

	@Parameters
	public static Iterable<Object[]> data() {
        if (isExtendedTests()) {
            return Arrays.asList(new Object[][] {
                    { ".bmp", true, new String[] {} }, { ".bmp", false, new String[] {} },
                    { ".dicom", true, new String[] {} }, { ".dicom", false, new String[] {} },
                    /* TODO: enable after IMAGINGCLOUD-51 is resolved
                    { ".gif", true, new String[] {} }, { ".gif", false, new String[] {} },
                    */
                    { ".j2k", true, new String[] {} }, { ".j2k", false, new String[] {} },
                    { ".jpg", true, new String[] {} }, { ".jpg", false, new String[] {} },
                    { ".png", true, new String[] {} }, { ".png", false, new String[] {} },
                    { ".psd", true, new String[] {} }, { ".psd", false, new String[] {} },
                    { ".tiff", true, new String[] {} }, { ".tiff", false, new String[] {} },
                    { ".webp", true, new String[] {} }, { ".webp", false, new String[] {} }
            });
        }
        else {
            System.out.println("Extended tests had been disabled");
            return Arrays.asList(new Object[][] {
                    { ".jpg", true, new String[] {} }, { ".jpg", false, new String[] {} }
            });
        }
	}

	private String formatExtension;
    private Boolean saveResultToStorage;
    String[] additionalExportFormats;

    public CropApiTests(String extension, Boolean saveResult, String[] additionalFormats)
    {
        this.formatExtension = extension;
        this.saveResultToStorage = saveResult;
        this.additionalExportFormats = additionalFormats;
    }

    /**
     * Test operation: Crop an existing image.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImageCropTest() throws Exception {
        String name = null;
        Integer x = 10;
        Integer y = 10;
        Integer width = 100;
        Integer height = 150;
        String outPath = null;
        String folder = getTempFolder();
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
		
		for (StorageFile inputFile : InputTestFiles)
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
				
				Method propertiesTester = CropApiTests.class.getDeclaredMethod("getImageCropPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
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
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postImageCropTest() throws Exception {
    	byte[] imageData = null;
		String name = null;
        Integer x = 10;
        Integer y = 10;
        Integer width = 100;
        Integer height = 150;
        String outPath = null;
        String folder = getTempFolder();
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
		
		for (StorageFile inputFile : InputTestFiles)
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
				
				Method propertiesTester = CropApiTests.class.getDeclaredMethod("postImageCropPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
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
	private byte[] getImageCropGetRequestInvoker(String name, String outPath) throws Exception
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
	private byte[] postImageCropPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageCropRequest.imageData = imageData;
		postImageCropRequest.outPath = outPath;
        return ImagingApi.postImageCrop(postImageCropRequest);
	}
	
	/**
	 * Tests properties for getImageCrop operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void getImageCropPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
		Assert.assertEquals(getImageCropRequest.width, resultProperties.getWidth());
        Assert.assertEquals(getImageCropRequest.height, resultProperties.getHeight());
	}
	
	/**
	 * Tests properties for postImageCrop operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void postImageCropPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
		Assert.assertEquals(postImageCropRequest.width, resultProperties.getWidth());
        Assert.assertEquals(postImageCropRequest.height, resultProperties.getHeight());
	}
}
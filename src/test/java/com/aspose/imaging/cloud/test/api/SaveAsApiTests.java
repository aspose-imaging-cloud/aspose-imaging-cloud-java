/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SaveAsApiTests.java">
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
import com.aspose.imaging.cloud.test.base.StorageFileInfo;

import org.junit.Test;
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
public class SaveAsApiTests extends ApiTester {

	private GetImageSaveAsRequest getImageSaveAsRequest;
	private PostImageSaveAsRequest postImageSaveAsRequest;

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

	public SaveAsApiTests(String extension, Boolean saveResult, String[] additionalFormats)
	{
		this.formatExtension = extension;
		this.saveResultToStorage = saveResult;
		this.additionalExportFormats = additionalFormats;
	}

    /**
     * Test operation: SaveAs an existing image.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImageSaveAsTest() throws Exception {
        String name = null;
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
				
				Method propertiesTester = SaveAsApiTests.class.getDeclaredMethod("getImageSaveAsPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
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
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postImageSaveAsTest() throws Exception {
    	byte[] imageData = null;
		String name = null;
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
				
				Method propertiesTester = SaveAsApiTests.class.getDeclaredMethod("postImageSaveAsPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
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
		            requestInvoker,
		            propertiesTester,
		            folder,
		            storage);
            }
		}
    }
	
    /**
	 * Invokes GET request for getImageSaveAs operation. Used indirectly by method reference.
	 * @param name Image file name
	 * @param outPath Out path
	 * @return API response
	 * @throws Exception 
	 */
	private byte[] getImageSaveAsGetRequestInvoker(String name, String outPath) throws Exception
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
	private byte[] postImageSaveAsPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageSaveAsRequest.imageData = imageData;
		postImageSaveAsRequest.outPath = outPath;
        return ImagingApi.postImageSaveAs(postImageSaveAsRequest);
	}
	
	/**
	 * Tests properties for getImageSaveAs operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void getImageSaveAsPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
	}
	
	/**
	 * Tests properties for postImageSaveAs operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void postImageSaveAsPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
	{
	}
}
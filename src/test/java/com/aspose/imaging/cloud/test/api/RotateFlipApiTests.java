/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="RotateFlipApiTests.java">
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
public class RotateFlipApiTests extends ApiTester {

	private GetImageRotateFlipRequest getImageRotateFlipRequest;
	private PostImageRotateFlipRequest postImageRotateFlipRequest;

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

    public RotateFlipApiTests(String extension, Boolean saveResult, String[] additionalFormats)
    {
        this.formatExtension = extension;
        this.saveResultToStorage = saveResult;
        this.additionalExportFormats = additionalFormats;
    }
	
    /**
     * Test operation: RotateFlip an existing image.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImageRotateFlipTest() throws Exception {
        String name = null;
        String method = "Rotate90FlipX";
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
				getImageRotateFlipRequest = new GetImageRotateFlipRequest(name, format, method, outPath, folder, storage);
				outName = name + "_rotateFlip." + format;
				
				Method propertiesTester = RotateFlipApiTests.class.getDeclaredMethod("getImageRotateFlipPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
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
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postImageRotateFlipTest() throws Exception {
    	byte[] imageData = null;
		String name = null;
		String method = "Rotate90FlipX";
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
				postImageRotateFlipRequest = new PostImageRotateFlipRequest(imageData, format, method, outPath, storage);
				outName = name + "_rotateFlip." + format;
				
				Method propertiesTester = RotateFlipApiTests.class.getDeclaredMethod("postImageRotateFlipPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
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
	private byte[] getImageRotateFlipGetRequestInvoker(String name, String outPath) throws Exception
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
	private byte[] postImageRotateFlipPostRequestInvoker(byte[] imageData, String outPath) throws Exception
	{
	    postImageRotateFlipRequest.imageData = imageData;
		postImageRotateFlipRequest.outPath = outPath;
        return ImagingApi.postImageRotateFlip(postImageRotateFlipRequest);
	}
	
	/**
	 * Tests properties for getImageRotateFlip operation. Used indirectly by method reference.
	 * @param originalProperties Original image properties
	 * @param resultProperties Result image properties
	 * @param resultData Result image data
	 */
	private void getImageRotateFlipPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
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
	 * @param resultData Result image data
	 */
	private void postImageRotateFlipPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
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
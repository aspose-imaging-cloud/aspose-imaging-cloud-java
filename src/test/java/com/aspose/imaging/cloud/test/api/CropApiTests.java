/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CropApiTests.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd.
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

    private CropImageRequest cropImageRequest;
    private CreateCroppedImageRequest createCroppedImageRequest;

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
    public void cropImageTest() throws Exception {
        
        if (saveResultToStorage)
        {
            return;
        }
        
        String name = null;
        Integer x = 10;
        Integer y = 10;
        Integer width = 100;
        Integer height = 150;
        String folder = getTempFolder();
        String storage = TestStorage;
        
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
                cropImageRequest = new CropImageRequest(name, format, x, y, width, height, folder, storage);
                
                Method propertiesTester = CropApiTests.class.getDeclaredMethod("cropImagePropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
                propertiesTester.setAccessible(true);
                Method requestInvoker = CropApiTests.class.getDeclaredMethod("cropImageGetRequestInvoker", String.class);
                requestInvoker.setAccessible(true);
                this.testGetRequest(
                    "cropImageTest", 
                    String.format("Input image: %s; Output format: %s; Width: %s; Height: %s; X: %s; Y: %s",
                            name, format, width, height, x, y),
                    name,
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
    public void createCroppedImageTest() throws Exception {
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
                createCroppedImageRequest = new CreateCroppedImageRequest(imageData, format, x, y, width, height, outPath, storage);
                outName = name + "_crop." + format;
                
                Method propertiesTester = CropApiTests.class.getDeclaredMethod("createCroppedImagePropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
                propertiesTester.setAccessible(true);
                Method requestInvoker = CropApiTests.class.getDeclaredMethod("createCroppedImagePostRequestInvoker", byte[].class, String.class);
                requestInvoker.setAccessible(true);
                this.testPostRequest(
                    "createCroppedImageTest; save result to storage: " + saveResultToStorage,  
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
     * Invokes GET request for cropImage operation. Used indirectly by method reference.
     * @param name Image file name
     * @return API response
     * @throws Exception 
     */
    private byte[] cropImageGetRequestInvoker(String name) throws Exception
    {
        cropImageRequest.name = name;
        return ImagingApi.cropImage(cropImageRequest);
    }
    
    /**
     * Invokes POST request for createCroppedImage operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     * @throws Exception 
     */
    private byte[] createCroppedImagePostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        createCroppedImageRequest.imageData = imageData;
        createCroppedImageRequest.outPath = outPath;
        return ImagingApi.createCroppedImage(createCroppedImageRequest);
    }
    
    /**
     * Tests properties for cropImage operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void cropImagePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertEquals(cropImageRequest.width, resultProperties.getWidth());
        Assert.assertEquals(cropImageRequest.height, resultProperties.getHeight());
    }
    
    /**
     * Tests properties for createCroppedImage operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void createCroppedImagePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertEquals(createCroppedImageRequest.width, resultProperties.getWidth());
        Assert.assertEquals(createCroppedImageRequest.height, resultProperties.getHeight());
    }
}
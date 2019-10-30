/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ImageUpdateApiTests.java">
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
public class UpdateImageApiTests extends ApiTester {

    private UpdateImageRequest updateImageRequest;
    private CreateUpdatedImageRequest createUpdatedImageRequest;

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

    public UpdateImageApiTests(String extension, Boolean saveResult, String[] additionalFormats)
    {
        this.formatExtension = extension;
        this.saveResultToStorage = saveResult;
        this.additionalExportFormats = additionalFormats;
    }
    
    /**
     * Test operation: Update an existing image.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateImageTest() throws Exception {
        
        if (saveResultToStorage)
        {
            return;
        }
        
        String name = null;
        Integer newWidth = 300;
        Integer newHeight = 450;
        Integer x = 10;
        Integer y = 10;
        Integer rectWidth = 200;
        Integer rectHeight = 300;
        String rotateFlipMethod = "Rotate90FlipX";
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
                updateImageRequest = new UpdateImageRequest(name, format, newWidth, newHeight, x, y, rectWidth, rectHeight, rotateFlipMethod, folder, storage);
                
                Method propertiesTester = UpdateImageApiTests.class.getDeclaredMethod("updateImagePropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
                propertiesTester.setAccessible(true);
                Method requestInvoker = UpdateImageApiTests.class.getDeclaredMethod("updateImageGetRequestInvoker", String.class);
                requestInvoker.setAccessible(true);
                this.testGetRequest(
                    "updateImageTest", 
                    String.format("Input image: %s; Output format: %s; New width: %s; New height: %s; "
                            + "Rotate/flip method: %s; X: %s; Y: %s; Rect width: %s; Rect height: %s",
                            name, format, newWidth, newHeight, rotateFlipMethod, x, y, rectWidth, rectHeight),
                    name,
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
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createUpdatedImageTest() throws Exception {
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
                createUpdatedImageRequest = new CreateUpdatedImageRequest(imageData, format, newWidth, newHeight, x, y, rectWidth, rectHeight, 
                        rotateFlipMethod, outPath, storage);
                outName = name + "_update." + format;
                
                Method propertiesTester = UpdateImageApiTests.class.getDeclaredMethod("createUpdatedImagePropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
                propertiesTester.setAccessible(true);
                Method requestInvoker = UpdateImageApiTests.class.getDeclaredMethod("createUpdatedImagePostRequestInvoker", byte[].class, String.class);
                requestInvoker.setAccessible(true);
                this.testPostRequest(
                    "createUpdatedImageTest; save result to storage: " + saveResultToStorage,  
                    saveResultToStorage,
                    String.format("Input image: %s; Output format: %s; New width: %s; New height: %s; "
                            + "Rotate/flip method: %s; X: %s; Y: %s; Rect width: %s; Rect height: %s",
                            name, format, newWidth, newHeight, rotateFlipMethod, x, y, rectWidth, rectHeight),
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
     * Invokes GET request for updateImage operation. Used indirectly by method reference.
     * @param name Image file name
     * @return API response
     * @throws Exception 
     */
    private byte[] updateImageGetRequestInvoker(String name) throws Exception
    {
        updateImageRequest.name = name;
        return ImagingApi.updateImage(updateImageRequest);
    }
    
    /**
     * Invokes POST request for createUpdatedImage operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     * @throws Exception 
     */
    private byte[] createUpdatedImagePostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        createUpdatedImageRequest.imageData = imageData;
        createUpdatedImageRequest.outPath = outPath;
        return ImagingApi.createUpdatedImage(createUpdatedImageRequest);
    }
    
    /**
     * Tests properties for updateImage operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void updateImagePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertEquals(updateImageRequest.rectHeight, resultProperties.getWidth());
        Assert.assertEquals(updateImageRequest.rectWidth, resultProperties.getHeight());
    }
    
    /**
     * Tests properties for createUpdatedImage operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void createUpdatedImagePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertEquals(createUpdatedImageRequest.rectHeight, resultProperties.getWidth());
        Assert.assertEquals(createUpdatedImageRequest.rectWidth, resultProperties.getHeight());
    }
}
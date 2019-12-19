/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DeskewApiTests.java">
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
import com.aspose.imaging.cloud.sdk.model.requests.CreateDeskewedImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.DeskewImageRequest;
import com.aspose.imaging.cloud.sdk.stablemodel.ImagingResponse;
import com.aspose.imaging.cloud.test.base.ApiTester;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.runners.Parameterized.Parameters;

/**
 * Class for testing deskew-related API calls
 */
@RunWith(Parameterized.class)
public class DeskewApiTests extends ApiTester {

    private DeskewImageRequest deskewImageRequest;
    private CreateDeskewedImageRequest createDeskewedImageRequest;

    @Parameters
    public static Iterable<Object[]> data() {
        if (isExtendedTests()) {
            return Arrays.asList(new Object[][] {
                    { ".bmp", true, true, null }, { ".bmp", false, true, "green"},
                    { ".dicom", true, false, null}, { ".dicom", false, true, null},
                    /* TODO: enable after IMAGINGCLOUD-51 is resolved
                    { ".gif", true, true, null}, { ".gif", false, true, null},
                    */
                    { ".j2k", true, true, null}, { ".j2k", false, true, null},
                    { ".jpg", true, true, null}, { ".jpg", false, true, null},
                    { ".png", true, true, null}, { ".png", false, true, null},
                    { ".psd", true, true, null}, { ".psd", false, true, null},
                    { ".tiff", true, true, null}, { ".tiff", false, true, null},
                    { ".webp", true, true, null}, { ".webp", false, true, null},
                    { ".dng", true, true, null}, { ".dng", false, true, null},
                    { ".djvu", true, true, null}, { ".djvu", false, true, null}
            });
        }
        else {
            System.out.println("Extended tests had been disabled");
            return Arrays.asList(new Object[][] {
                    { ".jpg", true, true, null }, { ".jpg", false, true, null }
            });
        }
    }

    private String formatExtension;
    private Boolean saveResultToStorage;
    private Boolean resizeProportionally;
    private String bkColor;

    public DeskewApiTests(String extension, Boolean saveResult, Boolean resizeProportionally, String bkColor)
    {
        this.formatExtension = extension;
        this.saveResultToStorage = saveResult;
        this.resizeProportionally = resizeProportionally;
        this.bkColor = bkColor;
    }

    /**
     * Test operation: Deskew an existing image.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deskewImageTest() throws Exception {
        
        if (saveResultToStorage)
        {
            return;
        }

        String name = null;
        String folder = getTempFolder();
        String storage = TestStorage;

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

            deskewImageRequest = new DeskewImageRequest(name, resizeProportionally, bkColor , folder, storage);

            Method propertiesTester = DeskewApiTests.class.getDeclaredMethod("deskewImagePropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = DeskewApiTests.class.getDeclaredMethod("deskewImageGetRequestInvoker", String.class);
            requestInvoker.setAccessible(true);
            this.testGetRequest(
                "deskewImageTest",
                String.format("Input image: %s; Output format: %s; ResizeProportionally: %s; BkColor: %s;",
                        name, formatExtension, resizeProportionally, bkColor),
                name,
                requestInvoker,
                propertiesTester,
                folder,
                storage);
        }
    }
    
    /**
     * Test operation: Deskew an image. Image is passed in a request stream.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDeskewedImageTest() throws Exception {
        byte[] imageData = null;
        String name = null;
        String outPath = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        String outName = null;
        
        for (StorageFile inputFile : InputTestFiles) {
            if (inputFile.getName().endsWith(formatExtension)) {
                name = inputFile.getName();
            } else {
                continue;
            }

            createDeskewedImageRequest = new CreateDeskewedImageRequest(imageData, resizeProportionally, bkColor, outPath, storage);
            outName = name + "_deskew" + formatExtension;

            Method propertiesTester = DeskewApiTests.class.getDeclaredMethod("createDeskewedImagePropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = DeskewApiTests.class.getDeclaredMethod("createDeskewedImagePostRequestInvoker", byte[].class, String.class);
            requestInvoker.setAccessible(true);
            this.testPostRequest(
                    "createDeskewedImageTest; save result to storage: " + saveResultToStorage,
                    saveResultToStorage,
                    String.format("Input image: %s; Output format: %s; ResizeProportionally: %s; BkColor: %s;",
                            name, formatExtension, resizeProportionally, bkColor),
                    name,
                    outName,
                    requestInvoker,
                    propertiesTester,
                    folder,
                    storage);
        }
    }
    
    /**
     * Invokes GET request for deskweImage operation. Used indirectly by method reference.
     * @param name Image file name
     * @return API response
     * @throws Exception 
     */
    private byte[] deskewImageGetRequestInvoker(String name) throws Exception
    {
        deskewImageRequest.name = name;
        deskewImageRequest.resizeProportionally = this.resizeProportionally;
        deskewImageRequest.bkColor = this.bkColor;
        return ImagingApi.deskewImage(deskewImageRequest);
    }
    
    /**
     * Invokes POST request for createDeskewedImage operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     * @throws Exception 
     */
    private byte[] createDeskewedImagePostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        createDeskewedImageRequest.imageData = imageData;
        createDeskewedImageRequest.outPath = outPath;
        createDeskewedImageRequest.resizeProportionally = this.resizeProportionally;
        createDeskewedImageRequest.bkColor = this.bkColor;
        return ImagingApi.createDeskewedImage(createDeskewedImageRequest);
    }
    
    /**
     * Tests properties for deskewImage operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void deskewImagePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultData);
        Assert.assertTrue(resultData.length > 0);
    }
    
    /**
     * Tests properties for createDeskewedImage operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void createDeskewedImagePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertEquals(originalProperties.getBitsPerPixel(), resultProperties.getBitsPerPixel());
    }
}
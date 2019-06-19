/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="BmpApiTests.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
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

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.Parameters;

import java.lang.Iterable;
import java.util.Arrays;
import java.lang.reflect.Method;

/**
 * Class for testing BMP-related API calls
 */
@RunWith(Parameterized.class)
public class BmpApiTests extends ApiTester {

    private ModifyBmpRequest modifyBmpRequest;
    private CreateModifiedBmpRequest createModifiedBmpRequest;

    @Parameters
    public static Iterable<Object> data() {
        return Arrays.asList(new Object[] { true, false });
    }

    private Boolean saveResultToStorage;

    public BmpApiTests(Boolean saveResult)
    {
        this.saveResultToStorage = saveResult;
    }

    /**
     * Test operation: Update parameters of existing BMP image.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void modifyBmpTest() throws Exception {
        
        if (saveResultToStorage)
        {
            return;
        }
        
        String name = "test.bmp";
        Integer bitsPerPixel = 32;
        Integer horizontalResolution = 300;
        Integer verticalResolution = 300;
        Boolean fromScratch = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        modifyBmpRequest = new ModifyBmpRequest(name, bitsPerPixel, horizontalResolution, verticalResolution, fromScratch, folder, storage);
        
        Method propertiesTester = BmpApiTests.class.getDeclaredMethod("modifyBmpPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = BmpApiTests.class.getDeclaredMethod("modifyBmpGetRequestInvoker", String.class);
        requestInvoker.setAccessible(true);
        this.testGetRequest(
            "modifyBmpTest; save result to storage: " + saveResultToStorage, 
            String.format("Input image: %s; Bits per pixel: %s; Horizontal resolution: %s; Vertical resolution: %s",
                    name, bitsPerPixel, horizontalResolution, verticalResolution),
            name,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Test operation: Update parameters of BMP image. Image is passed in a request stream.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createModifiedBmpTest() throws Exception {
        byte[] imageData = null;
        Integer bitsPerPixel = 32;
        Integer horizontalResolution = 300;
        Integer verticalResolution = 300;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "test.bmp";
        String outName = name + "_specific." + "bmp";
        createModifiedBmpRequest = new CreateModifiedBmpRequest(imageData, bitsPerPixel, horizontalResolution, verticalResolution, fromScratch, outPath, storage);
        
        Method propertiesTester = BmpApiTests.class.getDeclaredMethod("createModifiedBmpPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = BmpApiTests.class.getDeclaredMethod("createModifiedBmpPostRequestInvoker", byte[].class, String.class);
        requestInvoker.setAccessible(true);
        this.testPostRequest(
            "createModifiedBmpTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Bits per pixel: %s; Horizontal resolution: %s; Vertical resolution: %s",
                    name, bitsPerPixel, horizontalResolution, verticalResolution),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Invokes GET request for modifyBmp operation. Used indirectly by method reference.
     * @param name Image file name
     * @return API response
     * @throws Exception 
     */
    private byte[] modifyBmpGetRequestInvoker(String name) throws Exception
    {
        modifyBmpRequest.name = name;
        return ImagingApi.modifyBmp(modifyBmpRequest);
    }
    
    /**
     * Invokes POST request for createModifiedBmp operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     * @throws Exception 
     */
    private byte[] createModifiedBmpPostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        createModifiedBmpRequest.imageData = imageData;
        createModifiedBmpRequest.outPath = outPath;
        return ImagingApi.createModifiedBmp(createModifiedBmpRequest);
    }
    
    /**
     * Tests properties for modifyBmp operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void modifyBmpPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getBmpProperties());
        Assert.assertEquals(modifyBmpRequest.bitsPerPixel, resultProperties.getBitsPerPixel());
        Assert.assertEquals((int)modifyBmpRequest.verticalResolution, (int)Math.ceil(resultProperties.getVerticalResolution()));
        Assert.assertEquals((int)modifyBmpRequest.horizontalResolution, (int)Math.ceil(resultProperties.getHorizontalResolution()));

        Assert.assertNotNull(originalProperties.getBmpProperties());
        Assert.assertEquals(originalProperties.getBmpProperties().getCompression(), resultProperties.getBmpProperties().getCompression());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
    }
    
    /**
     * Tests properties for createModifiedBmp operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultProperties Result image data
     */
    private void createModifiedBmpPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getBmpProperties());
        Assert.assertEquals(createModifiedBmpRequest.bitsPerPixel, resultProperties.getBitsPerPixel());
        Assert.assertEquals((int)createModifiedBmpRequest.verticalResolution, (int)Math.ceil(resultProperties.getVerticalResolution()));
        Assert.assertEquals((int)createModifiedBmpRequest.horizontalResolution, (int)Math.ceil(resultProperties.getHorizontalResolution()));

        Assert.assertNotNull(originalProperties.getBmpProperties());
        Assert.assertEquals(originalProperties.getBmpProperties().getCompression(), resultProperties.getBmpProperties().getCompression());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
    }
}

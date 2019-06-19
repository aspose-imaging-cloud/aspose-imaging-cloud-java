/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="JpgApiTests.java">
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
 * Class for testing JPG-related API calls
 */
@RunWith(Parameterized.class)
public class JpgApiTests extends ApiTester {

    private ModifyJpegRequest modifyJpegRequest;
    private CreateModifiedJpegRequest createModifiedJpegRequest;

    @Parameters
    public static Iterable<Object> data() {
        return Arrays.asList(new Object[] { true, false });
    }

    private Boolean saveResultToStorage;

    public JpgApiTests(Boolean saveResult)
    {
        this.saveResultToStorage = saveResult;
    }
    
    /**
     * Test operation: Update parameters of existing JPG image.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void modifyJpegTest() throws Exception {
        
        if (saveResultToStorage)
        {
            return;
        }
        
        String name = "test.jpg";
        int quality = 65;
        String compressionType = "progressive";
        Boolean fromScratch = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        modifyJpegRequest = new ModifyJpegRequest(name, quality, compressionType, fromScratch, folder, storage);
        
        Method propertiesTester = JpgApiTests.class.getDeclaredMethod("modifyJpegPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = JpgApiTests.class.getDeclaredMethod("modifyJpegGetRequestInvoker", String.class);
        requestInvoker.setAccessible(true);
        this.testGetRequest(
            "modifyJpegTest; save result to storage: " + saveResultToStorage, 
            String.format("Input image: %s; Quality: %s; Compression type: %s",
                    name, quality, compressionType),
            name,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Test operation: Update parameters of JPG image. Image is passed in a request stream.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createModifiedJpegTest() throws Exception {
        byte[] imageData = null;
        int quality = 65;
        String compressionType = "progressive";
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "test.jpg";
        String outName = name + "_specific." + "jpg";
        createModifiedJpegRequest = new CreateModifiedJpegRequest(imageData, quality, compressionType, fromScratch, outPath, storage);
        
        Method propertiesTester = JpgApiTests.class.getDeclaredMethod("createModifiedJpegPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = JpgApiTests.class.getDeclaredMethod("createModifiedJpegPostRequestInvoker", byte[].class, String.class);
        requestInvoker.setAccessible(true);
        this.testPostRequest(
            "createModifiedJpegTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Quality: %s; Compression type: %s",
                    name, quality, compressionType),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Invokes GET request for modifyJpeg operation. Used indirectly by method reference.
     * @param name Image file name
     * @param outPath Out path
     * @return API response
     * @throws Exception 
     */
    private byte[] modifyJpegGetRequestInvoker(String name) throws Exception
    {
        modifyJpegRequest.name = name;
        return ImagingApi.modifyJpeg(modifyJpegRequest);
    }
    
    /**
     * Invokes POST request for createModifiedJpeg operation. Used indirectly by method reference.
     * @param imageData Image data
     * @return API response
     * @throws Exception 
     */
    private byte[] createModifiedJpegPostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        createModifiedJpegRequest.imageData = imageData;
        createModifiedJpegRequest.outPath = outPath;
        return ImagingApi.createModifiedJpeg(createModifiedJpegRequest);
    }
    
    /**
     * Tests properties for modifyJpeg operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void modifyJpegPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getJpegProperties());

        Assert.assertNotNull(originalProperties.getJpegProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
    }
    
    /**
     * Tests properties for createModifiedJpeg operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void createModifiedJpegPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getJpegProperties());

        Assert.assertNotNull(originalProperties.getJpegProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
    }
}
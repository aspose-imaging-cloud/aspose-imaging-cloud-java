/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="WebpApiTests.java">
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
 * Class for testing WEBP-related API calls
 */
@RunWith(Parameterized.class)
public class WebpApiTests extends ApiTester {

    private ModifyWebPRequest modifyWebPRequest;
    private CreateModifiedWebPRequest createModifiedWebPRequest;

    @Parameters
    public static Iterable<Object> data() {
        return Arrays.asList(new Object[] { true, false });
    }

    private Boolean saveResultToStorage;

    public WebpApiTests(Boolean saveResult)
    {
        this.saveResultToStorage = saveResult;
    }
    
    /**
     * Test operation: Update parameters of existing WEBP image.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void modifyWebPTest() throws Exception {
        
        if (saveResultToStorage)
        {
            return;
        }
        
        String name = "Animation.webp";
        Boolean lossless = true;
        Integer quality = 90;
        Integer animLoopCount = 5;
        String animBackgroundColor = "gray";
        Boolean fromScratch = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        modifyWebPRequest = new ModifyWebPRequest(name, lossless, quality, animLoopCount, animBackgroundColor, fromScratch, folder, storage);
        
        Method propertiesTester = WebpApiTests.class.getDeclaredMethod("modifyWebPPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = WebpApiTests.class.getDeclaredMethod("modifyWebPGetRequestInvoker", String.class);
        requestInvoker.setAccessible(true);
        this.testGetRequest(
            "modifyWebPTest", 
            String.format("Input image: %s; AnimBackgroundColor: %s; Lossless: %s; Quality: %s; AnimLoopCount: %s; ",
                    name, animBackgroundColor, lossless, quality, animLoopCount),
            name,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Test operation: Update parameters of WEBP image. Image is passed in a request stream.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createModifiedWebPTest() throws Exception {
        byte[] imageData = null;
        Boolean lossless = true;
        Integer quality = 90;
        Integer animLoopCount = 5;
        String animBackgroundColor = "gray";
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "Animation.webp";
        String outName = name + "_specific." + "webp";
        createModifiedWebPRequest = new CreateModifiedWebPRequest(imageData, lossless, quality, animLoopCount, animBackgroundColor, fromScratch, outPath, storage);
        
        Method propertiesTester = WebpApiTests.class.getDeclaredMethod("createModifiedWebPPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = WebpApiTests.class.getDeclaredMethod("createModifiedWebPPostRequestInvoker", byte[].class, String.class);
        requestInvoker.setAccessible(true);
        this.testPostRequest(
            "createModifiedWebPTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; AnimBackgroundColor: %s; Lossless: %s; Quality: %s; AnimLoopCount: %s; ",
                    name, animBackgroundColor, lossless, quality, animLoopCount),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Invokes GET request for modifyWebP operation. Used indirectly by method reference.
     * @param name Image file name
     * @param outPath Out path
     * @throws Exception 
     */
    private byte[] modifyWebPGetRequestInvoker(String name) throws Exception
    {
        modifyWebPRequest.name = name;
        return ImagingApi.modifyWebP(modifyWebPRequest);
    }
    
    /**
     * Invokes POST request for createModifiedWebP operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     * @throws Exception 
     */
    private byte[] createModifiedWebPPostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        createModifiedWebPRequest.imageData = imageData;
        createModifiedWebPRequest.outPath = outPath;
        return ImagingApi.createModifiedWebP(createModifiedWebPRequest);
    }
    
    /**
     * Tests properties for modifyWebP operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void modifyWebPPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getWebPProperties());

        Assert.assertNotNull(originalProperties.getWebPProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
    }
    
    /**
     * Tests properties for createModifiedWebP operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void createModifiedWebPPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getWebPProperties());

        Assert.assertNotNull(originalProperties.getWebPProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
    }
}

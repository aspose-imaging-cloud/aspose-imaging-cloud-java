/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmfApiTests.java">
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

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.Parameters;

import java.lang.Iterable;
import java.util.Arrays;
import java.lang.reflect.Method;

/**
 * Class for testing EMF-related API calls
 */
@RunWith(Parameterized.class)
public class EmfApiTests extends ApiTester {

    private GetImageEmfRequest getImageEmfRequest;
    private PostImageEmfRequest postImageEmfRequest;

    @Parameters
    public static Iterable<Object> data() {
        return Arrays.asList(new Object[] { true, false });
    }

    private Boolean saveResultToStorage;

    public EmfApiTests(Boolean saveResult)
    {
        this.saveResultToStorage = saveResult;
    }
    
    /**
     * Test operation: Rasterize existing EMF image to PNG using given parameters.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImageEmfTest() throws Exception {
        String name = "test.emf";
        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        Integer borderX = 50;
        Integer borderY = 50;
        Boolean fromScratch = null;
        String outPath = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        String outName = name + "_specific." + "png";
        getImageEmfRequest = new GetImageEmfRequest(name, bkColor, pageWidth, pageHeight, borderX, borderY, fromScratch, outPath, folder, storage, "png");
        
        Method propertiesTester = EmfApiTests.class.getDeclaredMethod("getImageEmfPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = EmfApiTests.class.getDeclaredMethod("getImageEmfGetRequestInvoker", String.class, String.class);
        requestInvoker.setAccessible(true);
        this.testGetRequest(
            "getImageEmfTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; BackColor: %s; Page width: %s; Page height: %s; BorderX: %s; BorderY: %s",
                    name, bkColor, pageWidth, pageHeight, borderX, borderY),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Test operation: Rasterize EMF image to PNG using given parameters. Image is passed in a request stream.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postImageEmfTest() throws Exception {
        byte[] imageData = null;
        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        Integer borderX = 50;
        Integer borderY = 50;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "test.emf";
        String outName = name + "_specific." + "png";
        postImageEmfRequest = new PostImageEmfRequest(imageData, bkColor, pageWidth, pageHeight, borderX, borderY, fromScratch, outPath, storage, "png");
        
        Method propertiesTester = EmfApiTests.class.getDeclaredMethod("postImageEmfPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = EmfApiTests.class.getDeclaredMethod("postImageEmfPostRequestInvoker", byte[].class, String.class);
        requestInvoker.setAccessible(true);
        this.testPostRequest(
            "postImageEmfTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; BackColor: %s; Page width: %s; Page height: %s; BorderX: %s; BorderY: %s",
                    name, bkColor, pageWidth, pageHeight, borderX, borderY),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Invokes GET request for getImageEmf operation. Used indirectly by method reference.
     * @param name Image file name
     * @param outPath Out path
     * @return API response
     * @throws Exception 
     */
    private byte[] getImageEmfGetRequestInvoker(String name, String outPath) throws Exception
    {
        getImageEmfRequest.name = name;
        getImageEmfRequest.outPath = outPath;
        return ImagingApi.getImageEmf(getImageEmfRequest);
    }
    
    /**
     * Invokes POST request for postImageEmf operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     * @throws Exception 
     */
    private byte[] postImageEmfPostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        postImageEmfRequest.imageData = imageData;
        postImageEmfRequest.outPath = outPath;
        return ImagingApi.postImageEmf(postImageEmfRequest);
    }
    
    /**
     * Tests properties for getImageEmf operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void getImageEmfPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getPngProperties());
        Assert.assertEquals(getImageEmfRequest.pageWidth + getImageEmfRequest.borderX * 2, (int)resultProperties.getWidth());
        Assert.assertEquals(getImageEmfRequest.pageHeight + getImageEmfRequest.borderY * 2, (int)resultProperties.getHeight());
    }
    
    /**
     * Tests properties for postImageEmf operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void postImageEmfPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getPngProperties());
        Assert.assertEquals(postImageEmfRequest.pageWidth + postImageEmfRequest.borderX * 2, (int)resultProperties.getWidth());
        Assert.assertEquals(postImageEmfRequest.pageHeight + postImageEmfRequest.borderY * 2, (int)resultProperties.getHeight());
    }
}
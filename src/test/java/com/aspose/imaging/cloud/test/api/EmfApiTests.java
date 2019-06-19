/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmfApiTests.java">
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
 * Class for testing EMF-related API calls
 */
@RunWith(Parameterized.class)
public class EmfApiTests extends ApiTester {

    private ModifyEmfRequest modifyEmfRequest;
    private CreateModifiedEmfRequest createModifiedEmfRequest;

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
    public void modifyEmfTest() throws Exception {
        
        if (saveResultToStorage)
        {
            return;
        }
        
        String name = "test.emf";
        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        Integer borderX = 50;
        Integer borderY = 50;
        Boolean fromScratch = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        modifyEmfRequest = new ModifyEmfRequest(name, bkColor, pageWidth, pageHeight, borderX, borderY, fromScratch, folder, storage, "png");
        
        Method propertiesTester = EmfApiTests.class.getDeclaredMethod("modifyEmfPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = EmfApiTests.class.getDeclaredMethod("modifyEmfGetRequestInvoker", String.class);
        requestInvoker.setAccessible(true);
        this.testGetRequest(
            "modifyEmfTest", 
            String.format("Input image: %s; BackColor: %s; Page width: %s; Page height: %s; BorderX: %s; BorderY: %s",
                    name, bkColor, pageWidth, pageHeight, borderX, borderY),
            name,
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
    public void createModifiedEmfTest() throws Exception {
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
        createModifiedEmfRequest = new CreateModifiedEmfRequest(imageData, bkColor, pageWidth, pageHeight, borderX, borderY, fromScratch, outPath, storage, "png");
        
        Method propertiesTester = EmfApiTests.class.getDeclaredMethod("createModifiedEmfPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = EmfApiTests.class.getDeclaredMethod("createModifiedEmfPostRequestInvoker", byte[].class, String.class);
        requestInvoker.setAccessible(true);
        this.testPostRequest(
            "createModifiedEmfTest; save result to storage: " + saveResultToStorage, 
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
     * Invokes GET request for modifyEmf operation. Used indirectly by method reference.
     * @param name Image file name
     * @return API response
     * @throws Exception 
     */
    private byte[] modifyEmfGetRequestInvoker(String name) throws Exception
    {
        modifyEmfRequest.name = name;
        return ImagingApi.modifyEmf(modifyEmfRequest);
    }
    
    /**
     * Invokes POST request for createModifiedEmf operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     * @throws Exception 
     */
    private byte[] createModifiedEmfPostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        createModifiedEmfRequest.imageData = imageData;
        createModifiedEmfRequest.outPath = outPath;
        return ImagingApi.createModifiedEmf(createModifiedEmfRequest);
    }
    
    /**
     * Tests properties for modifyEmf operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void modifyEmfPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getPngProperties());
        Assert.assertEquals(modifyEmfRequest.pageWidth + modifyEmfRequest.borderX * 2, (int)resultProperties.getWidth());
        Assert.assertEquals(modifyEmfRequest.pageHeight + modifyEmfRequest.borderY * 2, (int)resultProperties.getHeight());
    }
    
    /**
     * Tests properties for createModifiedEmf operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void createModifiedEmfPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getPngProperties());
        Assert.assertEquals(createModifiedEmfRequest.pageWidth + createModifiedEmfRequest.borderX * 2, (int)resultProperties.getWidth());
        Assert.assertEquals(createModifiedEmfRequest.pageHeight + createModifiedEmfRequest.borderY * 2, (int)resultProperties.getHeight());
    }
}
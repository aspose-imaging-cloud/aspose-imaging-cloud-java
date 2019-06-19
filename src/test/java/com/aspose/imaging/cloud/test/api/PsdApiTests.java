/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PsdApiTests.java">
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
 * Class for testing PSD-related API calls
 */
@RunWith(Parameterized.class)
public class PsdApiTests extends ApiTester {

    private ModifyPsdRequest modifyPsdRequest;
    private CreateModifiedPsdRequest createModifiedPsdRequest;

    @Parameters
    public static Iterable<Object> data() {
        return Arrays.asList(new Object[] { true, false });
    }

    private Boolean saveResultToStorage;

    public PsdApiTests(Boolean saveResult)
    {
        this.saveResultToStorage = saveResult;
    }
    
    /**
     * Test operation: Update parameters of existing PSD image.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void modifyPsdTest() throws Exception {
        
        if (saveResultToStorage)
        {
            return;
        }
        
        String name = "test.psd";
        int channelsCount = 3;
        String compressionMethod = "raw";
        Boolean fromScratch = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        modifyPsdRequest = new ModifyPsdRequest(name, channelsCount, compressionMethod, fromScratch, folder, storage);
        
        Method propertiesTester = PsdApiTests.class.getDeclaredMethod("modifyPsdPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = PsdApiTests.class.getDeclaredMethod("modifyPsdGetRequestInvoker", String.class);
        requestInvoker.setAccessible(true);
        this.testGetRequest(
            "modifyPsdTest; save result to storage: " + saveResultToStorage, 
            String.format("Input image: %s; Channels count: %s; Compression method: %s",
                    name, channelsCount, compressionMethod),
            name,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Test operation: Update parameters of PSD image. Image is passed in a request stream.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createModifiedPsdTest() throws Exception {
        byte[] imageData = null;
        int channelsCount = 3;
        String compressionMethod = "raw";
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "test.psd";
        String outName = name + "_specific." + "psd";
        createModifiedPsdRequest = new CreateModifiedPsdRequest(imageData, channelsCount, compressionMethod, fromScratch, outPath, storage);
        
        Method propertiesTester = PsdApiTests.class.getDeclaredMethod("createModifiedPsdPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = PsdApiTests.class.getDeclaredMethod("createModifiedPsdPostRequestInvoker", byte[].class, String.class);
        requestInvoker.setAccessible(true);
        this.testPostRequest(
            "createModifiedPsdTest; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Channels count: %s; Compression method: %s",
                    name, channelsCount, compressionMethod),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Invokes GET request for modifyPsd operation. Used indirectly by method reference.
     * @param name Image file name
     * @return API response
     * @throws Exception 
     */
    private byte[] modifyPsdGetRequestInvoker(String name) throws Exception
    {
        modifyPsdRequest.name = name;
        return ImagingApi.modifyPsd(modifyPsdRequest);
    }
    
    /**
     * Invokes POST request for createModifiedPsd operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     * @throws Exception 
     */
    private byte[] createModifiedPsdPostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        createModifiedPsdRequest.imageData = imageData;
        createModifiedPsdRequest.outPath = outPath;
        return ImagingApi.createModifiedPsd(createModifiedPsdRequest);
    }
    
    /**
     * Tests properties for modifyPsd operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void modifyPsdPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getPsdProperties());
        Assert.assertEquals(modifyPsdRequest.compressionMethod, resultProperties.getPsdProperties().getCompression().toLowerCase());
        Assert.assertEquals(modifyPsdRequest.channelsCount, resultProperties.getPsdProperties().getChannelsCount());

        Assert.assertNotNull(originalProperties.getPsdProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
        Assert.assertEquals(originalProperties.getPsdProperties().getBitsPerChannel(), resultProperties.getPsdProperties().getBitsPerChannel());
    }
    
    /**
     * Tests properties for createModifiedPsd operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void createModifiedPsdPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getPsdProperties());
        Assert.assertEquals(createModifiedPsdRequest.compressionMethod, resultProperties.getPsdProperties().getCompression().toLowerCase());
        Assert.assertEquals(createModifiedPsdRequest.channelsCount, resultProperties.getPsdProperties().getChannelsCount());

        Assert.assertNotNull(originalProperties.getPsdProperties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
        Assert.assertEquals(originalProperties.getPsdProperties().getBitsPerChannel(), resultProperties.getPsdProperties().getBitsPerChannel());
    }
}

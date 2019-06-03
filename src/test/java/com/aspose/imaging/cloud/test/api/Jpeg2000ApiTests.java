/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="Jpeg2000ApiTests.java">
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
 * Class for testing JPEG2000-related API calls
 */
@RunWith(Parameterized.class)
public class Jpeg2000ApiTests extends ApiTester {

    private GetImageJpeg2000Request getImageJpeg2000Request;
    private PostImageJpeg2000Request postImageJpeg2000Request;

    @Parameters
    public static Iterable<Object> data() {
        return Arrays.asList(new Object[] { true, false });
    }

    private Boolean saveResultToStorage;

    public Jpeg2000ApiTests(Boolean saveResult)
    {
        this.saveResultToStorage = saveResult;
    }
    
    /**
     * Test operation: Update parameters of existing JPEG2000 image.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImageJpeg2000Test() throws Exception {
        
        if (saveResultToStorage)
        {
            return;
        }
        
        String name = "test.j2k";
        String codec = "jp2";
        String comment = "Aspose";
        Boolean fromScratch = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        getImageJpeg2000Request = new GetImageJpeg2000Request(name, comment, codec, fromScratch, folder, storage);
        
        Method propertiesTester = Jpeg2000ApiTests.class.getDeclaredMethod("getImageJpeg2000PropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = Jpeg2000ApiTests.class.getDeclaredMethod("getImageJpeg2000GetRequestInvoker", String.class);
        requestInvoker.setAccessible(true);
        this.testGetRequest(
            "getImageJpeg2000Test; save result to storage: " + saveResultToStorage, 
            String.format("Input image: %s; Comment: %s; Codec: %s",
                    name, comment, codec),
            name,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Test operation: Update parameters of JPEG2000 image. Image is passed in a request stream.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postImageJpeg2000Test() throws Exception {
        byte[] imageData = null;
        String codec = "jp2";
        String comment = "Aspose";
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "test.j2k";
        String outName = name + "_specific." + "jp2";
        postImageJpeg2000Request = new PostImageJpeg2000Request(imageData, comment, codec, fromScratch, outPath, storage);
        
        Method propertiesTester = Jpeg2000ApiTests.class.getDeclaredMethod("postImageJpeg2000PropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = Jpeg2000ApiTests.class.getDeclaredMethod("postImageJpeg2000PostRequestInvoker", byte[].class, String.class);
        requestInvoker.setAccessible(true);
        this.testPostRequest(
            "postImageJpeg2000Test; save result to storage: " + saveResultToStorage, 
            saveResultToStorage,
            String.format("Input image: %s; Comment: %s; Codec: %s",
                    name, comment, codec),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Invokes GET request for getImageJpeg2000 operation. Used indirectly by method reference.
     * @param name Image file name
     * @return API response
     * @throws Exception 
     */
    private byte[] getImageJpeg2000GetRequestInvoker(String name) throws Exception
    {
        getImageJpeg2000Request.name = name;
        return ImagingApi.getImageJpeg2000(getImageJpeg2000Request);
    }
    
    /**
     * Invokes POST request for postImageJpeg2000 operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     * @throws Exception 
     */
    private byte[] postImageJpeg2000PostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        postImageJpeg2000Request.imageData = imageData;
        postImageJpeg2000Request.outPath = outPath;
        return ImagingApi.postImageJpeg2000(postImageJpeg2000Request);
    }
    
    /**
     * Tests properties for getImageJpeg2000 operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void getImageJpeg2000PropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertEquals(getImageJpeg2000Request.codec, resultProperties.getJpeg2000Properties().getCodec().toString().toLowerCase());
        Assert.assertNotNull(resultProperties.getJpeg2000Properties().getComments());
        Assert.assertTrue(resultProperties.getJpeg2000Properties().getComments().contains(getImageJpeg2000Request.comment));

        Assert.assertNotNull(originalProperties.getJpeg2000Properties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
        Assert.assertNotNull(originalProperties.getJpeg2000Properties().getComments());
        Assert.assertFalse(originalProperties.getJpeg2000Properties().getComments().contains(getImageJpeg2000Request.comment));
    }
    
    /**
     * Tests properties for postImageJpeg2000 operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void postImageJpeg2000PropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertEquals(postImageJpeg2000Request.codec, resultProperties.getJpeg2000Properties().getCodec().toString().toLowerCase());
        Assert.assertNotNull(resultProperties.getJpeg2000Properties().getComments());
        Assert.assertTrue(resultProperties.getJpeg2000Properties().getComments().contains(postImageJpeg2000Request.comment));

        Assert.assertNotNull(originalProperties.getJpeg2000Properties());
        Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
        Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());
        Assert.assertNotNull(originalProperties.getJpeg2000Properties().getComments());
        Assert.assertFalse(originalProperties.getJpeg2000Properties().getComments().contains(postImageJpeg2000Request.comment));
    }
}
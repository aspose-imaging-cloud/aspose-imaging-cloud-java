/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SvgApiTests.java">
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
 * Class for testing SVG-related API calls
 */
@RunWith(Parameterized.class)
public class SvgApiTests extends ApiTester {

    private ModifySvgRequest modifySvgRequest;
    private CreateModifiedSvgRequest createModifiedSvgRequest;

    @Parameters
    public static Iterable<Object> data() {
        return Arrays.asList(new Object[] { true, false });
    }

    private Boolean saveResultToStorage;

    public SvgApiTests(Boolean saveResult)
    {
        this.saveResultToStorage = saveResult;
    }

    /**
     * Test operation: Rasterize existing SVG image to PNG using given size parameters.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void modifySvgSizeRasterizationTest() throws Exception {

        if (saveResultToStorage)
        {
            return;
        }

        String name = "test.svg";
        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        // borderX and borderY are not supported right now, see IMAGINGNET-3543
        Integer borderX = 0;
        Integer borderY = 0;
        Boolean fromScratch = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        modifySvgRequest = new ModifySvgRequest(name, null, null, null, null, pageWidth, pageHeight, borderX, borderY, bkColor, fromScratch, folder, storage, "png");

        Method propertiesTester = SvgApiTests.class.getDeclaredMethod("modifySvgSizeRasterizationPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = SvgApiTests.class.getDeclaredMethod("modifySvgGetRequestInvoker", String.class);
        requestInvoker.setAccessible(true);
        this.testGetRequest(
                "modifySvgSizeRasterizationTest",
                String.format("Input image: %s; BackColor: %s; Page width: %s; Page height: %s; BorderX: %s; BorderY: %s",
                        name, bkColor, pageWidth, pageHeight, borderX, borderY),
                name,
                requestInvoker,
                propertiesTester,
                folder,
                storage);
    }

    /**
     * Test operation: Rasterize existing SVG image to PNG using given scale parameters.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void modifySvgScaleRasterizationTest() throws Exception {

        if (saveResultToStorage)
        {
            return;
        }

        String name = "test.svg";
        String bkColor = "gray";
        Double scaleX = 2.0;
        Double scaleY = 2.0;
        Boolean fromScratch = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        modifySvgRequest = new ModifySvgRequest(name, null, null, scaleX, scaleY, null, null, null, null, bkColor, fromScratch, folder, storage, "png");

        Method propertiesTester = SvgApiTests.class.getDeclaredMethod("modifySvgScaleRasterizationPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = SvgApiTests.class.getDeclaredMethod("modifySvgGetRequestInvoker", String.class);
        requestInvoker.setAccessible(true);
        this.testGetRequest(
                "modifySvgScaleRasterizationTest",
                String.format("Input image: %s; BackColor: %s; Scale X: %s; Scale Y: %s",
                        name, bkColor, scaleX, scaleY),
                name,
                requestInvoker,
                propertiesTester,
                folder,
                storage);
    }

    /**
     * Test operation: Update properties of the existing SVG image.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void modifySvgUpdatePropertiesTest() throws Exception {

        if (saveResultToStorage)
        {
            return;
        }

        String name = "test.svg";
        // Only RGB color type is supported right now, see IMAGINGNET-3543
        String colorType = "rgb";
        Boolean textAsShapes = true;
        Boolean fromScratch = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        modifySvgRequest = new ModifySvgRequest(name, colorType, textAsShapes, null, null, null, null, null, null, null, fromScratch, folder, storage, "svg");

        Method propertiesTester = SvgApiTests.class.getDeclaredMethod("modifySvgUpdatePropertiesPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = SvgApiTests.class.getDeclaredMethod("modifySvgGetRequestInvoker", String.class);
        requestInvoker.setAccessible(true);
        this.testGetRequest(
                "modifySvgUpdatePropertiesTest",
                String.format("Input image: %s; Color type: %s; Text as shapes: %s",
                        name, colorType, textAsShapes),
                name,
                requestInvoker,
                propertiesTester,
                folder,
                storage);
    }

    /**
     * Test operation: Rasterize SVG image to PNG using given size parameters. Image is passed in a request stream.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createModifiedSvgSizeRasterizationTest() throws Exception {
        byte[] imageData = null;
        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        // borderX and borderY are not supported right now, see IMAGINGNET-3543
        Integer borderX = 0;
        Integer borderY = 0;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "test.svg";
        String outName = name + "_specific." + "png";
        createModifiedSvgRequest = new CreateModifiedSvgRequest(imageData, null, null, null, null, pageWidth, pageHeight, borderX, borderY, bkColor, fromScratch, outPath, storage, "png");

        Method propertiesTester = SvgApiTests.class.getDeclaredMethod("createModifiedSvgSizeRasterizationPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = SvgApiTests.class.getDeclaredMethod("createModifiedSvgPostRequestInvoker", byte[].class, String.class);
        requestInvoker.setAccessible(true);
        this.testPostRequest(
                "createModifiedSvgSizeRasterizationTest; save result to storage: " + saveResultToStorage,
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
     * Test operation: Rasterize SVG image to PNG using given scale parameters. Image is passed in a request stream.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createModifiedSvgScaleRasterizationTest() throws Exception {
        byte[] imageData = null;
        String bkColor = "gray";
        Double scaleX = 2.0;
        Double scaleY = 2.0;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "test.svg";
        String outName = name + "_specific." + "png";
        createModifiedSvgRequest = new CreateModifiedSvgRequest(imageData, null, null, scaleX, scaleY, null, null, null, null, bkColor, fromScratch, outPath, storage, "png");

        Method propertiesTester = SvgApiTests.class.getDeclaredMethod("createModifiedSvgScaleRasterizationPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = SvgApiTests.class.getDeclaredMethod("createModifiedSvgPostRequestInvoker", byte[].class, String.class);
        requestInvoker.setAccessible(true);
        this.testPostRequest(
                "createModifiedSvgScaleRasterizationTest; save result to storage: " + saveResultToStorage,
                saveResultToStorage,
                String.format("Input image: %s; BackColor: %s; Scale X: %s; Scale Y: %s",
                        name, bkColor, scaleX, scaleY),
                name,
                outName,
                requestInvoker,
                propertiesTester,
                folder,
                storage);
    }

    /**
     * Test operation: Update properties of the existing SVG image. Image is passed in a request stream.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createModifiedSvgUpdatePropertiesTest() throws Exception {
        byte[] imageData = null;
        // Only RGB color type is supported right now, see IMAGINGNET-3543
        String colorType = "rgb";
        Boolean textAsShapes = true;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = TestStorage;
        String folder = getTempFolder();
        String name = "test.svg";
        String outName = name + "_specific." + "png";
        createModifiedSvgRequest = new CreateModifiedSvgRequest(imageData, colorType, textAsShapes, null, null, null, null, null, null, null, fromScratch, outPath, storage, "svg");

        Method propertiesTester = SvgApiTests.class.getDeclaredMethod("createModifiedSvgUpdatePropertiesPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = SvgApiTests.class.getDeclaredMethod("createModifiedSvgPostRequestInvoker", byte[].class, String.class);
        requestInvoker.setAccessible(true);
        this.testPostRequest(
                "createModifiedSvgUpdatePropertiesTest; save result to storage: " + saveResultToStorage,
                saveResultToStorage,
                String.format("Input image: %s; Color type: %s; Text as shapes: %s",
                        name, colorType, textAsShapes),
                name,
                outName,
                requestInvoker,
                propertiesTester,
                folder,
                storage);
    }

    /**
     * Invokes GET request for modifySvg operation. Used indirectly by method reference.
     * @param name Image file name
     * @return API response
     * @throws Exception
     */
    private byte[] modifySvgGetRequestInvoker(String name) throws Exception
    {
        modifySvgRequest.name = name;
        return ImagingApi.modifySvg(modifySvgRequest);
    }

    /**
     * Invokes POST request for createModifiedSvg operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     * @throws Exception
     */
    private byte[] createModifiedSvgPostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        createModifiedSvgRequest.imageData = imageData;
        createModifiedSvgRequest.outPath = outPath;
        return ImagingApi.createModifiedSvg(createModifiedSvgRequest);
    }

    /**
     * Tests properties for modifySvg for size rasterization operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void modifySvgSizeRasterizationPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getPngProperties());
        Assert.assertEquals(modifySvgRequest.pageWidth + modifySvgRequest.borderX * 2, (int)resultProperties.getWidth());
        Assert.assertEquals(modifySvgRequest.pageHeight + modifySvgRequest.borderY * 2, (int)resultProperties.getHeight());
    }

    /**
     * Tests properties for modifySvg for scale rasterization operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void modifySvgScaleRasterizationPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getPngProperties());
        Assert.assertEquals((int) (originalProperties.getWidth() * modifySvgRequest.scaleX), (int)resultProperties.getWidth());
        Assert.assertEquals((int)(originalProperties.getHeight() * modifySvgRequest.scaleY), (int)resultProperties.getHeight());
    }

    /**
     * Tests properties for modifySvg for properties update. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void modifySvgUpdatePropertiesPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getSvgProperties());
        Assert.assertEquals(modifySvgRequest.colorType, resultProperties.getSvgProperties().getColorType());
    }

    /**
     * Tests properties for createModifiedSvg for size rasterization operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void createModifiedSvgSizeRasterizationPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getPngProperties());
        Assert.assertEquals(createModifiedSvgRequest.pageWidth + createModifiedSvgRequest.borderX * 2, (int)resultProperties.getWidth());
        Assert.assertEquals(createModifiedSvgRequest.pageHeight + createModifiedSvgRequest.borderY * 2, (int)resultProperties.getHeight());
    }

    /**
     * Tests properties for createModifiedSvg for scake rasterization operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void createModifiedSvgScaleRasterizationPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getPngProperties());
        Assert.assertEquals((int) (originalProperties.getWidth() * createModifiedSvgRequest.scaleX), (int)resultProperties.getWidth());
        Assert.assertEquals((int)(originalProperties.getHeight() * createModifiedSvgRequest.scaleY), (int)resultProperties.getHeight());
    }

    /**
     * Tests properties for createModifiedSvg for properties update. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void createModifiedSvgUpdatePropertiesPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getSvgProperties());
        Assert.assertEquals(createModifiedSvgRequest.colorType, resultProperties.getSvgProperties().getColorType());
    }
}
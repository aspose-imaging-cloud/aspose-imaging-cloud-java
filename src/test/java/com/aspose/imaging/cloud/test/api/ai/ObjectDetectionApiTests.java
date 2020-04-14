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
package com.aspose.imaging.cloud.test.api.ai;

import com.aspose.imaging.cloud.sdk.model.DetectedObject;
import com.aspose.imaging.cloud.sdk.model.StorageFile;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.sdk.stablemodel.ImagingResponse;
import com.aspose.imaging.cloud.test.base.ApiTester;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static org.junit.runners.Parameterized.Parameters;

/**
 * Class for testing object detection-related API calls
 */
@RunWith(Parameterized.class)
public class ObjectDetectionApiTests extends ApiTester {

    private ObjectBoundsRequest objectBoundsRequest;
    private VisualObjectBoundsRequest visualObjectBoundsRequest;
    private CreateObjectBoundsRequest createObjectBoundsRequest;
    private CreateVisualObjectBoundsRequest createVisualObjectBoundsRequest;

    @Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { false }
        });
    }

    private Boolean saveResultToStorage;


    public ObjectDetectionApiTests(Boolean saveResult)
    {
        this.saveResultToStorage = saveResult;
    }

    /**
     * Test operation: detect object bounds for an existing image.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void objectBoundsTest() throws Exception {
        
        if (saveResultToStorage)
        {
            return;
        }

        String name = null;
        String folder = getTempFolder();
        String storage = TestStorage;

        for (StorageFile inputFile : InputTestFiles)
        {
            name = inputFile.getName();
            if (!name.equalsIgnoreCase("object_detection_example.jpg"))
            {
                continue;
            }

            objectBoundsRequest = new ObjectBoundsRequest(name, null, 60,
                true, true, folder, storage);

            Method propertiesTester = ObjectDetectionApiTests.class.getDeclaredMethod("ObjectDetectionBoundsTester", List.class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = ObjectDetectionApiTests.class.getDeclaredMethod("objectBoundsGetRequestInvoker", String.class);
            requestInvoker.setAccessible(true);
            this.testObjectDetectionGetRequest(
                "objectDetectionImageTest",
                String.format("Input image: %s;", name),
                name,
                requestInvoker,
                propertiesTester,
                folder,
                storage);
        }
    }

    @Test
    public void visualObjectBoundsTest() throws Exception {

        if (saveResultToStorage)
        {
            return;
        }

        String name = null;
        String folder = getTempFolder();
        String storage = TestStorage;

        for (StorageFile inputFile : InputTestFiles)
        {
            name = inputFile.getName();
            if (!name.equalsIgnoreCase("object_detection_example.jpg"))
            {
                continue;
            }

            visualObjectBoundsRequest = new VisualObjectBoundsRequest(name, null, 60,
                    true, true, folder, storage);

            Method propertiesTester = ObjectDetectionApiTests.class.getDeclaredMethod("VisualObjectDetectionBoundsTester", byte[].class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = ObjectDetectionApiTests.class.getDeclaredMethod("visualObjectBoundsGetRequestInvoker", String.class);
            requestInvoker.setAccessible(true);
            this.testObjectDetectionGetRequest(
                    "visualObjectDetectionImageTest",
                    String.format("Input image: %s;", name),
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
    public void createObjectBoundsTest() throws Exception {
        byte[] imageData = null;
        String name = null;
        String outPath = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        String outName = null;

        for (StorageFile inputFile : InputTestFiles) {
            name = inputFile.getName();
            if (!name.equalsIgnoreCase("object_detection_example.jpg"))
            {
                continue;
            }

            createObjectBoundsRequest = new CreateObjectBoundsRequest(imageData, null, 60, true, true, outPath, storage);

            Method propertiesTester = ObjectDetectionApiTests.class.getDeclaredMethod("ObjectDetectionBoundsTester", List.class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = ObjectDetectionApiTests.class.getDeclaredMethod("objectBoundsPostRequestInvoker", byte[].class, String.class);
            requestInvoker.setAccessible(true);
            this.testObjectDetectionPostRequest(
                    "createObjectBoundsTest; save result to storage: " + saveResultToStorage,
                    saveResultToStorage,
                    String.format("Input image: %s; ", name),
                    name,
                    name,
                    requestInvoker,
                    propertiesTester,
                    folder,
                    storage);
        }
    }

    @Test
    public void createVisualObjectBoundsTest() throws Exception {
        byte[] imageData = null;
        String name = null;
        String outPath = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        String outName = null;

        for (StorageFile inputFile : InputTestFiles) {
            name = inputFile.getName();
            if (!name.equalsIgnoreCase("object_detection_example.jpg"))
            {
                continue;
            }

            createVisualObjectBoundsRequest = new CreateVisualObjectBoundsRequest(imageData, null, 60, true, true, outPath, storage);

            Method propertiesTester = ObjectDetectionApiTests.class.getDeclaredMethod("VisualObjectDetectionBoundsTester", byte[].class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = ObjectDetectionApiTests.class.getDeclaredMethod("visualObjectBoundsPostRequestInvoker", byte[].class, String.class);
            requestInvoker.setAccessible(true);
            this.testObjectDetectionPostRequest(
                    "createVisualObjectBoundsTest; save result to storage: " + saveResultToStorage,
                    saveResultToStorage,
                    String.format("Input image: %s; ", name),
                    name,
                    name,
                    requestInvoker,
                    propertiesTester,
                    folder,
                    storage);
        }
    }


    /**
     * Invokes GET request for object bounds operation. Used indirectly by method reference.
     * @param name Image file name
     * @return API response
     * @throws Exception 
     */
    private List<DetectedObject> objectBoundsGetRequestInvoker(String name) throws Exception
    {
        objectBoundsRequest.name = name;
        return ImagingApi.objectBounds(objectBoundsRequest);
    }

    private List<DetectedObject> objectBoundsPostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        createObjectBoundsRequest.imageData = imageData;
        createObjectBoundsRequest.outPath = outPath;
        return ImagingApi.createObjectBounds(createObjectBoundsRequest);
    }

    private byte[] visualObjectBoundsGetRequestInvoker(String name) throws Exception
    {
        visualObjectBoundsRequest.name = name;
        return ImagingApi.visualObjectBounds(visualObjectBoundsRequest);
    }

    private byte[] visualObjectBoundsPostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        createVisualObjectBoundsRequest.imageData = imageData;
        createVisualObjectBoundsRequest.outPath = outPath;
        return ImagingApi.createVisualObjectBounds(createVisualObjectBoundsRequest);
    }

    /**
     * Invokes POST request for createVisualObjectBoundsImage operation. Used indirectly by method reference.
     * @param imageData Image data
     * @param outPath Out path
     * @return API response
     * @throws Exception 
     */
    /*private byte[] createDeskewedImagePostRequestInvoker(byte[] imageData, String outPath) throws Exception
    {
        createDeskewedImageRequest.imageData = imageData;
        createDeskewedImageRequest.outPath = outPath;
        createDeskewedImageRequest.resizeProportionally = this.resizeProportionally;
        createDeskewedImageRequest.bkColor = this.bkColor;
        return ImagingApi.createDeskewedImage(createDeskewedImageRequest);
    }*/
    /**
     * Tests properties for deskewImage operation. Used indirectly by method reference.
     * @param resultData Result image data
     */
    private void ObjectDetectionBoundsTester(List<DetectedObject> resultData)
    {
        Assert.assertNotNull(resultData);
        Assert.assertTrue(resultData.size() > 0);
    }

    private void VisualObjectDetectionBoundsTester(byte[] resultData)
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
    /*private void createDeskewedImagePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertEquals(originalProperties.getBitsPerPixel(), resultProperties.getBitsPerPixel());
    }*/
}
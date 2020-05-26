/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ObjectDetectionApiTests.java">
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

import com.aspose.imaging.cloud.sdk.model.DetectedObjectList;
import com.aspose.imaging.cloud.sdk.model.StorageFile;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.test.base.ApiTester;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Method;
import java.util.Arrays;
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
    public static Iterable<Boolean[]> data() {
        return Arrays.asList(new Boolean[][] {
                { false }
        });
    }

    private Boolean saveResultToStorage;
    private String imageName;


    public ObjectDetectionApiTests(Boolean saveResult)
    {
        this.saveResultToStorage = saveResult;
        this.imageName = "test.bmp";
    }

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
            if (!name.equalsIgnoreCase(imageName))
            {
                continue;
            }

            objectBoundsRequest = new ObjectBoundsRequest(name, null, 20,
                true, true, folder, storage);

            Method propertiesTester = ObjectDetectionApiTests.class.getDeclaredMethod("ObjectDetectionBoundsTester", DetectedObjectList.class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = ObjectDetectionApiTests.class.getDeclaredMethod("objectBoundsGetRequestInvoker", String.class);
            requestInvoker.setAccessible(true);
            this.testObjectDetectionGetRequest(
                "objectDetection_objectbounds_test",
                String.format("Input image: %s; SaveResultToStorage: %s; method: ssd; threshold: 20", name, saveResultToStorage),
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
            if (!name.equalsIgnoreCase(imageName))
            {
                continue;
            }

            visualObjectBoundsRequest = new VisualObjectBoundsRequest(name, null, 20,
                    true, true, "blue", folder, storage);

            Method propertiesTester = ObjectDetectionApiTests.class.getDeclaredMethod("VisualObjectDetectionBoundsTester", byte[].class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = ObjectDetectionApiTests.class.getDeclaredMethod("visualObjectBoundsGetRequestInvoker", String.class);
            requestInvoker.setAccessible(true);
            this.testObjectDetectionGetRequest(
                    "objectdetection_visualobjectbounds_test",
                    String.format("Input image: %s; SaveResultToStorage: %s; method: ssd; threshold: 20, color: blue", name, saveResultToStorage),
                    name,
                    requestInvoker,
                    propertiesTester,
                    folder,
                    storage);
        }
    }

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
            if (!name.equalsIgnoreCase(imageName))
            {
                continue;
            }

            createObjectBoundsRequest = new CreateObjectBoundsRequest(imageData, null, 20, true, true, outPath, storage);

            Method propertiesTester = ObjectDetectionApiTests.class.getDeclaredMethod("ObjectDetectionBoundsTester", DetectedObjectList.class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = ObjectDetectionApiTests.class.getDeclaredMethod("objectBoundsPostRequestInvoker", byte[].class, String.class);
            requestInvoker.setAccessible(true);
            this.testObjectDetectionPostRequest(
                    "objectdetection_createobjectbounds_test",
                    saveResultToStorage,
                    String.format("Input image: %s; SaveResultToStorage: %s; method: ssd; threshold: 20", name, saveResultToStorage),
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
            if (!name.equalsIgnoreCase(imageName))
            {
                continue;
            }

            createVisualObjectBoundsRequest = new CreateVisualObjectBoundsRequest(imageData, null, 60, true, true, "blue", outPath, storage);

            Method propertiesTester = ObjectDetectionApiTests.class.getDeclaredMethod("VisualObjectDetectionBoundsTester", byte[].class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = ObjectDetectionApiTests.class.getDeclaredMethod("visualObjectBoundsPostRequestInvoker", byte[].class, String.class);
            requestInvoker.setAccessible(true);
            this.testObjectDetectionPostRequest(
                    "objectdetection_createvisualobjectbounds_test",
                    saveResultToStorage,
                    String.format("Input image: %s; SaveResultToStorage: %s; method: ssd; threshold: 20; color: blue", name, saveResultToStorage),
                    name,
                    name,
                    requestInvoker,
                    propertiesTester,
                    folder,
                    storage);
        }
    }

    private DetectedObjectList objectBoundsGetRequestInvoker(String name) throws Exception
    {
        objectBoundsRequest.name = name;
        return ImagingApi.objectBounds(objectBoundsRequest);
    }

    private DetectedObjectList objectBoundsPostRequestInvoker(byte[] imageData, String outPath) throws Exception
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

    private void ObjectDetectionBoundsTester(DetectedObjectList resultData)
    {
        Assert.assertNotNull(resultData);
        Assert.assertNotNull(resultData.getDetectedObjects());
        Assert.assertTrue(resultData.getDetectedObjects().size() > 0);
        Assert.assertNotNull(resultData.getDetectedObjects().get(0).getLabel());
        Assert.assertNotNull(resultData.getDetectedObjects().get(0).getScore());
        Assert.assertTrue(resultData.getDetectedObjects().get(0).getScore() > 0);
        Assert.assertNotNull(resultData.getDetectedObjects().get(0).getBounds());
        Assert.assertTrue(resultData.getDetectedObjects().get(0).getBounds().getHeight() > 0);
        Assert.assertTrue(resultData.getDetectedObjects().get(0).getBounds().getWidth() > 0);
    }

    private void VisualObjectDetectionBoundsTester(byte[] resultData)
    {
        Assert.assertNotNull(resultData);
        Assert.assertTrue(resultData.length > 0);
    }
}
/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FramesApiTests.java">
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

import com.aspose.imaging.cloud.sdk.model.StorageFile;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.sdk.stablemodel.ImagingResponse;
import com.aspose.imaging.cloud.test.base.ApiTester;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static org.junit.runners.Parameterized.Parameters;

/**
 * Class for testing Frames API calls
 */
@RunWith(Parameterized.class)
public class FramesApiTests extends ApiTester {

    private List<String> formatsWithoutProperties = Arrays.asList(".cdr", ".cmx", ".otg");

    private GetImageFrameRequest getImageFrameRequest;
    private CreateImageFrameRequest createImageFrameRequest;
    private GetImageFrameRangeRequest getImageFrameRangeRequest;
    private CreateImageFrameRangeRequest createImageFrameRangeRequest;
    private GetImageFramePropertiesRequest getImageFramePropertiesRequest;
    private ExtractImageFramePropertiesRequest extractImageFramePropertiesRequest;

    @Parameters
    public static Iterable<Object[]> data() {
        if (isExtendedTests()) {
            return Arrays.asList(new Object[][]{
                    {".cdr", true}, {".cdr", false},
                    {".cmx", true}, {".cmx", false},
                    {".dicom", true}, {".dicom", false},
                    {".djvu", true}, {".djvu", false},
                    {".gif", true}, {".gif", false},
                    {".odg", true}, {".odg", false},
                    {".otg", true}, {".otg", false},
                    {".psd", true}, {".psd", false},
                    {".webp", true}, {".webp", false}
            });
        } else {
            System.out.println("Extended tests had been disabled");
            return Arrays.asList(new Object[][]{
                    {".tif", true}, {".tif", false}
            });
        }
    }

    private String formatExtension;
    private String exportFormat;
    private Boolean saveResultToStorage;

    public FramesApiTests(String extension, Boolean saveResult) {
        this.formatExtension = extension;
        this.saveResultToStorage = saveResult;
    }

    /**
     * Test operation: Get image frame.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getImageFrameTest() throws Exception {
        if (saveResultToStorage) {
            return;
        }

        Integer frameId = 1;
        String folder = getTempFolder();
        String storage = TestStorage;
        exportFormat = this.getExportFormat(formatExtension, true);

        for (StorageFile inputFile : MultipageInputTestFiles) {
            String name = null;
            if (inputFile.getName().endsWith(formatExtension)) {
                name = inputFile.getName();
            } else {
                continue;
            }

            getImageFrameRequest = new GetImageFrameRequest(name, frameId, null, null, null, null, null, null, null, null, folder, storage);

            Method propertiesTester = FramesApiTests.class.getDeclaredMethod("framePropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = FramesApiTests.class.getDeclaredMethod("getImageFrameRequestInvoker", String.class);
            requestInvoker.setAccessible(true);
            this.testGetRequest(
                    "getImageFrameTest",
                    String.format("Input image: %s, Frame id: %s", name, frameId),
                    name,
                    requestInvoker,
                    propertiesTester,
                    folder,
                    storage
            );
        }
    }

    /**
     * Test operation: Create image frame.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void createImageFrameTest() throws Exception {

        Integer frameId = 1;
        String folder = getTempFolder();
        String storage = TestStorage;
        exportFormat = this.getExportFormat(formatExtension, true);

        for (StorageFile inputFile : MultipageInputTestFiles) {
            String name = null;
            if (inputFile.getName().endsWith(formatExtension)) {
                name = inputFile.getName();
            } else {
                continue;
            }

            String outName = String.format("%s_single_frame_%s", name, exportFormat);
            createImageFrameRequest = new CreateImageFrameRequest(null, frameId, null, null, null, null, null, null, null, null, null, storage);

            Method propertiesTester = FramesApiTests.class.getDeclaredMethod("framePropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = FramesApiTests.class.getDeclaredMethod("createImageFrameRequestInvoker", byte[].class, String.class);
            requestInvoker.setAccessible(true);
            this.testPostRequest(
                    "createImageFrameTest",
                    saveResultToStorage,
                    String.format("Input image: %s, Frame id: %s", name, frameId),
                    name,
                    outName,
                    requestInvoker,
                    propertiesTester,
                    folder,
                    storage
            );
        }
    }

    /**
     * Test operation: Get image frame range.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getImageFrameRangeTest() throws Exception {
        if (saveResultToStorage) {
            return;
        }

        Integer startFrameId = 0;
        Integer endFrameId = 1;
        String folder = getTempFolder();
        String storage = TestStorage;
        exportFormat = this.getExportFormat(formatExtension, false);

        for (StorageFile inputFile : MultipageInputTestFiles) {
            String name = null;
            if (inputFile.getName().endsWith(formatExtension)) {
                name = inputFile.getName();
            } else {
                continue;
            }

            getImageFrameRangeRequest = new GetImageFrameRangeRequest(name, startFrameId, endFrameId, null, null, null, null, null, null, null, null, folder, storage);

            Method propertiesTester = FramesApiTests.class.getDeclaredMethod("framePropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = FramesApiTests.class.getDeclaredMethod("getImageFrameRangeRequestInvoker", String.class);
            requestInvoker.setAccessible(true);
            this.testGetRequest(
                    "getImageFrameTest",
                    String.format("Input image: %s, Start frame id: %s; End frame id: %s", name, startFrameId, endFrameId),
                    name,
                    requestInvoker,
                    propertiesTester,
                    folder,
                    storage
            );
        }
    }

    /**
     * Test operation: Create image frame range.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void createImageFrameRangeTest() throws Exception {

        Integer startFrameId = 0;
        Integer endFrameId = 1;
        String folder = getTempFolder();
        String storage = TestStorage;
        exportFormat = this.getExportFormat(formatExtension, false);

        for (StorageFile inputFile : MultipageInputTestFiles) {
            String name = null;
            if (inputFile.getName().endsWith(formatExtension)) {
                name = inputFile.getName();
            } else {
                continue;
            }

            String outName = String.format("%s_frame_range_%s", name, exportFormat);
            createImageFrameRangeRequest = new CreateImageFrameRangeRequest(null, startFrameId, endFrameId, null, null, null, null, null, null, null, null, null, storage);

            Method propertiesTester = FramesApiTests.class.getDeclaredMethod("framePropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
            propertiesTester.setAccessible(true);
            Method requestInvoker = FramesApiTests.class.getDeclaredMethod("createImageFrameRangeRequestInvoker", byte[].class, String.class);
            requestInvoker.setAccessible(true);
            this.testPostRequest(
                    "createImageFrameRangeTest",
                    saveResultToStorage,
                    String.format("Input image: %s, Start frame id: %s; End frame id: %s", name, startFrameId, endFrameId),
                    name,
                    outName,
                    requestInvoker,
                    propertiesTester,
                    folder,
                    storage
            );
        }
    }

    /**
     * Test operation: Get image frame properties.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void getFramePropertiesTest() throws Exception {
        if (saveResultToStorage) {
            return;
        }

        Integer frameId = 1;
        String folder = getTempFolder();
        String storage = TestStorage;

        for (StorageFile inputFile : MultipageInputTestFiles) {
            String name = null;
            if (inputFile.getName().endsWith(formatExtension)) {
                name = inputFile.getName();
            } else {
                continue;
            }

            copyInputFileToFolder(name, folder, storage);

            System.out.println("GetImageFrameProperties");
            System.out.println(String.format("Input image: %s; Frame id: %s", name, frameId));

            ImagingResponse responseMessage = ImagingApi.getImageFrameProperties(new GetImageFramePropertiesRequest(name, frameId, folder, storage));

            Assert.assertNotNull(responseMessage);
            if (formatsWithoutProperties.contains(formatExtension))
                return;

            String propertiesName = this.getPropertiesName(formatExtension);
            Object resultFormatProperties = null;
            try {
                resultFormatProperties = ImagingResponse.class.getDeclaredMethod(propertiesName).invoke(responseMessage);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            Assert.assertNotNull(resultFormatProperties);
        }
    }

    /**
     * Test operation: Extract image frame properties.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void extractFramePropertiesTest() throws Exception {
        if (saveResultToStorage) {
            return;
        }

        Integer frameId = 1;
        String folder = getTempFolder();
        String storage = TestStorage;

        for (StorageFile inputFile : MultipageInputTestFiles) {
            String name = null;
            if (inputFile.getName().endsWith(formatExtension)) {
                name = inputFile.getName();
            } else {
                continue;
            }

            copyInputFileToFolder(name, folder, storage);
            byte[] imageData = ImagingApi.downloadFile(new DownloadFileRequest((folder + "/" + name), storage, null));

            System.out.println("ExtractImageFrameProperties");
            System.out.println(String.format("Input image: %s; Frame id: %s", name, frameId));

            ImagingResponse responseMessage = ImagingApi.extractImageFrameProperties(new ExtractImageFramePropertiesRequest(imageData, frameId));

            Assert.assertNotNull(responseMessage);
            if (formatsWithoutProperties.contains(formatExtension))
                return;

            String propertiesName = this.getPropertiesName(formatExtension);
            Object resultFormatProperties = null;
            try {
                resultFormatProperties = ImagingResponse.class.getDeclaredMethod(propertiesName).invoke(responseMessage);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            Assert.assertNotNull(resultFormatProperties);
        }
    }

    /**
     * Tests properties for frames operations. Used indirectly by method reference.
     *
     * @param originalProperties Original image properties
     * @param resultProperties   Result image properties
     * @param resultData         Result image data
     */
    private void framePropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData) {
        Assert.assertNotNull(resultProperties);
        if (formatsWithoutProperties.contains(exportFormat))
            return;

        String propertiesName = this.getPropertiesName(exportFormat);
        Object resultFormatProperties = null;
        try {
            resultFormatProperties = ImagingResponse.class.getDeclaredMethod(propertiesName).invoke(resultProperties);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(resultFormatProperties);
    }

    /**
     * Invokes GET request for getImageFrame operation. Used indirectly by method reference.
     *
     * @param name Image file name
     * @return API response
     */
    private byte[] getImageFrameRequestInvoker(String name) throws Exception {
        getImageFrameRequest.name = name;
        return ImagingApi.getImageFrame(getImageFrameRequest);
    }

    /**
     * Invokes POST request for createImageFrame operation. Used indirectly by method reference.
     *
     * @param imageData Image data
     * @param outPath   Out path
     * @return API response
     */
    private byte[] createImageFrameRequestInvoker(byte[] imageData, String outPath) throws Exception {
        createImageFrameRequest.imageData = imageData;
        createImageFrameRequest.outPath = outPath;
        return ImagingApi.createImageFrame(createImageFrameRequest);
    }

    /**
     * Invokes GET request for getImageFrameRange operation. Used indirectly by method reference.
     *
     * @param name Image file name
     * @return API response
     */
    private byte[] getImageFrameRangeRequestInvoker(String name) throws Exception {
        getImageFrameRangeRequest.name = name;
        return ImagingApi.getImageFrameRange(getImageFrameRangeRequest);
    }

    /**
     * Invokes POST request for createImageFrameRange operation. Used indirectly by method reference.
     *
     * @param imageData Image data
     * @param outPath   Out path
     * @return API response
     */
    private byte[] createImageFrameRangeRequestInvoker(byte[] imageData, String outPath) throws Exception {
        createImageFrameRangeRequest.imageData = imageData;
        createImageFrameRangeRequest.outPath = outPath;
        return ImagingApi.createImageFrameRange(createImageFrameRangeRequest);
    }

    /**
     * Gets name of the field with properties
     *
     * @param format Image format
     * @return Field name
     */
    private String getPropertiesName(String format) {
        if (format == null)
            throw new IllegalArgumentException("Invalid format");

        if (format.equals(".jpg"))
            format = ".jpeg";
        else if (format.equals(".j2k"))
            format = ".jpeg2000";
        else if (format.equals(".webp"))
            format = ".webP";

        if (format.startsWith("."))
            format = format.substring(1);

        return "get" + format.substring(0, 1).toUpperCase() + format.substring(1) + "Properties";
    }

    /**
     * Gets default export format
     *
     * @param format        Image format
     * @param isSingleFrame Single frame or frame range operation
     * @return Export format
     */
    private String getExportFormat(String format, Boolean isSingleFrame) {
        if (Arrays.asList(".dicom", ".dng", ".djvu", ".cdr", ".cmx", ".odg", ".otg", ".svg").contains(format))
            return isSingleFrame ? ".psd" : ".pdf";
        return format;
    }
}

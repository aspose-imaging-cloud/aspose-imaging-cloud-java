/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TiffFrames.java">
 *   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
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

import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.sdk.stablemodel.ImagingResponse;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * frames example.
 */
public class MultiframeImage extends ImagingBase {
    /**
     * Examples of operations with multi frame image.
     *
     * @param imagingApi The imaging API.
     */
    public MultiframeImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Multiframe image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "MultipageSampleImage.djvu";
    }

    /**
     * Get separate frame from existing image.
     *
     * @throws Exception
     */
    public void GetImageFrameFromStorage() throws Exception {
        System.out.println("Get separate frame from existing image in cloud storage");

        uploadSampleImageToCloud();

        Integer frameId = 1; // Index of the frame
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(getSampleImageFileName(), frameId, null, null, null, null, null, null, null, null, folder, storage);

        System.out.println(String.format("Call GetImageFrame with params: frame Id: %s", frameId));

        byte[] imageFrame = ImagingApi.getImageFrame(getImageFrameRequest);
        saveUpdatedImageToOutput("SingleFrame.tiff", imageFrame);

        System.out.println();
    }

    /**
     * Get separate frame from existing image, and upload the frame to Cloud Storage.
     *
     * @throws Exception
     */
    public void GetImageFrameAndUploadToStorage() throws Exception {
        System.out.println("Get separate frame from existing image and upload to cloud storage");

        uploadSampleImageToCloud();

        Integer frameId = 1; // Index of the frame
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(getSampleImageFileName(), frameId, null, null, null, null, null, null, null, null, folder, storage);

        System.out.println(String.format("Call GetImageFrame with params: frame Id: %s", frameId));

        byte[] imageFrame = ImagingApi.getImageFrame(getImageFrameRequest);
        uploadImageToCloudExample(imageFrame, "SingleFrame.tiff");

        System.out.println();
    }

    /**
     * Get separate frame from existing image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateImageFrameFromRequestBody() throws Exception {
        System.out.println("Get separate frame from existing image from request body");

        Integer frameId = 1;
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateImageFrameRequest createImageFrameRequest = new CreateImageFrameRequest(inputStream, frameId, null, null, null, null, null, null, null, null, outPath, storage);

        System.out.println(String.format("Call createImageFrameRequest with params: frame Id: %s", frameId));

        byte[] imageFrame = ImagingApi.createImageFrame(createImageFrameRequest);
        saveUpdatedImageToOutput("SingleFrameFromRequest.tiff", imageFrame);

        System.out.println();
    }

    /**
     * Get frame range from existing image.
     *
     * @throws Exception
     */
    public void GetImageFrameRangeFromStorage() throws Exception {
        System.out.println("Get frame range from existing image in cloud storage");

        uploadSampleImageToCloud();

        Integer startFrameId = 1; // Index of the first frame in range
        Integer endFrameId = 4; // Index of the last frame in range
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GetImageFrameRangeRequest getImageFrameRangeRequest = new GetImageFrameRangeRequest(getSampleImageFileName(), startFrameId, endFrameId, null, null, null, null, null, null, null, null, folder, storage);

        System.out.println(String.format("Call GetImageFrame with params: start frame Id: %s, end frame Id: %s", startFrameId, endFrameId));

        byte[] imageFrame = ImagingApi.getImageFrameRange(getImageFrameRangeRequest);
        saveUpdatedImageToOutput("FrameRange.djvu", imageFrame);

        System.out.println();
    }

    /**
     * Get frame range from existing image, and upload the frame to Cloud Storage.
     *
     * @throws Exception
     */
    public void GetImageFrameRangeAndUploadToStorage() throws Exception {
        System.out.println("Get frame range from existing image and upload to cloud storage");

        uploadSampleImageToCloud();

        Integer startFrameId = 1; // Index of the first frame in range
        Integer endFrameId = 4; // Index of the last frame in range
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GetImageFrameRangeRequest getImageFrameRangeRequest = new GetImageFrameRangeRequest(getSampleImageFileName(), startFrameId, endFrameId, null, null, null, null, null, null, null, null, folder, storage);

        System.out.println(String.format("Call GetImageFrame with params: start frame Id: %s, end frame Id: %s", startFrameId, endFrameId));

        byte[] imageFrame = ImagingApi.getImageFrameRange(getImageFrameRangeRequest);
        uploadImageToCloudExample(imageFrame, "FrameRange.djvu");

        System.out.println();
    }

    /**
     * Get frame range from existing image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateImageFrameRangeFromRequestBody() throws Exception {
        System.out.println("Get frame range from existing image from request body");

        Integer startFrameId = 1; // Index of the first frame in range
        Integer endFrameId = 4; // Index of the last frame in range
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateImageFrameRangeRequest createImageFrameRangeRequest = new CreateImageFrameRangeRequest(inputStream, startFrameId, endFrameId, null, null, null, null, null, null, null, null, outPath, storage);

        System.out.println(String.format("Call createImageFrameRequest with params: start frame Id: %s, end frame Id: %s", startFrameId, endFrameId));

        byte[] imageFrame = ImagingApi.createImageFrameRange(createImageFrameRangeRequest);
        saveUpdatedImageToOutput("FrameRangeFromRequest.djvu", imageFrame);

        System.out.println();
    }

    /**
     * Get separate frame properties of a image.
     *
     * @throws Exception
     */
    public void GetImageFramePropertiesFromStorage() throws Exception {
        System.out.println("Gets separate frame properties of existing image from cloud storage");

        uploadSampleImageToCloud();

        Integer frameId = 1; // Number of a frame
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GetImageFramePropertiesRequest imageFramePropertiesRequest =
                new GetImageFramePropertiesRequest(getSampleImageFileName(), frameId, folder, storage);

        System.out.println("Call GetImageFrameProperties with params: frame Id: " + frameId);

        ImagingResponse imagingResponse = ImagingApi.getImageFrameProperties(imageFramePropertiesRequest);
        outputPropertiesToFile("TiffFrameProperties.txt", imagingResponse);

        System.out.println();
    }

    /**
     * Get separate frame properties of a image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void ExtractImageFramePropertiesFromRequestBody() throws Exception {
        System.out.println("Get separate frame properties of existing image from request body");

        Integer frameId = 1;

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        ExtractImageFramePropertiesRequest imageFramePropertiesRequest =
                new ExtractImageFramePropertiesRequest(inputStream, frameId);

        System.out.println("Call ExtractImageFrameProperties with params: frame Id: " + frameId);

        ImagingResponse imagingResponse = ImagingApi.extractImageFrameProperties(imageFramePropertiesRequest);
        outputPropertiesToFile("TiffFramePropertiesFromRequest.txt", imagingResponse);

        System.out.println();
    }
}

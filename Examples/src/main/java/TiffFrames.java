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

import com.aspose.imaging.cloud.sdk.model.requests.CreateImageFrameRequest;
import com.aspose.imaging.cloud.sdk.model.requests.ExtractImageFramePropertiesRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageFramePropertiesRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageFrameRequest;
import com.aspose.imaging.cloud.sdk.stablemodel.ImagingResponse;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * TIFF frames example.
 */
public class TiffFrames extends ImagingBase {
    /**
     * Initializes a new instance of the TiffFrames class
     *
     * @param imagingApi The imaging API.
     */
    public TiffFrames(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("TIFF frames example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "TiffFrameSampleImage.tiff";
    }

    /**
     * Get separate frame from existing TIFF image.
     *
     * @throws Exception
     */
    public void GetImageFrameFromStorage() throws Exception {
        System.out.println("Get separate frame from existing TIFF image in cloud storage");

        uploadSampleImageToCloud();

        Integer frameId = 1; // Number of a frame
        Integer newWidth = 300;
        Integer newHeight = 450;
        Integer x = 10;
        Integer y = 10;
        Integer rectWidth = 200;
        Integer rectHeight = 300;
        String rotateFlipMethod = "Rotate90FlipX";
        Boolean saveOtherFrames = false; // Result will include just the specified frame
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(
                getSampleImageFileName(), frameId, newWidth, newHeight,
                x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames, folder, storage);

        System.out.println(String.format("Call GetImageFrame with params: frame Id: %s, new width: %s, new height: %s, x: %s, y: %s, rect width: %s, rectHeight: %s, rotate/flip method: %s, save other frames: %s", frameId, newWidth, newHeight, x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames));

        byte[] imageFrame = ImagingApi.getImageFrame(getImageFrameRequest);
        saveUpdatedImageToOutput("SingleFrame.tiff", imageFrame);

        System.out.println();
    }

    /**
     * Get separate frame from existing TIFF image, and upload the frame to Cloud Storage.
     *
     * @throws Exception
     */
    public void GetImageFrameAndUploadToStorage() throws Exception {
        System.out.println("Get separate frame from existing TIFF image and upload to cloud storage");

        uploadSampleImageToCloud();

        Integer frameId = 1; // Number of a frame
        Integer newWidth = 300;
        Integer newHeight = 450;
        Integer x = 10;
        Integer y = 10;
        Integer rectWidth = 200;
        Integer rectHeight = 300;
        String rotateFlipMethod = "Rotate90FlipX";
        Boolean saveOtherFrames = false; // Result will include just the specified frame
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(
                getSampleImageFileName(), frameId, newWidth, newHeight,
                x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames, folder, storage);

        System.out.println(String.format("Call GetImageFrame with params: frame Id: %s, new width: %s, new height: %s, x: %s, y: %s, rect width: %s, rectHeight: %s, rotate/flip method: %s, save other frames: %s", frameId, newWidth, newHeight, x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames));

        byte[] imageFrame = ImagingApi.getImageFrame(getImageFrameRequest);
        uploadImageToCloud("SingleFrame.tiff", imageFrame);

        System.out.println();
    }

    /**
     * Resize a TIFF frame.
     *
     * @throws Exception
     */
    public void ResizeImageFrameFromStorage() throws Exception {
        System.out.println("Resize frame from existing TIFF image from cloud storage");

        uploadSampleImageToCloud();

        Integer frameId = 0; // Number of a frame
        Integer newWidth = 300;
        Integer newHeight = 300;
        Boolean saveOtherFrames = false; // Result will include just the specified frame
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(getSampleImageFileName(), frameId, newWidth, newHeight, null, null, null, null, null,
                saveOtherFrames, folder, storage);

        System.out.println(String.format("Call GetImageFrame with params: frame Id: %s, new width: %s, new height: %s, save other frames: %s", frameId, newWidth, newHeight, saveOtherFrames));

        byte[] imageFrame = ImagingApi.getImageFrame(getImageFrameRequest);
        saveUpdatedImageToOutput("ResizeFrame.tiff", imageFrame);

        System.out.println();
    }

    /**
     * Crop a TIFF frame.
     *
     * @throws Exception
     */
    public void CropImageFrameFromStorage() throws Exception {
        System.out.println("Crop frame from existing TIFF image from cloud storage");

        uploadSampleImageToCloud();

        Integer frameId = 0; // Number of a frame
        Integer x = 10;
        Integer y = 10;
        Integer rectWidth = 200;
        Integer rectHeight = 300;
        // Result will include just the specified frame
        Boolean saveOtherFrames = false;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(getSampleImageFileName(), frameId, null, null, x, y,
                rectWidth, rectHeight, null, saveOtherFrames, folder, storage);

        System.out.println(String.format("Call GetImageFrame with params: frame Id: %s, x: %s, y: %s, rect width: %s, rectHeight: %s, save other frames: %s", frameId, x, y, rectWidth, rectHeight, saveOtherFrames));

        byte[] imageFrame = ImagingApi.getImageFrame(getImageFrameRequest);
        saveUpdatedImageToOutput("CropFrame.tiff", imageFrame);

        System.out.println();
    }

    /**
     * Rotate/Flip a TIFF frame.
     *
     * @throws Exception
     */
    public void RotateFlipImageFrameFromStorage() throws Exception {
        System.out.println("Rotate/flip frame from existing TIFF image from cloud storage");

        uploadSampleImageToCloud();

        Integer frameId = 0; // Number of a frame
        String rotateFlipMethod = "Rotate90FlipX";
        Boolean saveOtherFrames = false; // Result will include just the specified frame
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(getSampleImageFileName(), frameId, null, null, null, null, null, null,
                rotateFlipMethod, saveOtherFrames, folder, storage);

        System.out.println(String.format("Call GetImageFrame with params: frame Id: %s, rotate/flip method: %s, save other frames: %s", frameId, rotateFlipMethod, saveOtherFrames));

        byte[] imageFrame = ImagingApi.getImageFrame(getImageFrameRequest);
        saveUpdatedImageToOutput("RotateFlipFrame.tiff", imageFrame);

        System.out.println();
    }

    /**
     * Gets all image frames from storage.
     *
     * @throws Exception
     */
    public void GetAllImageFramesFromStorage() throws Exception {
        System.out.println("Gets all image frames from existing TIFF image from cloud storage");

        uploadSampleImageToCloud();

        Integer frameId = 1; // Number of a frame
        Integer newWidth = 300;
        Integer newHeight = 450;
        Integer x = 10;
        Integer y = 10;
        Integer rectWidth = 200;
        Integer rectHeight = 300;
        String rotateFlipMethod = "Rotate90FlipX";
        Boolean saveOtherFrames = true; // Result will include all other frames
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(
                getSampleImageFileName(), frameId, newWidth, newHeight,
                x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames, folder, storage);

        System.out.println(String.format("Call GetImageFrame with params: frame Id: %s, new width: %s, new height: %s, x: %s, y: %s, rect width: %s, rectHeight: %s, rotate/flip method: %s, save other frames: %s", frameId, newWidth, newHeight, x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames));

        byte[] imageFrame = ImagingApi.getImageFrame(getImageFrameRequest);
        saveUpdatedImageToOutput("OtherFrames.tiff", imageFrame);

        System.out.println();
    }

    /**
     * Get separate frame from existing TIFF image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateImageFrameFromRequestBody() throws Exception {
        System.out.println("Get separate frame from existing TIFF image from request body");

        Integer frameId = 1;
        Integer newWidth = 300;
        Integer newHeight = 450;
        Integer x = 10;
        Integer y = 10;
        Integer rectWidth = 200;
        Integer rectHeight = 300;
        String rotateFlipMethod = "Rotate90FlipX";
        Boolean saveOtherFrames = false;
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateImageFrameRequest createImageFrameRequest = new CreateImageFrameRequest(inputStream, frameId, newWidth,
                newHeight, x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames, outPath, storage);

        System.out.println(String.format("Call createImageFrameRequest with params: frame Id: %s, new width: %s, new height: %s, x: %s, y: %s, rect width: %s, rectHeight: %s, rotate/flip method: %s, save other frames: %s", frameId, newWidth, newHeight, x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames));

        byte[] imageFrame = ImagingApi.createImageFrame(createImageFrameRequest);
        saveUpdatedImageToOutput("SingleFrameFromRequest.tiff", imageFrame);

        System.out.println();
    }

    /**
     * Get separate frame properties of a TIFF image.
     *
     * @throws Exception
     */
    public void GetImageFramePropertiesFromStorage() throws Exception {
        System.out.println("Gets separate frame properties of existing TIFF image from cloud storage");

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
     * Get separate frame properties of a TIFF image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void ExtractImageFramePropertiesFromRequestBody() throws Exception {
        System.out.println("Get separate frame properties of existing TIFF image from request body");

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

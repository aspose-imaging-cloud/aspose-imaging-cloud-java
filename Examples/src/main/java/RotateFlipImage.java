/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RotateFlipImage.java">
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

import com.aspose.imaging.cloud.sdk.model.requests.CreateRotateFlippedImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.RotateFlipImageRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Rotate and/or flip an image example.
 */
public class RotateFlipImage extends ImagingBase {
    /**
     * Initializes a new instance of the RotateFlipImage class
     *
     * @param imagingApi The imaging API.
     */
    public RotateFlipImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Rotate/flip image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "RotateFlipSampleImage.psd";
    }

    /**
     * Rotate and/or flip an image.
     *
     * @throws Exception
     */
    public void RotateFlipImageFromStorage() throws Exception {
        System.out.println("Rotate and/or flip an image from cloud storage");

        uploadSampleImageToCloud();

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-RotateFlip
        // for possible output formats
        String format = "gif";
        String method = "Rotate90FlipX"; // RotateFlip method
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        RotateFlipImageRequest getImageRotateFlipRequest = new RotateFlipImageRequest(
                getSampleImageFileName(), method, format, folder, storage);

        System.out.println(String.format("Call RotateFlipImage with params: method: %s, format: %s", method, format));

        byte[] updatedImage = ImagingApi.rotateFlipImage(getImageRotateFlipRequest);
        saveUpdatedSampleImageToOutput(updatedImage, false, format);

        System.out.println();
    }

    /**
     * Rotate and/or flip an image, and upload updated image to Cloud Storage
     *
     * @throws Exception
     */
    public void RotateFlipImageAndUploadToStorage() throws Exception {
        System.out.println("Rotate/flip an image and upload to cloud storage");

        uploadSampleImageToCloud();

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-RotateFlip
        // for possible output formats
        String format = "gif";
        String method = "Rotate90FlipX"; // RotateFlip method
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        RotateFlipImageRequest getImageRotateFlipRequest = new RotateFlipImageRequest(
                getSampleImageFileName(), format, method, folder, storage);

        System.out.println(String.format("Call RotateFlipImage with params: method: %s, format: %s", method, format));

        byte[] updatedImage = ImagingApi.rotateFlipImage(getImageRotateFlipRequest);
        uploadImageToCloud(getModifiedSampleImageFileName(false, format), updatedImage);

        System.out.println();
    }

    /**
     * Rotate and/or flip an image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateRotateFlippedImageFromRequestBody() throws Exception {
        System.out.println("Rotate/flip an image from request body");

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-RotateFlip
        // for possible output formats
        String format = "gif";
        String method = "Rotate90FlipX"; // RotateFlip method
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateRotateFlippedImageRequest createRotateFlippedImageRequest =
                new CreateRotateFlippedImageRequest(inputStream, method, format, outPath, storage);

        System.out.println(String.format("Call createRotateFlippedImageRequest with params: method: %s, format: %s", method, format));

        byte[] updatedImage = ImagingApi.createRotateFlippedImage(createRotateFlippedImageRequest);
        saveUpdatedSampleImageToOutput(updatedImage, true, format);

        System.out.println();
    }
}

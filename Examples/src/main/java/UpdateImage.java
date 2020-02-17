/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UpdateImage.java">
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

import com.aspose.imaging.cloud.sdk.model.requests.CreateUpdatedImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.UpdateImageRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Update image example.
 */
public class UpdateImage extends ImagingBase {
    /**
     * Initializes a new instance of the UpdateImage class
     *
     * @param imagingApi The imaging API.
     */
    public UpdateImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Update image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "UpdateSampleImage.gif";
    }

    /**
     * Perform scaling, cropping and flipping of an existing image in a single request. The image is saved in the cloud.
     *
     * @throws Exception
     */
    public void UpdateImageFromStorage() throws Exception {
        System.out.println("Update parameters of an image from cloud storage");

        uploadSampleImageToCloud();

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-Update
        // for possible output formats
        String format = "pdf";
        Integer newWidth = 300;
        Integer newHeight = 450;
        Integer x = 10;
        Integer y = 10;
        Integer rectWidth = 200;
        Integer rectHeight = 300;
        String rotateFlipMethod = "Rotate90FlipX";
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        UpdateImageRequest getImageUpdateRequest = new UpdateImageRequest(
                getSampleImageFileName(), format, newWidth,
                newHeight, x, y, rectWidth, rectHeight, rotateFlipMethod, folder, storage);

        System.out.println(String.format("Call UpdateImage with params: new width: %s, new height: %s, x:{x}, y:{y}, rect width: %s, rectHeight: %s, rotate/flip method: %s, format: %s", newWidth, newHeight, rectWidth, rectHeight, rotateFlipMethod, format));

        byte[] updatedImage = ImagingApi.updateImage(getImageUpdateRequest);
        saveUpdatedSampleImageToOutput(updatedImage, false, null);

        System.out.println();
    }

    /**
     * Perform scaling, cropping and flipping of an existing image in a single request. And upload updated image to Cloud Storage.
     *
     * @throws Exception
     */
    public void UpdateImageAndUploadToStorage() throws Exception {
        System.out.println("Update parameters of an image and upload to cloud storage");

        uploadSampleImageToCloud();

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-Update
        // for possible output formats
        String format = "pdf";
        Integer newWidth = 300;
        Integer newHeight = 450;
        Integer x = 10;
        Integer y = 10;
        Integer rectWidth = 200;
        Integer rectHeight = 300;
        String rotateFlipMethod = "Rotate90FlipX";
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        UpdateImageRequest getImageUpdateRequest = new UpdateImageRequest(getSampleImageFileName(), format, newWidth,
                newHeight, x, y, rectWidth, rectHeight, rotateFlipMethod, folder, storage);

        System.out.println(String.format("Call UpdateImage with params: new width: %s, new height: %s, x:{x}, y:{y}, rect width: %s, rectHeight: %s, rotate/flip method: %s, format: %s", newWidth, newHeight, rectWidth, rectHeight, rotateFlipMethod, format));

        byte[] updatedImage = ImagingApi.updateImage(getImageUpdateRequest);
        uploadImageToCloud(getModifiedSampleImageFileName(false, null), updatedImage);

        System.out.println();
    }

    /**
     * Perform scaling, cropping and flipping of an image in a single request. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateUpdatedImageFromRequestBody() throws Exception {
        System.out.println("Update parameters of an image from request body");

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-Update
        // for possible output formats
        String format = "pdf";
        Integer newWidth = 300;
        Integer newHeight = 450;
        Integer x = 10;
        Integer y = 10;
        Integer rectWidth = 200;
        Integer rectHeight = 300;
        String rotateFlipMethod = "Rotate90FlipX";
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateUpdatedImageRequest postImageUpdateRequest = new CreateUpdatedImageRequest(
                inputStream, format, newWidth,
                newHeight, x, y, rectWidth, rectHeight, rotateFlipMethod, outPath, storage);

        System.out.println(String.format("Call CreateUpdatedImageRequest with params: new width: %s, new height: %s, x:{x}, y:{y}, rect width: %s, rectHeight: %s, rotate/flip method: %s, format: %s", newWidth, newHeight, rectWidth, rectHeight, rotateFlipMethod, format));

        byte[] updatedImage = ImagingApi.createUpdatedImage(postImageUpdateRequest);
        saveUpdatedSampleImageToOutput(updatedImage, true, null);

        System.out.println();
    }
}

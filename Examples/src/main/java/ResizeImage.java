/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ResizeImage.java">
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

import com.aspose.imaging.cloud.sdk.model.requests.CreateResizedImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.ResizeImageRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Resize image example.
 */
public class ResizeImage extends ImagingBase {
    /**
     * Initializes a new instance of the ResizeImage class
     *
     * @param imagingApi The imaging API.
     */
    public ResizeImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Resize an image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "ResizeSampleImage.psd";
    }

    /**
     * Resizes the image.
     *
     * @throws Exception
     */
    public void ResizeImageFromStorage() throws Exception {
        System.out.println("Resize an image from cloud storage");

        // Upload local image to Cloud Storage
        uploadSampleImageToCloud();

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-Resize
        // for possible output formats
        String format = "gif";
        Integer newWidth = 100;
        Integer newHeight = 150;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ResizeImageRequest resizeImageRequest = new ResizeImageRequest(getSampleImageFileName(), newWidth, newHeight, format, folder, storage);

        System.out.println(String.format("Call ResizeImage with params: new width: %s, new height: %s, format: %s", newWidth, newHeight, format));

        byte[] updatedImage = ImagingApi.resizeImage(resizeImageRequest);
        saveUpdatedSampleImageToOutput(updatedImage, false, null);

        System.out.println();
    }

    /**
     * Resizes the sample image and upload to Cloud Storage
     *
     * @throws Exception
     */
    public void ResizeImageAndUploadToStorage() throws Exception {
        System.out.println("Resize an image and upload to cloud storage");

        // Upload local image to Cloud Storage
        uploadSampleImageToCloud();

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-Resize
        // for possible output formats
        String format = "gif";
        Integer newWidth = 100;
        Integer newHeight = 150;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ResizeImageRequest resizeImageRequest = new ResizeImageRequest(
                getSampleImageFileName(), newWidth, newHeight, format, folder, storage);

        System.out.println(String.format("Call ResizeImage with params: new width: %s, new height: %s, format: %s", newWidth, newHeight, format));

        byte[] updatedImage = ImagingApi.resizeImage(resizeImageRequest);
        uploadImageToCloudExample(updatedImage, getModifiedSampleImageFileName(false, format));

        System.out.println();
    }

    /**
     * Resize an image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateResizedImageFromRequestBody() throws Exception {
        System.out.println("Resize an image from request body");

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-Resize
        // for possible output formats
        String format = "gif";
        Integer newWidth = 100;
        Integer newHeight = 150;
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateResizedImageRequest createResizedImageRequest = new CreateResizedImageRequest(
                inputStream, newWidth, newHeight, format, outPath, storage);

        System.out.println(String.format("Call CreateResizedImageRequest with params: new width: %s, new height: %s, format: %s", newWidth, newHeight, format));

        byte[] updatedImage = ImagingApi.createResizedImage(createResizedImageRequest);
        saveUpdatedSampleImageToOutput(updatedImage, true, format);

        System.out.println();
    }
}

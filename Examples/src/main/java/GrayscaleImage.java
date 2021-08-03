/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GrayscaleImage.java">
 *   Copyright (c) 2018-2020 Aspose Pty Ltd. All rights reserved.
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

import com.aspose.imaging.cloud.sdk.model.requests.CreateGrayscaledImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GrayscaleImageRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Grayscale image example.
 */
public class GrayscaleImage extends ImagingBase {
    /**
     * Initializes a new instance of the GrayscaleImage class
     *
     * @param imagingApi The imaging API.
     */
    public GrayscaleImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Grayscale image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "GrayscaleSampleImage.bmp";
    }

    /**
     * Grayscale the image from cloud storage.
     *
     * @throws Exception
     */
    public void GrayscaleImageFromStorage() throws Exception {
        System.out.println("Grayscales the image from cloud storage");

        uploadSampleImageToCloud();

        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GrayscaleImageRequest request = new GrayscaleImageRequest(getSampleImageFileName(), folder, storage);

        System.out.println(String.format("Call GrayscaleImage"));

        byte[] updatedImage = ImagingApi.grayscaleImage(request);
        saveUpdatedSampleImageToOutput(updatedImage, false, "bmp");

        System.out.println();
    }

    /**
     * Grayscale an existing image, and upload updated image to Cloud Storage.
     *
     * @throws Exception
     */
    public void GrayscaleImageAndUploadToStorage() throws Exception {
        System.out.println("Grayscales the image and upload to cloud storage");

        uploadSampleImageToCloud();

        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GrayscaleImageRequest request = new GrayscaleImageRequest(getSampleImageFileName(), folder, storage);

        System.out.println(String.format("Call GrayscaleImage"));

        byte[] updatedImage = ImagingApi.grayscaleImage(request);
        uploadImageToCloudExample(updatedImage, getModifiedSampleImageFileName(false, "bmp"));

        System.out.println();
    }

    /**
     * Grayscale an image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateGrayscaledImageFromRequestBody() throws Exception {
        System.out.println("Grayscales the image from request body");

        String storage = null; // We are using default Cloud Storage
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image)

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateGrayscaledImageRequest request = new CreateGrayscaledImageRequest(inputStream, outPath, storage);

        System.out.println(String.format("Call CreateGrayscaledImageRequest"));

        byte[] updatedImage = ImagingApi.createGrayscaledImage(request);
        saveUpdatedSampleImageToOutput(updatedImage, true, "bmp");

        System.out.println();
    }
}

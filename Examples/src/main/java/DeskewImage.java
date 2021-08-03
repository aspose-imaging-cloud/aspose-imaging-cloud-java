/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DeskewImage.java">
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

import com.aspose.imaging.cloud.sdk.model.requests.CreateDeskewedImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.DeskewImageRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Deskew image example.
 */
public class DeskewImage extends ImagingBase {
    /**
     * Initializes a new instance of the DeskewImage class
     *
     * @param imagingApi The imaging API.
     */
    public DeskewImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Deskew image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected java.lang.String getSampleImageFileName() {
        return "DeskewSampleImage.tif";
    }

    /**
     * Deskews the image from cloud storage.
     *
     * @throws Exception
     */
    public void DeskewImageFromStorage() throws Exception {
        System.out.println("Deskews the image from cloud storage");

        uploadSampleImageToCloud();

        Boolean resizeProportionally = true;
        String bkColor = "white";
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        DeskewImageRequest request = new DeskewImageRequest(getSampleImageFileName(), resizeProportionally, bkColor, folder, storage);

        System.out.println(String.format("Call DeskewImage with params: resizeProportionally: %s, bkColor: %s", resizeProportionally, bkColor));

        byte[] updatedImage = ImagingApi.deskewImage(request);
        saveUpdatedSampleImageToOutput(updatedImage, false, "bmp");

        System.out.println();
    }

    /**
     * Deskew an existing image, and upload updated image to Cloud Storage.
     *
     * @throws Exception
     */
    public void DeskewImageAndUploadToStorage() throws Exception {
        System.out.println("Deskews the image and upload to cloud storage");

        uploadSampleImageToCloud();

        Boolean resizeProportionally = true;
        String bkColor = "white";
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        DeskewImageRequest request = new DeskewImageRequest(getSampleImageFileName(), resizeProportionally, bkColor, folder, storage);

        System.out.println(String.format("Call DeskewImage with params: resizeProportionally: %s, bkColor: %s", resizeProportionally, bkColor));

        byte[] updatedImage = ImagingApi.deskewImage(request);
        uploadImageToCloudExample(updatedImage, getModifiedSampleImageFileName(false, "bmp"));

        System.out.println();
    }

    /**
     * Deskew an image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateDeskewedImageFromRequestBody() throws Exception {
        System.out.println("Deskews the image from request body");

        Boolean resizeProportionally = true;
        String bkColor = "white";
        String storage = null; // We are using default Cloud Storage
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image)

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateDeskewedImageRequest request = new CreateDeskewedImageRequest(inputStream, resizeProportionally, bkColor, outPath, storage);

        System.out.println(String.format("Call CreateDeskewedImageRequest with params: resizeProportionally: %s, bkColor: %s", resizeProportionally, bkColor));

        byte[] updatedImage = ImagingApi.createDeskewedImage(request);
        saveUpdatedSampleImageToOutput(updatedImage, true, "bmp");

        System.out.println();
    }
}

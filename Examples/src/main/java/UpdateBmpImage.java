/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UpdateBmpImage.java">
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

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.CreateModifiedBmpRequest;
import com.aspose.imaging.cloud.sdk.model.requests.ModifyBmpRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Update BMP image example.
 */
public class UpdateBmpImage extends ImagingBase {
    /**
     * Initializes a new instance of the UpdateBmpImage class.
     *
     * @param imagingApi The imaging API.
     */
    public UpdateBmpImage(ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Update BMP image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "UpdateBmpSampleImage.bmp";
    }

    /**
     * Update parameters of a BMP image. The image is saved in the cloud.
     *
     * @throws Exception
     */
    public void ModifyBmpFromStorage() throws Exception {
        System.out.println("Update parameters of a BMP image from cloud storage");

        // Upload local image to Cloud Storage
        uploadSampleImageToCloud();

        Integer bitsPerPixel = 32;
        Integer horizontalResolution = 300;
        Integer verticalResolution = 300;
        Boolean fromScratch = null;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ModifyBmpRequest request = new ModifyBmpRequest(
                getSampleImageFileName(), bitsPerPixel, horizontalResolution, verticalResolution,
                fromScratch, folder, storage);

        System.out.println(String.format("Call ModifyBmp with params: bits per pixel: %s, horizontal resolution: %s, vertical resolution: %s", bitsPerPixel, horizontalResolution, verticalResolution));

        byte[] updatedImage = ImagingApi.modifyBmp(request);
        // Save updated image to local storage
        saveUpdatedSampleImageToOutput(updatedImage, false, null);

        System.out.println();
    }

    /**
     * Update parameters of a BMP image, and upload updated image to Cloud Storage.
     */
    public void ModifyBmpAndUploadToStorage() throws Exception {
        System.out.println("Update parameters of a BMP image and upload to cloud storage");

        // Upload local image to Cloud Storage
        uploadSampleImageToCloud();

        Integer bitsPerPixel = 32;
        Integer horizontalResolution = 300;
        Integer verticalResolution = 300;
        Boolean fromScratch = null;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ModifyBmpRequest request = new ModifyBmpRequest(
                getSampleImageFileName(), bitsPerPixel, horizontalResolution, verticalResolution,
                fromScratch, folder, storage);

        System.out.println(String.format("Call ModifyBmp with params: bits per pixel: %s, horizontal resolution: %s, vertical resolution: %s", bitsPerPixel, horizontalResolution, verticalResolution));

        byte[] updatedImage = ImagingApi.modifyBmp(request);
        uploadImageToCloud(getModifiedSampleImageFileName(false, null), updatedImage);

        System.out.println();
    }

    /**
     * Update parameters of a BMP image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateModifiedBmpFromRequestBody() throws Exception {
        System.out.println("Update parameters of a BMP image from request body");

        Integer bitsPerPixel = 32;
        Integer horizontalResolution = 300;
        Integer verticalResolution = 300;
        Boolean fromScratch = null;
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateModifiedBmpRequest request = new CreateModifiedBmpRequest(inputStream, bitsPerPixel, horizontalResolution, verticalResolution, fromScratch, outPath, storage);

        System.out.println(String.format("Call CreateModifiedBmp with params: bits per pixel: %s, horizontal resolution:%s, vertical resolution: %s", bitsPerPixel, horizontalResolution, verticalResolution));

        byte[] updatedImage = ImagingApi.createModifiedBmp(request);
        saveUpdatedSampleImageToOutput(updatedImage, true, null);

        System.out.println();
    }
}

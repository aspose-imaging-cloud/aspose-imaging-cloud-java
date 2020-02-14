/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UpdateJpegImage.java">
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

import com.aspose.imaging.cloud.sdk.model.requests.CreateModifiedJpegRequest;
import com.aspose.imaging.cloud.sdk.model.requests.ModifyJpegRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Update JPEG image example.
 */
public class UpdateJpegImage extends ImagingBase {
    /**
     * Initializes a new instance of the UpdateJpegImage class
     *
     * @param imagingApi The imaging API.
     */
    public UpdateJpegImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Update JPEG image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "UpdateJPEGSampleImage.jpg";
    }

    /**
     * Update parameters of existing JPEG image. The image is saved in the cloud.
     *
     * @throws Exception
     */
    public void ModifyJpegFromStorage() throws Exception {
        System.out.println("Update parameters of a JPEG image from cloud storage");

        uploadSampleImageToCloud();

        Integer quality = 65;
        String compressionType = "progressive";
        Boolean fromScratch = null;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ModifyJpegRequest modifyJpegRequest = new ModifyJpegRequest(getSampleImageFileName(), quality, compressionType,
                fromScratch, folder, storage);

        System.out.println(String.format("Call ModifyJpeg with params: quality: %s, compression type: %s", quality, compressionType));

        byte[] updatedImage = ImagingApi.modifyJpeg(modifyJpegRequest);
        saveUpdatedSampleImageToOutput(updatedImage, false, null);

        System.out.println();
    }

    /**
     * Update parameters of existing JPEG image, and upload updated image to Cloud Storage.
     *
     * @throws Exception
     */
    public void ModifyJpegAndUploadToStorage() throws Exception {
        System.out.println("Update parameters of a JPEG image and upload to cloud storage");

        uploadSampleImageToCloud();

        Integer quality = 65;
        String compressionType = "progressive";
        Boolean fromScratch = null;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ModifyJpegRequest modifyJpegRequest =
                new ModifyJpegRequest(getSampleImageFileName(), quality, compressionType, fromScratch, folder, storage);

        System.out.println(String.format("Call ModifyJpeg with params: quality: %s, compression type: %s", quality, compressionType));

        byte[] updatedImage = ImagingApi.modifyJpeg(modifyJpegRequest);
        uploadImageToCloud(getModifiedSampleImageFileName(false, null), updatedImage);

        System.out.println();
    }

    /**
     * Update parameters of existing JPEG image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateModifiedJpegFromRequestBody() throws Exception {
        System.out.println("Update parameters of a JPEG image from request body");

        Integer quality = 65;
        String compressionType = "progressive";
        Boolean fromScratch = null;
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateModifiedJpegRequest modifiedJpgRequest =
                new CreateModifiedJpegRequest(inputStream, quality, compressionType, fromScratch, outPath, storage);

        System.out.println(String.format("Call CreateModifiedJpegRequest with params: quality: %s, compression type: %s", quality, compressionType));

        byte[] updatedImage = ImagingApi.createModifiedJpeg(modifiedJpgRequest);
        saveUpdatedSampleImageToOutput(updatedImage, true, null);

        System.out.println();
    }
}

/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UpdatePsdImage.java">
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

import com.aspose.imaging.cloud.sdk.model.requests.CreateModifiedPsdRequest;
import com.aspose.imaging.cloud.sdk.model.requests.ModifyPsdRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Update PSD image example.
 */
public class UpdatePsdImage extends ImagingBase {
    /**
     * Initializes a new instance of the UpdatePsdImage class
     *
     * @param imagingApi The imaging API.
     */
    public UpdatePsdImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Update PSD image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "UpdatePSDSampleImage.psd";
    }

    /**
     * Update parameters of existing PSD image. The image is saved in the cloud.
     *
     * @throws Exception
     */
    public void ModifyPsdFromStorage() throws Exception {
        System.out.println("Update parameters of a PSD image from cloud storage");

        uploadSampleImageToCloud();

        Integer channelsCount = 3;
        String compressionMethod = "raw";
        Boolean fromScratch = null;
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ModifyPsdRequest modifyPsdRequest =
                new ModifyPsdRequest(getSampleImageFileName(), channelsCount, compressionMethod, fromScratch, folder, storage);

        System.out.println(String.format("Call ModifyPsd with params: channels count: %s, compression method: %s", channelsCount, compressionMethod));

        byte[] updatedImage = ImagingApi.modifyPsd(modifyPsdRequest);
        saveUpdatedSampleImageToOutput(updatedImage, false, null);

        System.out.println();
    }

    /**
     * Update parameters of existing PSD image, and upload updated image to Cloud Storage.
     *
     * @throws Exception
     */
    public void ModifyPsdAndUploadToStorage() throws Exception {
        System.out.println("Update parameters of a PSD image and upload to cloud storage");

        uploadSampleImageToCloud();

        Integer channelsCount = 3;
        String compressionMethod = "raw";
        Boolean fromScratch = null;
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ModifyPsdRequest modifyPsdRequest =
                new ModifyPsdRequest(getSampleImageFileName(), channelsCount, compressionMethod, fromScratch, folder, storage);

        System.out.println(String.format("Call ModifyPsd with params: channels count: %s, compression method: %s", channelsCount, compressionMethod));

        byte[] updatedImage = ImagingApi.modifyPsd(modifyPsdRequest);
        uploadImageToCloudExample(updatedImage, getModifiedSampleImageFileName(false, null));

        System.out.println();
    }

    /**
     * Update parameters of existing PSD image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateModifiedPsdFromRequestBody() throws Exception {
        System.out.println("Update parameters of a PSD image from request body");


        Integer channelsCount = 3;
        String compressionMethod = "raw";
        Boolean fromScratch = null;
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateModifiedPsdRequest modifiedPsdRequest =
                new CreateModifiedPsdRequest(inputStream, channelsCount,
                        compressionMethod, fromScratch, outPath, storage);

        System.out.println(String.format("Call CreateModifiedPsdRequest with params: channels count: %s, compression method: %s", channelsCount, compressionMethod));

        byte[] updatedImage = ImagingApi.createModifiedPsd(modifiedPsdRequest);
        saveUpdatedSampleImageToOutput(updatedImage, true, null);

        System.out.println();
    }
}

/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UpdateWebPImage.java">
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

import com.aspose.imaging.cloud.sdk.model.requests.CreateModifiedWebPRequest;
import com.aspose.imaging.cloud.sdk.model.requests.ModifyWebPRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * WEBP image example.
 */
public class UpdateWebPImage extends ImagingBase {
    /**
     * Initializes a new instance of the UpdateWebPImage class
     *
     * @param imagingApi The imaging API.
     */
    public UpdateWebPImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Crop image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "WEBPSampleImage.webp";
    }

    /**
     * Update parameters of existing WEBP image. The image is saved in the cloud.
     *
     * @throws Exception
     */
    public void ModifyWebPFromStorage() throws Exception {
        System.out.println("Update parameters of a WEBP image from cloud storage");

        uploadSampleImageToCloud();

        Boolean lossless = true;
        Integer quality = 90;
        Integer animLoopCount = 5;
        String animBackgroundColor = "gray";
        Boolean fromScratch = null;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ModifyWebPRequest getImageWebPRequest = new ModifyWebPRequest(getSampleImageFileName(), lossless, quality,
                animLoopCount, animBackgroundColor, fromScratch, folder, storage);

        System.out.println(String.format("Call ModifyWebP with params: lossless: %s, quality: %s, anim loop count: %s, anim background color: %s", lossless, quality, animLoopCount, animBackgroundColor));

        byte[] updatedImage = ImagingApi.modifyWebP(getImageWebPRequest);
        saveUpdatedSampleImageToOutput(updatedImage, false, null);

        System.out.println();
    }

    /**
     * Update parameters of existing WEBP image, and upload updated image to Cloud Storage.
     *
     * @throws Exception
     */
    public void ModifyWebPAndUploadToStorage() throws Exception {
        System.out.println("Update parameters of a WEBP image and upload to cloud storage");

        uploadSampleImageToCloud();

        Boolean lossless = true;
        Integer quality = 90;
        Integer animLoopCount = 5;
        String animBackgroundColor = "gray";
        Boolean fromScratch = null;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ModifyWebPRequest getImageWebPRequest = new ModifyWebPRequest(getSampleImageFileName(), lossless, quality,
                animLoopCount, animBackgroundColor, fromScratch, folder, storage);

        System.out.println(String.format("Call ModifyWebP with params: lossless: %s, quality: %s, anim loop count: %s, anim background color: %s", lossless, quality, animLoopCount, animBackgroundColor));

        byte[] updatedImage = ImagingApi.modifyWebP(getImageWebPRequest);
        uploadImageToCloud(getModifiedSampleImageFileName(false, null), updatedImage);

        System.out.println();
    }

    /// <summary>
    /// Update parameters of existing Webp image. asposelogo.webpImage data is passed in a request stream.
    /// </summary>
    public void CreateModifiedWebPFromRequestBody() throws Exception {
        System.out.println("Update parameters of a WEBP image from request body");

        Boolean lossless = true;
        Integer quality = 90;
        Integer animLoopCount = 5;
        String animBackgroundColor = "gray";
        Boolean fromScratch = null;
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateModifiedWebPRequest modifiedImageWebPRequest = new CreateModifiedWebPRequest(inputStream, lossless, quality,
                animLoopCount, animBackgroundColor, fromScratch, outPath, storage);

        System.out.println(String.format("Call CreateModifiedWebPRequest with params: lossless: %s, quality: %s, anim loop count: %s, anim background color: %s", lossless, quality, animLoopCount, animBackgroundColor));

        byte[] updatedImage = ImagingApi.createModifiedWebP(modifiedImageWebPRequest);
        saveUpdatedSampleImageToOutput(updatedImage, true, null);

        System.out.println();
    }
}

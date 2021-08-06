/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UpdateWmfImage.java">
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

import com.aspose.imaging.cloud.sdk.model.requests.CreateModifiedWmfRequest;
import com.aspose.imaging.cloud.sdk.model.requests.ModifyWmfRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * WMF image example.
 */
public class UpdateWmfImage extends ImagingBase {
    /**
     * Initializes a new instance of the UpdateWmfImage class
     *
     * @param imagingApi The imaging API.
     */
    public UpdateWmfImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Update WMF image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "WMFSampleImage.wmf";
    }

    /**
     * Process existing WMF image using given parameters. The image is saved in the cloud.
     *
     * @throws Exception
     */
    public void ModifyWmfFromStorage() throws Exception {
        System.out.println("Update parameters of a WMF image from cloud storage");

        uploadSampleImageToCloud();

        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        Integer borderX = 50;
        Integer borderY = 50;
        Boolean fromScratch = null;
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage

        String storage = null; // We are using default Cloud Storage
        String exportFormat = "png";

        ModifyWmfRequest getImageWmfRequest =
                new ModifyWmfRequest(getSampleImageFileName(), bkColor, pageWidth, pageHeight,
                        borderX, borderY, fromScratch, folder,
                        storage, exportFormat);

        System.out.println(String.format("Call ModifyWmf with params: background color: %s, page width: %s, page height: %s, border X: %s, border Y: %s", bkColor, pageWidth, pageHeight, borderX, borderY));

        byte[] updatedImage = ImagingApi.modifyWmf(getImageWmfRequest);
        saveUpdatedSampleImageToOutput(updatedImage, false, null);

        System.out.println();
    }

    /**
     * Process existing WMF image using given parameters, and upload updated image to Cloud Storage.
     *
     * @throws Exception
     */
    public void ModifyWmfAndUploadToStorage() throws Exception {
        System.out.println("Update parameters of a WMF image and upload to cloud storage");

        uploadSampleImageToCloud();

        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        Integer borderX = 50;
        Integer borderY = 50;
        Boolean fromScratch = null;
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage

        String storage = null; // We are using default Cloud Storage
        String exportFormat = "png";

        ModifyWmfRequest getImageWmfRequest =
                new ModifyWmfRequest(getSampleImageFileName(), bkColor, pageWidth, pageHeight,
                        borderX, borderY, fromScratch, folder,
                        storage, exportFormat);

        System.out.println(String.format("Call ModifyWmf with params: background color: %s, page width: %s, page height: %s, border X: %s, border Y: %s", bkColor, pageWidth, pageHeight, borderX, borderY));

        byte[] updatedImage = ImagingApi.modifyWmf(getImageWmfRequest);
        uploadImageToCloudExample(updatedImage, getModifiedSampleImageFileName(false, null));

        System.out.println();
    }

    /**
     * Process existing WMF image using given parameters. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateModifiedWmfFromRequestBody() throws Exception {
        System.out.println("Update parameters of a WMF image from request body");

        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        Integer borderX = 50;
        Integer borderY = 50;
        Boolean fromScratch = null;
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
        String storage = null; // We are using default Cloud Storage
        String exportFormat = "png";

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateModifiedWmfRequest postImageWmfRequest =
                new CreateModifiedWmfRequest(inputStream, bkColor, pageWidth,
                        pageHeight, borderX, borderY, fromScratch, outPath,
                        storage, exportFormat);

        System.out.println(String.format("Call ModifyWmf with params: background color: %s, page width: %s, page height: %s, border X: %s, border Y: %s", bkColor, pageWidth, pageHeight, borderX, borderY));

        byte[] updatedImage = ImagingApi.createModifiedWmf(postImageWmfRequest);
        saveUpdatedSampleImageToOutput(updatedImage, true, null);

        System.out.println();
    }
}

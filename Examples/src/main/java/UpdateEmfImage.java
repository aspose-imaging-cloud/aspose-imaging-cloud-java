/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UpdateEmfImage.java">
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


import com.aspose.imaging.cloud.sdk.model.requests.CreateModifiedEmfRequest;
import com.aspose.imaging.cloud.sdk.model.requests.ModifyEmfRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Update EMF image example.
 */
public class UpdateEmfImage extends ImagingBase {
    /**
     * Initializes a new instance of the UpdateEmfImage class
     *
     * @param imagingApi The imaging API.
     */
    public UpdateEmfImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Update EMF image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "UpdateEMFSampleImage.emf";
    }

    /**
     * Modifies the EMF from storage.
     *
     * @throws Exception
     */
    public void ModifyEmfFromStorage() throws Exception {
        System.out.println("Update parameters of a EMF image");

        uploadSampleImageToCloud();

        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        Integer borderX = 50;
        Integer borderY = 50;
        String format = "png";
        Boolean fromScratch = null;
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage
        String storage = null; // As we are using default Cloud Storage

        ModifyEmfRequest request = new ModifyEmfRequest(
                getSampleImageFileName(), bkColor, pageWidth, pageHeight, borderX, borderY,
                fromScratch, folder, storage, format);

        System.out.println(String.format("Call ModifyEmf with params: background color: %s, width: %s, height: %s, border x: %s, border y: %s, format: %s", bkColor, pageWidth, pageHeight, borderX, borderY, format));

        byte[] updatedImage = ImagingApi.modifyEmf(request);
        saveUpdatedSampleImageToOutput(updatedImage, false, format);

        System.out.println();
    }

    /**
     * Process existing EMF image using given parameters, and upload updated image to Cloud Storage.
     *
     * @throws Exception
     */
    public void ModifyEmfAndUploadToStorage() throws Exception {
        System.out.println("Update parameters of a EMF image and upload to cloud storage");

        uploadSampleImageToCloud();

        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        Integer borderX = 50;
        Integer borderY = 50;
        String format = "png";
        Boolean fromScratch = null;
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage
        String storage = null; // As we are using default Cloud Storage

        ModifyEmfRequest request = new ModifyEmfRequest(
                getSampleImageFileName(), bkColor, pageWidth, pageHeight, borderX, borderY,
                fromScratch, folder, storage, format);

        System.out.println(String.format("Call ModifyEmf with params: background color: %s, width: %s, height: %s, border x: %s, border y: %s, format: %s", bkColor, pageWidth, pageHeight, borderX, borderY, format));

        byte[] updatedImage = ImagingApi.modifyEmf(request);
        uploadImageToCloudExample(updatedImage, getModifiedSampleImageFileName(false, format));

        System.out.println();
    }

    /**
     * Rasterize EMF image to PNG using given parameters. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateModifiedEmfFromRequestBody() throws Exception {
        System.out.println("Update parameters of a EMF image from request body");

        String bkColor = "gray";
        Integer pageWidth = 300;
        Integer pageHeight = 300;
        Integer borderX = 50;
        Integer borderY = 50;
        String format = "png";
        Boolean fromScratch = null;
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
        String storage = null; // As we are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateModifiedEmfRequest request = new CreateModifiedEmfRequest(inputStream, bkColor, pageWidth, pageHeight,
                borderX, borderY, fromScratch, outPath, storage, format);

        System.out.println(String.format("Call CreateModifiedEmfRequest with params: background color: %s, width: %s, height: %s, border x: %s, border y: %s, format: %s", bkColor, pageWidth, pageHeight, borderX, borderY, format));

        byte[] updatedImage = ImagingApi.createModifiedEmf(request);
        saveUpdatedSampleImageToOutput(updatedImage, true, format);

        System.out.println();
    }
}

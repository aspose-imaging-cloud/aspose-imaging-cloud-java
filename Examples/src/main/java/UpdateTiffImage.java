/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UpdateTiffImage.java">
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

import com.aspose.imaging.cloud.sdk.model.requests.*;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * TIFF image example.
 */
public class UpdateTiffImage extends ImagingBase {
    /**
     * Initializes a new instance of the UpdateTiffImage class
     *
     * @param imagingApi The imaging API.
     */
    public UpdateTiffImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("TIFF image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "TiffSampleImage.tiff";
    }

    /**
     * Update parameters of TIFF image. The image is saved in the cloud.
     *
     * @throws Exception
     */
    public void ModifyTiffFromStorage() throws Exception {
        System.out.println("Update parameters of a TIFF image from cloud storage");

        uploadSampleImageToCloud();

        // Update parameters of TIFF image
        String compression = "adobedeflate";
        String resolutionUnit = "inch";
        Integer bitDepth = 1;
        Double horizontalResolution = 150.0;
        Double verticalResolution = 150.0;
        Boolean fromScratch = null;
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ModifyTiffRequest getImageTiffRequest =
                new ModifyTiffRequest(getSampleImageFileName(), bitDepth, compression, resolutionUnit,
                        horizontalResolution, verticalResolution, fromScratch, folder, storage);

        System.out.println(String.format("Call ModifyTiff with params: compression: %s, resolution unit: %s, bit depth: %s, horizontal resolution: %s, vertical resolution: %s", compression, resolutionUnit, bitDepth, horizontalResolution, verticalResolution));

        byte[] updatedImage = ImagingApi.modifyTiff(getImageTiffRequest);
        saveUpdatedSampleImageToOutput(updatedImage, false, null);

        System.out.println();
    }

    /**
     * Update parameters of TIFF image, and upload updated image to Cloud Storage.
     *
     * @throws Exception
     */
    public void ModifyTiffAndUploadToStorage() throws Exception {
        System.out.println("Update parameters of a TIFF image and upload to cloud storage");

        uploadSampleImageToCloud();

        // Update parameters of TIFF image
        String compression = "adobedeflate";
        String resolutionUnit = "inch";
        Integer bitDepth = 1;
        Double horizontalResolution = 150.0;
        Double verticalResolution = 150.0;
        Boolean fromScratch = null;
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ModifyTiffRequest getImageTiffRequest =
                new ModifyTiffRequest(getSampleImageFileName(), bitDepth, compression, resolutionUnit,
                        horizontalResolution, verticalResolution, fromScratch, folder, storage);

        System.out.println(String.format("Call ModifyTiff with params: compression: %s, resolution unit: %s, bit depth: %s, horizontal resolution: %s, vertical resolution: %s", compression, resolutionUnit, bitDepth, horizontalResolution, verticalResolution));

        byte[] updatedImage = ImagingApi.modifyTiff(getImageTiffRequest);
        uploadImageToCloudExample(updatedImage, getModifiedSampleImageFileName(false, null));

        System.out.println();
    }

    /**
     * Update parameters of TIFF image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateModifiedTiffFromRequestBody() throws Exception {
        System.out.println("Update parameters of a TIFF image from request body");

        String compression = "adobedeflate";
        String resolutionUnit = "inch";
        Integer bitDepth = 1;
        Double horizontalResolution = 150.0;
        Double verticalResolution = 150.0;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateModifiedTiffRequest postImageTiffRequest = new CreateModifiedTiffRequest(inputStream, bitDepth, compression,
                resolutionUnit, horizontalResolution, verticalResolution, fromScratch, outPath, storage);

        System.out.println(String.format("Call CreateModifiedTiffRequest with params: compression: %s, resolution unit: %s, bit depth: %s, horizontal resolution: %s, vertical resolution: %s", compression, resolutionUnit, bitDepth, horizontalResolution, verticalResolution));

        byte[] updatedImage = ImagingApi.createModifiedTiff(postImageTiffRequest);
        saveUpdatedSampleImageToOutput(updatedImage, true, null);

        System.out.println();
    }

    /**
     * Update parameters of TIFF image according to fax parameters.
     *
     * @throws Exception
     */
    public void ConvertTiffToFaxFromStorage() throws Exception {
        System.out.println("Update parameters of TIFF image according to fax parameters.");

        uploadSampleImageToCloud();

        // Update TIFF Image parameters according to fax parameters
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ConvertTiffToFaxRequest getTiffToFaxRequest = new ConvertTiffToFaxRequest(
                getSampleImageFileName(), storage, folder);

        System.out.println("Call ConvertTiffToFax");

        byte[] updatedImage = ImagingApi.convertTiffToFax(getTiffToFaxRequest);
        saveUpdatedImageToOutput("ConvertTiffToFax.tiff", updatedImage);

        System.out.println();
    }

    /**
     * Update parameters of TIFF image according to fax parameters. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void ConvertTiffToFaxFromRequestBody() throws Exception {
        System.out.println("Update parameters of TIFF image from request body according to fax parameters.");

        uploadSampleImageToCloud();

        // Update TIFF Image parameters according to fax parameters
        String outPath = null;
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateFaxTiffRequest createFaxTiffRequest = new CreateFaxTiffRequest(
                inputStream, outPath, storage);

        System.out.println("Call CreateFaxTiff");

        byte[] updatedImage = ImagingApi.createFaxTiff(createFaxTiffRequest);
        saveUpdatedSampleImageToOutput(updatedImage, true, null);

        System.out.println();
    }

    /**
     * Appends existing TIFF image to another existing TIFF image (i.e. merges TIFF images).
     *
     * @throws Exception
     */
    public void AppendTiffFromStorage() throws Exception {
        System.out.println(" Appends existing TIFF image to another existing TIFF image.");

        String appendFileName = "Append.tiff"; // Image file name to be appended to original one

        uploadSampleImageToCloud();

        // Upload file be appended to cloud storage
        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, appendFileName));
        uploadImageToCloudExample(inputStream, appendFileName);

        // Update TIFF Image parameters according to fax parameters
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        AppendTiffRequest request = new AppendTiffRequest(getSampleImageFileName(), appendFileName, storage, folder);

        System.out.println("Call AppendTiff");

        this.ImagingApi.appendTiff(request);

        // Download updated file to local storage
        DownloadFileRequest downloadFileRequest = new DownloadFileRequest(
                Paths.get(CloudImageFolder, getSampleImageFileName()).toString(), storage, null);
        byte[] updatedImage = ImagingApi.downloadFile(downloadFileRequest);
        saveUpdatedImageToOutput("AppendToTiff.tiff", updatedImage);

        System.out.println();
    }
}

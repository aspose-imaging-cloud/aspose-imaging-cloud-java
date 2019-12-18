/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ExportImage.java">
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

import com.aspose.imaging.cloud.sdk.model.requests.CreateSavedImageAsRequest;
import com.aspose.imaging.cloud.sdk.model.requests.SaveImageAsRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Export image example.
 */
public class ExportImage extends ImagingBase {
    /**
     * Initializes a new instance of the ExportImage class.
     *
     * @param imagingApi The imaging API.
     */
    public ExportImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Export image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "ExportSampleImage.bmp";
    }

    /**
     * Export an image to another format.
     *
     * @throws Exception
     */
    public void SaveImageAsFromStorage() throws Exception {
        System.out.println("Export an image to another format");

        uploadSampleImageToCloud();

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-Export(SaveAs)
        // for possible output formats
        String format = "pdf";
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // Cloud Storage name

        SaveImageAsRequest request = new SaveImageAsRequest(getSampleImageFileName(), format, folder, storage);

        System.out.println("Call SaveImageAs with params: format: " + format);

        byte[] updatedImage = ImagingApi.saveImageAs(request);
        saveUpdatedSampleImageToOutput(updatedImage, false, format);

        System.out.println();
    }

    /**
     * Export an image to another format.
     *
     * @throws Exception
     */
    public void SaveImageAsAndUploadToStorage() throws Exception {
        System.out.println("Export an image to another format and upload to cloud storage");

        uploadSampleImageToCloud();

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-Export(SaveAs)
        // for possible output formats
        String format = "pdf";
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // Cloud Storage name

        SaveImageAsRequest request = new SaveImageAsRequest(getSampleImageFileName(), format, folder, storage);

        System.out.println("Call SaveImageAs with params: format: " + format);

        byte[] updatedImage = ImagingApi.saveImageAs(request);
        uploadImageToCloud(getModifiedSampleImageFileName(false, format), updatedImage);

        System.out.println();
    }

    /// <summary>
    /// Export an image to another format. Image data is passed in a request stream.
    /// </summary>
    public void CreateSavedImageAsFromRequestBody() throws Exception {
        System.out.println("Export an image to another format. Image data is passed in a request body");

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-Export(SaveAs)
        // for possible output formats
        String format = "pdf";
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
        String storage = null; // Cloud Storage name

        CreateSavedImageAsRequest request = new CreateSavedImageAsRequest(inputStream, format, outPath, storage);

        System.out.println("Call CreateSavedImageAs with params: format: " + format);

        byte[] updatedImage = ImagingApi.createSavedImageAs(request);
        saveUpdatedSampleImageToOutput(updatedImage, true, format);

        System.out.println();

    }
}

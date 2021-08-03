/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CropImage.java">
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

import com.aspose.imaging.cloud.sdk.model.requests.CreateCroppedImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.CropImageRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Crop image example.
 */
public class CropImage extends ImagingBase {
    /**
     * Initializes a new instance of the CropImage class
     *
     * @param imagingApi The imaging API.
     */
    public CropImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Crop image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected java.lang.String getSampleImageFileName() {
        return "CropSampleImage.bmp";
    }

    /**
     * Crops the image from cloud storage.
     *
     * @throws Exception
     */
    public void CropImageFromStorage() throws Exception {
        System.out.println("Crops the image from cloud storage");

        uploadSampleImageToCloud();

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-Crop
        // for possible output formats
        String format = "jpg"; // Resulting image format.
        Integer x = 10;
        Integer y = 10;
        Integer width = 100;
        Integer height = 150;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        CropImageRequest request = new CropImageRequest(getSampleImageFileName(), x, y, width, height, format, folder, storage);

        System.out.println(String.format("Call CropImage with params: x: %s, y: %s, width: %s, height: %s", x, y, width, height));

        byte[] updatedImage = ImagingApi.cropImage(request);
        saveUpdatedSampleImageToOutput(updatedImage, false, format);

        System.out.println();
    }

    /**
     * Crop an existing image, and upload updated image to Cloud Storage.
     *
     * @throws Exception
     */
    public void CropImageAndUploadToStorage() throws Exception {
        System.out.println("Crops the image and upload to cloud storage");

        uploadSampleImageToCloud();

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-Crop
        // for possible output formats
        String format = "jpg"; // Resulting image format.
        Integer x = 10;
        Integer y = 10;
        Integer width = 100;
        Integer height = 150;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        CropImageRequest request = new CropImageRequest(getSampleImageFileName(), x, y, width, height, format, folder, storage);

        System.out.println(String.format("Call CropImage with params: x: %s, y: %s, width: %s, height: %s", x, y, width, height));

        byte[] updatedImage = ImagingApi.cropImage(request);
        uploadImageToCloudExample(updatedImage, getModifiedSampleImageFileName(false, format));

        System.out.println();
    }

    /**
     * Crop an image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateCroppedImageFromRequestBody() throws Exception {
        System.out.println("Crops the image from request body");

        // Please refer to https://docs.aspose.cloud/display/imagingcloud/Supported+File+Formats#SupportedFileFormats-Crop
        // for possible output formats
        String format = "jpg"; // Resulting image format.
        Integer x = 10;
        Integer y = 10;
        Integer width = 100;
        Integer height = 150;
        String storage = null; // We are using default Cloud Storage
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image)

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateCroppedImageRequest request = new CreateCroppedImageRequest(inputStream, x, y, width, height, format, outPath, storage);

        System.out.println(String.format("Call CreateCroppedImageRequest with params: x: %s, y: %s, width: %s, height: %s", x, y, width, height));

        byte[] updatedImage = ImagingApi.createCroppedImage(request);
        saveUpdatedSampleImageToOutput(updatedImage, true, format);

        System.out.println();
    }
}

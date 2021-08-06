/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UpdateJpeg2000Image.java">
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

import com.aspose.imaging.cloud.sdk.model.requests.CreateModifiedJpeg2000Request;
import com.aspose.imaging.cloud.sdk.model.requests.ModifyJpeg2000Request;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Update JPEG2000 image example.
 */
public class UpdateJpeg2000Image extends ImagingBase {
    /**
     * Initializes a new instance of the UpdateJpeg2000Image class
     *
     * @param imagingApi The imaging API.
     */
    public UpdateJpeg2000Image(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Update JPEG2000 image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "UpdateJPEG2000SampleImage.jp2";
    }

    /**
     * Update parameters of existing JPEG2000 image. The image is saved in the cloud.
     *
     * @throws Exception
     */
    public void ModifyJpeg2000FromStorage() throws Exception {
        System.out.println("Update parameters of a Jpeg2000 image from cloud storage");

        uploadSampleImageToCloud();

        String codec = "jp2";
        String comment = "Aspose";
        Boolean fromScratch = null;
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ModifyJpeg2000Request getImageJpeg2000Request =
                new ModifyJpeg2000Request(getSampleImageFileName(), comment, codec, fromScratch, folder, storage);

        System.out.println(String.format("Call ModifyJpeg2000 with params: codec: %s, comment: %s", codec, comment));

        byte[] updatedImage = ImagingApi.modifyJpeg2000(getImageJpeg2000Request);
        saveUpdatedSampleImageToOutput(updatedImage, false, null);

        System.out.println();
    }

    /**
     * Update parameters of existing JPEG2000 image, and upload updated image to Cloud Storage.
     *
     * @throws Exception
     */
    public void ModifyJpeg2000AndUploadToStorage() throws Exception {
        System.out.println("Update parameters of a Jpeg2000 image and upload to cloud storage");

        uploadSampleImageToCloud();

        String codec = "jp2";
        String comment = "Aspose";
        Boolean fromScratch = null;
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ModifyJpeg2000Request getImageJpeg2000Request =
                new ModifyJpeg2000Request(getSampleImageFileName(), comment, codec, fromScratch, folder, storage);

        System.out.println(String.format("Call ModifyJpeg2000 with params: codec: %s, comment: %s", codec, comment));

        byte[] updatedImage = ImagingApi.modifyJpeg2000(getImageJpeg2000Request);
        uploadImageToCloudExample(updatedImage, getModifiedSampleImageFileName(false, null));

        System.out.println();
    }

    /**
     * Update parameters of existing JPEG2000 image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateModifiedJpeg2000FromRequestBody() throws Exception {
        System.out.println("Update parameters of a Jpeg2000 image from request body");

        String codec = "jp2";
        String comment = "Aspose";
        Boolean fromScratch = null;
        String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateModifiedJpeg2000Request postImageJpeg2000Request =
                new CreateModifiedJpeg2000Request(inputStream, comment, codec, fromScratch, outPath, storage);

        System.out.println(String.format("Call CreateModifiedJpeg2000Request with params: codec: %s, comment: %s", codec, comment));

        byte[] updatedImage = ImagingApi.createModifiedJpeg2000(postImageJpeg2000Request);
        saveUpdatedSampleImageToOutput(updatedImage, true, null);

        System.out.println();
    }
}

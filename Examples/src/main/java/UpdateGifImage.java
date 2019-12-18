/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UpdateGifImage.java">
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


import com.aspose.imaging.cloud.sdk.model.requests.CreateModifiedGifRequest;
import com.aspose.imaging.cloud.sdk.model.requests.ModifyGifRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Update GIF image example.
 */
public class UpdateGifImage extends ImagingBase {
    /**
     * Initializes a new instance of the UpdateGifImage class
     *
     * @param imagingApi The imaging API.
     */
    public UpdateGifImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Update GIF image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "UpdateGIFSampleImage.gif";
    }

    /**
     * Update parameters of existing GIF image. The image is saved in the cloud.
     *
     * @throws Exception
     */
    public void ModifyGifFromStorage() throws Exception {
        System.out.println("Update parameters of a GIF image from cloud storage");

        uploadSampleImageToCloud();

        Integer backgroundColorIndex = 5;
        Integer colorResolution = 4;
        Boolean hasTrailer = true;
        Boolean interlaced = false;
        Boolean isPaletteSorted = true;
        Integer pixelAspectRatio = 4;
        Boolean fromScratch = null;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ModifyGifRequest getImageGifRequest = new ModifyGifRequest(getSampleImageFileName(), backgroundColorIndex,
                colorResolution, hasTrailer, interlaced, isPaletteSorted,
                pixelAspectRatio, fromScratch, folder, storage);

        System.out.println(String.format("Call ModifyGif with params: background color index: %s, color resolution: %s, has trailer: %s, interlaced: %s, is palette sorted: %s, pixel aspect ratio: %s", backgroundColorIndex, colorResolution, hasTrailer, interlaced, isPaletteSorted, pixelAspectRatio));

        byte[] updatedImage = ImagingApi.modifyGif(getImageGifRequest);
        saveUpdatedSampleImageToOutput(updatedImage, false, null);

        System.out.println();
    }

    /**
     * Update parameters of existing GIF image. The image is saved in the cloud.
     *
     * @throws Exception
     */
    public void ModifyGifAndUploadToStorage() throws Exception {
        System.out.println("Update parameters of a GIF image and upload to cloud storage");

        uploadSampleImageToCloud();

        Integer backgroundColorIndex = 5;
        Integer colorResolution = 4;
        Boolean hasTrailer = true;
        Boolean interlaced = false;
        Boolean isPaletteSorted = true;
        Integer pixelAspectRatio = 4;
        Boolean fromScratch = null;
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        ModifyGifRequest getImageGifRequest = new ModifyGifRequest(getSampleImageFileName(), backgroundColorIndex,
                colorResolution, hasTrailer, interlaced, isPaletteSorted,
                pixelAspectRatio, fromScratch, folder, storage);

        System.out.println(String.format("Call ModifyGif with params: background color index: %s, color resolution: %s, has trailer: %s, interlaced: %s, is palette sorted: %s, pixel aspect ratio: %s", backgroundColorIndex, colorResolution, hasTrailer, interlaced, isPaletteSorted, pixelAspectRatio));

        byte[] updatedImage = ImagingApi.modifyGif(getImageGifRequest);
        uploadImageToCloud(getModifiedSampleImageFileName(false, null), updatedImage);

        System.out.println();
    }

    /**
     * Update parameters of GIF image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void CreateModifiedGifFromRequestBody() throws Exception {
        System.out.println("Update parameters of a GIF image from request body");

        Integer backgroundColorIndex = 5;
        Integer colorResolution = 4;
        Boolean hasTrailer = true;
        Boolean interlaced = false;
        Boolean isPaletteSorted = true;
        Integer pixelAspectRatio = 4;
        Boolean fromScratch = null;
        String outPath = null;
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        CreateModifiedGifRequest postImageGifRequest = new CreateModifiedGifRequest(inputStream, backgroundColorIndex,
                colorResolution, hasTrailer, interlaced, isPaletteSorted, pixelAspectRatio,
                fromScratch, outPath, storage);

        System.out.println(String.format("Call CreateModifiedGifRequest with params: background color index: %s, color resolution: %s, has trailer: %s, interlaced: %s, is palette sorted: %s, pixel aspect ratio: %s", backgroundColorIndex, colorResolution, hasTrailer, interlaced, isPaletteSorted, pixelAspectRatio));

        byte[] updatedImage = ImagingApi.createModifiedGif(postImageGifRequest);
        saveUpdatedSampleImageToOutput(updatedImage, true, null);

        System.out.println();
    }
}

/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImageProperties.java">
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

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.ExtractImagePropertiesRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetImagePropertiesRequest;
import com.aspose.imaging.cloud.sdk.stablemodel.ImagingResponse;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Image properties example.
 */
public class ImageProperties extends ImagingBase {
    /**
     * Initializes a new instance of the ImageProperties class.
     *
     * @param imagingApi The imaging API.
     */
    public ImageProperties(ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Image properties example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "PropertiesOfSampleImage.tiff";
    }

    /**
     * Get properties of an image, which is store in the cloud.
     *
     * @throws Exception
     */
    public void GetImagePropertiesFromStorage() throws Exception {
        System.out.println("Get properties of an image in cloud storage");

        uploadSampleImageToCloud();

        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        GetImagePropertiesRequest getImagePropertiesRequest = new GetImagePropertiesRequest(
                getSampleImageFileName(), folder, storage);

        System.out.println("Call GetImageProperties");

        ImagingResponse imagingResponse = this.ImagingApi.getImageProperties(getImagePropertiesRequest);

        outputPropertiesToFile("ImageProperties.txt", imagingResponse);

        System.out.println();
    }

    /**
     * Get properties of an image. Image data is passed in a request stream.
     *
     * @throws Exception
     */
    public void ExtractImagePropertiesFromRequestBody() throws Exception {
        System.out.println("Get properties of an image from request body");

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        ExtractImagePropertiesRequest imagePropertiesRequest = new ExtractImagePropertiesRequest(inputStream);

        System.out.println("Call ExtractImageProperties");

        ImagingResponse imagingResponse = this.ImagingApi.extractImageProperties(imagePropertiesRequest);
        outputPropertiesToFile("ImagePropertiesFromRequest.txt", imagingResponse);

        System.out.println();
    }
}

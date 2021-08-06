/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ResizeImage.java">
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

import com.aspose.imaging.cloud.sdk.model.GaussianBlurFilterProperties;
import com.aspose.imaging.cloud.sdk.model.requests.FilterEffectImageRequest;

/**
 * Apply a filtering effect to an image.
 */
public class FilterImage extends ImagingBase {
    /**
     * Initializes a new instance of the FilterImage class
     *
     * @param imagingApi The imaging API.
     */
    public FilterImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Filter image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "FilterEffectSampleImage.psd";
    }

    /**
     * Applies  filtering effect to an image from cloud storage.
     *
     * @throws Exception
     */
    public void FilterImageFromStorage() throws Exception {
        System.out.println("Apply filtering effect to an image from cloud storage");

        uploadSampleImageToCloud();

        String filterType = "GaussianBlur";
        GaussianBlurFilterProperties filterProperties = new GaussianBlurFilterProperties() {{
            setRadius(4);
            setSigma(2.1);
        }};
        String format = "bmp";
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        FilterEffectImageRequest request = new FilterEffectImageRequest(getSampleImageFileName(), filterType,
                filterProperties, format, folder, storage);

        System.out.println(String.format("Call FilterEffectImage with params: filter type: %s, radius: %s, sigma: %s, format: %s",
                filterType, filterProperties.getRadius(), filterProperties.getSigma(), format));

        byte[] updatedImage = ImagingApi.filterEffectImage(request);
        saveUpdatedSampleImageToOutput(updatedImage, false, format);

        System.out.println();
    }

    /**
     * Applies  filtering effect to an image and uploads to Cloud Storage.
     *
     * @throws Exception
     */
    public void FilterImageAndUploadToStorage() throws Exception {
        System.out.println("Apply filtering effect to an image and upload to cloud storage");

        uploadSampleImageToCloud();

        String filterType = "GaussianBlur";
        GaussianBlurFilterProperties filterProperties = new GaussianBlurFilterProperties() {{
            setRadius(4);
            setSigma(2.1);
        }};
        String format = "bmp";
        String folder = CloudImageFolder; // Input file is saved at the Examples folder in the storage
        String storage = null; // We are using default Cloud Storage

        FilterEffectImageRequest request = new FilterEffectImageRequest(getSampleImageFileName(), filterType,
                filterProperties, format, folder, storage);

        System.out.println(String.format("Call FilterEffectImage with params: filter type: %s, radius: %s, sigma: %s, format: %s",
                filterType, filterProperties.getRadius(), filterProperties.getSigma(), format));

        byte[] updatedImage = ImagingApi.filterEffectImage(request);
        uploadImageToCloudExample(updatedImage, getModifiedSampleImageFileName(false, format));

        System.out.println();
    }
}

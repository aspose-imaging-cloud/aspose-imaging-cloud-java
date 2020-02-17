/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FindDuplicateImages.java">
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

package AI;

import com.aspose.imaging.cloud.sdk.model.ImageDuplicatesSet;
import com.aspose.imaging.cloud.sdk.model.requests.FindImageDuplicatesRequest;

/**
 * Find duplicate images example.
 */
public class FindDuplicateImages extends ImagingAiBase {

    /**
     * Initializes a new instance of the FindDuplicateImages class
     *
     * @param imagingApi The imaging API.
     */
    public FindDuplicateImages(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        System.out.println("Find duplicate images example:" + System.lineSeparator());
    }

    /**
     * Prepares the search context.
     *
     * @throws Exception
     */
    public void PrepareSearchContext() throws Exception {
        createSearchContext();

        String comparableImage = "ComparableImage.jpg";
        String comparingImageSimilarLess15 = "ComparingImageSimilar15.jpg";
        String comparingImageSimilarMore75 = "ComparingImageSimilar75.jpg";
        String[] images = {comparableImage, comparingImageSimilarLess15, comparingImageSimilarMore75};
        for (String imageName : images) {
            uploadImageToCloud(imageName, null);
        }

        createImageFeatures(comparableImage, false);
        createImageFeatures(comparingImageSimilarLess15, false);
        createImageFeatures(comparingImageSimilarMore75, false);

        System.out.println();
    }

    /**
     * Finds the image duplicates.
     *
     * @throws Exception
     */
    public void FindImageDuplicates() throws Exception {
        System.out.println("Finds the image duplicates");

        Double similarityThreshold = 70.0; // The similarity threshold
        String folder = CloudPath; // Path to input files
        String storage = null; // We are using default Cloud Storage

        FindImageDuplicatesRequest request = new FindImageDuplicatesRequest(SearchContextId, similarityThreshold, folder, storage);

        System.out.println("Call FindImageDuplicates with params: similarity threshold: " + similarityThreshold);

        ImageDuplicatesSet response = ImagingApi.findImageDuplicates(request);

        System.out.println("Duplicates Count: " + response.getDuplicates().size());
        System.out.println();
    }
}

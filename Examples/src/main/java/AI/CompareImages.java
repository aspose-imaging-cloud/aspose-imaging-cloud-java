/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CompareImages.java">
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

import com.aspose.imaging.cloud.sdk.model.SearchResultsSet;
import com.aspose.imaging.cloud.sdk.model.requests.CompareImagesRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Compare images example
 */
public class CompareImages extends ImagingAiBase {

    private final String ComparableImage = "ComparableImage.jpg";
    private final String ComparingImageSimilarMore75 = "ComparingImageSimilar75.jpg";

    /**
     * Initializes a new instance of the CompareImages class
     *
     * @param imagingApi Imaging API
     */
    public CompareImages(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        System.out.println("Compare images example:" + System.lineSeparator());
    }

    /**
     * Prepares the search context.
     *
     * @throws Exception
     */
    public void PrepareSearchContext() throws Exception {
        createSearchContext();

        // Upload images to Cloud Storage
        String[] images = {ComparableImage, ComparingImageSimilarMore75};
        for (String imageName : images) {
            // Upload local image to Cloud Storage
            uploadImageToCloud(imageName, null);
        }

        this.createImageFeatures(ComparableImage, false);
        this.createImageFeatures(ComparingImageSimilarMore75, false);

        System.out.println();
    }

    /**
     * Compares the two images in cloud.
     *
     * @throws Exception
     */
    public void CompareTwoImagesInCloud() throws Exception {
        System.out.println("Compares the two images in cloud storage:");

        // Compare two images
        String folder = CloudPath; // Folder with image to process
        String storage = null; // We are using default Cloud Storage

        CompareImagesRequest request = new CompareImagesRequest(SearchContextId, ComparableImage, null, ComparingImageSimilarMore75, folder, storage);

        System.out.println(String.format("Call CompareImages with params: image1: %s, image2: %s", ComparableImage, ComparingImageSimilarMore75));

        SearchResultsSet searchResults = ImagingApi.compareImages(request);

        Double similarity = searchResults.getResults().get(0).getSimilarity();
        System.out.println("Images Similarity: " + similarity);
        System.out.println();
    }

    /**
     * Compares the loaded image to image in cloud.
     *
     * @throws Exception
     */
    public void CompareLoadedImageToImageInCloud() throws Exception {
        System.out.println(" Compares the loaded image to image in cloud storage:");

        String comparingImageSimilarLess15 = "ComparingImageSimilar15.jpg";
        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, comparingImageSimilarLess15));
        CompareImagesRequest request = new CompareImagesRequest(SearchContextId, ComparableImage, inputStream, null, null, null);

        System.out.println("Call CompareImages with params: image:" + ComparableImage);

        SearchResultsSet searchResults = ImagingApi.compareImages(request);

        Double similarity = searchResults.getResults().get(0).getSimilarity();
        System.out.println("Images Similarity: " + similarity);

        System.out.println();
    }
}

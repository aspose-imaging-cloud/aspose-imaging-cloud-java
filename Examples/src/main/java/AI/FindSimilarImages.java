/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FindSimilarImages.java">
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

import com.aspose.imaging.cloud.sdk.model.SearchResult;
import com.aspose.imaging.cloud.sdk.model.SearchResultsSet;
import com.aspose.imaging.cloud.sdk.model.requests.CreateImageTagRequest;
import com.aspose.imaging.cloud.sdk.model.requests.FindImagesByTagsRequest;
import com.aspose.imaging.cloud.sdk.model.requests.FindSimilarImagesRequest;
import com.google.gson.Gson;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Find images example.
 */
public class FindSimilarImages extends ImagingAiBase {

    private final String ImagesPath = "FindSimilar";

    /**
     * Initializes a new instance of the ImagingAiBase class
     *
     * @param imagingApi
     */
    public FindSimilarImages(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        System.out.println("Find images example:" + System.lineSeparator());
    }

    /**
     * Prepares the search context.
     *
     * @throws Exception
     */
    public void PrepareSearchContext() throws Exception {
        createSearchContext();

        String[] images =
                {
                        "1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg",
                        "6.jpg", "7.jpg", "8.jpg", "9.jpg", "10.jpg"
                };

        for (String imageName : images) {
            uploadImageToCloud(imageName, ImagesPath);
        }

        createImageFeatures(ImagesPath, true);

        System.out.println();
    }

    /**
     * Finds the similar images.
     *
     * @throws Exception
     */
    public void FindImagesSimilar() throws Exception {
        System.out.println("Finds the similar images");

        String imageToFind = "4.jpg";
        String findImageId = Paths.get(ImagesPath, imageToFind).toString();
        Double similarityThreshold = 3.0; // The similarity threshold
        Integer maxCount = 3; // The maximum count
        String folder = CloudPath; // Path to input files
        String storage = null; // We are using default Cloud Storage

        FindSimilarImagesRequest request = new FindSimilarImagesRequest(SearchContextId, similarityThreshold, maxCount, null, findImageId, folder, storage);

        System.out.println(String.format("Call FindSimilarImages with params: similarity threshold: %s, max count: %s, image id: %S", similarityThreshold, maxCount, findImageId));

        SearchResultsSet response = ImagingApi.findSimilarImages(request);
        System.out.println("Results Count: " + response.getResults().size());
        System.out.println();
    }

    /**
     * Finds the images by tag.
     *
     * @throws Exception
     */
    public void FindImagesByTag() throws Exception {
        System.out.println("Finds the images by tag");

        String imageToFindByTag = "ComparingImageSimilar75.jpg";
        String fileName = imageToFindByTag;
        String tagName = "ImageTag";
        Double similarityThreshold = 60.0;
        Integer maxCount = 5;
        String folder = null; // Path to input files
        String storage = null; // We are using default Cloud Storage

        byte[] inputStream = Files.readAllBytes(Paths.get(ExampleImagesFolder, fileName));
        CreateImageTagRequest createTagRequest = new CreateImageTagRequest(inputStream, SearchContextId, tagName, folder, storage);

        System.out.println("Call CreateImageTag with params: tag name: " + tagName);

        ImagingApi.createImageTag(createTagRequest);

        List<String> tagsList = new ArrayList<>();
        tagsList.add(tagName);
        String tags = new Gson().toJson(tagsList);
        FindImagesByTagsRequest findRequest = new FindImagesByTagsRequest(tags, SearchContextId, similarityThreshold, maxCount, folder, storage);

        System.out.println(String.format("Call FindImagesByTagsRequest with params: similarity threshold: %s, max count: %s, tags: %s", similarityThreshold, maxCount, tags));

        SearchResultsSet findResponse = ImagingApi.findImagesByTags(findRequest);

        for (SearchResult searchResult : findResponse.getResults()) {
            System.out.println("ImageName: " + searchResult.getImageId() +
                    ", Similarity: " + searchResult.getSimilarity());
        }

        System.out.println();
    }
}

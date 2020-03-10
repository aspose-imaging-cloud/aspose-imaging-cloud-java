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
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.google.gson.Gson;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
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
            uploadImageToCloud(Paths.get(ImagesPath, imageName).toString(), null);
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
        String findImageId = Paths.get(CloudPath, imageToFind).toString();
        Double similarityThreshold = 60.0; // The similarity threshold
        Integer maxCount = 3; // The maximum count
        String folder = null;
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
        String folder = null;
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

    /**
     * Finds the similar images rom the URL source.
     *
     * @throws Exception
     */
    public void FindSimilarImagesFromUrl() throws Exception {
        System.out.println("Finds similar images from URL:");

        Double similarityThreshold = 30.0;
        Integer maxCount = 3;
        String folder = CloudPath; // Path to input files
        String storage = null; // We are using default Cloud Storage

        String imageSourceUrl = URLEncoder.encode("https://www.f1news.ru/interview/hamilton/140909.shtml", "UTF-8");

        // Add images from the website to the search context
        ImagingApi.createWebSiteImageFeatures(new CreateWebSiteImageFeaturesRequest(SearchContextId, imageSourceUrl, folder, storage));

        WaitIdle(SearchContextId);

        // Upload a sample file from that website
        // It will be resized to demonstrate search capabilities
        String imageName = CloudPath + "/" + "ReverseSearch.jpg";
        CreateSampleFile("https://cdn.f1ne.ws/userfiles/hamilton/140909.jpg", imageName, storage);

        // Find similar images in the search context
        SearchResultsSet findResponse = ImagingApi.findSimilarImages(new FindSimilarImagesRequest(SearchContextId, similarityThreshold, maxCount, null, imageName, folder, storage));

        System.out.println("Similar images found: " + findResponse.getResults().size());
        System.out.println("Similar image id: " + findResponse.getResults().get(0).getImageId());
        System.out.println("Similarity: " + findResponse.getResults().get(0).getSimilarity());
    }

    /**
     * Creates a sample file int he cloud; download file from the url; resizes it and upload to cloud.
     *
     * @param url     The file url.
     * @param path    The path in the cloud.
     * @param storage The storage name.
     * @throws Exception
     */
    private void CreateSampleFile(String url, String path, String storage) throws Exception {
        InputStream inputStream = new URL(url).openStream();
        byte[] imageData = new byte[inputStream.available()];
        inputStream.read(imageData);

        byte[] rotatedImage = ImagingApi.createResizedImage(new CreateResizedImageRequest(imageData, 600, 400, "jpg", null, storage));

        UploadFileRequest uploadFileRequest = new UploadFileRequest(path, rotatedImage, storage);
        ImagingApi.uploadFile(uploadFileRequest);
    }
}

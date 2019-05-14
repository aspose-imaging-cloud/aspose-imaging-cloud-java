package ai;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.*;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;


public class SearchContext {

    private ImagingApi imagingApi;
    private String DATA_PATH = "";

    public SearchContext(ImagingApi imagingApi, String DATA_PATH) {
        this.imagingApi = imagingApi;
        this.DATA_PATH = DATA_PATH;
    }

    /*
     * Create new search context
     */
    public void createNewSearchContext() {
        try {
            String detector = "akaze";
            String matchingAlgorithm = "randomBinaryTree";
            String folder = null; // File will be saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            PostCreateSearchContextRequest createSearchContextRequest = new PostCreateSearchContextRequest(detector,
                                                                                        matchingAlgorithm, folder, storage);
            SearchContextStatus status = imagingApi.postCreateSearchContext(createSearchContextRequest);
            System.out.println(status);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Gets the search context status
     */
    public void getTheSearchContextStatus() {
        try {
            String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
            String folder = null; // File is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetSearchContextStatusRequest searchContextStatusRequest = new GetSearchContextStatusRequest(searchContextId,
                                                                                                       folder, storage);

            SearchContextStatus status = imagingApi.getSearchContextStatus(searchContextStatusRequest);
            System.out.println(status.getSearchStatus());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Delete the search context
     */
    public void deleteSearchContext() {
        try {
            String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
            String folder = null; // File is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            DeleteSearchContextRequest deleteSearchContextRequest = new DeleteSearchContextRequest(searchContextId,
                                                                                                    folder, storage);
            imagingApi.deleteSearchContext(deleteSearchContextRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Extract features from image without adding to search context.
     * Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     */
    public void extractFeaturesFromImageWithoutAddingToSearchContext() {
        String fileName = "WaterMark.bmp";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            // Extract features from image without adding to search context
            String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
            String folder = null; // Folder with image to process
            String storage = null; // We are using default Cloud Storage

            GetSearchContextExtractImageFeaturesRequest extractImageFeaturesRequest =
                    new GetSearchContextExtractImageFeaturesRequest(searchContextId, fileName, null, folder, storage);

            ImageFeatures imageFeatures = imagingApi.getSearchContextExtractImageFeatures(extractImageFeaturesRequest);
            System.out.println(imageFeatures);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
    ​ * Compare two images. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     */
    public void compareTwoImages() {
        String imageInStorage1 = "aspose-logo.jpg";
        String imageInStorage2 = "aspose_logo.png";

        try {
            // Upload both images to Cloud Storage
            String[] images = {imageInStorage1, imageInStorage2};
            for (String imageName : images) {

                File inputFile = new File(DATA_PATH + imageName);
                FileInputStream localInputImageStream = new FileInputStream(inputFile);

                byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

                UploadFileRequest uploadFileRequest = new UploadFileRequest(imageName, localInputImage, null);
                FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);
            }

            // Compare two images
            String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
            String folder = null; // Folder with image to process
            String storage = null; // We are using default Cloud Storage

            SearchResultsSet result = imagingApi.postSearchContextCompareImages(
                    new PostSearchContextCompareImagesRequest(
                            searchContextId, imageInStorage1, null, imageInStorage2, folder, storage));
            Double similarity = result.getResults().get(0).getSimilarity();
            System.out.println("Images Similarity: " + similarity.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Find similar images. Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     */
    public void findSimilarImages() {
        String fileName = "aspose-logo.jpg";

        try {
            // Upload image to Cloud Storage
            File inputFile = new File(DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            // Find similar images
            String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
            Double similarityThreshold = 90.0;
            Integer maxCount = 5;
            String folder = null; // Folder with image to process
            String storage = null; // We are using default Cloud Storage

            SearchResultsSet results = imagingApi.getSearchContextFindSimilar(
                    new GetSearchContextFindSimilarRequest(
                            searchContextId, similarityThreshold, maxCount, null, fileName, folder, storage));


            // process search results
            for (SearchResult searchResult : results.getResults())
            {
                System.out.println("ImageName: " + searchResult.getImageId() +
                        ", Similarity: " + searchResult.getSimilarity());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Find duplicate images.
     */
    public void findDuplicateImages() {
        try {
            String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
            Double similarityThreshold = 90.0;
            String folder = null; // Folder with image to process
            String storage = null; // We are using default Cloud Storage

            ImageDuplicatesSet result = imagingApi.getSearchContextFindDuplicates(
                    new GetSearchContextFindDuplicatesRequest(searchContextId, similarityThreshold, folder, storage));

            for (ImageDuplicates duplicates : result.getDuplicates())
            {
                System.out.println("Duplicates:");
                for (SearchResult duplicate : duplicates.getDuplicateImages())
                {
                    System.out.println("ImageName: " + duplicate.getImageId() +
                            ", Similarity: " + duplicate.getSimilarity());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Add tag and reference image to search context.
     * Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     */
    public void addTagAndReferenceImageToSearchContext() {
        try {
            String tag = "MyTag";
            String imageName = "aspose_logo.png";
            String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
            String folder = null; // File will be saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            // Load tag image as a stream
            File inputFile = new File(DATA_PATH + imageName);
            byte[] inputBytes = new byte[(int) inputFile.length()];
            FileInputStream inputStream = new FileInputStream(inputFile);
            inputStream.read(inputBytes);

            imagingApi.postSearchContextAddTag(
                    new PostSearchContextAddTagRequest(inputBytes, searchContextId, tag, folder, storage));

            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Find images by tags.
     * Tags JSON string is passed as zero-indexed multipart/form-data content or as raw body stream.
     */
    public void searchImagesByTags() {
        try {
            String tag = "MyTag";
            String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
            Double similarityThreshold = 90.0;
            Integer maxCount = 10;
            String folder = null; // Folder with image to process
            String storage = null; // We are using default Cloud Storage

            // Serialize search tags collection to JSON
            List<String> tagsList = new ArrayList<String>();
            tagsList.add(tag);
            String tags = new Gson().toJson(tagsList);

            // Search images by tags
            SearchResultsSet result = imagingApi.postSearchContextFindByTags(
                    new PostSearchContextFindByTagsRequest(tags, searchContextId, similarityThreshold, maxCount,
                                                                                                folder, storage));

            // Process search results
            for (SearchResult searchResult : result.getResults())
            {
                System.out.println("ImageName: " + searchResult.getImageId() +
                        ", Similarity: " + searchResult.getSimilarity());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

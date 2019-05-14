package ai;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.ImageFeatures;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class SearchContextFeatures {

    private ImagingApi imagingApi;
    private String DATA_PATH = "";

    public SearchContextFeatures(ImagingApi imagingApi, String DATA_PATH) {
        this.imagingApi = imagingApi;
        this.DATA_PATH = DATA_PATH;
    }

    /*
     * Extract images features and add them to search context.
     * Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     */
    public void extractImageFeaturesAndAddThemToSearchContext() {
        try {
            // The search context identifier.
            String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";

            // Input image
            String imageName = "WaterMark.bmp";
            File inputFile = new File(DATA_PATH + imageName);
            byte[] imageData = new byte[(int) inputFile.length()];
            FileInputStream inputStream = new FileInputStream(inputFile);
            inputStream.read(imageData);

            String imageId = null; //The image identifier
            String imagesFolder = null;  // Images folder
            String folder = null;
            String storage = null; // We are using default Cloud Storage

            PostSearchContextExtractImageFeaturesRequest postSearchContextExtractImageFeaturesRequest =
                    new PostSearchContextExtractImageFeaturesRequest(searchContextId, imageData, imageId, imagesFolder,
                                                                                                    folder, storage);
            imagingApi.postSearchContextExtractImageFeatures(postSearchContextExtractImageFeaturesRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Gets image features from search context.
     */
    public void getImageFeaturesFromSearchContext() {
        try {
            String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
            String imageId = "WaterMark.bmp";
            String folder = null; // File is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetSearchContextImageFeaturesRequest getSearchContextImageFeaturesRequest =
                                    new GetSearchContextImageFeaturesRequest(searchContextId, imageId, folder, storage);
            ImageFeatures imageFeatures = imagingApi.getSearchContextImageFeatures(getSearchContextImageFeaturesRequest);
            System.out.println(imageFeatures);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Deletes image features from search context.
     */
    public void deleteImageFeaturesFromSearchContext() {
        try {
            String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
            String imageId = "WaterMark.bmp";
            String folder = null; // File is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            DeleteSearchContextImageFeaturesRequest deleteSearchContextImageFeaturesRequest =
                                new DeleteSearchContextImageFeaturesRequest(searchContextId, imageId, folder, storage);
            imagingApi.deleteSearchContextImageFeatures(deleteSearchContextImageFeaturesRequest);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Update images features in search context.
     * Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
    */
    public void updateImageFeaturesInSearchContext() {
        String fileName = "WaterMark.bmp";

        try {
            // Upload local image to storage
            File inputFile = new File(DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            // Update images features in search context
            String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
            String imageId = fileName;
            String folder = null; // File is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            PutSearchContextImageFeaturesRequest searchContextImageFeaturesRequest =
                            new PutSearchContextImageFeaturesRequest(searchContextId, imageId, null, folder, storage);
            imagingApi.putSearchContextImageFeatures(searchContextImageFeaturesRequest);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}

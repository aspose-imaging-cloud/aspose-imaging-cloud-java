package ai;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.requests.DeleteSearchContextImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.GetSearchContextImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PostSearchContextAddImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PutSearchContextImageRequest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class SearchContextImages {

    private ImagingApi imagingApi;
    private String DATA_PATH = "";

    public SearchContextImages(ImagingApi imagingApi, String DATA_PATH) {
        this.imagingApi = imagingApi;
        this.DATA_PATH = DATA_PATH;
    }

    /*
     * Get image from search context
     */
    public void getImageFromSearchContext() {
        try {
            String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
            String imageId = "WaterMark.bmp";
            String folder = null;
            String storage = null;

            GetSearchContextImageRequest getSearchContextImageRequest =
                                            new GetSearchContextImageRequest(searchContextId, imageId, folder, storage);
            byte[] retrievedImage = imagingApi.getSearchContextImage(getSearchContextImageRequest);

            // Save retrieved image to local storage
            FileOutputStream fos = new FileOutputStream(DATA_PATH + "Watermark_out.bmp");
            fos.write(retrievedImage);
            fos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Add image and images features to search context.
     * Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     */
     public void addImageAndImagesFeaturesToSearchContext() {
         try {
             String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
             String imageId = "WaterMark.bmp";

             // Input image
             File inputFile = new File(DATA_PATH + imageId);
             byte[] imageData = new byte[(int) inputFile.length()];
             FileInputStream inputStream = new FileInputStream(inputFile);
             inputStream.read(imageData);

             String folder = null;
             String storage = null;

             PostSearchContextAddImageRequest searchContextAddImageRequest =
                            new PostSearchContextAddImageRequest(searchContextId, imageId, imageData, folder, storage);
             imagingApi.postSearchContextAddImage(searchContextAddImageRequest);
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
     }

    /*
     * Delete image and images features from search context
     */
     public void deleteImageAndImagesFeaturesFromSearchContext() {
         try {
             String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
             String imageId = "WaterMark.bmp";
             String folder = null;
             String storage = null;

             DeleteSearchContextImageRequest searchContextImageRequest =
                     new DeleteSearchContextImageRequest(searchContextId, imageId, folder, storage);

             imagingApi.deleteSearchContextImage(searchContextImageRequest);
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
     }

    /*
     * Update image and images features in search context.
     * Image data may be passed as zero-indexed multipart/form-data content or as raw body stream.
     */
     public void updateImageAndImagesFeaturesInSearchContext() {
         try {
             String searchContextId = "5728a4ed-12bb-4b4a-8dce-38295735549f";
             String imageId = "WaterMark.bmp";
             byte[] imageData = null;
             String folder = null;
             String storage = null;

             PutSearchContextImageRequest searchContextImageRequest =
                            new PutSearchContextImageRequest(searchContextId, imageId, imageData, folder, storage);
             imagingApi.putSearchContextImage(searchContextImageRequest);
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
     }

}

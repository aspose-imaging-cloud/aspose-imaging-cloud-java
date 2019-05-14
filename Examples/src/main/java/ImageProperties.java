import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.sdk.stablemodel.ImagingResponse;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class ImageProperties {

    private ImagingApi imagingApi;

    public ImageProperties(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
     * Get properties of an image, which is store in the cloud.
     */
    public void getPropertiesOfAnImageInCloud() {
        String fileName = "Sample.tiff";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            // Get properties of an image
            // Folder with image to process. The value is null because the file is saved at the root of the storage
            String folder = null;
            String storage = null; // We are using default Cloud Storage

            GetImagePropertiesRequest getImagePropertiesRequest = new GetImagePropertiesRequest(fileName, folder,
                                                                                                            storage);

            ImagingResponse imagingResponse = imagingApi.getImageProperties(getImagePropertiesRequest);
            System.out.println(imagingResponse);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Get properties of an image.
     * Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     */
    public void getPropertiesOfAnImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "Sample.tiff");
            byte[] imageData = Files.readAllBytes(file.toPath());

            PostImagePropertiesRequest imagePropertiesRequest = new PostImagePropertiesRequest(imageData);
            ImagingResponse imagingResponse = imagingApi.postImageProperties(imagePropertiesRequest);
            System.out.println(imagingResponse);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

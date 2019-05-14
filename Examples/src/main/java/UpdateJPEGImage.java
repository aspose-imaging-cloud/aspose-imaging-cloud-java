import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class UpdateJPEGImage {

    private ImagingApi imagingApi;

    public UpdateJPEGImage(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
     * Update parameters of existing JPEG image. The image is saved in the cloud.
     */
    public void updateParametersOfJPEGImageInCloud() {
        String fileName = "aspose-logo.jpg";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            int quality = 65;
            String compressionType = "progressive";
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String folder = null; // Folder with image to process
            String storage = null; // We are using default Cloud Storage

            GetImageJpgRequest getImageJpgRequest = new GetImageJpgRequest(fileName, quality, compressionType,
                                                                                fromScratch, outPath, folder, storage);

            byte[] updatedImage = imagingApi.getImageJpg(getImageJpgRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.jpg");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Update parameters of existing JPEG image. Image is passed in a request stream.
     */
    public void updateParametersOfJPEGImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "aspose-logo.jpg");
            byte[] imageData = Files.readAllBytes(file.toPath());

            int quality = 65;
            String compressionType = "progressive";
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String storage = null; // We are using default Cloud Storage

            PostImageJpgRequest postImageJpgRequest = new PostImageJpgRequest(imageData, quality, compressionType,
                                                                                        fromScratch, outPath, storage);

            byte[] updatedImage = imagingApi.postImageJpg(postImageJpgRequest);;

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.jpg");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

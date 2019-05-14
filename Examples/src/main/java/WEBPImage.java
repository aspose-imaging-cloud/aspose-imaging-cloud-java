import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class WEBPImage {

    private ImagingApi imagingApi;

    public WEBPImage(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
     * Update parameters of existing WEBP image. The image is saved in the cloud.
     */
    public void updateParametersOfWEBPImageInCloud() {
        String fileName = "asposelogo.webp";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            Boolean lossless = true;
            Integer quality = 90;
            Integer animLoopCount = 5;
            String animBackgroundColor = "gray";
            // Specifies where additional parameters we do not support should be taken from.
            // If this is true – they will be taken from default values for standard image,
            // if it is false – they will be saved from current image. Default is false.
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            // Folder with image to process. The value is null because the file is saved at the root of the storage
            String folder = null;
            String storage = null; // We are using default Cloud Storage

            GetImageWebPRequest getImageWebPRequest = new GetImageWebPRequest(fileName, lossless, quality,
                                            animLoopCount, animBackgroundColor, fromScratch, outPath, folder, storage);

            byte[] updatedImage = imagingApi.getImageWebP(getImageWebPRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "asposelogo_out.webp");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Update parameters of existing Webp image. asposelogo.webpImage data is passed as zero-indexed multipart/form-data
     * content or as raw body stream.
     */
    public void updateParametersOfWEBPImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "asposelogo.webp");
            byte[] imageData = Files.readAllBytes(file.toPath());

            Boolean lossless = true;
            Integer quality = 90;
            Integer animLoopCount = 5;
            String animBackgroundColor = "gray";
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String storage = null; // We are using default Cloud Storage

            PostImageWebPRequest postImageWebPRequest = new PostImageWebPRequest(imageData, lossless, quality,
                                                    animLoopCount, animBackgroundColor, fromScratch, outPath, storage);

            byte[] updatedImage = imagingApi.postImageWebP(postImageWebPRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "asposelogo_out.webp");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

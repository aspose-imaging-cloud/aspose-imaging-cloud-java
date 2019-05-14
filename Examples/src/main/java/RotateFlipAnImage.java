import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class RotateFlipAnImage {

    private ImagingApi imagingApi;

    public RotateFlipAnImage(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
     * Rotate and/or flip an existing image.
     */
    public void rotateFlipAnImageInCloud() {
        String fileName = "Sample.psd";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            String format = "gif";
            String method = "Rotate90FlipX"; // RotateFlip method
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String folder = null; // Folder with image to process.
            String storage = null; // We are using default Cloud Storage

            GetImageRotateFlipRequest getImageRotateFlipRequest = new GetImageRotateFlipRequest(fileName, format,
                                                                                method, outPath, folder, storage);

            byte[] updatedImage = imagingApi.getImageRotateFlip(getImageRotateFlipRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.gif");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Rotate and/or flip an existing image.
     * Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     */
    public void rotateFlipAnImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "Sample.psd");
            byte[] imageData = Files.readAllBytes(file.toPath());

            String format = "gif";
            String method = "Rotate90FlipX"; // RotateFlip method
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String storage = null; // We are using default Cloud Storage

            PostImageRotateFlipRequest postImageRotateFlipRequest = new PostImageRotateFlipRequest(imageData, format,
                                                                                            method, outPath, storage);

            byte[] updatedImage = imagingApi.postImageRotateFlip(postImageRotateFlipRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.gif");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class ResizeImage {

    private ImagingApi imagingApi;

    public ResizeImage(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
     * Resize an existing image.
     */
    public void resizeAnImageInCloud() {
        String fileName = "Sample.psd";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            String format = "gif";
            Integer newWidth = 100;
            Integer newHeight = 150;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String folder = null; // Folder with image to process.
            String storage = null; // We are using default Cloud Storage

            GetImageResizeRequest getImageResizeRequest = new GetImageResizeRequest(fileName, format, newWidth,
                                                                                newHeight, outPath, folder, storage);

            byte[] updatedImage = imagingApi.getImageResize(getImageResizeRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.gif");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Resize an existing image. Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     */
    public void resizeAnImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "Sample.psd");
            byte[] imageData = Files.readAllBytes(file.toPath());

            String format = "gif";
            Integer newWidth = 100;
            Integer newHeight = 150;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String folder = null;
            String storage = null; // We are using default Cloud Storage

            PostImageResizeRequest postImageResizeRequest = new PostImageResizeRequest(imageData, format, newWidth,
                                                                                        newHeight, outPath, storage);

            byte[] updatedImage = imagingApi.postImageResize(postImageResizeRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.gif");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

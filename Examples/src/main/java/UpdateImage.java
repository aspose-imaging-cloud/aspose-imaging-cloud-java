import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class UpdateImage {

    private ImagingApi imagingApi;

    public UpdateImage(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
     * Perform scaling, cropping and flipping of an existing image in a single request. The image is saved in the cloud.
     */
    public void updateImageInCloud() {
        String fileName = "Sample.gif";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            String format = "pdf";
            Integer newWidth = 300;
            Integer newHeight = 450;
            Integer x = 10;
            Integer y = 10;
            Integer rectWidth = 200;
            Integer rectHeight = 300;
            String rotateFlipMethod = "Rotate90FlipX";
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageUpdateRequest getImageUpdateRequest = new GetImageUpdateRequest(fileName, format, newWidth,
                                newHeight, x, y, rectWidth, rectHeight, rotateFlipMethod, outPath, folder, storage);

            byte[] updatedImage = imagingApi.getImageUpdate(getImageUpdateRequest);;

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out." + format);
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Perform scaling, cropping and flipping of an image in a single request.
     * Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     */
    public void updateImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "Sample.gif");
            byte[] imageData = Files.readAllBytes(file.toPath());

            String format = "pdf";
            Integer newWidth = 300;
            Integer newHeight = 450;
            Integer x = 10;
            Integer y = 10;
            Integer rectWidth = 200;
            Integer rectHeight = 300;
            String rotateFlipMethod = "Rotate90FlipX";
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String storage = null; // We are using default Cloud Storage

            PostImageUpdateRequest postImageUpdateRequest = new PostImageUpdateRequest(imageData, format, newWidth,
                                        newHeight, x, y, rectWidth, rectHeight, rotateFlipMethod, outPath, storage);

            byte[] updatedImage = imagingApi.postImageUpdate(postImageUpdateRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out." + format);
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.sdk.stablemodel.ImagingResponse;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class TIFFFrames {

    private ImagingApi imagingApi;

    public TIFFFrames(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
     * Get separate frame from existing TIFF image.
     */
    public void getAFrameFromTIFFImageInCloud() {
        String fileName = "Sample.tiff";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            Integer frameId = 1; // Number of a frame
            Integer newWidth = 300;
            Integer newHeight = 450;
            Integer x = 10;
            Integer y = 10;
            Integer rectWidth = 200;
            Integer rectHeight = 300;
            String rotateFlipMethod = "Rotate90FlipX";
            // Result will include just the specified frame
            Boolean saveOtherFrames = false;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(fileName, frameId, newWidth, newHeight,
                            x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames, outPath, folder, storage);

            byte[] updatedImage = imagingApi.getImageFrame(getImageFrameRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "SingleFrame_out.tiff");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Get other frames from TIFF image.
     */
    public void getOtherFramesFromTIFFImageInCloud() {
        String fileName = "Sample.tiff";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            Integer frameId = 1; // Number of a frame
            Integer newWidth = 300;
            Integer newHeight = 450;
            Integer x = 10;
            Integer y = 10;
            Integer rectWidth = 200;
            Integer rectHeight = 300;
            String rotateFlipMethod = "Rotate90FlipX";
            // Result will include all other frames
            Boolean saveOtherFrames = true;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageFrameRequest getImageFrameRequest = new GetImageFrameRequest(fileName, frameId, newWidth, newHeight,
                    x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames, outPath, folder, storage);

            byte[] updatedImage = imagingApi.getImageFrame(getImageFrameRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "OtherFrames_out.tiff");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Get separate frame from existing TIFF image. Image is passed in a request stream.
     */
    public void getAFrameFromTIFFImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "Sample.tiff");
            byte[] imageData = Files.readAllBytes(file.toPath());

            Integer frameId = 1;
            Integer newWidth = 300;
            Integer newHeight = 450;
            Integer x = 10;
            Integer y = 10;
            Integer rectWidth = 200;
            Integer rectHeight = 300;
            String rotateFlipMethod = "Rotate90FlipX";
            Boolean saveOtherFrames = false;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String storage = null; // We are using default Cloud Storage

            PostImageFrameRequest postImageFrameRequest = new PostImageFrameRequest(imageData, frameId, newWidth,
                        newHeight, x, y, rectWidth, rectHeight, rotateFlipMethod, saveOtherFrames, outPath, storage);

            byte[] updatedImage = imagingApi.postImageFrame(postImageFrameRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "SingleFrame_out.tiff");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Get separate frame properties of existing TIFF image.
     */
    public void getFramePropertiesOfTIFFImageInCloud() {
        String fileName = "Sample.tiff";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            Integer frameId = 1; // Number of a frame
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageFramePropertiesRequest imageFramePropertiesRequest = new GetImageFramePropertiesRequest(fileName,
                                                                                                frameId, folder, storage);

            ImagingResponse imagingResponse = imagingApi.getImageFrameProperties(imageFramePropertiesRequest);
            System.out.println("Width: " + imagingResponse.getHeight() + " Height: " + imagingResponse.getWidth());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /*
     * Get separate frame properties of existing TIFF image. Image is passed in a request stream.
     */
    public void getFramePropertiesOfTIFFImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "Sample.tiff");
            byte[] imageData = Files.readAllBytes(file.toPath());

            Integer frameId = 1;

            PostImageFramePropertiesRequest imageFramePropertiesRequest = new PostImageFramePropertiesRequest(imageData,
                                                                                                                frameId);

            ImagingResponse imagingResponse = imagingApi.postImageFrameProperties(imageFramePropertiesRequest);
            System.out.println("Width: " + imagingResponse.getHeight() + " Height: " + imagingResponse.getWidth());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

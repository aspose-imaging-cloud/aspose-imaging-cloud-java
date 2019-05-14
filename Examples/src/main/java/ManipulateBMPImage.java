import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageBmpRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PostImageBmpRequest;
import com.aspose.imaging.cloud.sdk.model.requests.UploadFileRequest;
import com.aspose.imaging.cloud.sdk.stablemodel.ImagingResponse;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.nio.file.Files;


public class ManipulateBMPImage {

    private ImagingApi imagingApi;

    public ManipulateBMPImage(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
     * Update parameters of existing BMP image. The image is saved in the cloud.
     */
    public void updateParametersOfBMPImageInCloud() {
        String fileName = "WaterMark.bmp";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            Integer bitsPerPixel = 32;
            Integer horizontalResolution = 300;
            Integer verticalResolution = 300;
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageBmpRequest getImageBmpRequest = new GetImageBmpRequest(fileName, bitsPerPixel, horizontalResolution,
                                                                verticalResolution, fromScratch, outPath, folder, storage);

            byte[] updatedImage = imagingApi.getImageBmp(getImageBmpRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Watermark_out.bmp");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Update parameters of existing BMP image. Image is passed in a request stream.
     */
    public void updateParametersOfBMPImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "WaterMark.bmp");
            byte[] imageData = Files.readAllBytes(file.toPath());

            Integer bitsPerPixel = 32;
            Integer horizontalResolution = 300;
            Integer verticalResolution = 300;
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String storage = null; // We are using default Cloud Storage

            PostImageBmpRequest postImageBmpRequest = new PostImageBmpRequest(imageData, bitsPerPixel,
                                            horizontalResolution, verticalResolution, fromScratch, outPath, storage);

            byte[] updatedImage = imagingApi.postImageBmp(postImageBmpRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Watermark_out.bmp");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

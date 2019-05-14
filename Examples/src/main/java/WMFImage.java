import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class WMFImage {

    private ImagingApi imagingApi;

    public WMFImage(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
     * Process existing WMF image using given parameters. The image is saved in the cloud.
     */
    public void updateParametersOfWMFImageInCloud() {
        String fileName = "Sample.wmf";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            String bkColor = "gray";
            Integer pageWidth = 300;
            Integer pageHeight = 300;
            Integer borderX = 50;
            Integer borderY = 50;
            Boolean fromScratch = null;
            String outPath = null;  // Path to updated file (if this is empty, response contains streamed image).
            // Folder with image to process. The value is null because the file is saved at the root of the storage
            String folder = null;
            String storage = null; // We are using default Cloud Storage
            String exportFormat = "png";

            GetImageWmfRequest getImageWmfRequest = new GetImageWmfRequest(fileName, bkColor, pageWidth, pageHeight,
                                                                    borderX, borderY, fromScratch, outPath, folder,
                                                                                                storage, exportFormat);

            byte[] updatedImage = imagingApi.getImageWmf(getImageWmfRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "WMFToPNG_out.png");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Process existing WMF image using given parameters.
     * Image data is passed as zero-indexed multipart/form-data content or as raw body stream.
     */
    public void updateParametersOfWMFImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "Sample.wmf");
            byte[] imageData = Files.readAllBytes(file.toPath());

            String bkColor = "gray";
            Integer pageWidth = 300;
            Integer pageHeight = 300;
            Integer borderX = 50;
            Integer borderY = 50;
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String storage = null; // We are using default Cloud Storage
            String exportFormat = "png";

            PostImageWmfRequest postImageWmfRequest = new PostImageWmfRequest(imageData, bkColor, pageWidth,
                                                                pageHeight, borderX, borderY, fromScratch, outPath,
                                                                                                storage, exportFormat);


            byte[] updatedImage = imagingApi.postImageWmf(postImageWmfRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "WMFToPNG_out.png");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

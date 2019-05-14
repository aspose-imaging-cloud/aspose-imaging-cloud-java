import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.GetImageEmfRequest;
import com.aspose.imaging.cloud.sdk.model.requests.PostImageEmfRequest;
import com.aspose.imaging.cloud.sdk.model.requests.UploadFileRequest;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.file.Files;


public class UpdateEMFImageProperties {

    private ImagingApi imagingApi;

    public UpdateEMFImageProperties(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
     * Process existing EMF imaging using given parameters
     */
    public void processEMFImage() {
        String fileName = "Sample.emf";

        try {
            // Upload local image to storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            // Update EMF Image properties
            String bkColor = "gray";
            Integer pageWidth = 300;
            Integer pageHeight = 300;
            Integer borderX = 50;
            Integer borderY = 50;
            String format = "png";
            // Specifies where additional parameters we do not support should be taken from.
            // If this is true – they will be taken from default values for standard image,
            // if it is false – they will be saved from current image. Default is false.
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // As we are using default Cloud Storage

            GetImageEmfRequest getImageEmfRequest = new GetImageEmfRequest(fileName, bkColor, pageWidth, pageHeight,
                                                        borderX, borderY, fromScratch, outPath, folder, storage, format);

            byte[] updatedImage = imagingApi.getImageEmf(getImageEmfRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "SampleEMF_out.png");
            fos.write(updatedImage);
            fos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Rasterize EMF image to PNG using given parameters. Image is passed in a request stream
     */
    public void processEMFImageWithoutStorage() {
        try {
            File file = new File(Main.DATA_PATH + "Sample.emf");
            byte[] imageData = Files.readAllBytes(file.toPath());

            String bkColor = "gray";
            Integer pageWidth = 300;
            Integer pageHeight = 300;
            Integer borderX = 50;
            Integer borderY = 50;
            String format = "png";
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String storage = null; // As we are using default Cloud Storage

            PostImageEmfRequest postImageEmfRequest = new PostImageEmfRequest(imageData, bkColor, pageWidth, pageHeight,
                                                            borderX, borderY, fromScratch, outPath, storage, format);

            byte[] updatedImage = imagingApi.postImageEmf(postImageEmfRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "SampleEMF_out.png");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

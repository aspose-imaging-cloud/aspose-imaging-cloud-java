import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class UpdatePSDImage {

    private ImagingApi imagingApi;

    public UpdatePSDImage(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
     * Update parameters of existing PSD image. The image is saved in the cloud.
     */
    public void updateParametersOfPSDImageInCloud() {
        String fileName = "Sample.psd";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            int channelsCount = 3;
            String compressionMethod = "raw";
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String folder = null;
            String storage = null; // We are using default Cloud Storage

            GetImagePsdRequest getImagePsdRequest = new GetImagePsdRequest(fileName, channelsCount, compressionMethod,
                                                                                fromScratch, outPath, folder, storage);

            byte[] updatedImage = imagingApi.getImagePsd(getImagePsdRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.psd");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Update parameters of existing PSD image. Image is passed in a request stream.
     */
    public void updateParametersOfPSDImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "Sample.psd");
            byte[] imageData = Files.readAllBytes(file.toPath());

            int channelsCount = 3;
            String compressionMethod = "raw";
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image).
            String storage = null; // We are using default Cloud Storage

            PostImagePsdRequest postImagePsdRequest = new PostImagePsdRequest(imageData, channelsCount,
                                                                    compressionMethod, fromScratch, outPath, storage);

            byte[] updatedImage = imagingApi.postImagePsd(postImagePsdRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.psd");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class UpdateJPEG2000Image {

    private ImagingApi imagingApi;

    public UpdateJPEG2000Image(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
     * Update parameters of existing JPEG2000 image. The image is saved in the cloud.
     */
    public void updateParametersOfJPEG2000ImageInCloud() {
        String fileName = "Sample.jp2";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            String codec = "jp2";
            String comment = "Aspose";
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageJpeg2000Request getImageJpeg2000Request = new GetImageJpeg2000Request(fileName, comment, codec,
                                                                                fromScratch, outPath, folder, storage);

            byte[] updatedImage = imagingApi.getImageJpeg2000(getImageJpeg2000Request);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.jp2");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Update parameters of existing JPEG2000 image. Image is passed in a request stream.
     */
    public void updateParametersOfJPEG2000ImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "Sample.jp2");
            byte[] imageData = Files.readAllBytes(file.toPath());

            String codec = "jp2";
            String comment = "Aspose";
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String storage = null; // We are using default Cloud Storage

            PostImageJpeg2000Request postImageJpeg2000Request = new PostImageJpeg2000Request(imageData, comment, codec,
                                                                                        fromScratch, outPath, storage);

            byte[] updatedImage = imagingApi.postImageJpeg2000(postImageJpeg2000Request);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.jp2");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

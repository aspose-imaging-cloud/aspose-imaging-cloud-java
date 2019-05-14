import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class UpdateGIFImage {

    private ImagingApi imagingApi;

    public UpdateGIFImage(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
     * Update parameters of existing GIF image. The image is saved in the cloud.
     */
    public void updateParametersOfGIFImageInCloud() {
        String fileName = "Sample.gif";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            Integer backgroundColorIndex = 5;
            Integer colorResolution = 4;
            Boolean hasTrailer = true;
            Boolean interlaced = false;
            Boolean isPaletteSorted = true;
            Integer pixelAspectRatio = 4;
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageGifRequest getImageGifRequest = new GetImageGifRequest(fileName, backgroundColorIndex,
                                                            colorResolution, hasTrailer, interlaced, isPaletteSorted,
                                                            pixelAspectRatio, fromScratch, outPath, folder, storage);

            byte[] updatedImage = imagingApi.getImageGif(getImageGifRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.gif");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Update parameters of GIF image. Image is passed in a request stream.
     */
    public void updateParametersOfGIFImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "Sample.gif");
            byte[] imageData = Files.readAllBytes(file.toPath());

            Integer backgroundColorIndex = 5;
            Integer colorResolution = 4;
            Boolean hasTrailer = true;
            Boolean interlaced = false;
            Boolean isPaletteSorted = true;
            Integer pixelAspectRatio = 4;
            Boolean fromScratch = null;
            String outPath = null;
            String storage = null; // We are using default Cloud Storage

            PostImageGifRequest postImageGifRequest = new PostImageGifRequest(imageData, backgroundColorIndex,
                                            colorResolution, hasTrailer, interlaced, isPaletteSorted, pixelAspectRatio,
                                                                                        fromScratch, outPath, storage);

            byte[] updatedImage = imagingApi.postImageGif(postImageGifRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.gif");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

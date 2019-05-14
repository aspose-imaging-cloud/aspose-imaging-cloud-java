import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;


public class TIFFImage {

    private ImagingApi imagingApi;

    public TIFFImage(ImagingApi imagingApi) {
        this.imagingApi = imagingApi;
    }

    /*
    * Update parameters of TIFF image. The image is saved in the cloud.
    */
    public void updateParametersOfTIFFImageInCloud() {
        String fileName = "Sample.tiff";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            // Update parameters of TIFF image
            String compression = "adobedeflate";
            String resolutionUnit = "inch";
            int bitDepth = 1;
            double horizontalResolution = 150;
            double verticalResolution = 150;
            Boolean fromScratch = null;
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetImageTiffRequest getImageTiffRequest = new GetImageTiffRequest(fileName, compression, resolutionUnit,
                            bitDepth, fromScratch, horizontalResolution, verticalResolution, outPath, folder, storage);

            byte[] updatedImage = imagingApi.getImageTiff(getImageTiffRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.tiff");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Update parameters of TIFF image. Image data is passed as zero-indexed multipart/form-data
     * content or as raw body stream.
     */
    public void updateParametersOfTIFFImageInRequestBody() {
        try {
            File file = new File(Main.DATA_PATH + "Sample.tiff");
            byte[] imageData = Files.readAllBytes(file.toPath());

            String compression = "adobedeflate";
            String resolutionUnit = "inch";
            int bitDepth = 1;
            double horizontalResolution = 150;
            double verticalResolution = 150;
            Boolean fromScratch = null;
            String outPath = null;
            String storage = null; // We are using default Cloud Storage
            String folder = null; // Input file is saved at the root of the storage

            PostImageTiffRequest postImageTiffRequest = new PostImageTiffRequest(imageData, compression,
                                    resolutionUnit, bitDepth, fromScratch, horizontalResolution, verticalResolution,
                                                                                                    outPath, storage);

            byte[] updatedImage = imagingApi.postImageTiff(postImageTiffRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.tiff");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
    * Update parameters of TIFF image according to fax parameters.
    */
    public void updateParametersOfTIFFImageAccordingToFaxParameters() {
        String fileName = "Sample.tiff";

        try {
            // Upload local image to Cloud Storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult result = imagingApi.uploadFile(uploadFileRequest);

            // Update TIFF Image parameters according to fax parameters
            String outPath = null; // Path to updated file (if this is empty, response contains streamed image)
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            GetTiffToFaxRequest getTiffToFaxRequest = new GetTiffToFaxRequest(fileName, storage, folder, outPath);

            byte[] updatedImage = imagingApi.getTiffToFax(getTiffToFaxRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.tiff");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
    * Appends existing TIFF image to another existing TIFF image (i.e. merges TIFF images).
    */
    public void mergeTIFFImages() {
        String fileName = "Sample.tiff"; // Original image file name
        String appendFileName = "Memorandum.tif"; // Image file name to be appended to original one

        try {
            // Upload original image file to cloud storage
            File inputFile = new File(Main.DATA_PATH + fileName);
            FileInputStream localInputImageStream = new FileInputStream(inputFile);

            byte[] localInputImage = IOUtils.toByteArray(localInputImageStream);

            UploadFileRequest uploadFileRequest = new UploadFileRequest(fileName, localInputImage, null);
            FilesUploadResult inputFileResult = imagingApi.uploadFile(uploadFileRequest);

            // Upload file be appended to cloud storage
            File appendFile = new File(Main.DATA_PATH + appendFileName);
            FileInputStream appendFileImageStream = new FileInputStream(appendFile);

            byte[] appendFileImage = IOUtils.toByteArray(appendFileImageStream);

            UploadFileRequest uploadAppendFileRequest = new UploadFileRequest(appendFileName, appendFileImage, null);
            FilesUploadResult appendFileResult = imagingApi.uploadFile(uploadAppendFileRequest);

            // Update TIFF Image parameters according to fax parameters
            String folder = null; // Input file is saved at the root of the storage
            String storage = null; // We are using default Cloud Storage

            PostTiffAppendRequest request = new PostTiffAppendRequest(fileName, appendFileName, storage, folder);
            imagingApi.postTiffAppend(request);

            // Download updated file to local storage
            DownloadFileRequest downloadFileRequest = new DownloadFileRequest(fileName, storage, null);
            byte[] updatedImage = imagingApi.downloadFile(downloadFileRequest);

            // Save updated image to local storage
            FileOutputStream fos = new FileOutputStream(Main.DATA_PATH + "Sample_out.tiff");
            fos.write(updatedImage);
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

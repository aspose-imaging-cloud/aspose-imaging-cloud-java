/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImagingBase.java">
 *   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.UploadFileRequest;
import com.aspose.imaging.cloud.sdk.stablemodel.ImagingResponse;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Modify image example.
 */
public abstract class ImagingBase {
    /**
     * The output folder path.
     */
    public final static String OutputFolder = Paths.get((Paths.get(System.getProperty("user.dir"))
            .getParent().toString()), "Examples", "Output").toString();
    /**
     * The example images folder path.
     */
    protected final static String ExampleImagesFolder = Paths.get((Paths.get(System.getProperty("user.dir"))
            .getParent().toString()), "Examples", "Images").toString();
    /**
     * The cloud path.
     */
    protected final static String CloudPath = "Examples";

    /**
     * Gets the imaging API.
     */
    protected final ImagingApi ImagingApi;

    /**
     * Initializes a new instance of the ImagingBase class
     */
    public ImagingBase(ImagingApi imagingApi) {
        ImagingApi = imagingApi;
    }

    /**
     * Prints the example header.
     *
     * @param header The example header.
     */
    protected static void printHeader(String header) {
        System.out.println(header);
        System.out.println();
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    protected abstract String getSampleImageFileName();

    /**
     * Gets the name of the modified sample image file.
     *
     * @param fromRequest        If set to true - created from request.
     * @param newFormatExtension The new format extension.
     * @return The name of the modified sample image file.
     */
    protected String getModifiedSampleImageFileName(Boolean fromRequest, String newFormatExtension) {

        String nameWithNewExtension = newFormatExtension != null
                ? getSampleImageFileName().substring(0, getSampleImageFileName().lastIndexOf('.'))
                + newFormatExtension
                : getSampleImageFileName();
        return fromRequest
                ? "ModifiedFromRequest" + nameWithNewExtension
                : "Modified" + nameWithNewExtension;
    }

    /**
     * Uploads the example image to cloud.
     *
     * @throws Exception
     */
    protected void uploadSampleImageToCloud() throws Exception {
        byte[] inputImage = Files.readAllBytes(Paths.get(ExampleImagesFolder, getSampleImageFileName()));
        uploadImageToCloud(getSampleImageFileName(), inputImage);
    }

    /**
     * Uploads the image to cloud.
     *
     * @param imageName Name of the image.
     * @param image     The image.
     * @throws Exception
     */
    protected void uploadImageToCloud(String imageName, byte[] image) throws Exception {
        UploadFileRequest request = new UploadFileRequest(Paths.get(CloudPath, imageName).toString(), image, null);
        FilesUploadResult response = ImagingApi.uploadFile(request);
        System.out.println(response.getErrors() == null || response.getErrors().size() == 0
                ? "Image " + imageName + " is uploaded to cloud storage"
                : "Uploading errors count: " + response.getErrors().size());

    }

    /**
     * Saves the updated image to local output folder.
     *
     * @param updatedImage       The updated image.
     * @param fromRequest        If set to true - created from request.
     * @param newFormatExtension The new format extension.
     * @throws IOException
     */
    protected void saveUpdatedSampleImageToOutput(byte[] updatedImage, Boolean fromRequest, String newFormatExtension)
            throws IOException {
        String newFileName = getModifiedSampleImageFileName(fromRequest, newFormatExtension);
        saveUpdatedImageToOutput(newFileName, updatedImage);
    }

    /**
     * Saves the updated image to output folder.
     *
     * @param imageName    Name of the image.
     * @param updatedImage The updated image.
     * @throws IOException
     */
    protected void saveUpdatedImageToOutput(String imageName, byte[] updatedImage) throws IOException {
        Path path = Paths.get(OutputFolder, imageName).toAbsolutePath();
        Files.write(path, updatedImage);
        System.out.println("Image " + imageName + " is saved to " + path.getParent());
    }

    /**
     * Outputs the properties to file.
     *
     * @param fileName        Name of the file.
     * @param imagingResponse The imaging response.
     */
    protected void outputPropertiesToFile(String fileName, ImagingResponse imagingResponse) {
        Path path = Paths.get(OutputFolder, fileName).toAbsolutePath();
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(path.toString()), StandardCharsets.UTF_8))) {
            writer.write("Width: " + imagingResponse.getWidth());
            writer.write("Height: " + imagingResponse.getHeight());
            writer.write("Horizontal resolution: " + imagingResponse.getHorizontalResolution());
            writer.write("Vertical resolution: " + imagingResponse.getVerticalResolution());
            writer.write("Bits per pixel: " + imagingResponse.getBitsPerPixel());

            if (imagingResponse.getTiffProperties() != null) {
                writer.write("Tiff properties:");
                writer.write("Frames count: " + imagingResponse.getTiffProperties().getFrames().size());
                writer.write("Camera owner name: " + (imagingResponse.getTiffProperties().getExifData() != null
                        ? imagingResponse.getTiffProperties().getExifData().getCameraOwnerName()
                        : ""));
                writer.write("Byte order: " + imagingResponse.getTiffProperties().getByteOrder());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

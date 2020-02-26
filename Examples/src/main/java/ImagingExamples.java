/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImagingExamples.java">
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

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Launcher for examples.
 */
public class ImagingExamples {
    /**
     * Main function.
     *
     * @param args --appKey and --appSid are required arguments, --baseUrl is optional.
     */
    public static void main(String[] args) {
        ArgumentValues argumentValues = processArguments(args);

        try {
            ImagingApi imagingApi = new ImagingApi(argumentValues.AppKey, argumentValues.AppSid, argumentValues.BaseUrl);

            if (Files.exists(Paths.get(ImagingBase.OutputFolder)))
                deleteDirectoryRecursively(Paths.get(ImagingBase.OutputFolder));
            Files.createDirectory(Paths.get(ImagingBase.OutputFolder));

            System.out.println("Running Imaging Cloud examples:" + System.lineSeparator());

            // Update parameters of existing BMP image
            UpdateBmpImage bmpImage = new UpdateBmpImage(imagingApi);
            bmpImage.ModifyBmpFromStorage();
            bmpImage.ModifyBmpAndUploadToStorage();
            bmpImage.CreateModifiedBmpFromRequestBody();

            // Crop an existing image
            CropImage cropImage = new CropImage(imagingApi);
            cropImage.CropImageFromStorage();
            cropImage.CropImageAndUploadToStorage();
            cropImage.CreateCroppedImageFromRequestBody();

            // Deskew an existing image
            DeskewImage deskewImage = new DeskewImage(imagingApi);
            deskewImage.DeskewImageFromStorage();
            deskewImage.DeskewImageAndUploadToStorage();
            deskewImage.CreateDeskewedImageFromRequestBody();

            // Grayscale an existing image
            GrayscaleImage grayscaleImage = new GrayscaleImage(imagingApi);
            grayscaleImage.GrayscaleImageFromStorage();
            grayscaleImage.GrayscaleImageAndUploadToStorage();
            grayscaleImage.CreateGrayscaledImageFromRequestBody();

            // Process existing EMF imaging using given parameters
            UpdateEmfImage updateEmfImage = new UpdateEmfImage(imagingApi);
            updateEmfImage.ModifyEmfFromStorage();
            updateEmfImage.ModifyEmfAndUploadToStorage();
            updateEmfImage.CreateModifiedEmfFromRequestBody();

            // Export existing image to another format
            ExportImage exportImage = new ExportImage(imagingApi);
            exportImage.SaveImageAsFromStorage();
            exportImage.SaveImageAsAndUploadToStorage();
            exportImage.CreateSavedImageAsFromRequestBody();

            // Apply a filtering effect to an image
            FilterImage filterImage = new FilterImage(imagingApi);
            filterImage.FilterImageFromStorage();
            filterImage.FilterImageAndUploadToStorage();

            // Get properties of an image
            ImageProperties imageProperties = new ImageProperties(imagingApi);
            imageProperties.GetImagePropertiesFromStorage();
            imageProperties.ExtractImagePropertiesFromRequestBody();

            // Resize an existing image
            ResizeImage resizeImage = new ResizeImage(imagingApi);
            resizeImage.ResizeImageFromStorage();
            resizeImage.ResizeImageAndUploadToStorage();
            resizeImage.CreateResizedImageFromRequestBody();

            // Rotate and/or flip an existing image
            RotateFlipImage rotateFlipImage = new RotateFlipImage(imagingApi);
            rotateFlipImage.RotateFlipImageFromStorage();
            rotateFlipImage.RotateFlipImageAndUploadToStorage();
            rotateFlipImage.CreateRotateFlippedImageFromRequestBody();

            // TIFF Frames
            TiffFrames tiffFrames = new TiffFrames(imagingApi);
            // Get a specified frame from existing TIFF image
            tiffFrames.GetImageFrameFromStorage();
            // Get a specified frame from existing TIFF image, and upload the frame to Cloud Storage
            tiffFrames.GetImageFrameAndUploadToStorage();
            // Resize a TIFF frame
            tiffFrames.ResizeImageFrameFromStorage();
            // Crop a TIFF frame
            tiffFrames.CropImageFrameFromStorage();
            // RotateFlip a TIFF frame
            tiffFrames.RotateFlipImageFrameFromStorage();
            // Get other frames from existing TIFF image
            tiffFrames.GetAllImageFramesFromStorage();
            // Get separate frame from existing TIFF image.
            // Image data is passed as zero-indexed multipart/form-data content or as raw body stream
            tiffFrames.CreateImageFrameFromRequestBody();
            // Get separate frame properties of existing TIFF image
            tiffFrames.GetImageFramePropertiesFromStorage();
            // Get separate frame properties of existing TIFF image.
            // Image data is passed as zero-indexed multipart/form-data content or as raw body stream
            tiffFrames.ExtractImageFramePropertiesFromRequestBody();

            // Update parameters of existing TIFF image
            UpdateTiffImage updateTiffImage = new UpdateTiffImage(imagingApi);
            updateTiffImage.ModifyTiffFromStorage();
            updateTiffImage.ModifyTiffAndUploadToStorage();
            updateTiffImage.CreateModifiedTiffFromRequestBody();
            updateTiffImage.ConvertTiffToFaxFromStorage();
            updateTiffImage.AppendTiffFromStorage();

            // Update parameters of existing GIF image
            UpdateGifImage updateGifImage = new UpdateGifImage(imagingApi);
            updateGifImage.ModifyGifFromStorage();
            updateGifImage.ModifyGifAndUploadToStorage();
            updateGifImage.CreateModifiedGifFromRequestBody();

            // Perform scaling, cropping and flipping of an existing image in a single request
            UpdateImage updateImage = new UpdateImage(imagingApi);
            updateImage.UpdateImageFromStorage();
            updateImage.UpdateImageAndUploadToStorage();
            updateImage.CreateUpdatedImageFromRequestBody();

            // Update parameters of existing JPEG2000 image
            UpdateJpeg2000Image updateJpeg2000Image = new UpdateJpeg2000Image(imagingApi);
            updateJpeg2000Image.ModifyJpeg2000FromStorage();
            updateJpeg2000Image.ModifyJpeg2000AndUploadToStorage();
            updateJpeg2000Image.CreateModifiedJpeg2000FromRequestBody();

            // Update parameters of existing JPEG image
            UpdateJpegImage updateJpegImage = new UpdateJpegImage(imagingApi);
            updateJpegImage.ModifyJpegFromStorage();
            updateJpegImage.ModifyJpegAndUploadToStorage();
            updateJpegImage.CreateModifiedJpegFromRequestBody();

            // Update parameters of existing PSD image
            UpdatePsdImage updatePsdImage = new UpdatePsdImage(imagingApi);
            updatePsdImage.ModifyPsdFromStorage();
            updatePsdImage.ModifyPsdAndUploadToStorage();
            updatePsdImage.CreateModifiedPsdFromRequestBody();

            // Update parameters of existing WEBP image
            UpdateWebPImage updateWebPImage = new UpdateWebPImage(imagingApi);
            updateWebPImage.ModifyWebPFromStorage();
            updateWebPImage.ModifyWebPAndUploadToStorage();
            updateWebPImage.CreateModifiedWebPFromRequestBody();

            // Process existing WMF image using given parameters
            UpdateWmfImage updateWmfImage = new UpdateWmfImage(imagingApi);
            updateWmfImage.ModifyWmfFromStorage();
            updateWmfImage.ModifyWmfAndUploadToStorage();
            updateWmfImage.CreateModifiedWmfFromRequestBody();
        } catch (Exception exception) {
            System.out.println("Something goes wrong: " + exception);
            System.exit(1);
        }
        System.exit(0);
    }

    /**
     * Process CLI arguments, exit on invalid input.
     *
     * @param args CLI arguments.
     * @return Argument values.
     */
    private static ArgumentValues processArguments(String[] args) {
        List<String> errors = new ArrayList<>();

        String appKey = processArgument(args, "--appKey", "app key", errors);
        String appSid = processArgument(args, "--appSid", "app sid", errors);
        String baseUrl = processArgument(args, "--baseUrl", "Base url", errors, "https://api.aspose.cloud/");

        if (errors.isEmpty()) return new ArgumentValues(appKey, appSid, baseUrl);

        System.out.println("Failed to launch examples:" + System.lineSeparator() + join(System.lineSeparator(), errors));
        System.exit(1);
        return null;
    }

    /**
     * Retrieves argument value or writes error message.
     *
     * @param args        CLI arguments.
     * @param key         Argument key.
     * @param description Argument description (for error message).
     * @param errors      Errors to append to.
     * @return Argument value, if found.
     */
    private static String processArgument(String[] args, String key, String description, List<String> errors) {
        return processArgument(args, key, description, errors, null);
    }

    /**
     * Retrieves argument value or writes error message.
     *
     * @param args         CLI arguments.
     * @param key          Argument key.
     * @param description  Argument description (for error message).
     * @param errors       Errors to append to.
     * @param defaultValue Default value for optional parameter
     * @return Argument value, if found.
     */
    private static String processArgument(String[] args, String key, String description, List<String> errors, String defaultValue) {
        String argumentValue = null;
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if (!arg.startsWith(key)) continue;

            if (arg.contains("=")) {
                argumentValue = arg.substring(arg.indexOf("=") + 1);
            } else {
                argumentValue = args[i + 1];
            }
            break;
        }

        if (argumentValue != null) return argumentValue;

        if (defaultValue == null)
            errors.add(String.format("Please, provide %s: '%s <value>' or '%s=<value>'", description, key, key));
        else
            argumentValue = defaultValue;

        return argumentValue;
    }

    private static void deleteDirectoryRecursively(Path path) throws IOException {
        if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
            try (DirectoryStream<Path> entries = Files.newDirectoryStream(path)) {
                for (Path entry : entries) {
                    deleteDirectoryRecursively(entry);
                }
            }
        }
        Files.delete(path);
    }

    private static String join(String joinStr, List<String> strings) {
        if (strings == null || strings.size() == 0) {
            return "";
        } else if (strings.size() == 1) {
            return strings.get(0);
        } else {
            StringBuilder sb = new StringBuilder(strings.size() + strings.get(0).length());
            sb.append(strings.get(0));
            for (int i = 1; i < strings.size(); i++) {
                sb.append(joinStr).append(strings.get(i));
            }
            return sb.toString();
        }
    }

    private static final class ArgumentValues {
        public final String AppKey;

        public final String AppSid;

        public final String BaseUrl;

        public ArgumentValues(String appKey, String appSid, String baseUrl) {
            AppKey = appKey;
            AppSid = appSid;
            BaseUrl = baseUrl;
        }
    }
}

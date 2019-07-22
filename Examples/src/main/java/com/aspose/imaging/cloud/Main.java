/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="Main.java">
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
package com.aspose.imaging.cloud;

import com.aspose.imaging.cloud.reverseimagesearch.*;
import com.aspose.imaging.cloud.updateimages.*;

public class Main {

    public static void main(String[] args) {

        // Update parameters of existing BMP image
        UpdateBMPImage manipulateBMPImage = new UpdateBMPImage();
        manipulateBMPImage.modifyBMPFromStorage();
        manipulateBMPImage.createModifiedBmpFromRequestBody();

        // Process existing EMF imaging using given parameters
        UpdateEMFImage updateEMFImage = new UpdateEMFImage();
        updateEMFImage.modifyEMFFromStorage();
        updateEMFImage.createModifiedEMFFromRequestBody();

        // TIFF Frames
        TIFFFrames tiffFrames = new TIFFFrames();
        // Get a frame from existing TIFF image.
        tiffFrames.getImageFrameFromStorage();
        // Get a frame from existing TIFF image, and upload the frame to Cloud Storage.
        tiffFrames.getImageFrameAndUploadToStorage();
        // Resize a TIFF frame.
        tiffFrames.resizeImageFrameFromStorage();
        // Crop a TIFF frame.
        tiffFrames.cropImageFrameFromStorage();
        // RotateFlip a TIFF frame.
        tiffFrames.rotateFlipImageFrameFromStorage();
        // Result will also include all other frames.
        tiffFrames.getAllImageFramesFromStorage();
        // Get a frame from existing TIFF image. Image is passed in a request stream.
        tiffFrames.createImageFrameFromRequestBody();
        // Get a frame properties of a TIFF image.
        tiffFrames.getImageFramePropertiesFromStorage();
        // Get a frame properties of a TIFF image. Image data is passed in a request stream.
        tiffFrames.extractImageFramePropertiesFromRequestBody();

        // Update parameters of existing GIF image
        UpdateGIFImage updateGIFImage = new UpdateGIFImage();
        // Update parameters of a GIF image. The image is saved in the cloud.
        updateGIFImage.modifyGIFFromStorage();
        // Update parameters of a GIF image, and upload updated image to Cloud Storage.
        updateGIFImage.modifyGIFAndUploadToStorage();
        // Update parameters of GIF image. Image data is passed in a request stream.
        updateGIFImage.updateParametersOfGIFImageInRequestBody();

        // Update parameters of existing JPEG2000 image
        UpdateJPEG2000Image updateJPEG2000Image = new UpdateJPEG2000Image();
        // Update parameters of existing JPEG2000 image. The image is saved in the cloud.
        updateJPEG2000Image.modifyJPEG2000FromStorage();
        // Update parameters of existing JPEG2000 image, and upload The image is saved in the cloud.
        updateJPEG2000Image.modifyJPEG2000AndUploadToStorage();
        // Update parameters of existing JPEG2000 image. Image data is passed in a request stream.
        updateJPEG2000Image.createModifiedJPEG2000FromRequestBody();

        // Update parameters of existing JPEG image
        UpdateJPEGImage updateJPEGImage = new UpdateJPEGImage();
        // Update parameters of existing JPEG image. The image is saved in the cloud.
        updateJPEGImage.modifyJPEGFromStorage();
        // Update parameters of existing JPEG image, and upload updated image to cloud storage.
        updateJPEGImage.modifyJPEGAndUploadToStorage();
        // Update parameters of existing JPEG image. Image data is passed in a request stream.
        updateJPEGImage.createModifiedJPEGFromRequestBody();

        // Update parameters of existing PSD image
        UpdatePSDImage updatePSDImage = new UpdatePSDImage();
        // Update parameters of existing PSD image. The image is saved in the cloud.
        updatePSDImage.modifyPSDFromStorage();
        // Update parameters of existing PSD image, and upload updated image to cloud storage.
        updatePSDImage.modifyPSDAndUploadToStorage();
        // Update parameters of existing PSD image. Image is passed in a request stream.
        updatePSDImage.createModifiedPSDFromRequestBody();

        // Update parameters of existing TIFF image
        TIFFImage tiffImage = new TIFFImage();
        // Update parameters of TIFF image. The image is saved in the cloud.
        tiffImage.modifyTIFFFromStorage();
        // Update parameters of TIFF image, and upload updated image to cloud storage.
        tiffImage.modifyTIFFAndUploadToStorage();
        // Update parameters of TIFF image. Image data is passed in a request stream.
        tiffImage.createModifiedTIFFFromRequestBody();
        // Update parameters of TIFF image according to fax parameters.
        tiffImage.convertTIFFToFaxFromStorage();
        // Appends existing TIFF image to another existing TIFF image (i.e. merges TIFF images).
        tiffImage.appendTIFFFromStorage();

        // Update parameters of existing WEBP image
        UpdateWebPImage webpImage = new UpdateWebPImage();
        // Update parameters of existing WEBP image. The image is saved in the cloud.
        webpImage.modifyWEBPFromStorage();
        // Update parameters of existing WEBP image, and upload updated image to cloud storage.
        webpImage.modifyWEBPAndUploadToStorage();
        // Update parameters of existing Webp image. asposelogo.webpImage data is passed in request stream.
        webpImage.updateParametersOfWEBPImageInRequestBody();

        // Process existing WMF image using given parameters
        UpdateWmfImage wmfImage = new UpdateWmfImage();
        // Process existing WMF image using given parameters. The image is saved in the cloud.
        wmfImage.modifyWMFFromStorage();
        // Process existing WMF image using given parameters, and upload updated image to cloud storage.
        wmfImage.modifyWMFAndUploadToStorage();
        // Process existing WMF image using given parameters. Image data is passed in a request stream.
        wmfImage.createModifiedWMFImageFromRequestBody();

        // Export existing image to another format
        ExportImage exportImage = new ExportImage();
        // Export an image to another format.
        exportImage.saveImageAsToFromStorage();
        // Export an image to another format, and upload exported image to Cloud Storage.
        exportImage.saveImageAsAndUploadToStorage();
        // Export an image to another format. Image data is passed in a request stream.
        exportImage.createSavedImageAsFromRequestBody();

        // Crop an existing image
        CropImage cropImage = new CropImage();
        // Crop an existing image.
        cropImage.cropImageFromStorage();
        // Crop an existing image, and upload updated image to Cloud Storage.
        cropImage.cropImageAndUploadToStorage();
        // Crop an image. Image data is passed in a request stream.
        cropImage.createCroppedImageFromRequestBody();

        // Get properties of an image
        ImageProperties imageProperties = new ImageProperties();
        // Get properties of an image, which is stored in the cloud.
        imageProperties.getPropertiesFromStorage();
        // Get properties of an image. Image data is passed in a request stream.
        imageProperties.extractImagePropertiesFromRequestBody();

        // Resize an existing image
        ResizeImage resizeImage = new ResizeImage();
        // Resize an image.
        resizeImage.resizeImageFromStorage();
        // Resize an image, and upload updated image to Cloud Storage.
        resizeImage.resizeImageAndUploadToStorage();
        // Resize an existing image. Image data is passed in request stream.
        resizeImage.createResizedImageFromRequestBody();

        // Rotate and/or flip an existing image
        RotateFlipAnImage rotateFlipAnImage = new RotateFlipAnImage();
        // Rotate and/or flip an image.
        rotateFlipAnImage.rotateFlipImageFromStorage();
        // Rotate and/or flip an image, and upload updated image to Cloud Storage.
        rotateFlipAnImage.rotateFlipImageAndUploadToStorage();
        // Rotate and/or flip an existing image. Image data is passed in request stream.
        rotateFlipAnImage.createRotateFlippedImageFromRequestBody();

        // Perform scaling, cropping and flipping of an existing image in a single request
        UpdateImage updateImage = new UpdateImage();
        updateImage.updateImageFromStorage();
        updateImage.updateImageAndUploadToStorage();
        updateImage.createUpdatedImageFromRequestBody();

        // Reverse Image Search APIs
        // Compare two images
        CompareImages compareImages = new CompareImages();
        compareImages.compareTwoImagesInSearchContext();
        compareImages.compareLoadedImageToImageInSearchContext();

        // Find Duplicate Images
        FindDuplicateImages findDuplicateImages = new FindDuplicateImages();
        findDuplicateImages.findImageDuplicates();

        // Find Similar Images
        FindImages findImages = new FindImages();
        findImages.findSimilarImages();
        findImages.findImagesByTag();

        SearchContext searchContext = new SearchContext();
        // Extract features from image without adding to search context
        searchContext.extractImageFeatures();
        // Add tag and reference image to search context.
        searchContext.createImageTag();

        SearchContextImages searchContextImages = new SearchContextImages();
        // Add image and images features to search context
        searchContextImages.addSearchImage();
        // Get image from search context
        searchContextImages.getSearchImage();
        // Update image and images features in search context
        searchContextImages.updateSearchImage();
        //  Delete image and images features from search context
        searchContextImages.deleteSearchImage();
    }
}

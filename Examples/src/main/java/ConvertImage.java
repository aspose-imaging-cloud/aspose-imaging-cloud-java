/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConvertImage.java">
 *   Copyright (c) 2018-2021 Aspose Pty Ltd. All rights reserved.
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

import com.aspose.imaging.cloud.sdk.model.requests.ConvertImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.CreateConvertedImageRequest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Convert image example.
 */
public class ConvertImage extends ImagingBase {
    /**
     * Initializes a new instance of the ExportImage class.
     *
     * @param imagingApi The imaging API.
     */
    public ConvertImage(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
        super(imagingApi);
        printHeader("Export image example:");
    }

    /**
     * Gets the name of the example image file.
     *
     * @return The name of the example image file.
     */
    @Override
    protected String getSampleImageFileName() {
        return "ExportSampleImage.bmp";
    }

    /**
    *     Convert an image to another format. Image data is passed in a request stream.
    */
    public void createConvertedImageFromReques() throws Exception
    {
    	System.out.println("Convert an image to another format. Image data is passed in a request body");

        Path imagePath = Paths.get(ExampleImagesFolder, getSampleImageFileName());

        // Please refer to https://docs.aspose.cloud/imaging/supported-file-formats/#convert 
        // for possible output formats
        String outFormat = "pdf";
        byte[] updatedImage = convertImageFromRequestExample(imagePath, outFormat);
        saveUpdatedSampleImageToOutput(updatedImage, true, outFormat);        

        System.out.println();
    }    

    /**
    *     Convert an image to another format.
    */
    public void convertImageFromStorage() throws Exception
    {
    	System.out.println("Convert an image to another format");

        uploadSampleImageToCloud();

        // Please refer to https://docs.aspose.cloud/imaging/supported-file-formats/#convert 
        // for possible output formats
        String outFormat = "pdf";
        byte[] updatedImage = ConvertImageFromStorageExample(getSampleImageFileName(), CloudPath, "outFormat");
        saveUpdatedSampleImageToOutput(updatedImage, false, outFormat);        

        System.out.println();
    }

    /**
    *     Convert an image to another format.
     * @throws Exception 
    */
    public void convertImageAndUploadToStorage() throws Exception
    {
    	System.out.println("Convert an image to another format and upload to cloud storage");

        uploadSampleImageToCloud();
        // Please refer to https://docs.aspose.cloud/imaging/supported-file-formats/#convert 
        // for possible output formats
        String outFormat = "pdf";            
        byte[] updatedImage = ConvertImageFromStorageExample(getSampleImageFileName(), CloudPath, outFormat);        
        uploadImageToCloudExample(updatedImage, getModifiedSampleImageFileName(false, outFormat));        

        System.out.println();
    }
    
    /**
    * Convert image from request.
    *
    * @param imagePath Image file path.
    * @param outFormat Conversion format.
     * @throws Exception 
    * @returns Converted image data.
    */
    private byte[] convertImageFromRequestExample(Path imagePath, String outFormat) throws Exception
    {
        // Load image file            
    	byte[] inputImageData = Files.readAllBytes(imagePath);
    	
        String outPath = null; // Path to updated file (if this is empty, response contains image data)
        String storage = null; // Cloud Storage name

        // Create an instance of conversion request
        CreateConvertedImageRequest request = new CreateConvertedImageRequest(inputImageData, outFormat, outPath, storage);

        System.out.println("Call CreateConvertedImage with params: format: " + outFormat);  

        // Convert an image
        byte[] updatedImage = ImagingApi.createConvertedImage(request);

        return updatedImage;

    }

	/**
	* Convert image from storage.
	*
	* @param imageFileName Image file name.
	* @param storageImageFolder Image folder path in cloud storage.
	* @param outFormat Conversion format.
	* @return Converted image data.
	 * @throws Exception 
	*/
    private byte[] ConvertImageFromStorageExample(String imageFileName, String storageImageFolder, String outFormat) throws Exception
    {
        // see UploadImageToCloudExample

        String storage = null; // Cloud Storage name, null - default storage

        // Create an instance of conversion request
        ConvertImageRequest request = new ConvertImageRequest(imageFileName, outFormat, storageImageFolder, storage);
      
        System.out.println("Call ConvertImage with params: format: " + outFormat); 

        // Convert an image
        byte[] updatedImage = ImagingApi.convertImage(request);
        return updatedImage;
    }
}
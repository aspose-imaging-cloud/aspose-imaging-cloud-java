/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ExportImage.java">
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

import com.aspose.imaging.cloud.sdk.model.FilesUploadResult;
import com.aspose.imaging.cloud.sdk.model.requests.ConvertImageRequest;
import com.aspose.imaging.cloud.sdk.model.requests.UploadFileRequest;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoadCustomFonts extends ImagingBase {
	/**
     * Initializes a new instance of the ExportImage class.
     *
     * @param imagingApi The imaging API.
     */
    public LoadCustomFonts(com.aspose.imaging.cloud.sdk.api.ImagingApi imagingApi) {
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
        return "ImageWithCustomFonts.emz";
    }    
    
   /**
    * Using custom fonts for vector image conversion example.
    * @throws Exception 
    */
    public void usingCustomFontsForVectorImageConversion() throws Exception
    {
    	System.out.println("Using custom fonts for vector image conversion");

    	uploadSampleImageToCloud();

        // custom fonts should be loaded to storage to 'Fonts' folder
        // 'Fonts' folder should be placed to the root of the cloud storage
        uploadFontsToCloud();

        String format = "png";
        String folder = CloudPath; // Input file is saved at the Examples folder in the storage
        String storage = null; // Cloud Storage name
        ConvertImageRequest request = new ConvertImageRequest(getSampleImageFileName(), format, folder, storage);

        System.out.println("Call Convert with params: format:" + format);
        
        byte[] updatedImage = ImagingApi.convertImage(request);
        saveUpdatedSampleImageToOutput(updatedImage, true, format);       

        System.out.println();
    }
    
   /**
    *     Uploads custom fonts to cloud.
    */
    protected void uploadFontsToCloud() throws Exception{
    	
        String fontsFolder = Paths.get(ExampleImagesFolder, "Fonts").toAbsolutePath().toString();        
        File folder = new File(fontsFolder);           
        File [] files = folder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".xml");
            }
        });

        for (File file : files) {        	
    		byte[] fontContent = Files.readAllBytes(file.getAbsoluteFile().toPath());        	
            uploadToCloud(Paths.get("Fonts", file.getName()).toAbsolutePath().toString(), fontContent);
           }
    }           

   /**
    * Uploads the file to cloud.
    *
    * @param fileName Name of the file.
    * @param file     The file content.
    * @throws Exception
    */
    private void uploadToCloud(String fileName, byte[] file) throws Exception{
    	UploadFileRequest request = new UploadFileRequest(fileName, file, null);
        FilesUploadResult response = ImagingApi.uploadFile(request);
        System.out.println(response.getErrors() == null || response.getErrors().size() == 0
                ? "File " + fileName + " is uploaded to cloud storage"
                : "Uploading errors count: " + response.getErrors().size());
    }    

}

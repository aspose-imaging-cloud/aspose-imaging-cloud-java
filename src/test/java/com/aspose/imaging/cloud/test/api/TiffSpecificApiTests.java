/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TiffSpecificApiTests.java">
*   Copyright (c) 2019 Aspose Pty Ltd.
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
package com.aspose.imaging.cloud.test.api;

import com.aspose.imaging.cloud.sdk.invoker.internal.StreamHelper;
import com.aspose.imaging.cloud.sdk.model.StorageFile;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.sdk.stablemodel.*;
import com.aspose.imaging.cloud.test.base.ApiTester;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.junit.Test;
import org.junit.Assert;

import java.lang.reflect.Method;

/**
 * Class for testing TIFF-related API calls
 */
public class TiffSpecificApiTests extends ApiTester {

    private GetTiffToFaxRequest getTiffToFaxRequest;

    /**
     * Test operation: Update parameters of existing TIFF image accordingly to fax parameters.
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTiffToFaxTest() throws Exception {
        String name = "test.tiff";
        String outPath = null;
        String folder = getTempFolder();
        String storage = TestStorage;
        String outName = name + "_fax." + "tiff";
        getTiffToFaxRequest = new GetTiffToFaxRequest(name, storage, folder, outPath);
        
        Method propertiesTester = TiffSpecificApiTests.class.getDeclaredMethod("getTiffToFaxPropertiesTester", ImagingResponse.class, ImagingResponse.class, byte[].class);
        propertiesTester.setAccessible(true);
        Method requestInvoker = TiffSpecificApiTests.class.getDeclaredMethod("getTiffToFaxGetRequestInvoker", String.class, String.class);
        requestInvoker.setAccessible(true);
        this.testGetRequest(
            "getTiffToFaxTest", 
            true,
            String.format("Input image: %s",
                    name),
            name,
            outName,
            requestInvoker,
            propertiesTester,
            folder,
            storage);
    }
    
    /**
     * Test operation: Appends existing TIFF image to another existing TIFF image (i.e. merges TIFF images).
     * 
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postTiffAppendTest() throws Exception {
        Boolean passed = false;
        System.out.println("Test method: postTiffAppendTest");

        String inputFileName = "test.tiff";
        String folder = getTempFolder();

        if (!checkInputFileExists(inputFileName))
        {
            throw new Exception(
                    String.format("Input file %s doesn't exist in the specified storage folder: %s. Please, upload it first.",
                            inputFileName, folder));
        }

        String resultFileName = inputFileName + "_merged.tiff";
        String outPath = null;
        String inputPath = getTempFolder() + "/" + inputFileName;
        String storage = TestStorage;

        try
        {
            System.out.println("Input image: " + inputFileName);

            outPath = folder + "/" + resultFileName;

            // remove output file from the storage (if exists)
            if (ImagingApi.objectExists(new ObjectExistsRequest(outPath, storage, null)).isExists())
            {
                ImagingApi.deleteFile(new DeleteFileRequest(outPath, storage, null));
            }
            
            this.copyInputFileToFolder(inputFileName, folder, storage);
            ImagingApi.copyFile(new CopyFileRequest(inputPath, outPath, storage, storage, null));
            Assert.assertTrue(ImagingApi.objectExists(new ObjectExistsRequest(outPath, storage, null)).isExists());

            PostTiffAppendRequest request = new PostTiffAppendRequest(resultFileName, inputFileName, storage, folder);
            ImagingApi.postTiffAppend(request);
            StorageFile resultInfo = getStorageFileInfo(folder, resultFileName, storage);
            if (resultInfo == null)
            {
                throw new Exception(
                        String.format("Result file %s doesn't exist in the specified storage folder: %s. Result isn't present in the storage by an unknown reason.",
                                resultFileName, folder));
            }

            ImagingResponse resultProperties =
                    ImagingApi.getImageProperties(new GetImagePropertiesRequest(resultFileName, folder, storage));
            Assert.assertNotNull(resultProperties);
            ImagingResponse originalProperties =
                    ImagingApi.getImageProperties(new GetImagePropertiesRequest(inputFileName, folder, storage));
            Assert.assertNotNull(originalProperties);

            Assert.assertNotNull(resultProperties.getTiffProperties());
            Assert.assertNotNull(originalProperties.getTiffProperties());
            Assert.assertEquals(originalProperties.getTiffProperties().getFrames().size() * 2,
                    resultProperties.getTiffProperties().getFrames().size());
            Assert.assertEquals(originalProperties.getWidth(), resultProperties.getWidth());
            Assert.assertEquals(originalProperties.getHeight(), resultProperties.getHeight());

            passed = true;
        }
        catch (Exception ex)
        {
            failedAnyTest = true;
            System.out.println(ex.getMessage());
            throw ex;
        }
        finally
        {
            if (!failedAnyTest && RemoveResult && ImagingApi.objectExists(new ObjectExistsRequest(outPath, storage, null)).isExists())
            {
                ImagingApi.deleteFile(new DeleteFileRequest(outPath, storage, null));
            }
            
            System.out.println("Test passed: " + passed);
        }
    }
    
    /**
     * Invokes GET request for getTiffToFax operation. Used indirectly by method reference.
     * @param name Image file name
     * @param outPath Out path
     * @return API response
     * @throws Exception 
     */
    private byte[] getTiffToFaxGetRequestInvoker(String name, String outPath) throws Exception
    {
        getTiffToFaxRequest.name = name;
        getTiffToFaxRequest.outPath = outPath;
        return ImagingApi.getTiffToFax(getTiffToFaxRequest);
    }
    
    /**
     * Tests properties for getTiffToFax operation. Used indirectly by method reference.
     * @param originalProperties Original image properties
     * @param resultProperties Result image properties
     * @param resultData Result image data
     */
    private void getTiffToFaxPropertiesTester(ImagingResponse originalProperties, ImagingResponse resultProperties, byte[] resultData)
    {
        Assert.assertNotNull(resultProperties.getTiffProperties());
        Assert.assertEquals(1, (int)resultProperties.getBitsPerPixel());
        Assert.assertEquals(196, (int)Math.ceil((double)resultProperties.getVerticalResolution()));
        Assert.assertEquals(204, (int)Math.ceil((double)resultProperties.getHorizontalResolution()));
        Assert.assertEquals(1728, (int)resultProperties.getWidth());
        Assert.assertEquals(2200, (int)resultProperties.getHeight());
    }
}
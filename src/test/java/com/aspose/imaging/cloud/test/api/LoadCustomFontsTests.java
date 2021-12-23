/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="LoadCustomFontsTests.java">
*   Copyright (c) 2018-2021 Aspose Pty Ltd.
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

import com.aspose.imaging.cloud.sdk.model.StorageFile;
import com.aspose.imaging.cloud.sdk.model.requests.*;
import com.aspose.imaging.cloud.sdk.stablemodel.*;
import com.aspose.imaging.cloud.test.base.ApiTester;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.Parameters;

import java.lang.Iterable;
import java.util.Arrays;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.lang.Math;

/**
 * Class for testing using custom fonts 
 */
public class LoadCustomFontsTests extends ApiTester {
	 private ConvertImageRequest convertImageRequest;
	 
	 protected final static String OriginalDataFolder = ApiTester.OriginalDataFolder + "/UseCases";
	 
	 @Test
	    public void usingCustomFontsForVectorImageTest() throws Exception {
		 
		 	String name = null;
		 	String format ="png";
	        String folder = getTempFolder()+ "/UseCases";
	        String storage = TestStorage;
	        convertImageRequest = new ConvertImageRequest(name, format, folder, storage);
		    		  
		    Method requestInvoker = LoadCustomFontsTests.class.getDeclaredMethod("convertImageAsGetRequestInvoker", String.class);
		    requestInvoker.setAccessible(true);
		    this.testGetRequest(
		        "usingCustomFontsForVectorImageTest", 
		        String.format("Input image: %s; Output format: %s",
		                name, format),
		        name,
		        requestInvoker,
		        null,
		        folder,
		        storage);
	 }
	 
	 /**
	     * Invokes GET request for saveImageAs operation. Used indirectly by method reference.
	     * @param name Image file name
	     * @return API response
	     * @throws Exception 
	     */
	    private byte[] convertImageAsGetRequestInvoker(String name) throws Exception
	    {
	    	convertImageRequest.name = name;
	        byte[] res = ImagingApi.convertImage(convertImageRequest);
	        Assert.assertTrue(Math.abs((int)res.length - 11454) < 100);
	        return res;
	    }
}
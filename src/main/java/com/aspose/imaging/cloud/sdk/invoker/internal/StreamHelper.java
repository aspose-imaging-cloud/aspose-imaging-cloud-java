/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="StreamHelper.java">
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

package com.aspose.imaging.cloud.sdk.invoker.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Stream helper class
 */
public class StreamHelper
{
	/**
	 * Copies content of one stream to another.
	 * @param source The source.
	 * @param destination The destination.
	 * @throws IOException
	 */
    public static void copyTo(InputStream source, OutputStream destination) throws IOException
    {
    	copyTo(source, destination, 81920);
    }
	    
    /**
     * Copies content of one stream to another.
	 * @param source The source.
	 * @param destination The destination.
     * @param bufferSize Size of the buffer.
     * @throws IOException
     */
    public static void copyTo(InputStream source, OutputStream destination, int bufferSize) throws IOException
    {
        byte[] array = new byte[bufferSize];
        int count;
        while ((count = source.read(array, 0, array.length)) != 0)
        {
            destination.write(array, 0, count);
        }
    }

    /**
     * Reads stream content as bytes.
     * @param input The input.
     * @return Stream content as bytes.
     * @throws IOException
     */
    public static byte[] readAsBytes(InputStream input) throws IOException
    {
    	if (input == null)
    	{
    		return new byte[0];
    	}
    	
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int nRead;
        byte[] data = new byte[16 * 1024];

        while ((nRead = input.read(data, 0, data.length)) != -1) {
          buffer.write(data, 0, nRead);
        }

        buffer.flush();

        return buffer.toByteArray();
    }       

    /**
     * Reads stream content as string.
     * @param input The input.
     * @return Stream content as string.
     * @throws IOException
     */
    public static String toString(InputStream input) throws IOException
    {
    	ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int nRead;
        byte[] data = new byte[16 * 1024];

        while ((nRead = input.read(data, 0, data.length)) != -1) {
          buffer.write(data, 0, nRead);
        }

        buffer.flush();

        return buffer.toString();
    }  
}
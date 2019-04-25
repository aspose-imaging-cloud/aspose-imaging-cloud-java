/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="IRequestHandler.java">
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

package com.aspose.imaging.cloud.sdk.invoker.internal.requesthandlers;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;

/**
 * Request handler interface.
 */
public interface IRequestHandler
{
    /**
     * Processes the URL.
     * @param url The URL.
     * @return Processed URL.
     * @throws URISyntaxException 
     * @throws IllegalArgumentException 
     * @throws IOException 
     * @throws Exception 
     */
    String processUrl(String url) throws IllegalArgumentException, URISyntaxException, IOException, Exception;

    /**
     * Processes parameters before sending.
     * @param connection The connection.
     * @param streamToSend The stream to send.
     * @throws Exception 
     */
    void beforeSend(HttpURLConnection connection, OutputStream streamToSend) throws Exception;

    /**
     * Processes the response.
     * @param connection The connection.
     * @param resultData The result data.
     * @throws IOException 
     * @throws Exception 
     */
    void processResponse(HttpURLConnection connection, byte[] resultData) throws IOException, Exception;
}
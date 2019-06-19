/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DebugLogRequestHandler.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd.
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
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.aspose.imaging.cloud.sdk.invoker.Configuration;

/**
 * Debug log request handler.
 */
/// <summary>
public class DebugLogRequestHandler implements IRequestHandler
{
    /**
     * The configuration
     */
    private final Configuration configuration;
    
    private static final Logger logger = Logger.getLogger("com.aspose.imaging");

    /**
     * Initializes a new instance of the DebugLogRequestHandler class.
     * @param configuration The configuration.
     */
    public DebugLogRequestHandler(Configuration configuration)
    {
        this.configuration = configuration;
    }

    /**
     * Processes the URL.
     * @param url The URL.
     * @return Processed URL.
     */
    public String processUrl(String url)
    {
        return url;
    }
    
    /**
     * Processes parameters before sending.
     * @param connection The connection.
     * @param streamToSend The stream to send.
     */
    public void beforeSend(HttpURLConnection connection, OutputStream streamToSend)
    {
        if (this.configuration.getDebugMode())
        {
            this.logRequest(connection, streamToSend);
        }
    }  
    
    /**
     * Processes the response.
     * @param connection The connection.
     * @param resultStream The result data.
     * @throws IOException 
     */
    public void processResponse(HttpURLConnection connection, byte[] resultData) throws IOException
    {
        if (this.configuration.getDebugMode())
        {
            this.logResponse(connection, resultData);
        }
    }
    
    /**
     * Logs the request.
     * @param connection The connection.
     * @param streamToSend The stream to send.
     */
    private void logRequest(HttpURLConnection connection, OutputStream streamToSend)
    {
        String header = String.format("\r\nRequest %s: %s", connection.getRequestMethod(), connection.getURL().toString());
        this.log(header);
        if (streamToSend != null)
        {
            this.log(streamToSend.toString());
        }
    }

    /**
     * Logs the response.
     * @param connection The connection.
     * @param resultStream The result data.
     * @throws IOException
     */
    private void logResponse(HttpURLConnection connection, byte[] resultData) throws IOException
    {
        String header = String.format("\r\nResponse %d: %s", connection.getResponseCode(), connection.getResponseMessage());
        this.log(header);
        
        StringBuilder sb = new StringBuilder();
        this.formatHeaders(sb, connection.getHeaderFields());
        this.log(sb.toString());
        
        this.log(resultData.toString());
    }

    /**
     * Formats the headers.
     * @param sb The string builder.
     * @param headerDictionary The header dictionary.
     */
    private void formatHeaders(StringBuilder sb, Map<String, List<String>> headerDictionary)
    {
        for (String key : headerDictionary.keySet())
        {
            sb.append(key);
            sb.append(": ");
            List<String> values = headerDictionary.get(key);
            for (String value : values)
            {
                sb.append(value + "; ");
            }
            
            sb.append("\n");
        }
    }

    /**
     * Logs the specified string.
     * @param string The string to log.
     */
    private void log(String string)
    {
        logger.log(Level.FINE, string);
        System.out.println(string);
    }
}
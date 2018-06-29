/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ApiInvoker.java">
*   Copyright (c) 2018 Aspose Pty Ltd.
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
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import com.aspose.imaging.cloud.sdk.api.ImagingApi;
import com.aspose.imaging.cloud.sdk.invoker.ApiException;
import com.aspose.imaging.cloud.sdk.invoker.internal.requesthandlers.IRequestHandler;

/**
 * API invoker class
 */
public class ApiInvoker
{
	/**
	 * Aspose client header name
	 */
    private final String AsposeClientHeaderName = "x-aspose-client";

    /**
     * Aspose client version header name
     */
    private final String AsposeClientVersionHeaderName = "x-aspose-client-version";

    /**
     * The default header map
     */
    private final HashMap<String, String> defaultHeaderMap = new HashMap<String, String>();

    /**
     * The request handlers
     */
    private final IRequestHandler[] requestHandlers;

    /**
     * Initializes a new instance of the ApiInvoker class.
     * @param requestHandlers The request handlers.
     */
    public ApiInvoker(IRequestHandler[] requestHandlers)
    {
        String sdkVersion = ImagingApi.Version;
        this.addDefaultHeader(AsposeClientHeaderName, "java sdk");
        this.addDefaultHeader(AsposeClientVersionHeaderName, sdkVersion);
        this.requestHandlers = requestHandlers;
    }

    /**
     * Invokes the API.
     * @param path The path.
     * @param method The method.
     * @param body The body.
     * @param headerParams The header parameters.
     * @param formParams The form parameters.
     * @return Resulting data.
     * @throws Exception 
     */
    public byte[] invokeApi(
        String path,
        String method,
        String body,
        HashMap<String, String> headerParams,
        HashMap<String, Object> formParams) throws Exception
    {
        return this.invokeInternal(path, method, body, headerParams, formParams, "application/json");
    }
    
    /**
     * Invokes the API.
     * @param path The path.
     * @param method The method.
     * @param body The body.
     * @param headerParams The header parameters.
     * @param formParams The form parameters.
     * @param contentType Type of the content.
     * @return Resulting data.
     * @throws Exception 
     */
    public byte[] invokeApi(
        String path,
        String method,
        String body,
        HashMap<String, String> headerParams,
        HashMap<String, Object> formParams,
        String contentType) throws Exception
    {
        return this.invokeInternal(path, method, body, headerParams, formParams, contentType);
    }

    /**
     * Converts stream to the file information parameter.
     * @param stream The stream.
     * @param paramName Name of the parameter.
     * @return File information parameter.
     * @throws IOException 
     */
    public FileInfo toFileInfo(InputStream stream, String paramName) throws IOException
    {
    	FileInfo fileInfo = new FileInfo();
    	fileInfo.Name = paramName;
    	fileInfo.MimeType = "application/octet-stream";
    	fileInfo.file = StreamHelper.readAsBytes(stream);
    	return fileInfo;
    }
    
    /**
     * Converts bytes to the file information parameter.
     * @param data The data bytes.
     * @param paramName Name of the parameter.
     * @return File information parameter.
     */
    public FileInfo toFileInfo(byte[] data, String paramName)
    {
    	FileInfo fileInfo = new FileInfo();
    	fileInfo.Name = paramName;
    	fileInfo.MimeType = "application/octet-stream";
    	fileInfo.file = data;
    	return fileInfo;
    }

    /**
     * Converts bytes to the file information parameter.
     * @param data The data bytes.
     * @return File information parameter.
     */
    public FileInfo toFileInfo(byte[] data)
    {
    	FileInfo fileInfo = new FileInfo();
    	fileInfo.Name = "file";
    	fileInfo.MimeType = "application/octet-stream";
    	fileInfo.file = data;
    	return fileInfo;
    }

    /**
     * Gets the multipart form data.
     * @param postParameters The post parameters.
     * @param boundary The boundary.
     * @return
     */
    private static byte[] getMultipartFormData(HashMap<String, Object> postParameters, String boundary)
    {
    	ByteArrayOutputStream formDataStream = new ByteArrayOutputStream();
    	
        Boolean needsClrf = false;
    	Charset utf8 = Charset.forName("UTF-8");
        
        if (postParameters.size() > 1)
        {
            for (Map.Entry<String, Object> param : postParameters.entrySet())
            {
                if (needsClrf)
                {                	
                    WriteStringToStream(formDataStream, "\r\n", utf8);
                }

                needsClrf = true;

                Object paramValue = param.getValue();
                if (paramValue instanceof FileInfo)
                {
                    FileInfo fileInfo = (FileInfo)paramValue;
                    String postData =
                        String.format(
                            "--%s}\r\nContent-Disposition: form-data; name=\"%s\"; filename=\"%s\"\r\nContent-Type: %s\r\n\r\n",
                            boundary,
                            param.getKey(),
                            fileInfo.MimeType);
                   
                    WriteStringToStream(formDataStream, postData, utf8);

                    // Write the file data directly to the Stream, rather than serializing it to a String.
                    formDataStream.write(fileInfo.file, 0, fileInfo.file.length);
                }
                else
                {
                    String StringData;
                    if (paramValue instanceof String)
                    {
                        StringData = (String)paramValue;
                    }
                    else
                    {
                        StringData = SerializationHelper.serialize(paramValue);
                    }

                    String postData =
                        String.format(
                            "--%s\r\nContent-Disposition: form-data; name=\"%s\"\r\n\r\n%s",
                            boundary,
                            param.getKey(),
                            StringData);
                   
                    WriteStringToStream(formDataStream, postData, utf8);
                }
            }

            // Add the end of the request.  Start with a newline
            String footer = "\r\n--" + boundary + "--\r\n";             
           
            WriteStringToStream(formDataStream, footer, utf8);
        }
        else
        {
            for (Map.Entry<String, Object> param : postParameters.entrySet())
            {
            	Object paramValue = param.getValue();
                if (paramValue instanceof FileInfo)
                {
                	FileInfo fileInfo = (FileInfo)paramValue;

                    // Write the file data directly to the Stream, rather than serializing it to a String.
                    formDataStream.write(fileInfo.file, 0, fileInfo.file.length);
                }
                else
                {
                    String postData;
                    if (!(paramValue instanceof String))
                    {
                        postData = SerializationHelper.serialize(paramValue);
                    }
                    else
                    {
                        postData = (String)paramValue;
                    }   
                    
                    WriteStringToStream(formDataStream, postData, utf8);
                }
            }
        }

        return formDataStream.toByteArray();
    }
    
    private static void WriteStringToStream(ByteArrayOutputStream formDataStream, String data, Charset charset)
    {
    	 ByteBuffer postBytes = charset.encode(data);
    	 byte[] bytesArray = postBytes.array();
         formDataStream.write(bytesArray, 0, bytesArray.length);
    }

    /**
     * Adds the default header.
     * @param key The key.
     * @param value The value.
     */
    private void addDefaultHeader(String key, String value)
    {
        if (!this.defaultHeaderMap.containsKey(key))
        {
            this.defaultHeaderMap.put(key, value);
        }
    }

    /**
     * Invokes the internal API.
     * @param path The path.
     * @param method The method.
     * @param body The body.
     * @param headerParams The header parameters.
     * @param formParams The form parameters.
     * @param contentType Type of the content.
     * @return Resulting data.
     * @throws Exception 
     */
    private byte[] invokeInternal(
        String path,
        String method,
        String body,
        HashMap<String, String> headerParams,
        HashMap<String, Object> formParams,
        String contentType) throws Exception
    {
        if (formParams == null)
        {
            formParams = new HashMap<String, Object>();
        }

        if (headerParams == null)
        {
            headerParams = new HashMap<String, String>();
        }
        
        for (IRequestHandler handler : this.requestHandlers)
        {
        	path = handler.processUrl(path);
        }

        HttpURLConnection request;
        try
        {
            request = this.prepareRequest(path, method, formParams, headerParams, body, contentType);
            return this.readResponse(request);
        }
        catch (NeedRepeatRequestException e)
        {
            request = this.prepareRequest(path, method, formParams, headerParams, body, contentType);
            return this.readResponse(request);
        }
    }

    /**
     * Prepares the request.
     * @param path The path.
     * @param method The method.
     * @param formParams The form parameters.
     * @param headerParams The header parameters.
     * @param body The body.
     * @param contentType Type of the content.
     * @return Prepared request.
     * @throws IOException 
     */
    private HttpURLConnection prepareRequest(String path, String method, HashMap<String, Object> formParams, 
      HashMap<String, String> headerParams, String body, String contentType) throws IOException
    {
     HttpURLConnection connection = (HttpURLConnection)new URL(path).openConnection();
     if (method.equals("PUT") || method.equals("POST"))
     {   
      connection.setDoOutput(true);
     }
        
        connection.setUseCaches(false);
     connection.setRequestMethod(method);

        byte[] formData = null;
        if (formParams.size() > 0)
        {
            if (formParams.size() > 1)
            {
                String formDataBoundary = "Somthing";
                connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + formDataBoundary);
                formData = getMultipartFormData(formParams, formDataBoundary);
            }
            else
            {
             connection.setRequestProperty("Content-Type", "multipart/form-data");
                formData = getMultipartFormData(formParams, "");
            }

            connection.setFixedLengthStreamingMode(formData.length);
        }

        for (Map.Entry<String, String> headerParamsItem : this.defaultHeaderMap.entrySet())
        {
         connection.setRequestProperty(headerParamsItem.getKey(), headerParamsItem.getValue());
        }

        for (Map.Entry<String, String> defaultHeaderMapItem : headerParams.entrySet())
        {
         if (!headerParams.containsKey(defaultHeaderMapItem.getKey()))
            {
             connection.setRequestProperty(defaultHeaderMapItem.getKey(), defaultHeaderMapItem.getValue());
            }
        }
        
        OutputStream outStream = null;
        ByteArrayOutputStream streamToSend = null;
        try
        {
         if (method.equals("PUT") || method.equals("POST"))
         {         
          streamToSend = new ByteArrayOutputStream();

                if (formData != null)
                {
                    streamToSend.write(formData, 0, formData.length);
                }

                if (body != null)
                {
                 byte[] bodyBytes = body.getBytes();
                 streamToSend.write(bodyBytes, 0, bodyBytes.length);
                }
         }

            for (IRequestHandler handler : this.requestHandlers)
            {
             handler.beforeSend(connection, streamToSend);
            }
            
            if (streamToSend != null)
            {
             if (streamToSend.size() > 0)
             {
              connection.connect();
                 outStream = connection.getOutputStream();
                 outStream.write(streamToSend.toByteArray());
             }
             else
             {
              connection.setFixedLengthStreamingMode(0);
             }
            }
        }
        finally
        {
            if (outStream != null)
            {
             outStream.flush();
             outStream.close();
            }
            
            if (streamToSend != null)
            {
             streamToSend.close();
            }
        }

        return connection;
    }

    /**
     * Reads the response.
     * @param client The client.
     * @return Response data.
     * @throws Exception 
     */
    private byte[] readResponse(HttpURLConnection client) throws Exception
    {
    	InputStream inputStream = null;
    	
        try
        {
        	inputStream = client.getInputStream();
        	byte[] resultData = StreamHelper.readAsBytes(inputStream);
        	
        	for (IRequestHandler handler : this.requestHandlers)
        	{
        		handler.processResponse(client, resultData);
        	}
        	
            return resultData;
        }
        finally
        {
        	client.disconnect();
        	
        	if (inputStream != null)
        	{
        		inputStream.close();
        	}
        }
    }
}
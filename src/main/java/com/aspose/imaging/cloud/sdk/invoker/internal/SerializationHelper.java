/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SerializationHelper.java">
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

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import com.aspose.imaging.cloud.sdk.invoker.JSON;
import com.aspose.imaging.cloud.sdk.invoker.ApiException;

/** 
 * Serialization helper class
 */
public class SerializationHelper
{
	/**
	 * Serializes the specified object.
	 * @param obj The object.
	 * @return Serialized object.
	 */
    public static String serialize(Object obj)
    {
        try
        {
            return JSON.serialize(obj);
        }
        catch (Exception e)
        {
            throw new ApiException(500, e.getMessage());
        }
    }        

    /**
     * Deserializes the specified JSON string.
     * @param jsonString The JSON string.
     * @param returnType Return type.
     * @return Deserialized JSON string.
     */
    public static <T> T deserialize(String jsonString, Class<T> returnType)
    {
        try
        {
        	if (jsonString.startsWith("{") || jsonString.startsWith("["))
            {
            	return JSON.deserialize(jsonString, returnType);
            }
            else
            {
            	Serializer serializer = new Persister();
            	return serializer.read(returnType, jsonString);
            }
        }
        catch (Exception e)
        {
        	throw new ApiException(500, e.getMessage());
        }
    }        
}
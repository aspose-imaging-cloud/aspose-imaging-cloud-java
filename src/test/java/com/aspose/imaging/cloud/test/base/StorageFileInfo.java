/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="StorageFileInfo.java">
*   Copyright (c) 2018 Aspose Pty Ltd. All rights reserved.
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
package com.aspose.imaging.cloud.test.base;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The storage file info
 */
public class StorageFileInfo
{
	private String name;
	private Boolean isFolder;
	private String modifiedDate;
	private long size;
	private String path;
	private Boolean isDirectory;

	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	@JsonProperty("Name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("IsFolder")
	public Boolean getIsFolder() {
		return isFolder;
	}

	@JsonProperty("IsFolder")
	public void setIsFolder(Boolean isFolder) {
		this.isFolder = isFolder;
	}

	@JsonProperty("ModifiedDate")
	public String getModifiedDate() {
		return modifiedDate;
	}

	@JsonProperty("ModifiedDate")
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	@JsonProperty("Size")
	public long getSize() {
		return size;
	}

	@JsonProperty("Size")
	public void setSize(long size) {
		this.size = size;
	}

	@JsonProperty("Path")
	public String getPath() {
		return path;
	}

	@JsonProperty("Path")
	public void setPath(String path) {
		this.path = path;
	}

	@JsonProperty("IsDirectory")
	public Boolean getIsDirectory() {
		return isDirectory;
	}

	@JsonProperty("IsDirectory")
	public void setIsDirectory(Boolean isDirectory) {
		this.isDirectory = isDirectory;
	}
}
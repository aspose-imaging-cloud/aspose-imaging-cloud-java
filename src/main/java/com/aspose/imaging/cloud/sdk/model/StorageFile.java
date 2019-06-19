/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="StorageFile.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
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

package com.aspose.imaging.cloud.sdk.model;

import org.apache.commons.lang3.ObjectUtils;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.aspose.imaging.cloud.sdk.stablemodel.*;

/**
 * File or folder information
 */
public class StorageFile {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isFolder")
  private Boolean isFolder = null;

  @JsonProperty("modifiedDate")
  private Date modifiedDate = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("path")
  private String path = null;

  public StorageFile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * File or folder name.
   * @return name
  **/
  public String getName() {
    return name;
  }  

  public void setName(String name) {
    this.name = name;
  }

  public StorageFile isFolder(Boolean isFolder) {
    this.isFolder = isFolder;
    return this;
  }

  /**
   * True if it is a folder.
   * @return isFolder
  **/
  public Boolean isIsFolder() {
    return isFolder;
  }  

  public void setIsFolder(Boolean isFolder) {
    this.isFolder = isFolder;
  }

  public StorageFile modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * File or folder last modified DateTime.
   * @return modifiedDate
  **/
  public Date getModifiedDate() {
    return modifiedDate;
  }  

  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public StorageFile size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * File or folder size.
   * @return size
  **/
  public Long getSize() {
    return size;
  }  

  public void setSize(Long size) {
    this.size = size;
  }

  public StorageFile path(String path) {
    this.path = path;
    return this;
  }

  /**
   * File or folder path.
   * @return path
  **/
  public String getPath() {
    return path;
  }  

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    StorageFile storageFile = (StorageFile) o;
    return ObjectUtils.equals(this.name, storageFile.name) &&
    ObjectUtils.equals(this.isFolder, storageFile.isFolder) &&
    ObjectUtils.equals(this.modifiedDate, storageFile.modifiedDate) &&
    ObjectUtils.equals(this.size, storageFile.size) &&
    ObjectUtils.equals(this.path, storageFile.path);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, isFolder, modifiedDate, size, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageFile {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EpsProperties.java">
*   Copyright (c) 2018-2020 Aspose Pty Ltd. All rights reserved.
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
 * EpsProperties
 */
public class EpsProperties {
  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("height")
  private Integer height = null;

  @JsonProperty("boundingBoxString")
  private String boundingBoxString = null;

  @JsonProperty("creationDateString")
  private String creationDateString = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("postScriptVersion")
  private String postScriptVersion = null;

  @JsonProperty("title")
  private String title = null;

  public EpsProperties width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Gets the width.
   * @return width
  **/
  public Integer getWidth() {
    return width;
  }  

  public void setWidth(Integer width) {
    this.width = width;
  }

  public EpsProperties height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Gets the height.
   * @return height
  **/
  public Integer getHeight() {
    return height;
  }  

  public void setHeight(Integer height) {
    this.height = height;
  }

  public EpsProperties boundingBoxString(String boundingBoxString) {
    this.boundingBoxString = boundingBoxString;
    return this;
  }

  /**
   * Gets the BoundingBox.
   * @return boundingBoxString
  **/
  public String getBoundingBoxString() {
    return boundingBoxString;
  }  

  public void setBoundingBoxString(String boundingBoxString) {
    this.boundingBoxString = boundingBoxString;
  }

  public EpsProperties creationDateString(String creationDateString) {
    this.creationDateString = creationDateString;
    return this;
  }

  /**
   * Gets the CreationDate.
   * @return creationDateString
  **/
  public String getCreationDateString() {
    return creationDateString;
  }  

  public void setCreationDateString(String creationDateString) {
    this.creationDateString = creationDateString;
  }

  public EpsProperties creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Gets the Creator.
   * @return creator
  **/
  public String getCreator() {
    return creator;
  }  

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public EpsProperties postScriptVersion(String postScriptVersion) {
    this.postScriptVersion = postScriptVersion;
    return this;
  }

  /**
   * Gets the PostScript version.
   * @return postScriptVersion
  **/
  public String getPostScriptVersion() {
    return postScriptVersion;
  }  

  public void setPostScriptVersion(String postScriptVersion) {
    this.postScriptVersion = postScriptVersion;
  }

  public EpsProperties title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Gets the Title.
   * @return title
  **/
  public String getTitle() {
    return title;
  }  

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EpsProperties epsProperties = (EpsProperties) o;
    return ObjectUtils.equals(this.width, epsProperties.width) &&
    ObjectUtils.equals(this.height, epsProperties.height) &&
    ObjectUtils.equals(this.boundingBoxString, epsProperties.boundingBoxString) &&
    ObjectUtils.equals(this.creationDateString, epsProperties.creationDateString) &&
    ObjectUtils.equals(this.creator, epsProperties.creator) &&
    ObjectUtils.equals(this.postScriptVersion, epsProperties.postScriptVersion) &&
    ObjectUtils.equals(this.title, epsProperties.title);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(width, height, boundingBoxString, creationDateString, creator, postScriptVersion, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EpsProperties {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    boundingBoxString: ").append(toIndentedString(boundingBoxString)).append("\n");
    sb.append("    creationDateString: ").append(toIndentedString(creationDateString)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    postScriptVersion: ").append(toIndentedString(postScriptVersion)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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


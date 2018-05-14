/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="JpegProperties.java">
*   Copyright (c) 2018 Aspose.Imaging for Cloud
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

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents information about image in JPEG format.
 */
public class JpegProperties {
  @JsonProperty("Comment")
  private String comment = null;

  @JsonProperty("JpegExifData")
  private JpegExifData jpegExifData = null;

  @JsonProperty("JpegJfifData")
  private JfifData jpegJfifData = null;

  public JpegProperties comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Gets or sets the comment.
   * @return comment
  **/
  @ApiModelProperty(value = "Gets or sets the comment.")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public JpegProperties jpegExifData(JpegExifData jpegExifData) {
    this.jpegExifData = jpegExifData;
    return this;
  }

   /**
   * Gets or sets the JPEG EXIF data.
   * @return jpegExifData
  **/
  @ApiModelProperty(value = "Gets or sets the JPEG EXIF data.")
  public JpegExifData getJpegExifData() {
    return jpegExifData;
  }

  public void setJpegExifData(JpegExifData jpegExifData) {
    this.jpegExifData = jpegExifData;
  }

  public JpegProperties jpegJfifData(JfifData jpegJfifData) {
    this.jpegJfifData = jpegJfifData;
    return this;
  }

   /**
   * Gets or sets the JPEG JFIF data.
   * @return jpegJfifData
  **/
  @ApiModelProperty(value = "Gets or sets the JPEG JFIF data.")
  public JfifData getJpegJfifData() {
    return jpegJfifData;
  }

  public void setJpegJfifData(JfifData jpegJfifData) {
    this.jpegJfifData = jpegJfifData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JpegProperties jpegProperties = (JpegProperties) o;
    return Objects.equals(this.comment, jpegProperties.comment) &&
        Objects.equals(this.jpegExifData, jpegProperties.jpegExifData) &&
        Objects.equals(this.jpegJfifData, jpegProperties.jpegJfifData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, jpegExifData, jpegJfifData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JpegProperties {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    jpegExifData: ").append(toIndentedString(jpegExifData)).append("\n");
    sb.append("    jpegJfifData: ").append(toIndentedString(jpegJfifData)).append("\n");
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


/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TiffFrame.java">
*   Copyright (c) Aspose Pty Ltd.
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents information about TIFF frame.
 */
public class TiffFrame {
  @JsonProperty("FrameOptions")
  private TiffOptions frameOptions = null;

  @JsonProperty("Height")
  private Integer height = null;

  @JsonProperty("Width")
  private Integer width = null;

  @JsonProperty("ExifData")
  private ExifData exifData = null;

  public TiffFrame frameOptions(TiffOptions frameOptions) {
    this.frameOptions = frameOptions;
    return this;
  }

  /**
   * Gets or sets options for the frame.
   * @return frameOptions
  **/
  public TiffOptions getFrameOptions() {
    return frameOptions;
  }  

  public void setFrameOptions(TiffOptions frameOptions) {
    this.frameOptions = frameOptions;
  }

  public TiffFrame height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Gets or sets the frame height.
   * @return height
  **/
  public Integer getHeight() {
    return height;
  }  

  public void setHeight(Integer height) {
    this.height = height;
  }

  public TiffFrame width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Gets or sets the frame width.
   * @return width
  **/
  public Integer getWidth() {
    return width;
  }  

  public void setWidth(Integer width) {
    this.width = width;
  }

  public TiffFrame exifData(ExifData exifData) {
    this.exifData = exifData;
    return this;
  }

  /**
   * Gets or sets the EXIF data.
   * @return exifData
  **/
  public ExifData getExifData() {
    return exifData;
  }  

  public void setExifData(ExifData exifData) {
    this.exifData = exifData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    TiffFrame tiffFrame = (TiffFrame) o;
    return ObjectUtils.equals(this.frameOptions, tiffFrame.frameOptions) &&
    ObjectUtils.equals(this.height, tiffFrame.height) &&
    ObjectUtils.equals(this.width, tiffFrame.width) &&
    ObjectUtils.equals(this.exifData, tiffFrame.exifData);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(frameOptions, height, width, exifData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TiffFrame {\n");
    
    sb.append("    frameOptions: ").append(toIndentedString(frameOptions)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    exifData: ").append(toIndentedString(exifData)).append("\n");
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


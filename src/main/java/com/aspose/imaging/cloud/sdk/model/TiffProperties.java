/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TiffProperties.java">
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
 * Represents properties of TIFF image.
 */
public class TiffProperties {
  @JsonProperty("frames")
  private List<TiffFrame> frames = null;

  @JsonProperty("byteOrder")
  private String byteOrder = null;

  @JsonProperty("exifData")
  private ExifData exifData = null;

  public TiffProperties frames(List<TiffFrame> frames) {
    this.frames = frames;
    return this;
  }

  public TiffProperties addFramesItem(TiffFrame framesItem) {
    if (this.frames == null) {
      this.frames = new ArrayList<TiffFrame>();
    }
    this.frames.add(framesItem);
    return this;
  }

  /**
   * Frames information.
   * @return frames
  **/
  public List<TiffFrame> getFrames() {
    return frames;
  }  

  public void setFrames(List<TiffFrame> frames) {
    this.frames = frames;
  }

  public TiffProperties byteOrder(String byteOrder) {
    this.byteOrder = byteOrder;
    return this;
  }

  /**
   * Gets or sets the byte order.
   * @return byteOrder
  **/
  public String getByteOrder() {
    return byteOrder;
  }  

  public void setByteOrder(String byteOrder) {
    this.byteOrder = byteOrder;
  }

  public TiffProperties exifData(ExifData exifData) {
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
    TiffProperties tiffProperties = (TiffProperties) o;
    return ObjectUtils.equals(this.frames, tiffProperties.frames) &&
    ObjectUtils.equals(this.byteOrder, tiffProperties.byteOrder) &&
    ObjectUtils.equals(this.exifData, tiffProperties.exifData);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(frames, byteOrder, exifData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TiffProperties {\n");
    
    sb.append("    frames: ").append(toIndentedString(frames)).append("\n");
    sb.append("    byteOrder: ").append(toIndentedString(byteOrder)).append("\n");
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


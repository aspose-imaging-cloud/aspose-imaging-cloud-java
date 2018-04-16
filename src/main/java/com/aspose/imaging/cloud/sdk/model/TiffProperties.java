/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TiffProperties.java">
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
 * Represents properties of TIFF image.
 */
public class TiffProperties {
  @JsonProperty("ByteOrder")
  private String byteOrder = null;

  @JsonProperty("ExifData")
  private ExifData exifData = null;

  @JsonProperty("Frames")
  private List<TiffFrame> frames = null;

  public TiffProperties byteOrder(String byteOrder) {
    this.byteOrder = byteOrder;
    return this;
  }

   /**
   * Gets or sets the byte order.
   * @return byteOrder
  **/
  @ApiModelProperty(value = "Gets or sets the byte order.")
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
  @ApiModelProperty(value = "Gets or sets the EXIF data.")
  public ExifData getExifData() {
    return exifData;
  }

  public void setExifData(ExifData exifData) {
    this.exifData = exifData;
  }

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
  @ApiModelProperty(value = "Frames information.")
  public List<TiffFrame> getFrames() {
    return frames;
  }

  public void setFrames(List<TiffFrame> frames) {
    this.frames = frames;
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
    return Objects.equals(this.byteOrder, tiffProperties.byteOrder) &&
        Objects.equals(this.exifData, tiffProperties.exifData) &&
        Objects.equals(this.frames, tiffProperties.frames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byteOrder, exifData, frames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TiffProperties {\n");
    
    sb.append("    byteOrder: ").append(toIndentedString(byteOrder)).append("\n");
    sb.append("    exifData: ").append(toIndentedString(exifData)).append("\n");
    sb.append("    frames: ").append(toIndentedString(frames)).append("\n");
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


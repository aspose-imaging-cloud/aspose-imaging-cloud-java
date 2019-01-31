/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="Jpeg2000Properties.java">
*   Copyright (c) 2019 Aspose Pty Ltd. All rights reserved.
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
import com.aspose.imaging.cloud.sdk.stablemodel.*;

/**
 * Represents information about image in JPEG2000 format.
 */
public class Jpeg2000Properties {
  @JsonProperty("Comments")
  private List<String> comments = null;

  @JsonProperty("Codec")
  private Jpeg2000Codec codec = null;

  public Jpeg2000Properties comments(List<String> comments) {
    this.comments = comments;
    return this;
  }

  public Jpeg2000Properties addCommentsItem(String commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<String>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Gets or sets the JPEG comment markers.
   * @return comments
  **/
  public List<String> getComments() {
    return comments;
  }  

  public void setComments(List<String> comments) {
    this.comments = comments;
  }

  public Jpeg2000Properties codec(Jpeg2000Codec codec) {
    this.codec = codec;
    return this;
  }

  /**
   * Gets or sets the JPEG2000 codec
   * @return codec
  **/
  public Jpeg2000Codec getCodec() {
    return codec;
  }  

  public void setCodec(Jpeg2000Codec codec) {
    this.codec = codec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Jpeg2000Properties jpeg2000Properties = (Jpeg2000Properties) o;
    return ObjectUtils.equals(this.comments, jpeg2000Properties.comments) &&
    ObjectUtils.equals(this.codec, jpeg2000Properties.codec);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(comments, codec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jpeg2000Properties {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
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


/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DiscUsage.java">
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
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.aspose.imaging.cloud.sdk.stablemodel.*;

/**
 * Class for disc space information.
 */
public class DiscUsage {
  @JsonProperty("usedSize")
  private Long usedSize = null;

  @JsonProperty("totalSize")
  private Long totalSize = null;

  public DiscUsage usedSize(Long usedSize) {
    this.usedSize = usedSize;
    return this;
  }

  /**
   * Application used disc space.
   * @return usedSize
  **/
  public Long getUsedSize() {
    return usedSize;
  }  

  public void setUsedSize(Long usedSize) {
    this.usedSize = usedSize;
  }

  public DiscUsage totalSize(Long totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  /**
   * Total disc space.
   * @return totalSize
  **/
  public Long getTotalSize() {
    return totalSize;
  }  

  public void setTotalSize(Long totalSize) {
    this.totalSize = totalSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    DiscUsage discUsage = (DiscUsage) o;
    return ObjectUtils.equals(this.usedSize, discUsage.usedSize) &&
    ObjectUtils.equals(this.totalSize, discUsage.totalSize);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(usedSize, totalSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscUsage {\n");
    
    sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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


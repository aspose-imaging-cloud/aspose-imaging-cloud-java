/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DjvuProperties.java">
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

package com.aspose.imaging.cloud.sdk.model;

import org.apache.commons.lang3.ObjectUtils;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.aspose.imaging.cloud.sdk.stablemodel.*;

/**
 * Represents properties of djvu file.
 */
public class DjvuProperties {
  @JsonProperty("BackgroundColor")
  private String backgroundColor = null;

  @JsonProperty("HasBackgroundColor")
  private Boolean hasBackgroundColor = null;

  @JsonProperty("PagesCount")
  private Integer pagesCount = null;

  public DjvuProperties backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Gets or sets background color.
   * @return backgroundColor
  **/
  public String getBackgroundColor() {
    return backgroundColor;
  }  

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public DjvuProperties hasBackgroundColor(Boolean hasBackgroundColor) {
    this.hasBackgroundColor = hasBackgroundColor;
    return this;
  }

  /**
   * Gets or sets a value indicating whether background color is used.
   * @return hasBackgroundColor
  **/
  public Boolean isHasBackgroundColor() {
    return hasBackgroundColor;
  }  

  public void setHasBackgroundColor(Boolean hasBackgroundColor) {
    this.hasBackgroundColor = hasBackgroundColor;
  }

  public DjvuProperties pagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
    return this;
  }

  /**
   * Gets or sets pages count.
   * @return pagesCount
  **/
  public Integer getPagesCount() {
    return pagesCount;
  }  

  public void setPagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    DjvuProperties djvuProperties = (DjvuProperties) o;
    return ObjectUtils.equals(this.backgroundColor, djvuProperties.backgroundColor) &&
    ObjectUtils.equals(this.hasBackgroundColor, djvuProperties.hasBackgroundColor) &&
    ObjectUtils.equals(this.pagesCount, djvuProperties.pagesCount);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(backgroundColor, hasBackgroundColor, pagesCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DjvuProperties {\n");
    
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    hasBackgroundColor: ").append(toIndentedString(hasBackgroundColor)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
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


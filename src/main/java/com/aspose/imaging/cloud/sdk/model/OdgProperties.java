/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="OdgProperties.java">
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

import org.apache.commons.lang3.ObjectUtils;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ODG format specific properties
 */
public class OdgProperties {
  @JsonProperty("PageCount")
  private Integer pageCount = null;

  @JsonProperty("Metadata")
  private OdgMetadata metadata = null;

  @JsonProperty("Pages")
  private List<OdgPage> pages = null;

  public OdgProperties pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

  /**
   * Gets or sets the page count.
   * @return pageCount
  **/
  public Integer getPageCount() {
    return pageCount;
  }  

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public OdgProperties metadata(OdgMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Gets or sets the metadata.
   * @return metadata
  **/
  public OdgMetadata getMetadata() {
    return metadata;
  }  

  public void setMetadata(OdgMetadata metadata) {
    this.metadata = metadata;
  }

  public OdgProperties pages(List<OdgPage> pages) {
    this.pages = pages;
    return this;
  }

  public OdgProperties addPagesItem(OdgPage pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<OdgPage>();
    }
    this.pages.add(pagesItem);
    return this;
  }

  /**
   * Gets or sets the pages.
   * @return pages
  **/
  public List<OdgPage> getPages() {
    return pages;
  }  

  public void setPages(List<OdgPage> pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    OdgProperties odgProperties = (OdgProperties) o;
    return ObjectUtils.equals(this.pageCount, odgProperties.pageCount) &&
    ObjectUtils.equals(this.metadata, odgProperties.metadata) &&
    ObjectUtils.equals(this.pages, odgProperties.pages);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(pageCount, metadata, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OdgProperties {\n");
    
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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


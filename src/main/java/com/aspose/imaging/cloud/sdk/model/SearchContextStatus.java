/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SearchContextStatus.java">
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
 * Search context status.
 */
public class SearchContextStatus extends SaaSposeResponse {
  @JsonProperty("Id")
  private String id = null;

  @JsonProperty("SearchStatus")
  private String searchStatus = null;

  @JsonProperty("Progress")
  private Double progress = null;

  public SearchContextStatus id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Gets or sets the identifier.
   * @return id
  **/
  public String getId() {
    return id;
  }  

  public void setId(String id) {
    this.id = id;
  }

  public SearchContextStatus searchStatus(String searchStatus) {
    this.searchStatus = searchStatus;
    return this;
  }

  /**
   * Gets or sets the status.
   * @return searchStatus
  **/
  public String getSearchStatus() {
    return searchStatus;
  }  

  public void setSearchStatus(String searchStatus) {
    this.searchStatus = searchStatus;
  }

  public SearchContextStatus progress(Double progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Gets or sets the progress (in %).
   * @return progress
  **/
  public Double getProgress() {
    return progress;
  }  

  public void setProgress(Double progress) {
    this.progress = progress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SearchContextStatus searchContextStatus = (SearchContextStatus) o;
    return ObjectUtils.equals(this.id, searchContextStatus.id) &&
    ObjectUtils.equals(this.searchStatus, searchContextStatus.searchStatus) &&
    ObjectUtils.equals(this.progress, searchContextStatus.progress) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, searchStatus, progress, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchContextStatus {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    searchStatus: ").append(toIndentedString(searchStatus)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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


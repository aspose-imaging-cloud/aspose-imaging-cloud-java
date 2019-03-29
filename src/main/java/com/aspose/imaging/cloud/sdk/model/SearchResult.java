/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SearchResult.java">
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
 * Image search result.
 */
public class SearchResult {
  @JsonProperty("imageId")
  private String imageId = null;

  @JsonProperty("similarity")
  private Double similarity = null;

  public SearchResult imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Gets or sets the image identifier.
   * @return imageId
  **/
  public String getImageId() {
    return imageId;
  }  

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public SearchResult similarity(Double similarity) {
    this.similarity = similarity;
    return this;
  }

  /**
   * Gets or sets the similarity.
   * @return similarity
  **/
  public Double getSimilarity() {
    return similarity;
  }  

  public void setSimilarity(Double similarity) {
    this.similarity = similarity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SearchResult searchResult = (SearchResult) o;
    return ObjectUtils.equals(this.imageId, searchResult.imageId) &&
    ObjectUtils.equals(this.similarity, searchResult.similarity);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(imageId, similarity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
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


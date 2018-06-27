/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ImageDuplicates.java">
*   Copyright (c) 2018 Aspose Pty Ltd.
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
 * Duplicate images.
 */
public class ImageDuplicates {
  @JsonProperty("DuplicateImages")
  private List<SearchResult> duplicateImages = null;

  public ImageDuplicates duplicateImages(List<SearchResult> duplicateImages) {
    this.duplicateImages = duplicateImages;
    return this;
  }

  public ImageDuplicates addDuplicateImagesItem(SearchResult duplicateImagesItem) {
    if (this.duplicateImages == null) {
      this.duplicateImages = new ArrayList<SearchResult>();
    }
    this.duplicateImages.add(duplicateImagesItem);
    return this;
  }

  /**
   * Gets the array of duplicate images.
   * @return duplicateImages
  **/
  public List<SearchResult> getDuplicateImages() {
    return duplicateImages;
  }  

  public void setDuplicateImages(List<SearchResult> duplicateImages) {
    this.duplicateImages = duplicateImages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ImageDuplicates imageDuplicates = (ImageDuplicates) o;
    return ObjectUtils.equals(this.duplicateImages, imageDuplicates.duplicateImages);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(duplicateImages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDuplicates {\n");
    
    sb.append("    duplicateImages: ").append(toIndentedString(duplicateImages)).append("\n");
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


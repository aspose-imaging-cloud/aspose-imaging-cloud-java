/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ImageFeatures.java">
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
 * Image features.
 */
public class ImageFeatures {
  @JsonProperty("imageId")
  private String imageId = null;

  @JsonProperty("featuresCount")
  private Integer featuresCount = null;

  @JsonProperty("featureLengthInBits")
  private Integer featureLengthInBits = null;

  @JsonProperty("features")
  private byte[] features = null;

  public ImageFeatures imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Gets the image identifier.
   * @return imageId
  **/
  public String getImageId() {
    return imageId;
  }  

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public ImageFeatures featuresCount(Integer featuresCount) {
    this.featuresCount = featuresCount;
    return this;
  }

  /**
   * Gets the features count.
   * @return featuresCount
  **/
  public Integer getFeaturesCount() {
    return featuresCount;
  }  

  public void setFeaturesCount(Integer featuresCount) {
    this.featuresCount = featuresCount;
  }

  public ImageFeatures featureLengthInBits(Integer featureLengthInBits) {
    this.featureLengthInBits = featureLengthInBits;
    return this;
  }

  /**
   * Gets the feature length in bits.
   * @return featureLengthInBits
  **/
  public Integer getFeatureLengthInBits() {
    return featureLengthInBits;
  }  

  public void setFeatureLengthInBits(Integer featureLengthInBits) {
    this.featureLengthInBits = featureLengthInBits;
  }

  public ImageFeatures features(byte[] features) {
    this.features = features;
    return this;
  }

  /**
   * Gets the features.
   * @return features
  **/
  public byte[] getFeatures() {
    return features;
  }  

  public void setFeatures(byte[] features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ImageFeatures imageFeatures = (ImageFeatures) o;
    return ObjectUtils.equals(this.imageId, imageFeatures.imageId) &&
    ObjectUtils.equals(this.featuresCount, imageFeatures.featuresCount) &&
    ObjectUtils.equals(this.featureLengthInBits, imageFeatures.featureLengthInBits) &&
    ObjectUtils.equals(this.features, imageFeatures.features);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(imageId, featuresCount, featureLengthInBits, features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageFeatures {\n");
    
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    featuresCount: ").append(toIndentedString(featuresCount)).append("\n");
    sb.append("    featureLengthInBits: ").append(toIndentedString(featureLengthInBits)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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


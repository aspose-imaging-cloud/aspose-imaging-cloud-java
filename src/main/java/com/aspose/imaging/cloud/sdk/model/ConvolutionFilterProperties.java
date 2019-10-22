/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ConvolutionFilterProperties.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
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
 * The convolution filter.
 */
public class ConvolutionFilterProperties extends FilterPropertiesBase {
  @JsonProperty("factor")
  private Double factor = null;

  @JsonProperty("bias")
  private Integer bias = null;

  public ConvolutionFilterProperties factor(Double factor) {
    this.factor = factor;
    return this;
  }

  /**
   * Gets or sets the factor.
   * @return factor
  **/
  public Double getFactor() {
    return factor;
  }  

  public void setFactor(Double factor) {
    this.factor = factor;
  }

  public ConvolutionFilterProperties bias(Integer bias) {
    this.bias = bias;
    return this;
  }

  /**
   * Gets or sets the bias.
   * @return bias
  **/
  public Integer getBias() {
    return bias;
  }  

  public void setBias(Integer bias) {
    this.bias = bias;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ConvolutionFilterProperties convolutionFilterProperties = (ConvolutionFilterProperties) o;
    return ObjectUtils.equals(this.factor, convolutionFilterProperties.factor) &&
    ObjectUtils.equals(this.bias, convolutionFilterProperties.bias) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(factor, bias, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvolutionFilterProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    bias: ").append(toIndentedString(bias)).append("\n");
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


/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DeconvolutionFilterProperties.java">
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
 * Deconvolution Filter Options, abstract class
 */
public class DeconvolutionFilterProperties extends FilterPropertiesBase {
  @JsonProperty("snr")
  private Double snr = null;

  @JsonProperty("brightness")
  private Double brightness = null;

  @JsonProperty("grayscale")
  private Boolean grayscale = null;

  @JsonProperty("isPartialLoaded")
  private Boolean isPartialLoaded = null;

  public DeconvolutionFilterProperties snr(Double snr) {
    this.snr = snr;
    return this;
  }

  /**
   * Gets or sets the SNR(signal-to-noise ratio) recommended range 0.002 - 0.009, default value &#x3D; 0.007
   * @return snr
  **/
  public Double getSnr() {
    return snr;
  }  

  public void setSnr(Double snr) {
    this.snr = snr;
  }

  public DeconvolutionFilterProperties brightness(Double brightness) {
    this.brightness = brightness;
    return this;
  }

  /**
   * Gets or sets the brightness. recommended range 1 - 1.5 default value &#x3D; 1.15
   * @return brightness
  **/
  public Double getBrightness() {
    return brightness;
  }  

  public void setBrightness(Double brightness) {
    this.brightness = brightness;
  }

  public DeconvolutionFilterProperties grayscale(Boolean grayscale) {
    this.grayscale = grayscale;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this DeconvolutionFilterProperties is grayscale. Return grayscale mode or RGB mode.
   * @return grayscale
  **/
  public Boolean isGrayscale() {
    return grayscale;
  }  

  public void setGrayscale(Boolean grayscale) {
    this.grayscale = grayscale;
  }

  public DeconvolutionFilterProperties isPartialLoaded(Boolean isPartialLoaded) {
    this.isPartialLoaded = isPartialLoaded;
    return this;
  }

  /**
   * Gets a value indicating whether this instance is partial loaded.
   * @return isPartialLoaded
  **/
  public Boolean isIsPartialLoaded() {
    return isPartialLoaded;
  }  

  public void setIsPartialLoaded(Boolean isPartialLoaded) {
    this.isPartialLoaded = isPartialLoaded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    DeconvolutionFilterProperties deconvolutionFilterProperties = (DeconvolutionFilterProperties) o;
    return ObjectUtils.equals(this.snr, deconvolutionFilterProperties.snr) &&
    ObjectUtils.equals(this.brightness, deconvolutionFilterProperties.brightness) &&
    ObjectUtils.equals(this.grayscale, deconvolutionFilterProperties.grayscale) &&
    ObjectUtils.equals(this.isPartialLoaded, deconvolutionFilterProperties.isPartialLoaded) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(snr, brightness, grayscale, isPartialLoaded, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeconvolutionFilterProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    snr: ").append(toIndentedString(snr)).append("\n");
    sb.append("    brightness: ").append(toIndentedString(brightness)).append("\n");
    sb.append("    grayscale: ").append(toIndentedString(grayscale)).append("\n");
    sb.append("    isPartialLoaded: ").append(toIndentedString(isPartialLoaded)).append("\n");
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


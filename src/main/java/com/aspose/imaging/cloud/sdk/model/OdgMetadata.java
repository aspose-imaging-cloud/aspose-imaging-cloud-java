/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="OdgMetadata.java">
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
 * ODG format metadata
 */
public class OdgMetadata {
  @JsonProperty("generator")
  private String generator = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("keywords")
  private String keywords = null;

  @JsonProperty("initialCreator")
  private String initialCreator = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("printedBy")
  private String printedBy = null;

  @JsonProperty("creationDateTime")
  private String creationDateTime = null;

  @JsonProperty("modificationDateTime")
  private String modificationDateTime = null;

  @JsonProperty("printDateTime")
  private String printDateTime = null;

  @JsonProperty("documentTemplate")
  private String documentTemplate = null;

  @JsonProperty("automaticReload")
  private String automaticReload = null;

  @JsonProperty("hyperlinkBehavior")
  private String hyperlinkBehavior = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("editingCycles")
  private String editingCycles = null;

  @JsonProperty("editingDuration")
  private String editingDuration = null;

  @JsonProperty("documentStatistics")
  private String documentStatistics = null;

  public OdgMetadata generator(String generator) {
    this.generator = generator;
    return this;
  }

  /**
   * Gets or sets the generator.
   * @return generator
  **/
  public String getGenerator() {
    return generator;
  }  

  public void setGenerator(String generator) {
    this.generator = generator;
  }

  public OdgMetadata title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Gets or sets the title.
   * @return title
  **/
  public String getTitle() {
    return title;
  }  

  public void setTitle(String title) {
    this.title = title;
  }

  public OdgMetadata description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Gets or sets the description.
   * @return description
  **/
  public String getDescription() {
    return description;
  }  

  public void setDescription(String description) {
    this.description = description;
  }

  public OdgMetadata subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Gets or sets the subject.
   * @return subject
  **/
  public String getSubject() {
    return subject;
  }  

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public OdgMetadata keywords(String keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * Gets or sets the keywords.
   * @return keywords
  **/
  public String getKeywords() {
    return keywords;
  }  

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public OdgMetadata initialCreator(String initialCreator) {
    this.initialCreator = initialCreator;
    return this;
  }

  /**
   * Gets or sets the initial creator.
   * @return initialCreator
  **/
  public String getInitialCreator() {
    return initialCreator;
  }  

  public void setInitialCreator(String initialCreator) {
    this.initialCreator = initialCreator;
  }

  public OdgMetadata creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Gets or sets the creator.
   * @return creator
  **/
  public String getCreator() {
    return creator;
  }  

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public OdgMetadata printedBy(String printedBy) {
    this.printedBy = printedBy;
    return this;
  }

  /**
   * Gets or sets the \&quot;PrintedBy\&quot; record.
   * @return printedBy
  **/
  public String getPrintedBy() {
    return printedBy;
  }  

  public void setPrintedBy(String printedBy) {
    this.printedBy = printedBy;
  }

  public OdgMetadata creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Gets or sets the creation date and time.
   * @return creationDateTime
  **/
  public String getCreationDateTime() {
    return creationDateTime;
  }  

  public void setCreationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OdgMetadata modificationDateTime(String modificationDateTime) {
    this.modificationDateTime = modificationDateTime;
    return this;
  }

  /**
   * Gets or sets the modification date and time.
   * @return modificationDateTime
  **/
  public String getModificationDateTime() {
    return modificationDateTime;
  }  

  public void setModificationDateTime(String modificationDateTime) {
    this.modificationDateTime = modificationDateTime;
  }

  public OdgMetadata printDateTime(String printDateTime) {
    this.printDateTime = printDateTime;
    return this;
  }

  /**
   * Gets or sets the print date and time.
   * @return printDateTime
  **/
  public String getPrintDateTime() {
    return printDateTime;
  }  

  public void setPrintDateTime(String printDateTime) {
    this.printDateTime = printDateTime;
  }

  public OdgMetadata documentTemplate(String documentTemplate) {
    this.documentTemplate = documentTemplate;
    return this;
  }

  /**
   * Gets or sets the document template.
   * @return documentTemplate
  **/
  public String getDocumentTemplate() {
    return documentTemplate;
  }  

  public void setDocumentTemplate(String documentTemplate) {
    this.documentTemplate = documentTemplate;
  }

  public OdgMetadata automaticReload(String automaticReload) {
    this.automaticReload = automaticReload;
    return this;
  }

  /**
   * Gets or sets the automatic reload.
   * @return automaticReload
  **/
  public String getAutomaticReload() {
    return automaticReload;
  }  

  public void setAutomaticReload(String automaticReload) {
    this.automaticReload = automaticReload;
  }

  public OdgMetadata hyperlinkBehavior(String hyperlinkBehavior) {
    this.hyperlinkBehavior = hyperlinkBehavior;
    return this;
  }

  /**
   * Gets or sets the hyperlink behavior.
   * @return hyperlinkBehavior
  **/
  public String getHyperlinkBehavior() {
    return hyperlinkBehavior;
  }  

  public void setHyperlinkBehavior(String hyperlinkBehavior) {
    this.hyperlinkBehavior = hyperlinkBehavior;
  }

  public OdgMetadata language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Gets or sets the language.
   * @return language
  **/
  public String getLanguage() {
    return language;
  }  

  public void setLanguage(String language) {
    this.language = language;
  }

  public OdgMetadata editingCycles(String editingCycles) {
    this.editingCycles = editingCycles;
    return this;
  }

  /**
   * Gets or sets the editing cycles.
   * @return editingCycles
  **/
  public String getEditingCycles() {
    return editingCycles;
  }  

  public void setEditingCycles(String editingCycles) {
    this.editingCycles = editingCycles;
  }

  public OdgMetadata editingDuration(String editingDuration) {
    this.editingDuration = editingDuration;
    return this;
  }

  /**
   * Gets or sets the duration of the editing.
   * @return editingDuration
  **/
  public String getEditingDuration() {
    return editingDuration;
  }  

  public void setEditingDuration(String editingDuration) {
    this.editingDuration = editingDuration;
  }

  public OdgMetadata documentStatistics(String documentStatistics) {
    this.documentStatistics = documentStatistics;
    return this;
  }

  /**
   * Gets or sets the document statistics.
   * @return documentStatistics
  **/
  public String getDocumentStatistics() {
    return documentStatistics;
  }  

  public void setDocumentStatistics(String documentStatistics) {
    this.documentStatistics = documentStatistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    OdgMetadata odgMetadata = (OdgMetadata) o;
    return ObjectUtils.equals(this.generator, odgMetadata.generator) &&
    ObjectUtils.equals(this.title, odgMetadata.title) &&
    ObjectUtils.equals(this.description, odgMetadata.description) &&
    ObjectUtils.equals(this.subject, odgMetadata.subject) &&
    ObjectUtils.equals(this.keywords, odgMetadata.keywords) &&
    ObjectUtils.equals(this.initialCreator, odgMetadata.initialCreator) &&
    ObjectUtils.equals(this.creator, odgMetadata.creator) &&
    ObjectUtils.equals(this.printedBy, odgMetadata.printedBy) &&
    ObjectUtils.equals(this.creationDateTime, odgMetadata.creationDateTime) &&
    ObjectUtils.equals(this.modificationDateTime, odgMetadata.modificationDateTime) &&
    ObjectUtils.equals(this.printDateTime, odgMetadata.printDateTime) &&
    ObjectUtils.equals(this.documentTemplate, odgMetadata.documentTemplate) &&
    ObjectUtils.equals(this.automaticReload, odgMetadata.automaticReload) &&
    ObjectUtils.equals(this.hyperlinkBehavior, odgMetadata.hyperlinkBehavior) &&
    ObjectUtils.equals(this.language, odgMetadata.language) &&
    ObjectUtils.equals(this.editingCycles, odgMetadata.editingCycles) &&
    ObjectUtils.equals(this.editingDuration, odgMetadata.editingDuration) &&
    ObjectUtils.equals(this.documentStatistics, odgMetadata.documentStatistics);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(generator, title, description, subject, keywords, initialCreator, creator, printedBy, creationDateTime, modificationDateTime, printDateTime, documentTemplate, automaticReload, hyperlinkBehavior, language, editingCycles, editingDuration, documentStatistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OdgMetadata {\n");
    
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    initialCreator: ").append(toIndentedString(initialCreator)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    printedBy: ").append(toIndentedString(printedBy)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    modificationDateTime: ").append(toIndentedString(modificationDateTime)).append("\n");
    sb.append("    printDateTime: ").append(toIndentedString(printDateTime)).append("\n");
    sb.append("    documentTemplate: ").append(toIndentedString(documentTemplate)).append("\n");
    sb.append("    automaticReload: ").append(toIndentedString(automaticReload)).append("\n");
    sb.append("    hyperlinkBehavior: ").append(toIndentedString(hyperlinkBehavior)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    editingCycles: ").append(toIndentedString(editingCycles)).append("\n");
    sb.append("    editingDuration: ").append(toIndentedString(editingDuration)).append("\n");
    sb.append("    documentStatistics: ").append(toIndentedString(documentStatistics)).append("\n");
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


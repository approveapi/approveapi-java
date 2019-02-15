/*
 * ApproveAPISwagger
 * The simple API to request a user's approval on anything via email + sms.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@approveapi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.approveapi;

import java.util.Objects;
import java.util.Arrays;
import com.approveapi.AnswerMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * PromptAnswer
 */

public class PromptAnswer {
  @JsonProperty("time")
  private BigDecimal time;

  @JsonProperty("result")
  private Boolean result;

  @JsonProperty("metadata")
  private AnswerMetadata metadata = null;

  public PromptAnswer time(BigDecimal time) {
    this.time = time;
    return this;
  }

   /**
   * The unix timestamp when the user answered the prompt.
   * @return time
  **/
  @ApiModelProperty(required = true, value = "The unix timestamp when the user answered the prompt.")
  public BigDecimal getTime() {
    return time;
  }

  public void setTime(BigDecimal time) {
    this.time = time;
  }

  public PromptAnswer result(Boolean result) {
    this.result = result;
    return this;
  }

   /**
   * The user&#39;s answer to whether or not they approve this prompt.
   * @return result
  **/
  @ApiModelProperty(required = true, value = "The user's answer to whether or not they approve this prompt.")
  public Boolean getResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  public PromptAnswer metadata(AnswerMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public AnswerMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(AnswerMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromptAnswer promptAnswer = (PromptAnswer) o;
    return Objects.equals(this.time, promptAnswer.time) &&
        Objects.equals(this.result, promptAnswer.result) &&
        Objects.equals(this.metadata, promptAnswer.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, result, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromptAnswer {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

package com.globallogic.rds.api.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HeaderType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-15T23:29:47.910Z")

public class HeaderType   {
  @JsonProperty("time")
  private String time = null;

  @JsonProperty("token")
  private String token = null;

  public HeaderType time(String time) {
    this.time = time;
    return this;
  }




  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public HeaderType token(String token) {
    this.token = token;
    return this;
  }


  @NotNull
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderType headerType = (HeaderType) o;
    return Objects.equals(this.time, headerType.time) &&
        Objects.equals(this.token, headerType.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderType {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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


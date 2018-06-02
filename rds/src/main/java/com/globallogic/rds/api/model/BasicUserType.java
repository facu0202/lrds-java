package com.globallogic.rds.api.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BasicUserType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-15T23:29:47.910Z")

public class BasicUserType   {
  @JsonProperty("mail")
  private String mail = null;

  @JsonProperty("rol")
  private String rol = "basicUser";

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("firstname")
  private String firstname = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("password")
  private String password = null;

  public BasicUserType mail(String mail) {
    this.mail = mail;
    return this;
  }


  @NotNull
  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public BasicUserType rol(String rol) {
    this.rol = rol;
    return this;
  }


  @NotNull
  public String getRol() {
    return rol;
  }

  public void setRol(String rol) {
    this.rol = rol;
  }

  public BasicUserType userName(String userName) {
    this.userName = userName;
    return this;
  }

  @NotNull
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public BasicUserType firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }



  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public BasicUserType surname(String surname) {
    this.surname = surname;
    return this;
  }



  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public BasicUserType password(String password) {
    this.password = password;
    return this;
  }


  @NotNull
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicUserType basicUserType = (BasicUserType) o;
    return Objects.equals(this.mail, basicUserType.mail) &&
        Objects.equals(this.rol, basicUserType.rol) &&
        Objects.equals(this.userName, basicUserType.userName) &&
        Objects.equals(this.firstname, basicUserType.firstname) &&
        Objects.equals(this.surname, basicUserType.surname) &&
        Objects.equals(this.password, basicUserType.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mail, rol, userName, firstname, surname, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicUserType {\n");
    
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    rol: ").append(toIndentedString(rol)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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


package com.globallogic.rds.api.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * UserType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-15T23:29:47.910Z")

public class UserType extends Hypermedia  {
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

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("creationDate")
  private String creationDate = null;

  public UserType mail(String mail) {
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

  public UserType rol(String rol) {
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

  public UserType userName(String userName) {
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

  public UserType firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }




  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public UserType surname(String surname) {
    this.surname = surname;
    return this;
  }




  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public UserType password(String password) {
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

  public UserType id(String id) {
    this.id = id;
    return this;
  }




  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserType creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }




  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserType userType = (UserType) o;
    return Objects.equals(this.mail, userType.mail) &&
        Objects.equals(this.rol, userType.rol) &&
        Objects.equals(this.userName, userType.userName) &&
        Objects.equals(this.firstname, userType.firstname) &&
        Objects.equals(this.surname, userType.surname) &&
        Objects.equals(this.password, userType.password) &&
        Objects.equals(this.id, userType.id) &&
        Objects.equals(this.creationDate, userType.creationDate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mail, rol, userName, firstname, surname, password, id, creationDate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    rol: ").append(toIndentedString(rol)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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


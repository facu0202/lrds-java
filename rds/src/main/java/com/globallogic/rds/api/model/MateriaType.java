package com.globallogic.rds.api.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * MateriaType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-15T23:29:47.910Z")

public class MateriaType   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("grado")
  private Integer grado = null;

  @JsonProperty("horario")
  private String horario = null;

  @JsonProperty("fecha")
  private LocalDate fecha = null;

  public MateriaType id(String id) {
    this.id = id;
    return this;
  }



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MateriaType nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  @NotNull


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public MateriaType grado(Integer grado) {
    this.grado = grado;
    return this;
  }



  public Integer getGrado() {
    return grado;
  }

  public void setGrado(Integer grado) {
    this.grado = grado;
  }

  public MateriaType horario(String horario) {
    this.horario = horario;
    return this;
  }

  
  @NotNull


  public String getHorario() {
    return horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }

  public MateriaType fecha(LocalDate fecha) {
    this.fecha = fecha;
    return this;
  }


  @Valid

  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MateriaType materiaType = (MateriaType) o;
    return Objects.equals(this.id, materiaType.id) &&
        Objects.equals(this.nombre, materiaType.nombre) &&
        Objects.equals(this.grado, materiaType.grado) &&
        Objects.equals(this.horario, materiaType.horario) &&
        Objects.equals(this.fecha, materiaType.fecha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, grado, horario, fecha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MateriaType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    grado: ").append(toIndentedString(grado)).append("\n");
    sb.append("    horario: ").append(toIndentedString(horario)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
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


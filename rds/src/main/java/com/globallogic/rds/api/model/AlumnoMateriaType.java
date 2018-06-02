package com.globallogic.rds.api.model;

import java.util.Objects;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlumnoMateriaType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-15T23:29:47.910Z")

public class AlumnoMateriaType extends MateriaType  {
  @JsonProperty("inscripto")
  private Boolean inscripto = null;

  public AlumnoMateriaType inscripto(Boolean inscripto) {
    this.inscripto = inscripto;
    return this;
  }


  public Boolean isInscripto() {
    return inscripto;
  }

  public void setInscripto(Boolean inscripto) {
    this.inscripto = inscripto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlumnoMateriaType alumnoMateriaType = (AlumnoMateriaType) o;
    return Objects.equals(this.inscripto, alumnoMateriaType.inscripto) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inscripto, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlumnoMateriaType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inscripto: ").append(toIndentedString(inscripto)).append("\n");
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


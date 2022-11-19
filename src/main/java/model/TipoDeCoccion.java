package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public enum TipoDeCoccion {
  CRUDO,REBOZADO;

  @Column
  public String nombreCoccion;

  TipoDeCoccion() {
  }
}

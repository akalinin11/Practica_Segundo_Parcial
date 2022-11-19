package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "pieza")
public class Pieza extends Persistencia {


  @Column
  public String nombre;

  @Column
  public Integer precio;

  //@Enumerated(EnumType.STRING)
  @Embedded
  TipoDeCoccion tipoDeCoccion;

  public Pieza( ) {}

}

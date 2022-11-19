package model;

import lombok.Getter;

import javax.persistence.*;

@Getter
@MappedSuperclass
public abstract class Persistencia {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int id;

}
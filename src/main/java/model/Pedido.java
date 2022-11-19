package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter

@Entity
@Table(name = "pedido")
public class Pedido extends Persistencia {


  @ElementCollection @JoinColumn(name = "id_pedido")
  public List<TipoDeCoccion> coccionesPreferidas;

  @ElementCollection @JoinColumn(name = "id_pedido")
  public List<Categoria> categoriasPreferidas;

  public Pedido() {}

}

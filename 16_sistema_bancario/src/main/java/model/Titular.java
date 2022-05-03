package model;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="matriculas")

public class Titular {
   
	@EmbeddedId
    private TitularPk id;
    
    @ManyToOne
    @JoinColumn(name="idCuenta",referencedColumnName="numeroCuenta",insertable=false,updatable=false)
    Cuenta cuenta;
    
    @ManyToOne
    @JoinColumn(name="idCliente",referencedColumnName="dni",insertable=false,updatable=false)
    Cliente cliente;
  
    public Titular(int nota) {
		super();
	}
    public Titular( Cuenta cuenta, Cliente cliente) {
		super();
		this.cuenta = cuenta;
		this.cliente = cliente;
	}

}

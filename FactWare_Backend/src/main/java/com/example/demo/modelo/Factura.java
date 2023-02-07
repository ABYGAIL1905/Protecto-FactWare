package com.example.demo.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "factura")
@Getter
@Setter
public class Factura implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 @Column (name = "id_factura")
	private Long id_factura;
	
	 @Column (name = "fecha")
	private Date fecha;
	 @ManyToOne
	  @JoinColumn (name = "id_usuario", referencedColumnName = "id_usuario")
	    private Usuario usuario;
}

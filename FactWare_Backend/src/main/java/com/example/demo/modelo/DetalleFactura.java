package com.example.demo.modelo;

import java.io.Serializable;

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
@Table(name = "detallefact")
@Getter
@Setter
public class DetalleFactura implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column (name = "id_detalle")
	private Long id_detalle;
	
	 @Column (name = "cantidad")
	private int cantidad;
	 
	 @Column (name = "subTotal")
	private double subTotal;
	 
	 @Column (name = "iva")
	private double iva;
	 
	 @Column (name = "total")
	private double total;
	
	 @ManyToOne
	    @JoinColumn (name = "id_producto", referencedColumnName = "id_producto")
	    private Producto producto;
	 @ManyToOne
	 @JoinColumn (name = "id_factura", referencedColumnName = "id_factura")
	    private Factura factura;
}

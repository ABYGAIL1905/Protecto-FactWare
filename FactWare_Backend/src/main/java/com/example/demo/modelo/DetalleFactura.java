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
public class DetalleFactura implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Long id_detalle;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "subTotal")
    private double subTotal;

    @Column(name = "iva")
    private double iva;

    @Column(name = "total")
    private double total;

    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private Producto producto;
    @ManyToOne
    @JoinColumn(name = "id_factura", referencedColumnName = "id_factura")
    private Factura factura;

    public DetalleFactura() {
    }
    

    public Long getId_detalle() {
		return id_detalle;
	}


	public void setId_detalle(Long id_detalle) {
		this.id_detalle = id_detalle;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}


	public double getIva() {
		return iva;
	}


	public void setIva(double iva) {
		this.iva = iva;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public Factura getFactura() {
		return factura;
	}


	public void setFactura(Factura factura) {
		this.factura = factura;
	}


	public DetalleFactura(Long id_detalle, int cantidad, double subTotal, double iva, double total, Producto producto, Factura factura) {
        this.id_detalle = id_detalle;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.iva = iva;
        this.total = Math.round(total*100)/100;
        this.producto = producto;
        this.factura = factura;
    }
    
    
}

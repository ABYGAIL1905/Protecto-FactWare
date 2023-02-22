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
@Table(name = "inventario")
@Getter
@Setter
public class Inventario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_inventario")
    private Long id_inventario;

    @Column(name = "cantidad_inventario")
    private int cantidad_inventario;

    @Column(name = "stock")
    private int stock;

    @Column(name = "fechaEntrega")
    private Date fechaEntrega;

    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private Producto producto;

    
    public Long getId_inventario() {
		return id_inventario;
	}

	public void setId_inventario(Long id_inventario) {
		this.id_inventario = id_inventario;
	}

	public int getCantidad_inventario() {
		return cantidad_inventario;
	}

	public void setCantidad_inventario(int cantidad_inventario) {
		this.cantidad_inventario = cantidad_inventario;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Inventario() {
    }

    public Inventario(Long id_inventario, int cantidad_inventario, int stock, Date fechaEntrega, Producto producto) {
        this.id_inventario = id_inventario;
        this.cantidad_inventario = cantidad_inventario;
        this.stock = stock;
        this.fechaEntrega = fechaEntrega;
        this.producto = producto;
    }
    
    
}

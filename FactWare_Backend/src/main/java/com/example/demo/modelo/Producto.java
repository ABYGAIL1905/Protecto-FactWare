package com.example.demo.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "producto")
@Getter
@Setter
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_producto")
    private Long id_producto;

    @Column(name = "nombre_producto")
    private String nombre_producto;

    @Column(name = "descripcion_producto")
    private String descripcion_producto;

    @Column(name = "codigoBarras_producto")
    private int codigoBarras_producto;

    @Column(name = "costo_producto")
    private Double costo_producto;

    @Column(name = "pvp_producto")
    private Double pvp_producto;

    @Column(name = "utilidad_producto")
    private Double utilidad_producto;

    @Column(name = "estadoIVA_producto")
    private String estadoIVA_producto;

    @Column(name = "stock")
    private int stock;

//    @JsonIgnore
//    @OneToMany(mappedBy = "producto")
//    List<DetalleFactura> detalle_factura;
    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public int getCodigoBarras_producto() {
        return codigoBarras_producto;
    }

    public void setCodigoBarras_producto(int codigoBarras_producto) {
        this.codigoBarras_producto = codigoBarras_producto;
    }

    public Double getCosto_producto() {
        return costo_producto;
    }

    public void setCosto_producto(Double costo_producto) {
        this.costo_producto = costo_producto;
    }

    public Double getPvp_producto() {
        return pvp_producto;
    }

    public void setPvp_producto(Double pvp_producto) {
        this.pvp_producto = pvp_producto;
    }

    public Double getUtilidad_producto() {
        return utilidad_producto;
    }

    public void setUtilidad_producto(Double utilidad_producto) {
        this.utilidad_producto = utilidad_producto;
    }

    public String getEstadoIVA_producto() {
        return estadoIVA_producto;
    }

    public void setEstadoIVA_producto(String estadoIVA_producto) {
        this.estadoIVA_producto = estadoIVA_producto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    
    @ManyToOne
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
    private Proveedor proveedor;

//	  @OneToMany(mappedBy = "producto")
//	    List<Inventario> inventario;
    public Producto() {
    }

    public Producto(Long id) {
        super();
        this.id_producto = id;
    }

    public Producto(Long id_producto, String nombre_producto, String descripcion_producto, int codigoBarras_producto, Double costo_producto, Double pvp_producto, Double utilidad_producto, String estadoIVA_producto, Proveedor proveedor) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.codigoBarras_producto = codigoBarras_producto;
        this.costo_producto = costo_producto;
        this.pvp_producto = pvp_producto;
        this.utilidad_producto = utilidad_producto;
        this.estadoIVA_producto = estadoIVA_producto;
        this.proveedor = proveedor;
    }

}

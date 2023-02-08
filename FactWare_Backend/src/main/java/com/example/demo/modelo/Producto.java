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
public class Producto implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 @Column (name = "id_producto")
	private Long id_producto;
	
	 @Column (name = "nombre_producto")
	private String nombre_producto;
         
        @Column (name = "descripcion_producto")
	private String descripcion_producto;
        
        @Column (name = "codigoBarras_producto")
	private int codigoBarras_producto;
        
        @Column (name = "costo_producto")
	private Double costo_producto;
        
        @Column (name = "pvp_producto")
	private Double pvp_producto;
        
        @Column (name = "utilidad_producto")
	private Double utilidad_producto;
        
        @Column (name = "estadoIVA_producto")
	private String estadoIVA_producto;

	 @JsonIgnore
	    @OneToMany(mappedBy = "producto")
	    List<DetalleFactura> detalle_factura;
	 
	 @ManyToOne
	    @JoinColumn (name = "id_proveedor", referencedColumnName = "id_proveedor")
	    private Proveedor proveedor;
	  @OneToMany(mappedBy = "producto")
	    List<Inventario> inventario;

}

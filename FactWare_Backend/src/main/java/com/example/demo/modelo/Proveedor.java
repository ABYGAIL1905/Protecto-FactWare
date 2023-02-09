package com.example.demo.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "proveedor")
@Getter
@Setter
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_proveedor")
    private Long id_proveedor;

    @Column(name = "nombre_proveedor")
    private String nombre_proveedor;

    @Column(name = "direccion_proveedor")
    private String direccion_proveedor;

    @Column(name = "telefono_proveedor")
    private String telefono_proveedor;

//	 @OneToMany(mappedBy = "proveedor")
//	    List<Producto> producto;
    public Proveedor() {
    }

    public Proveedor(Long id) {
        super();
        this.id_proveedor = id;
    }
}

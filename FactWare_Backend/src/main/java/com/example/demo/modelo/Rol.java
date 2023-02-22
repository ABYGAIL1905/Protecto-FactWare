package com.example.demo.modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "rol")
@Getter
@Setter
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_rol")
    private Long id_rol;

    @Column(name = "nombre_rol")
    private String nombre_rol;
    
//    @OneToMany(mappedBy = "rol")
//    List<Usuario> usuario;

    public Long getId_rol() {
		return id_rol;
	}

	public void setId_rol(Long id_rol) {
		this.id_rol = id_rol;
	}

	public String getNombre_rol() {
		return nombre_rol;
	}

	public void setNombre_rol(String nombre_rol) {
		this.nombre_rol = nombre_rol;
	}

	public Rol() {
    }

    public Rol(Long id) {
        super();
        this.id_rol = id;
    }

//    public Rol(Long id_rol, String nombre_rol, List<Usuario> usuario) {
//        this.id_rol = id_rol;
//        this.nombre_rol = nombre_rol;
//        this.usuario = usuario;
//    }

}

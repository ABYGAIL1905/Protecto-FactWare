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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "persona")
@Getter
@Setter
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_persona")
    private Long id_persona;

    @Column(name = "cedula")
    private String cedula;

    @Column(name = "nombre_persona")
    private String nombre_persona;

    @Column(name = "apellido_persona")
    private String apellido_persona;

    @Column(name = "direccion_persona")
    private String direccion_persona;

    @Column(name = "telefono_persona")
    private String telefono_persona;

    @Column(name = "correo_persona")
    private String correo_persona;

//    @OneToMany(mappedBy = "persona")
//    List<Usuario> usuario;
//
//    @OneToMany(mappedBy = "persona")
//    List<Factura> factura;

    public Persona() {
    }

    //relacion entre Id de Usuarios
    public Persona(Long id) {
        super();
        this.id_persona = id;
    }

	public Long getId_persona() {
		return id_persona;
	}

	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre_persona() {
		return nombre_persona;
	}

	public void setNombre_persona(String nombre_persona) {
		this.nombre_persona = nombre_persona;
	}

	public String getApellido_persona() {
		return apellido_persona;
	}

	public void setApellido_persona(String apellido_persona) {
		this.apellido_persona = apellido_persona;
	}

	public String getDireccion_persona() {
		return direccion_persona;
	}

	public void setDireccion_persona(String direccion_persona) {
		this.direccion_persona = direccion_persona;
	}

	public String getTelefono_persona() {
		return telefono_persona;
	}

	public void setTelefono_persona(String telefono_persona) {
		this.telefono_persona = telefono_persona;
	}

	public String getCorreo_persona() {
		return correo_persona;
	}

	public void setCorreo_persona(String correo_persona) {
		this.correo_persona = correo_persona;
	}

//    public Persona(Long id_persona, String cedula, String nombre_persona, String apellido_persona, String direccion_persona, String telefono_persona, String correo_persona, List<Usuario> usuario, List<Factura> factura) {
//        this.id_persona = id_persona;
//        this.cedula = cedula;
//        this.nombre_persona = nombre_persona;
//        this.apellido_persona = apellido_persona;
//        this.direccion_persona = direccion_persona;
//        this.telefono_persona = telefono_persona;
//        this.correo_persona = correo_persona;
//        this.usuario = usuario;
//        this.factura = factura;
//    }

    
}

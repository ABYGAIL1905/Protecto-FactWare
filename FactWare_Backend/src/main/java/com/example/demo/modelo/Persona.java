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
@Table(name = "persona")
@Getter
@Setter
public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 @Column (name = "id_persona")
	private Long id_persona;
	
	 @Column (name = "cedula")
	private String cedula;
	 
	 @Column (name = "nombre_persona")
	private String nombre_persona;
	 
	 @Column (name = "apellido_persona")
	private String apellido_persona;
	 
	 @Column (name = "direccion_persona")
	private String direccion_persona;
	 
	 @Column (name = "telefono_persona")
	private String telefono_persona;
	 
	 @Column (name = "correo_persona")
	private String correo_persona;
	
	 @OneToMany(mappedBy = "persona")
	    List<Usuario> usuario;
         
         @OneToMany(mappedBy = "persona")
	    List<Factura> factura;
         
         public Persona(){}
         
         public Persona(Long id){
             super();
             this.id_persona=id;
         }
	
}

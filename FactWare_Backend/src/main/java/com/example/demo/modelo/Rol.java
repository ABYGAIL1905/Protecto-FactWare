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

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "rol")
@Getter
@Setter
public class Rol implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 @Column (name = "id_rol")
	private Long id_rol;
	
	 @Column (name = "nombre_rol")
	private String nombre_rol;
	    @JsonBackReference

	   @OneToMany(mappedBy = "rol")
	    List<Usuario> usuario;
           
           public Rol(){}
           
           public Rol(Long id_persona){
               this.id_rol=id_persona;
           }
}

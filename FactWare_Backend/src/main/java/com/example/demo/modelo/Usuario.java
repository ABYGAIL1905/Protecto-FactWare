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

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 @Column (name = "id_usuario")
	private Long id_usuario;
	 @Column (name = "password")
	private String password;
	
	 @ManyToOne
	    @JoinColumn (name = "id_persona", referencedColumnName = "id_persona")
	    private Persona persona;
	 @ManyToOne
	    @JoinColumn (name = "id_rol", referencedColumnName = "id_rol")
	    private Rol rol;
	 @OneToMany(mappedBy = "usuario")
	    List<Factura> factura;
}

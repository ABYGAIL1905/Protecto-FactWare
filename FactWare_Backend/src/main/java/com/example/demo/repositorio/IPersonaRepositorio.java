package com.example.demo.repositorio;

import com.example.demo.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaRepositorio extends JpaRepository<Persona, Long>{

}

package com.example.demo.repositorio;

import com.example.demo.modelo.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IRolRepositorio extends JpaRepository<Rol, Long>{

}

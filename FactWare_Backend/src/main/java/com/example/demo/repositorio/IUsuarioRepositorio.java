package com.example.demo.repositorio;

import com.example.demo.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepositorio extends JpaRepository<Usuario, Long> {
    
}

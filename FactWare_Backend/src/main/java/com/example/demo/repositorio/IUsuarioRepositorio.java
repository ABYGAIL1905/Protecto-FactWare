package com.example.demo.repositorio;

import com.example.demo.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepositorio extends CrudRepository<Usuario, Long>{

}

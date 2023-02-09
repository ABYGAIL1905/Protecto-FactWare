package com.example.demo.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.Inventario;

public interface IInventarioRepositorio extends CrudRepository <Inventario, Long>{

}

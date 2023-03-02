package com.example.demo.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.Inventario;
import com.example.demo.modelo.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IInventarioRepositorio extends CrudRepository <Inventario, Long>{

    @Query(value = "SELECT stock FROM producto WHERE id_producto = :id",nativeQuery = true)
    public int stockProd(@Param("id") Long id);
}

package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Producto;

@Repository
public interface IProductoRepositorio extends JpaRepository<Producto, Long>{

   // UPDATE producto SET stock = 50 WHERE id_producto = 1
}

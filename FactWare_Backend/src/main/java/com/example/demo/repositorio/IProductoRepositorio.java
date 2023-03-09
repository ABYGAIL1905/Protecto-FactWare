package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Producto;

public interface IProductoRepositorio  extends JpaRepository<Producto, Long>{

   // UPDATE producto SET stock = 50 WHERE id_producto = 1
}

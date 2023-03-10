package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface IProductoRepositorio  extends JpaRepository<Producto, Long>{

    @Query(value = "SELECT * FROM producto WHERE stock <= 25",nativeQuery = true)
    public List<Producto> buscarProduc();
   
}

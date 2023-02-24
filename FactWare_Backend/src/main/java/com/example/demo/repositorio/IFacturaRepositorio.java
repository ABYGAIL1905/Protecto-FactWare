package com.example.demo.repositorio;

import com.example.demo.modelo.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacturaRepositorio extends JpaRepository<Factura, Long>{

}

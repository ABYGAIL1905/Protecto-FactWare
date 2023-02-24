package com.example.demo.repositorio;

import com.example.demo.modelo.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleFactRepositorio extends JpaRepository<DetalleFactura, Long>{

}

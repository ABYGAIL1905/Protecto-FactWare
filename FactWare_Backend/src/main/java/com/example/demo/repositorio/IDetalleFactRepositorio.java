package com.example.demo.repositorio;

import com.example.demo.modelo.DetalleFactura;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IDetalleFactRepositorio extends JpaRepository<DetalleFactura, Long>{

    @Query(value = "SELECT * FROM detallefact WHERE id_factura = :id",nativeQuery = true)
    public List<DetalleFactura> buscarFactura(@Param("id") Long id);   
}

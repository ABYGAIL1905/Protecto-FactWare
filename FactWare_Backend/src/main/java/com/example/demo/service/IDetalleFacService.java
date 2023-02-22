package com.example.demo.service;

import com.example.demo.modelo.DetalleFactura;
import java.util.List;

public interface IDetalleFacService {

    public List<DetalleFactura> findAll();
    
    public DetalleFactura save(DetalleFactura detalleFactura);
    
   public DetalleFactura findById(Long id);
   
   public void delete(Long id);
}

package com.example.demo.service;

import com.example.demo.modelo.Factura;
import java.util.List;

public interface IFacturaService {

    public List<Factura> findAll();
    
    public Factura save(Factura factura);
    
   public Factura findById(Long id);
   
   public void delete(Long id);
}

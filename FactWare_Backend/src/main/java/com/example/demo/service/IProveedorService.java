package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Proveedor;



public interface IProveedorService {

    public List<Proveedor> findAll();
    
    public Proveedor save(Proveedor proveedor);
    
   public Proveedor findById(Long id);
   
   public void delete(Long id);
}

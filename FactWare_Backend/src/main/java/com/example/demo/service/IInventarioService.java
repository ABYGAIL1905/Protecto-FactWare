package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Inventario;


public interface IInventarioService {
	
	
    public List<Inventario> findAll();
    
    public Inventario save(Inventario inventario);
    
   public Inventario findById(Long id);
   
   public void delete(Long id);
}

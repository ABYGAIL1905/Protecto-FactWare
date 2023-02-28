package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Producto;


public interface IProductoService {
	
	  public List<Producto> findAll();
	    
	    public Producto save(Producto producto);
	    
	   public Producto findById(Long id);
	   
	   public void delete(Long id);
}

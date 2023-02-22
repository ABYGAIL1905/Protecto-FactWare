package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.example.demo.modelo.Producto;



public interface IProductoService {
	

	 public List<Producto> findAll();
	    
	    public Producto save(Producto producto);
	    
	   public Producto findById(Long id);
	   
	   public void delete(Long id);
}

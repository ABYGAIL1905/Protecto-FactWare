package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.modelo.Persona;
import com.example.demo.modelo.Producto;
import com.example.demo.repositorio.IProductoRepositorio;


@Service
public class ProductoImpService implements IProductoService{
	
	@Autowired
	private IProductoRepositorio productoRepository;
	

	@Override
    @Transactional (readOnly=true)
	public List<Producto> findAll() {
		
		return (List<Producto>) productoRepository.findAll();
	}

	@Override
	public Producto save(Producto producto) {
		
		return productoRepository.save(producto);
	}
	

	@Override
	 @Transactional (readOnly=true)
	public Producto findById(Long id) {
	
		return productoRepository.findById(id).get();
	}
	
	

	@Override
	public void delete(Long id) {
		productoRepository.deleteById(id);
	}

}

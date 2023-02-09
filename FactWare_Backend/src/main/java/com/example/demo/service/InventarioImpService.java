package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.modelo.Inventario;
import com.example.demo.repositorio.IInventarioRepositorio;

@Service
public class InventarioImpService implements IInventarioService {
	  @Autowired
	    private IInventarioRepositorio inveD;

	    @Override
	    @Transactional (readOnly=true)
	    public List<Inventario> findAll() {
	        return (List<Inventario>) inveD.findAll();
	    }

	    @Override
	    public Inventario save(Inventario inventario) {
	        return inveD.save(inventario);
	    }

	    @Override
	    @Transactional (readOnly=true)
	    public Inventario findById(Long id) {
	        return inveD.findById(id).get();
	    }

	    @Override
	    public void delete(Long id) {
	    	inveD.deleteById(id);
	    }
}

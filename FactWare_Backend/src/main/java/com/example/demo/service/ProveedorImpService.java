package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.modelo.Proveedor;
import com.example.demo.repositorio.IProveedorRepositorio;

@Service
public class ProveedorImpService implements IProveedorService{

    @Autowired
    private IProveedorRepositorio proveD;

    @Override
    @Transactional (readOnly=true)
    public List<Proveedor> findAll() {
        return (List<Proveedor>) proveD.findAll();
    }

    @Override
    public Proveedor save(Proveedor proveedor) {
        return proveD.save(proveedor);
    }

    @Override
    @Transactional (readOnly=true)
    public Proveedor findById(Long id) {
        return proveD.findById(id).get();
    }

    @Override
    public void delete(Long id) {
    	proveD.deleteById(id);
    }
}

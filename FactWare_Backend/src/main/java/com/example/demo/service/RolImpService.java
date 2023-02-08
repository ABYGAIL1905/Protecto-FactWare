package com.example.demo.service;

import com.example.demo.modelo.Rol;
import com.example.demo.repositorio.IRolRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RolImpService implements IRolService{

    @Autowired
    private IRolRepositorio rR;
    
    @Override
    @Transactional (readOnly=true)
    public List<Rol> findAll() {
        return (List<Rol>) rR.findAll();
    }

    @Override
    public Rol save(Rol rol) {
        return rR.save(rol);
    }

    @Override
    @Transactional (readOnly=true)
    public Rol findById(Long id) {
        return rR.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        rR.deleteById(id);
    }

}

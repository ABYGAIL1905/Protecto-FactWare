package com.example.demo.service;

import com.example.demo.modelo.Persona;
import com.example.demo.repositorio.IPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaImpService implements IPersonaService{

    @Autowired
    private IPersonaRepositorio rP;
    
    @Override
    @Transactional (readOnly=true)
    public List<Persona> findAll() {
        return (List<Persona>) rP.findAll();
    }

    @Override
    public Persona save(Persona persona) {
        return rP.save(persona);
    }

    @Override
    @Transactional (readOnly=true)
    public Persona findById(Long id) {
        return rP.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        rP.deleteById(id);
    }

}

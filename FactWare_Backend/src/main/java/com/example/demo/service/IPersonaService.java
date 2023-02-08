package com.example.demo.service;

import com.example.demo.modelo.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> findAll();
    
    public Persona save(Persona persona);
    
   public Persona findById(Long id);
   
   public void delete(Long id);
   
}

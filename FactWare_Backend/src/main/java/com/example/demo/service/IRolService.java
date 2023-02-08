package com.example.demo.service;

import com.example.demo.modelo.Rol;
import java.util.List;

public interface IRolService {

    public List<Rol> findAll();
    
    public Rol save(Rol rol);
    
   public Rol findById(Long id);
   
   public void delete(Long id);
}

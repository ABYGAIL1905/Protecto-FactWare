package com.example.demo.service;

import com.example.demo.modelo.Usuario;
import java.util.List;

public interface IUsuarioService {

    public List<Usuario> findAll();
    
    public Usuario save(Usuario usuario);
    
   public Usuario findById(Long id);
   
   public void delete(Long id);
}

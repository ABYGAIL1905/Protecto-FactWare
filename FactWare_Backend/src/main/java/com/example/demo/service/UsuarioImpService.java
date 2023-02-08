package com.example.demo.service;

import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.IUsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioImpService implements IUsuarioService{

    @Autowired
    private IUsuarioRepositorio rU;

    @Override
    @Transactional (readOnly=true)
    public List<Usuario> findAll() {
        return (List<Usuario>) rU.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return rU.save(usuario);
    }

    @Override
    @Transactional (readOnly=true)
    public Usuario findById(Long id) {
        return rU.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        rU.deleteById(id);
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repositorio;

import com.example.demo.modelo.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author educr
 */
public interface IUsuarioDao extends JpaRepository<Usuario, Long>{
    
    public Usuario findByUser(String user);

    Boolean existsByUser(String user);

    @Query(value = "SELECT * FROM usuario WHERE user = ?", nativeQuery = true)
    public abstract List<Usuario> buscarUsuario(String user);

    public boolean existsByPassword(String contrasenia);
}

package com.example.demo.controlador;

import com.example.demo.modelo.Rol;
import com.example.demo.service.IRolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class RolControlador {

    @Autowired
    private IRolService sR;
    
    //Listar todos los roles
    @GetMapping("/lisR")
    public List<Rol> index(){
        return sR.findAll();
    }
    
    //Buscar un rol
    @GetMapping("buc/{id}")
    public Rol findById(Long id){
        return sR.findById(id);
    }
    
    //Guardar Rol
    @PutMapping("/savR")
    @ResponseStatus(HttpStatus.CREATED)
    public Rol save(@RequestBody Rol rol){
        return sR.save(rol);
    }
    
    //Modificar Rol
    @PutMapping("/modR/{id}")
    public Rol update(@RequestBody Rol rol, @PathVariable Long id){
        Rol rolN = sR.findById(id);
        rolN.setNombre_rol(rol.getNombre_rol());
        return sR.save(rolN);
    }
    
    //Eliminar Rol
    @DeleteMapping("/delR/{id}")
    public void delete(Long id){
        sR.delete(id);
    }
}   

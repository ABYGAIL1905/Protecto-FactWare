package com.example.demo.controlador;

import com.example.demo.modelo.Persona;
import com.example.demo.service.IPersonaService;
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
public class PersonaControlador {
    
    @Autowired
    private IPersonaService sP;
    
    //listar todas la personas
    @GetMapping("/lisP")
    public List<Persona> index(){
        return sP.findAll();
    }
    
    //Buscar una persona
    @GetMapping("/busc/{id}")
    public Persona findById(Long id){
        return sP.findById(id);
    }
    
    //Guardar
    @PutMapping("/savP")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona save(@RequestBody Persona persona){
        return sP.save(persona);
    }
    
    //Modificar Persona
    @PutMapping("/modiP/{id}")
    public Persona update(@RequestBody Persona persona, @PathVariable Long id){
        Persona personaN = sP.findById(id);
        personaN.setApellido_persona(persona.getApellido_persona());
        personaN.setCedula(persona.getCedula());
        personaN.setCorreo_persona(persona.getCorreo_persona());
        personaN.setDireccion_persona(persona.getDireccion_persona());
        //personaN.setFactura(persona.getFactura());
        personaN.setNombre_persona(persona.getNombre_persona());
        personaN.setTelefono_persona(persona.getTelefono_persona());
        //personaN.setUsuario(persona.getUsuario());
        
        return sP.save(personaN);
    }

    //Eliminar Personar
    @DeleteMapping("delP/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        sP.delete(id);
    }
}

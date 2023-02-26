package com.example.demo.controlador;

import com.example.demo.modelo.Factura;
import com.example.demo.service.IFacturaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class FacturaControlador {
    
    @Autowired
    private IFacturaService sF;
    
    //listar todos los usuarios
    @GetMapping("/listF")
    public List<Factura> index() {
        return sF.findAll();
    }

    //Buscar un usuario
    @GetMapping("/buscF/{id}")
    public Factura findById(@PathVariable Long id) {
        return sF.findById(id);
    }

    //Guardar
    @PostMapping("/savF")
    @ResponseStatus(HttpStatus.CREATED)
    public Factura save(@RequestBody Factura factura) {
        return sF.save(factura);
    }

    //Modificar Usuario
    @PutMapping("/modiF/{id}")
    public Factura update(@RequestBody Factura factura, @PathVariable Long id) {
        Factura facturaN = sF.findById(id);
        facturaN.setFecha(factura.getFecha());
        facturaN.setPersona(factura.getPersona());
        return sF.save(facturaN);
    }

    //Eliminar Usuario
    @DeleteMapping("/delF/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        sF.delete(id);
    }
}

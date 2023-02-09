package com.example.demo.controlador;

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

import com.example.demo.modelo.Proveedor;
import com.example.demo.service.IProveedorService;



@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProveedorControlador {

@Autowired
    private IProveedorService sProv;
    
    //listar todas los proveedores
    @GetMapping("/lisProve")
    public List<Proveedor> index(){
        return sProv.findAll();
    }
    
    //Buscar una persona
    @GetMapping("/buscProve/{id}")
    public Proveedor findById(Long id){
        return sProv.findById(id);
    }
    
    //Guardar proveedor
    @PutMapping("/savProve")
    @ResponseStatus(HttpStatus.CREATED)
    public Proveedor save(@RequestBody Proveedor proveedor){
        return sProv.save(proveedor);
    }
    
    //Modificar Proveedor
    @PutMapping("/modiProve/{id}")
    public Proveedor update(@RequestBody Proveedor proveedor, @PathVariable Long id){
       Proveedor  proveedorN = sProv.findById(id);
       proveedorN.setDireccion_proveedor(proveedor.getDireccion_proveedor());
       proveedorN.setNombre_proveedor(proveedor.getNombre_proveedor());
       proveedorN.setProducto(proveedor.getProducto());
       proveedorN.setTelefono_proveedor(proveedor.getTelefono_proveedor());
        
        
        return sProv.save(proveedorN);
    }

    //Eliminar proveedor
    @DeleteMapping("delProve/{id}")
    public void delete(Long id){
    	sProv.delete(id);
    }
 
}

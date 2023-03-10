package com.example.demo.controlador;

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

import com.example.demo.modelo.Inventario;
import com.example.demo.modelo.Producto;
import com.example.demo.repositorio.IInventarioRepositorio;
import com.example.demo.service.IInventarioService;
import com.example.demo.service.IProductoService;
import org.springframework.web.bind.annotation.PostMapping;



@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class InventarioControlador {

 @Autowired
    private IInventarioService sInvent;
 
 @Autowired
 private IProductoService sPro;
 
 @Autowired
 private IInventarioRepositorio  rIn;
    
    //listar  inventario
    @GetMapping("/lisInvent")
    public List<Inventario> index(){
        return sInvent.findAll();
    }
    
    //Buscar inventaro
    @GetMapping("/buscInvent/{id}")
    public Inventario findById(@PathVariable Long id){
        return sInvent.findById(id);
    }
    
    //Guardar inventario
    @PostMapping("/savInvent")
    @ResponseStatus(HttpStatus.CREATED)
    public Inventario  save(@RequestBody Inventario  inventario ){
        System.out.println(""+inventario.getProducto().getId_producto().toString());
        //int stockActual = rIn.stockProd(inventario.getProducto().getId_producto());
        Producto p = sPro.findById(inventario.getProducto().getId_producto());
        p.setStock(inventario.getCantidad_inventario()+p.getStock());
        sPro.save(p);
        return sInvent.save(inventario );
    }
    
    //Modificar inventario
    @PutMapping("/modiInvent/{id}")
    public Inventario  update(@RequestBody Inventario  inventario , @PathVariable Long id){
      Inventario   inventarioN = sInvent.findById(id);
      inventarioN.setCantidad_inventario(inventario.getCantidad_inventario());
      inventarioN.setFechaEntrega(inventario.getFechaEntrega());
      inventarioN.setProducto(inventario.getProducto());
        
        
        return sInvent.save(inventarioN);
    }

    //Eliminar inventario
    @DeleteMapping("delInvent/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
    	sInvent.delete(id);
    } 
}

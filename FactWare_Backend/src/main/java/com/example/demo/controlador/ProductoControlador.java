package com.example.demo.controlador;

import com.example.demo.modelo.DetalleFactura;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import com.example.demo.modelo.Persona;
import com.example.demo.modelo.Producto;
import com.example.demo.repositorio.IDetalleFactRepositorio;
import com.example.demo.repositorio.IProductoRepositorio;
import com.example.demo.service.IProductoService;



@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/productos")
public class ProductoControlador {


	@Autowired
	private IProductoService productoService;
        
        @Autowired
        private IProductoRepositorio rPro;
        
        @Autowired
        private IDetalleFactRepositorio rDet;
	
	
	//crear
	@PostMapping
	public ResponseEntity<?> create (@RequestBody Producto producto){
		return ResponseEntity.status(HttpStatus.CREATED).body(productoService.save(producto));
	}
	
	//listar
	 @GetMapping("/lisPr")
	    public List<Producto> index(){
	        return productoService.findAll();
	    }
	 
	 //buscar
	 @GetMapping("/{id}")
	    public Producto findById(@PathVariable Long id){
	        return productoService.findById(id);
	    }
	 
	 
	 
	 //Guardar
	    @PostMapping("/savPr")
	    @ResponseStatus(HttpStatus.CREATED)
	    public Producto save(@RequestBody Producto producto){
	        return productoService.save(producto);
	    }
	    
	  
	    //Modificar 
	    @PutMapping("/{id}")
	    public Producto update(@RequestBody Producto producto, @PathVariable Long id){
	    	Producto prod = productoService.findById(id);
	        
	    	prod.setNombre_producto(producto.getNombre_producto());
	    	prod.setDescripcion_producto(producto.getDescripcion_producto());
	    	prod.setCodigoBarras_producto(producto.getCodigoBarras_producto());
	    	prod.setCosto_producto(producto.getCosto_producto());
	    	prod.setPvp_producto(producto.getPvp_producto());
	    	prod.setUtilidad_producto(producto.getUtilidad_producto());
	    	prod.setEstadoIVA_producto(producto.getEstadoIVA_producto());
                prod.setStock(producto.getStock());
	    	
	    	
	        
	        return productoService.save(prod);
	    }
	    
	    //Eliminar 
	    @DeleteMapping("/{id}")
	    @ResponseStatus(HttpStatus.NO_CONTENT)
	    public void delete(@PathVariable Long id){
	    	productoService.delete(id);
	    }
            
            
            //Listar lo que tengan stoc menor
            @GetMapping("/lisStoc")
	    public List<Producto> stoc(){
	        return rPro.buscarProduc();
	    }
	 
	 
            //listar para el mas vendido
            @GetMapping("/masVendido")
            public List<DetalleFactura> vendido(){
                return rDet.busque();
            }
}

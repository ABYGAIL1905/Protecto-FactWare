package com.example.demo.service;

import com.example.demo.modelo.DetalleFactura;
import com.example.demo.repositorio.IDetalleFactRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleFacImpService implements IDetalleFacService {
    
    @Autowired
    private IDetalleFactRepositorio rD;
    
    @Override
    public List<DetalleFactura> findAll() {
        return (List<DetalleFactura>) rD.findAll();
    }
    
    @Override
    public DetalleFactura save(DetalleFactura detalleFactura) {
        return rD.save(detalleFactura);
    }
    
    @Override
    public DetalleFactura findById(Long id) {
        return rD.findById(id).get();
    }
    
    @Override
    public void delete(Long id) {
        rD.deleteById(id);
    }
    
}

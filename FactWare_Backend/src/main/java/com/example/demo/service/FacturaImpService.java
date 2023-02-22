package com.example.demo.service;

import com.example.demo.modelo.Factura;
import com.example.demo.repositorio.IFacturaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FacturaImpService implements IFacturaService{

    @Autowired
    private IFacturaRepositorio rF;

    @Override
    public List<Factura> findAll() {
        return (List<Factura>) rF.findAll();
    }

    @Override
    public Factura save(Factura factura) {
        return rF.save(factura);
    }

    @Override
    public Factura findById(Long id) {
        return rF.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        rF.deleteById(id);
    }
}

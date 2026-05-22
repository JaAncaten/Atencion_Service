package com.vetnova.atencionservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vetnova.atencionservice.model.Atencion;
import com.vetnova.atencionservice.repository.AtencionRepository;
@Service

public class AtencionService {
    @Autowired
    private AtencionRepository atencionRepository;

    public List<Atencion> obtenerAtenciones(){
        return atencionRepository.findAll();
    }
    
    public Atencion guardarAtencion(Atencion atencion){
        return atencionRepository.save(atencion);
    }

    public Atencion obtenerAtencionPorId(Long id){
        return atencionRepository.findById(id).orElse(null);
    }

    public void eliminarAtencion(Long id){
         atencionRepository.deleteById(id);
    }
}

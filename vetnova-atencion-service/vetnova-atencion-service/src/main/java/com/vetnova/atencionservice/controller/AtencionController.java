package com.vetnova.atencionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vetnova.atencionservice.model.Atencion;
import com.vetnova.atencionservice.service.AtencionService;

@RestController
@RequestMapping("/api/atenciones")

public class AtencionController {
    @Autowired
    private AtencionService atencionService;

    @GetMapping
    public List<Atencion> obtenerAtenciones(){
        return atencionService.obtenerAtenciones();
    }
    
    @PostMapping
    public Atencion guardarAtencion(@RequestBody Atencion atencion){
        return atencionService.guardarAtencion(atencion);
    }

    @GetMapping("/{id}")
    public Atencion obtenerAtencionPorId(@PathVariable Long id) {
        return atencionService.obtenerAtencionPorId(id); 
    }

    @DeleteMapping("/{id}")
    public void eliminarAtencion(@PathVariable Long id){
        atencionService.eliminarAtencion(id);
    }
}

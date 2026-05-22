package com.vetnova.atencionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vetnova.atencionservice.model.Atencion;


public interface AtencionRepository extends JpaRepository<Atencion,Long>{
    
}

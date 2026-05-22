package com.vetnova.atencionservice.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "atenciones")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Atencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long mascotaId;

    private Long usuarioId;

    private Long veterinarioId;

    private String motivo;

    private String diagnostico;

    private String tratamiento;

    private LocalDate fecha;

    private LocalTime hora;

    private String estado;

}
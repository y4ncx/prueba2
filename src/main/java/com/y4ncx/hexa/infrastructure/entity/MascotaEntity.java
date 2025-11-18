package com.y4ncx.hexa.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "mascotas")
public class MascotaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String genero;
    private Double peso;
    private String tamano;
    private String color;
    private String raza;
    private String especie;
    private LocalDate fechaNacimiento;
    private String propietario;
    private String domesticoOSalvaje;
    private Boolean tieneVacunas;
    private String veterinario;
}

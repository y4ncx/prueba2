package com.y4ncx.hexa.application.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class MascotaDTO {
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

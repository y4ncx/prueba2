package com.y4ncx.hexa.domain.model;

import java.time.LocalDate;

public class Mascota {

    private Long id;
    private String nombre;
    private String genero;
    private double peso;
    private String tamano;
    private String color;
    private String raza;
    private String especie;
    private LocalDate fechaNacimiento;
    private String propietario;
    private String domesticoOSalvaje;
    private boolean tieneVacunas;
    private String veterinario;

    public Mascota() {
    }

    public Mascota(Long id, String nombre, String genero, double peso, String tamano,
                   String color, String raza, String especie, LocalDate fechaNacimiento,
                   String propietario, String domesticoOSalvaje, boolean TieneVacunas, String veterinario) {

        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
        this.tamano = tamano;
        this.color = color;
        this.raza = raza;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.propietario = propietario;
        this.domesticoOSalvaje = domesticoOSalvaje;
        this.tieneVacunas = tieneVacunas;
        this.veterinario = veterinario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPropietario() {
        return propietario;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getDomesticoOSalvaje() {
        return domesticoOSalvaje;
    }
    public void setDomesticoOSalvaje(String domesticoOSalvaje) {
        this.domesticoOSalvaje = domesticoOSalvaje;
    }

    public Boolean getTieneVacunas() {
        return tieneVacunas;
    }
    public void setTieneVacunas(Boolean tieneVacunas) {
        this.tieneVacunas = tieneVacunas;
    }

    public String getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }
}

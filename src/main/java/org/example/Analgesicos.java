package org.example;

import java.time.LocalDate;

public abstract class Analgesicos {

    private String nombre,  registro, fabricante;
    private Integer precio = 1000;
    private LocalDate fechaVencimiento, fechaCreacion;

    //Constructores

    public Analgesicos() {
    }

    public Analgesicos(String nombre, String registro, String fabricante, Integer precio, LocalDate fechaVencimiento, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.registro = registro;
        this.fabricante = fabricante;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaCreacion = fechaCreacion;
    }

    //getters / setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Double DescuentoTipo(double descuento){
        descuento = descuento - (precio * 0.05);
    return descuento;
    }

}

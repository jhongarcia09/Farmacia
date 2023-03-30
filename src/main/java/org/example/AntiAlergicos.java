package org.example;

import java.time.LocalDate;

public class AntiAlergicos extends Analgesicos{

    //Constructores


    public AntiAlergicos() {
    }

    public AntiAlergicos(String nombre, String registro, String fabricante, Integer precio, LocalDate fechaVencimiento, LocalDate fechaCreacion) {
        super(nombre, registro, fabricante, precio, fechaVencimiento, fechaCreacion);
    }

    public Double DescuentoTipo(double descuento){
        descuento = descuento - (this.getPrecio() * 0.08);
        return descuento;
    }
}

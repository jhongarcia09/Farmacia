package org.example;

import java.time.LocalDate;

public class AntiInflamatorio extends Analgesicos{
    //Constructores

    public AntiInflamatorio() {
    }

    public AntiInflamatorio(String nombre, String registro, String fabricante, Integer precio, LocalDate fechaVencimiento, LocalDate fechaCreacion) {
        super(nombre, registro, fabricante, precio, fechaVencimiento, fechaCreacion);
    }
    public Double DescuentoTipo(double descuento) {
        descuento = descuento - (this.getPrecio() * 0.1);
        return descuento;
    }
}

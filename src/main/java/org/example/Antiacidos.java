package org.example;

import java.time.LocalDate;

public class Antiacidos extends Analgesicos{

    //Constructores
    public Antiacidos() {
    }

    public Antiacidos(String nombre, String registro, String fabricante, Integer precio, LocalDate fechaVencimiento, LocalDate fechaCreacion) {
        super(nombre, registro, fabricante, precio, fechaVencimiento, fechaCreacion);
    }

    public Double DescuentoTipo(double descuento){
        descuento = descuento - (this.getPrecio() * 0.06);
        return descuento;
    }





}

package org.example;

import java.time.LocalDate;

public class AntiInfeccioso extends Analgesicos{
    //Contructores


    public AntiInfeccioso() {
    }

    public AntiInfeccioso(String nombre, String registro, String fabricante, Integer precio, LocalDate fechaVencimiento, LocalDate fechaCreacion) {
        super(nombre, registro, fabricante, precio, fechaVencimiento, fechaCreacion);
    }
}

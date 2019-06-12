package org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour;

import java.util.Formatter;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Packing;

public interface Item {

    String nombre();
    Packing empaquetado();
    Float pvp();

    default String outputFormatter() {
        
        StringBuilder stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(stringBuilder);
        
        formatter.format("Item: %1$s, Empaquetado: %2$s, Precio: %3$s %n", 
                   this.nombre(), this.empaquetado().envoltorio(), this.pvp());

        formatter.close();
        return stringBuilder.toString();
    }
}
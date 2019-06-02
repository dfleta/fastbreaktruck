package org.lasencinas.fastbreaktruck.fastbreaktruck.domain;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Item;
import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Packing;

public abstract class Bebida implements Item {

    @Override
    public Packing envoltorio() {
        return new Tubo();
    }

    @Override
    public String toString() {
        return "Item: " + this.nombre() +
               ", Envoltorio: " + this.envoltorio().paquete() +
               ", Precio: " + this.pvp();
    }    
}
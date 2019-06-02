package org.lasencinas.fastbreaktruck.fastbreaktruck.domain;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Item;

public abstract class Bebida implements Item {

    @Override
    public String toString() {
        return "Item: " + this.nombre() +
               ", Envoltorio: " + this.envoltorio().paquete() +
               ", Precio: " + this.pvp();
    }    
}
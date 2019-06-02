package org.lasencinas.fastbreaktruck.fastbreaktruck.types;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Item;
import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Packing;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Caja;

public abstract class Cereales implements Item {

    @Override
    public Packing envoltorio() {
        return new Caja();
    }

    @Override
    public String toString() {
        return "Item: " + this.nombre() +
               ", Envoltorio: " + this.envoltorio().paquete() +
               ", Precio: " + this.pvp();
    }
}
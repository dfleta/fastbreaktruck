package org.lasencinas.fastbreaktruck.fastbreaktruck.types;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Item;
import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Packing;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Caja;

public abstract class Juguete implements Item {

    @Override
    public Packing empaquetado() {
        return new Caja();
    }

    @Override
    public String toString() {
        return "Item: " + this.nombre() +
               ", Empaquetado: " + this.empaquetado().envoltorio() +
               ", Precio: " + this.pvp();
    }
}
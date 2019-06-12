package org.lasencinas.fastbreaktruck.fastbreaktruck.types;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Item;
import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Packing;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Tubo;

public abstract class Bebida implements Item {

    @Override
    public Packing empaquetado() {
        return new Tubo();
    }

    @Override
    public String toString() {
        return this.outputFormatter();
    }
}
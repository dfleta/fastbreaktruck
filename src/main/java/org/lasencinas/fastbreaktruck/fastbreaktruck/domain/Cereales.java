package org.lasencinas.fastbreaktruck.fastbreaktruck.domain;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Item;
import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Packing;

public abstract class Cereales implements Item {

    @Override
    public Packing envoltorio() {
        return new Caja();
    }

}
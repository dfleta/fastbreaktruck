package org.lasencinas.fastbreaktruck.fastbreaktruck.domain;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Packing;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Cereales;

public class Eyeholes extends Cereales {

    private Float PVP = (float) 25;

    public Eyeholes() {
    };

    @Override
    public String nombre() {
        return "Eyeholes";
    }

    @Override
    public Packing envoltorio() {
        return new Caja();
    }

    @Override
    public Float pvp() {
        return this.PVP;
    };

    
}
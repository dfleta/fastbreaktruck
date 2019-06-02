package org.lasencinas.fastbreaktruck.fastbreaktruck.domain;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Packing;

public class Smiggles extends Cereales {

    private final String NOMBRE = "Smiggles";
    private final Float PVP = 50f;

    @Override
    public String nombre() {
        return NOMBRE;
    }

    @Override
    public Packing envoltorio() {
        return new Caja();
    }

    @Override
    public Float pvp() {
        return PVP;
    }

    

}
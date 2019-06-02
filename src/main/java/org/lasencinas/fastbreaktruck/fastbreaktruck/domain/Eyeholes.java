package org.lasencinas.fastbreaktruck.fastbreaktruck.domain;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Packing;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Cereales;

public class Eyeholes extends Cereales {

    private final String NOMBRE = "Eyeholes";
    private final Float PVP = 25f;

    public Eyeholes() {
    };

    @Override
    public String nombre() {
        return NOMBRE;
    }

    @Override
    public Float pvp() {
        return PVP;
    };

    
}
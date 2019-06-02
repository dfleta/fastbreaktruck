package org.lasencinas.fastbreaktruck.fastbreaktruck.domain;

import org.lasencinas.fastbreaktruck.fastbreaktruck.types.Bebida;

public class TurbulentJuice extends Bebida {

    private final String NOMBRE = "Turbulent juiiiiice"; 
    private final Float PVP = 30f;

    @Override
    public String nombre() {
        return NOMBRE;
    }

    @Override
    public Float pvp() {
        return PVP;
    }
}
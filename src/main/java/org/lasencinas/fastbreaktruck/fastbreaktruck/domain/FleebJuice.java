package org.lasencinas.fastbreaktruck.fastbreaktruck.domain;

public class FleebJuice extends Bebida {

    private final String NOMBRE = "Fleeb juice";
    private final Float PVP = 35f; 

    @Override
    public String nombre() {
        return NOMBRE;
    }

    @Override
    public Float pvp() {
        return PVP;
    }


}
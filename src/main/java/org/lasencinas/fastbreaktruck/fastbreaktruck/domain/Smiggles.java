package org.lasencinas.fastbreaktruck.fastbreaktruck.domain;

public class Smiggles extends Cereales {

    private final String NOMBRE = "Smiggles";
    private final Float PVP = 50f;

    @Override
    public String nombre() {
        return NOMBRE;
    }

    @Override
    public Float pvp() {
        return PVP;
    }

    

}
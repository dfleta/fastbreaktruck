package org.lasencinas.fastbreaktruck.fastbreaktruck.domain;

import org.lasencinas.fastbreaktruck.fastbreaktruck.types.Juguete;

public class Plumbus extends Juguete {

    private final String NOMBRE = "Plumbus";
    private final Float PVP = 100f;

    @Override
    public String nombre() {
        return this.NOMBRE;
    }

    @Override
    public Float pvp() {
        return this.PVP;
    }
}
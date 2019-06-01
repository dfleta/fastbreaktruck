package org.lasencinas.fastbreaktruck.fastbreaktruck.domain;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Packing;;

public class Caja implements Packing {

    public Caja() {
    };

    @Override
    public String paquete() {
        return "Caja";
    }
}
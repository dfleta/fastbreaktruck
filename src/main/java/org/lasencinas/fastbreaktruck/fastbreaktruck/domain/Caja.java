package org.lasencinas.fastbreaktruck.fastbreaktruck.domain;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Packing;

public class Caja implements Packing {

    @Override
    public String envoltorio() {
        return "Caja";
    }
}
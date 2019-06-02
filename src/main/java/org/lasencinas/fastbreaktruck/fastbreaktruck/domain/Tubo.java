package org.lasencinas.fastbreaktruck.fastbreaktruck.domain;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Packing;

public class Tubo implements Packing {
    
    @Override
    public String paquete() {
        return "tubo";
    }
}
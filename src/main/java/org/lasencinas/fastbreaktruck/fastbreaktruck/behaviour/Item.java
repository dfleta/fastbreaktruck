package org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Packing;

public interface Item {

    public String nombre();
    public Packing envoltorio();
    public Float pvp();

}
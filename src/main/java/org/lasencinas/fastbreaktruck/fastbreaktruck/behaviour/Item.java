package org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Packing;

public interface Item {

    String nombre();
    Packing empaquetado();
    Float pvp();
}
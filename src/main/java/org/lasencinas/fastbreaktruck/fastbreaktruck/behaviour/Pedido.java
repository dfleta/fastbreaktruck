package org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour;

import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Desayuno;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Eyeholes;

public class Pedido {

    public Pedido() {}

    public Desayuno prepararEyeHoles() {
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Eyeholes());
        return desayuno;
    }

    public Desayuno prepareSmiggles() {
        Desayuno desayuno = new Desayuno();
        //desayuno.addItem(new Smiggles());
        return desayuno;
    }
}
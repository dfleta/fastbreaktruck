package org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour;

import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Desayuno;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Eyeholes;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Smiggles;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.TurbulentJuice;

public class Pedido {

    public Pedido() {}

    public Desayuno prepararEyeHoles() {
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Eyeholes());
        desayuno.addItem(new TurbulentJuice());
        return desayuno;
    }

    public Desayuno prepareSmiggles() {
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Smiggles());
        return desayuno;
    }
}
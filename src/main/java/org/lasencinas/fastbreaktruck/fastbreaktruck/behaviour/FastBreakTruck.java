package org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour;

import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Desayuno;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Eyeholes;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.FleebJuice;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Plumbus;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.Smiggles;
import org.lasencinas.fastbreaktruck.fastbreaktruck.domain.TurbulentJuice;

public class FastBreakTruck {

    public static Desayuno prepararEyeHoles() {
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Eyeholes());
        desayuno.addItem(new TurbulentJuice());
        return desayuno;
    }

    public static Desayuno prepararSmiggles() {
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Smiggles());
        desayuno.addItem(new FleebJuice());
        return desayuno;
    }

    public static void incluirJuguete(Desayuno desayuno) {
        desayuno.addItem(new Plumbus());
    }
}
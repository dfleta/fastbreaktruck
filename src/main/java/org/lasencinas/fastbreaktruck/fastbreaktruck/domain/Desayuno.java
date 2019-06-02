package org.lasencinas.fastbreaktruck.fastbreaktruck.domain;

import java.util.ArrayList;
import java.util.List;

import org.lasencinas.fastbreaktruck.fastbreaktruck.behaviour.Item;


public class Desayuno {

    private List<Item> items = new ArrayList<Item>();
    private Float total = 0f;

    public Desayuno() {
    };

    public List<Item> getItems() {
        return this.items;
    }
 
    public void addItem(Item item) {
        getItems().add(item);
    }

    public void mostrarItems() {
        for (Item item : getItems()) {
            System.out.println("Item: " + item.nombre() +
                               ", Envoltorio: " + item.envoltorio().paquete() +
                               ", Precio: " + item.pvp());
        }
    }

    public Float getCoste() {
        getItems().forEach(item -> total += item.pvp());
        return this.total;
    }
}
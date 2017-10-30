package com.felipefvs.listasimples.model;

/**
 * Created by FELIPESIQUEIRAB20588 on 30/10/2017.
 */

public class Item {

    private String name;
    private int qtd;

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return name + ": " + qtd;
    }
}

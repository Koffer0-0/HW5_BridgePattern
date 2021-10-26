package com.company;

public class Wizzard extends Troop {

    public Wizzard() {
        super("Use some magic");
    }

    @Override
    public void traintroop() {
        System.out.println(this.purpose);
        this.barracks.trainTroop();
    }

    @Override
    public void improveTroop() {
        this.barracks.improveTroop();
    }
}

package com.company;

public class Marksman extends Troop {

    public Marksman() {
        super("Use bow and arrows");
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

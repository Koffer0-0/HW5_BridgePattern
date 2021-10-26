package com.company;

public class Knight extends Troop {

    public Knight() {
        super("Kill face to face");
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

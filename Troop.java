package com.company;

public abstract class Troop {
    protected String purpose;
    protected Barracks barracks;

    public Troop(String purpose) {
        this.purpose = purpose;
    }

    public abstract void traintroop();
    public abstract void improveTroop();

    public void chooseBarracks(Barracks barracks) {
        this.barracks = barracks;
    }

}

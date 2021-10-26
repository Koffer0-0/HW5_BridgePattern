package com.company;

public class KnightBarracks implements Barracks {
    @Override
    public void trainTroop() {
        System.out.println("I AM READY TO FIGHT MY KING");
    }

    @Override
    public void improveTroop() {
        System.out.println("I FEEL A SURGE OF STRENGTH");
    }
}

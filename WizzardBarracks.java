package com.company;

public class WizzardBarracks implements Barracks {
    @Override
    public void trainTroop() {
        System.out.println("Do you want some magic?");
    }

    @Override
    public void improveTroop() {
        System.out.println("Mana and damage increased!");
    }
}

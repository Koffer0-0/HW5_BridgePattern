package com.company;

public class MarksmanBarracks implements Barracks {
    @Override
    public void trainTroop() {
        System.out.println("My bow always with me");
    }

    @Override
    public void improveTroop() {
        System.out.println("Speed of attack increased");
    }
}

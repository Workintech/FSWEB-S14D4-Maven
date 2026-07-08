package org.example.rpg;

public class Troll extends


        org.example.rpg.Monster implements org.example.rpg.Bleedable, Poisonable {

    public Troll(String name, int hitPoints, double damage) {
        super();
        bleed(name, hitPoints, damage);
    }

    public double bleed(String name, int hitPoints, double damage) {
        return getDamage() * 0.25;
    }

    public double getDamage() {
        return 0;
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }

    @Override
    public double bleed() {
        return 0;
    }
}
package org.example.rpg;

public class Monster {

    private String name;
    private int hitPoints;
    private double damage;

    public Monster() {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public double attack() {
        double totalDamage = getDamage();

        if (this instanceof org.example.rpg.Bleedable) {
            totalDamage += ((org.example.rpg.Bleedable) this).bleed();
        }

        if (this instanceof Poisonable) {
            totalDamage += ((Poisonable) this).poison();
        }

        return totalDamage;
    }
}
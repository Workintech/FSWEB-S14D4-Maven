package org.example.model;

public class Bread extends ProductForSale {

    private double weight;

    public Bread(String type, double price, String description, double weight) {
        super();
        this.weight = weight;
    }

    public Bread(String bakery, int price, String testBread, String wholeWheat) {
        super();
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Weight: " + weight + " kg");
        System.out.println("----------------------------");
    }
}
package org.example.model;

public class Chocolate extends ProductForSale {

    private int cocoaPercentage;

    public Chocolate(String type, double price, String description, int cocoaPercentage) {
        super();
        this.cocoaPercentage = cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Percentage: " + cocoaPercentage + "%");
        System.out.println("----------------------------");
    }
}
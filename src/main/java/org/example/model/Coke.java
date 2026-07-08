package org.example.model;

public class Coke extends ProductForSale {

    private boolean sugarFree;

    public Coke(String type, double price, String description, boolean sugarFree) {
        super();
        this.sugarFree = sugarFree;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Sugar Free: " + (sugarFree ? "Yes" : "No"));
        System.out.println("----------------------------");
    }
}
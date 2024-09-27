package org.example.model;

public class Bread extends ProductForSale{
    private String ingradiants;

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public Bread(String type, double price, String description, String ingradiants) {
        super(type, price, description);
        this.ingradiants = ingradiants;
    }

    @Override
    public void showDetails() {
        System.out.println(ingradiants);
    }
}

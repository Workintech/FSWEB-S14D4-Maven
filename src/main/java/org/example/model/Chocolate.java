package org.example.model;

public class Chocolate extends ProductForSale{
    private String orijin;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, String orijin) {
        super(type, price, description);
        this.orijin = orijin;
    }

    @Override
    public void showDetails() {
        System.out.println(orijin);
    }
}

package org.example.model;

public class Coke extends ProductForSale{
    private String gasPercantage;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, String gasPercantage) {
        super(type, price, description);
        this.gasPercantage = gasPercantage;
    }

    @Override
    public void showDetails() {
        System.out.println(gasPercantage);
    }

}

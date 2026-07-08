package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Dark", 45.5, "Bitter chocolate", 80);
        products[1] = new Coke("Cola", 20.0, "Cold drink", true);
        products[2] = new Bread("Whole Wheat", 15.0, "Healthy bread", 0.5);

        listProducts(products);
    }
}
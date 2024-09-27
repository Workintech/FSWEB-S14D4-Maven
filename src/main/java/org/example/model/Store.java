package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Coke ("Diet",30,"Diet Coke From USA","30");
        products[1] = new Chocolate ("Bitter",25,"Swish Chocolatte","Sweden");
        products[2] = new Bread ("White",10,"Standary Turkish Bread","Water and grains");



        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            product.showDetails();
        }
    }
}
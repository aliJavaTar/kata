package com.shopping.domain;

public class Product {

    private int id;
    private double price;
    private double tax;

    public Product(int id, double price, double tax) {
        this.id = id;
        this.price = price;
        this.tax = tax;
    }
}

package com.shopping.domain;

import java.util.List;

public class ShoppingCart {
    private int id;
    private List<Product> products;

    public double calculateTotalPriceOfProducts() {
        return products.stream()
                .mapToDouble(Product::calculateTotalPrice).sum();
    }

}

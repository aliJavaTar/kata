package com.pattern.factory.product;

public class PresentDigitalFactory extends Present {
    @Override
    Product getProduct() {
        return new DigitalProduct();
    }
}

package com.pattern.factory.product;

public abstract class Present {

    public void present() {
        var product = getProduct();
        System.out.println(product.price());
        System.out.println(product.title());
    }

    abstract Product getProduct();
}

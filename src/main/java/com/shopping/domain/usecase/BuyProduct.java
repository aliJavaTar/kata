package com.shopping.domain.usecase;


import com.shopping.domain.Inventory;
import com.shopping.domain.ShoppingCarts;

import java.util.List;

public class BuyProduct {

    private final ShoppingCarts carts;
    private final Inventory inventory;

    public BuyProduct(ShoppingCarts carts, Inventory inventory) {
        this.carts = carts;
        this.inventory = inventory;
    }

    public void applyProduct(List<Integer> ides) {

//        carts.applyProduct();
    }
}

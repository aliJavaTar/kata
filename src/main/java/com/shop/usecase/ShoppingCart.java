package com.shop.usecase;

import com.shop.usecase.domain.Food;
import com.shop.usecase.domain.ShoppingCarts;

import java.util.List;

public class ShoppingCart {
    private final ShoppingCarts shoppingCarts;

    public ShoppingCart(ShoppingCarts shoppingCarts) {
        this.shoppingCarts = shoppingCarts;
    }

    public List<Food> apply(List<Food> foodList) {
        if (foodList == null)
            throw new IllegalArgumentException("");
        return shoppingCarts.applyFood(foodList);
    }
}

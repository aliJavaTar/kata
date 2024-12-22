package com.shop.domain.usecase;


import com.shop.domain.Food;
import com.shop.domain.ShoppingCarts;

import java.util.List;
public class AddFood {
    private final ShoppingCarts shoppingCarts;

    public AddFood(ShoppingCarts shoppingCarts) {
        this.shoppingCarts = shoppingCarts;
    }

    public List<Food> apply(List<Food> foodList) {
        if (foodList == null)
            throw new IllegalArgumentException("");
        return shoppingCarts.applyFood(foodList);
    }
}

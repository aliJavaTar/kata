package com.shop.domain.usecase;

import com.shop.domain.Food;
import com.shop.domain.ShoppingCarts;

import java.util.List;

public class BuyFood {
    private final ShoppingCarts shoppingCarts;

    public BuyFood(ShoppingCarts shoppingCarts) {
        this.shoppingCarts = shoppingCarts;
    }

    public List<Food> calculatePrice() {
        List<Food> foods = shoppingCarts.getFoods();
        return foods;
    }
}

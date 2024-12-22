package com.shop.domain.usecase;

import com.shop.domain.Food;
import com.shop.domain.ShoppingCarts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.when;

class BuyFoodShould {

    private ShoppingCarts cart;
    private BuyFood buyFood;

    @BeforeEach
    void setUp() {
        cart = Mockito.mock(ShoppingCarts.class);
        buyFood = new BuyFood(cart);
    }

    @Test
    void see_shopping_cart_list() {
        when(cart.getFoods()).thenReturn(getFoods());

        List<Food> foods = buyFood.calculatePrice();
        // total price
        // prime price
        // tax
        // count  of foods

    }


    private static List<Food> getFoods() {
        var food = new Food("apple", 1.55,12,12);
        return List.of(food);
    }
}
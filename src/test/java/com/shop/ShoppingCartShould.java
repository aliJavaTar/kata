package com.shop;

import com.shop.domain.Food;
import com.shop.domain.Inventory;

import com.shop.domain.ShoppingCarts;
import com.shop.domain.usecase.ApplyFood;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyList;

class ShoppingCartShould {

    private ShoppingCarts cart;
    private Inventory inventory;
    private ApplyFood applyFood;

    @BeforeEach
    void setUp() {
        cart = Mockito.mock(ShoppingCarts.class);
        inventory = Mockito.mock(Inventory.class);
        applyFood = new ApplyFood(cart);
//        food = Set.of("Iceberg 🥬", "Tomato 🍅", "Chicken 🍗", "Bread 🍞", "Corn 🌽");
    }


    @Test
    void add_foods() {

        Mockito.when(inventory.findAll()).thenReturn(getFoods());
        Mockito.when(cart.applyFood(anyList())).thenReturn(getFoods());

        var foodList = inventory.findAll();
        var foodListAdded = applyFood.apply(foodList);

        Assertions.assertThat(foodList)
                .containsExactlyInAnyOrderElementsOf(foodListAdded);
    }


    private static List<Food> getFoods() {
        var food = new Food("apple", 1.55);
        return List.of(food);
    }
}
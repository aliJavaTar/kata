package com.shop.domain.usecase;

import com.shop.domain.Food;
import com.shop.domain.Inventory;

import com.shop.domain.ShoppingCarts;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyList;

class AddFoodShould {

    private ShoppingCarts cart;
    private Inventory inventory;
    private AddFood applyFood;

    @BeforeEach
    void setUp() {
        cart = Mockito.mock(ShoppingCarts.class);
        inventory = Mockito.mock(Inventory.class);
        applyFood = new AddFood(cart);
//        food = Set.of("Iceberg 🥬", "Tomato 🍅", "Chicken 🍗", "Bread 🍞", "Corn 🌽");
    }


    @Test
    void add_each_food_to_list() {

        Mockito.when(inventory.findAll()).thenReturn(getFoods());
        Mockito.when(cart.applyFood(anyList())).thenReturn(getFoods());

        var foodList = inventory.findAll();
        var foodListAdded = applyFood.apply(foodList);

        Assertions.assertThat(foodList)
                .containsExactlyInAnyOrderElementsOf(foodListAdded);
    }


    private static List<Food> getFoods() {
        var food = new Food("apple", 1.55,12,12);
        return List.of(food);
    }
}
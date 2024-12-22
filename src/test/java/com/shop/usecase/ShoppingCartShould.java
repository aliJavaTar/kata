package com.shop.usecase;

import com.shop.usecase.domain.Food;
import com.shop.usecase.domain.Inventory;
import com.shop.usecase.domain.ShoppingCarts;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyList;

class ShoppingCartShould {

    private ShoppingCarts cart;
    private Inventory inventory;

    @BeforeEach
    void setUp() {
        cart = Mockito.mock(ShoppingCarts.class);
        inventory = Mockito.mock(Inventory.class);
//        food = Set.of("Iceberg 🥬", "Tomato 🍅", "Chicken 🍗", "Bread 🍞", "Corn 🌽");
    }


    @Test
    void add_foods() {
        ShoppingCart shoppingCart = new ShoppingCart(cart);
        Mockito.when(inventory.findAll()).thenReturn(getFoods());
        Mockito.when(cart.applyFood(anyList())).thenReturn(getFoods());

        var foodList = inventory.findAll();
        var foodListAdded = shoppingCart.apply(foodList);

        Assertions.assertThat(foodList)
                .containsExactlyInAnyOrderElementsOf(foodListAdded);
    }

    @Test
    void show_list_of_food() {

    }

    private static List<Food> getFoods() {
        var food = new Food("apple", 1.55);
        return List.of(food);
    }
}
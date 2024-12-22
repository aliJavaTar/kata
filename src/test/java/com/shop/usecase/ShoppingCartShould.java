package com.shop.usecase;

import com.shop.usecase.domain.Inventory;
import com.shop.usecase.domain.ShoppingCarts;
import com.shop.usecase.infra.InventoryImpl;
import com.shop.usecase.infra.ShoppingCartImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Set;

class ShoppingCartShould {

    private ShoppingCarts cart;
    private Inventory inventory;
    private Set<String> food;


    @BeforeEach
    void setUp() {
        cart = Mockito.mock(ShoppingCarts.class);
        inventory = Mockito.mock(Inventory.class);
        food = Set.of("Iceberg 🥬", "Tomato 🍅", "Chicken 🍗", "Bread 🍞", "Corn 🌽");
    }


    @Test
    void addToCart() {
        inventory.findAll();
        cart.applyFood(food);
        Assertions.assertThat(food.size()).isEqualTo(5);
    }
}
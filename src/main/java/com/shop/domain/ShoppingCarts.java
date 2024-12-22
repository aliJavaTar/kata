package com.shop.domain;

import java.util.List;

public interface ShoppingCarts {

    List<Food> applyFood(List<Food> food);

    List<Food> getFoods();
}

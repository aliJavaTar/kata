package com.shop.usecase.infra;

import com.shop.usecase.domain.Food;
import com.shop.usecase.domain.Inventory;

import java.util.List;

public class InventoryImpl implements Inventory {
    @Override
    public List<Food> findAll() {
        return List.of();
    }
}

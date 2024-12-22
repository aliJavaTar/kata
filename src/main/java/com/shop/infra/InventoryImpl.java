package com.shop.infra;

import com.shop.domain.Food;
import com.shop.domain.Inventory;

import java.util.List;

public class InventoryImpl implements Inventory {
    @Override
    public List<Food> findAll() {
        return List.of();
    }
}

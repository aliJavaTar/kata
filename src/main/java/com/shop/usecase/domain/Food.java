package com.shop.usecase.domain;

import java.util.Objects;

public class Food {
    private final String name;
    private final double cost;

    public Food(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Double.compare(cost, food.cost) == 0 && Objects.equals(name, food.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }
}

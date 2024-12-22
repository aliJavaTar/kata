package com.shop.domain;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Food {
    private final String name;
    private final double cost;
    private final double revenue;
    private final double tax;


    public Food(String name, double cost, double revenue, double tax) {
        this.name = name;
        this.cost = cost;
        this.revenue = revenue;
        this.tax = tax;
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

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", revenue=" + revenue +
                ", tax=" + tax +
                '}';
    }
}

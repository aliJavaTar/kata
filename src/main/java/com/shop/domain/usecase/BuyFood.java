package com.shop.domain.usecase;

import com.shop.domain.Food;
import com.shop.domain.ShoppingCarts;
import com.shop.infra.ResultDto;

import java.util.List;

public class BuyFood {
    public static final int ONE_HUNDRED = 100;
    private final ShoppingCarts shoppingCarts;

    public BuyFood(ShoppingCarts shoppingCarts) {
        this.shoppingCarts = shoppingCarts;
    }

    public ResultDto calculatePrice() {
        List<Food> foods = shoppingCarts.getFoods();


        double claucluatePriceWithReveeue = 0;

        for (Food food : foods) {
            double calculateRevenue = getCalculateRevenue(food.getRevenue(), food.getCost());
            claucluatePriceWithReveeue += food.getCost() + calculateRevenue;
            claucluatePriceWithReveeue += getCalculateRevenue(claucluatePriceWithReveeue,  food.getTax());
            System.out.println(claucluatePriceWithReveeue);
        }
        return new ResultDto(foods,claucluatePriceWithReveeue,foods.size());
    }

    private static double getCalculateRevenue(double revenue, double cost) {
        return Math.ceil(revenue * cost * ONE_HUNDRED) / ONE_HUNDRED;
    }
}

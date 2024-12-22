package com.shop.infra;

import com.shop.domain.Food;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ResultDto {
    private List<Food> foods;
    private double totalPrice;
    private int countOfFood;
}

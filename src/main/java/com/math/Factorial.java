package com.math;

import java.math.BigDecimal;

public record Factorial(int number) {

    public BigDecimal calculateFactorialOfNumber() {
        BigDecimal result = new BigDecimal(1);
        for (int index = number; index > 0; index--) {
            result = result.multiply(BigDecimal.valueOf(index));
        }
        return result;
    }
}

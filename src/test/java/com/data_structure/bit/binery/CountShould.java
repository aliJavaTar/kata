package com.data_structure.bit.binery;


import org.junit.jupiter.api.Test;


class CountShould {

    @Test
    void calculateCountOfSubtractionsOfPowersOfTwoUntilNegative() {
        int calculate = new Count(999999999).calculate_performance();
        System.out.println(calculate);
    }
}
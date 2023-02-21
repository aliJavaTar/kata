package com.codeWars.CalculateBMi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculateBmiTest {
    @Test
    void should_calculate_bmi_for_Underweight_when_bmi_less_than_18_5() {
        CalculateBmi calculate = new CalculateBmi();
        // bmi = weight / height * 2
        String bmi = calculate.bmi(80, 1.80);
        Assertions.assertThat(bmi).isEqualTo("Normal");
    }
}
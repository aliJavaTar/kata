package com.math.dsa;

import org.apache.commons.lang3.JavaVersion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialShould {

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11,max = JRE.JAVA_21)
//    @EnumSource(value = JavaVersion.class , names = {"ADMIN" , "USER"})
    void out_put_zero_when_input_is_null() {
        var factorial = new Factorial(0);
        int result = factorial.calculate();
        assertThat(result).isEqualTo(1);
    }
    // 2 and 5 - > min of them its 2,222,555 000
    @ParameterizedTest
    @EnabledOnOs(OS.MAC)
    @CsvSource({"2,2", "5,120"})
    void calculate_factorial_of_number(int input, int expected) {
        var factorial = new Factorial(input);
        int result = factorial.calculate();
        assertThat(result).isEqualTo(expected);
    }
}
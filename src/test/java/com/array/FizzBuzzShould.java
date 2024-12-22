package com.array;

//import org.assertj.core.api.Assertions;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzShould {
    //TDD
    @Test
    void fizzBuzz() {

        var fizzBuzz = new FizzBuzz();

        int result = fizzBuzz.calculate(2, 2);

        Assertions.assertThat(result).isEqualTo(new int[]{2,3});

    }

}
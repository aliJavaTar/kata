package com.tdd.FizBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


/*
   3   fizz
   5   buzz
   15  fizzbzz
 */

class FizzBuzzShould {


    //    public List<String> fizzBuzz(int n) {
//
//    }

    @Test
    void give_exception_when_number_is_negative() {
        var fizzBuzz = new FizzBuzz();
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.calculate(-1));

    }

    @Test
    void give_fizz_when_number_equal_three() {
        var fizzBuzz = new FizzBuzz();
        int number = 3;
        List<String> result = fizzBuzz.calculate(number);
        assertThat(result).isEqualTo(List.of("1", "2", "Fizz"));
    }

    @Test
    void give_buzz_when_number_equal_five() {
        var fizzBuzz = new FizzBuzz();
        int number = 5;
        /*
              <          false
          age > 5 result true
         */
        List<String> result = fizzBuzz.calculate(number);
        assertThat(result).isEqualTo(List.of("1", "2", "Fizz", "4", "Buzz"));

    }

    // property base test  && mutation test
    @Test
    void give_fizz_buzz_when_number_equal_fifteen() {
        var fizzBuzz = new FizzBuzz();
        int number = 15;
        List<String> result = fizzBuzz.calculate(number);
        assertThat(result).isEqualTo(List.of("1", "2", "Fizz", "4", "Buzz"
                , "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"));

    }

//    @ParameterizedTest
//    @ValueSource(ints = {1, 2, 3, 5})
//    void give_fizz_buzz_when_number_equal_fifteen(int input) {
//        var fizzBuzz = new FizzBuzz();
//        String result = fizzBuzz.calculate(input);
//        assertThat(result).isEqualTo("FizzBuzz");
//
//    }

}
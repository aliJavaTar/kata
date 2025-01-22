package com.tdd.FizBuzz;


import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> calculate(int number) {
        List<String> result = new ArrayList<>();

        if (number <= 0)
            throw new IllegalArgumentException();

        for (int index = 1; index <= number; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                result.add("FizzBuzz");
            } else if (index % 3 == 0) {
                result.add("Fizz");
            } else if (index % 5 == 0) {
                result.add("Buzz");
            } else result.add(String.valueOf(index));
        }

        return result;
    }

}

package com.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TwoSumShould {
    @ParameterizedTest
    @MethodSource("provideData")
    void Given_an_array_of_integers_return_the_indices_of_the_two_numbers_such_that_they_add_up_to_the_target
            (int target, int[] numbers, int[] exceptedIndex) {

        var twoSum = new TwoSum(numbers, target);
        int[] result = twoSum.findIndex_performance();
        Assertions.assertThat(result).isEqualTo(exceptedIndex);
    }

    static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(1, new int[]{0, 1}, new int[]{0, 1}),
                Arguments.of(5, new int[]{2, 5, 3}, new int[]{0, 2}),
                Arguments.of(6, new int[]{1, 9, 3, 5, 7}, new int[]{0, 3}),
                Arguments.of(547, new int[]{
                        1, 9, 3, 5, 7, 4, 67, 7
                        , 2, 4, 23, 54, 124, 23, 5546, 54676,
                        67, 234, 5235, 234, 5, 4256, 253, 265423,
                        5365454, 5467253, 745652354, 7654345, 75
                        , 54876, 123, 43654, 2365645, 54634254, 75466, 345,
                        54, 52547, 5253254, 554356546, 435, 345, 546, 5466, 23465754, 5467}, new int[]{0, 42})
        );

    }
}
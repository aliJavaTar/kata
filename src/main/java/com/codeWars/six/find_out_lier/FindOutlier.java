package com.codeWars.six.find_out_lier;

public class FindOutlier {
    public int find(int[] integers) {
        int countOfEven = 0;
        int countOfOdd = 0;

        for (int index = 0; index < 3; index++) {
            if (isEven(integers[index])) {
                countOfEven++;
            }
            if (!isEven(integers[index])) {
                countOfOdd++;
            }
        }
        if (countOfEven > countOfOdd) {
            for (int integer : integers) {
                if (!isEven(integer))
                    return integer;
            }
        } else {
            for (int integer : integers) {
                if (isEven(integer))
                    return integer;
            }
        }
        return 0;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}

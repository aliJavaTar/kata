package com.data_structure.bit.binery;


public record Count(int number) {
    static StringBuilder builder;

    private int calculate() {
        builder = new StringBuilder();
        int count = 0;
        int temp = number;
        int index = Integer.highestOneBit(number);

        while (temp > 0 && index > 0) {
            if (temp >= index) {
                count++;
                temp -= index;
                builder.append('1');
            } else
                builder.append('0');
            index >>= 1;
        }
        return count;
    }

    String countOfNumber() {
        calculate();
        if (number % 2 == 0)
            builder.append('0');
        return builder.toString();
    }

}

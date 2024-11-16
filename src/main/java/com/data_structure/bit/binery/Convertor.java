package com.data_structure.bit.binery;

public record Convertor(int number) {

    String convertNumberToBinary_() {
        return Integer.toBinaryString(number);
    }

    String convertNumberToBinary() {

        StringBuilder builder = new StringBuilder();
        int temp = number;
        int index = Integer.highestOneBit(number);

        while (index > 0) {
            if (temp >= index) {
                builder.append('1');
                temp -= index;
            } else {
                builder.append('0');
            }
            index >>= 1;
        }

        return builder.toString();
    }
}

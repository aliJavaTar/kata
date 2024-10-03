package com.data_structure.bit.binery;

public record Convertor(int number) {


    String convertNumberToBinary() {

        StringBuilder builder = new StringBuilder();
        int temp = number;
        int index = Integer.highestOneBit(number);  // Start with the highest bit set

        // Loop through bits and build the binary representation
        while (index > 0) {
            if (temp >= index) {
                builder.append('1');
                temp -= index;
            } else {
                builder.append('0');
            }
            index >>= 1; // Shift to the next lower bit
        }

        return builder.toString();
    }
}

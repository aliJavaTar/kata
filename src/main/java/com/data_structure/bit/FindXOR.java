package com.data_structure.bit;

public record FindXOR(int number) {

    public int find() {

       int  absNumber = Math.abs(number);

        int remainder = absNumber % 4;

        return switch (remainder) {
            case 0 -> absNumber;
            case 1 -> 1;
            case 2 -> absNumber + 1;
            default -> 0;
        };
    }
}

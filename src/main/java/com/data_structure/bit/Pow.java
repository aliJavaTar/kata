package com.data_structure.bit;

public record Pow(int number) {

    public static final int ONE = 1;

    public boolean isPowOfTwo() {
        return (number - ONE & number) == 0;

    }
}

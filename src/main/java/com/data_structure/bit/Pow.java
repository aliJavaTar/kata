package com.data_structure.bit;

public record Pow(int number) {

    public boolean isPowOfTwo() {
        int sub = number - 1;
        return (sub & number) == 0;

    }
}

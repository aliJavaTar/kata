package com.data_structure.bit;

public record CalculatePowTowBinary(int number) {
    public boolean isPow() {
        return false;
    }
    public boolean isPowOfTwo() {
        return (number & (number - 1)) == 0;
    }
}

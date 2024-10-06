package com.data_structure.bit;

public record Find(int number) {
    public int findMSB() {
        int result = 1;
        while ((result & number) != number) {
            result <<= 1;
        }
        return result >> 1;
    }
}

package com.data_structure.bit.binery;

public record PowerOfTwo(long number) {

    public boolean isPowerOfTwo() {
        double logResult = Math.log(number) / Math.log(2);
        int roundedLogResult = (int) Math.round(logResult);
        return number == (int) Math.pow(2, roundedLogResult);
    }
}

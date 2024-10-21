package com.data_structure.bit;

public record FirstSetBit(int number) {

    public static final int START_INDEX_FROM_ONE = 1;
    public static final int BASE_LOG = 2;

    public int findPossibleFirstSetBit() {
        if (number == 0)
            return 0;

        int isolatedBit = number & -number;

        return (int) ((int) Math.log(isolatedBit) / Math.log(BASE_LOG) + START_INDEX_FROM_ONE);
    }

}

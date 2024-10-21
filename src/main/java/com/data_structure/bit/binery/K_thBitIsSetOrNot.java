package com.data_structure.bit.binery;

public record K_thBitIsSetOrNot(int number, int key) {
    public boolean isSet() {
        int mask = 1 << key;
        return (number & mask) != 0;
    }
}
//static boolean checkKthBit(int n, int k) {
//
//    int mask = 1 << k;
//    return (n & mask) != 0;
//}
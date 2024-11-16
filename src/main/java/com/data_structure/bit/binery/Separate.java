package com.data_structure.bit.binery;

public record Separate(int number) {

    public boolean isSeparate() {
        String binaryCode = Integer.toBinaryString(number);
        char[] charArray = binaryCode.toCharArray();
        int length = binaryCode.length();
        for (int index = 0; index < length; index++) {
            if (index == length - 1)
                break;
            if (charArray[index] == '0' && charArray[index + 1] == '0' || charArray[index] == '1' && charArray[index + 1] == '1') {
                return false;
            }
        }
        return true;
    }
}

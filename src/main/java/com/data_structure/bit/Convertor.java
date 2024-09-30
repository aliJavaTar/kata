package com.data_structure.bit;

public record Convertor(int number) {

    String convertNumberToBinary() {
        var index = getCountOfNumber();
        System.out.println(index);
        return "";
    }

    private int getCountOfNumber() {
        for (int index = 0; index < number; index++) {
            int pow = (int) Math.pow(2, index);
            if (pow >= number)
                return index;
        }
        return number;
    }

}

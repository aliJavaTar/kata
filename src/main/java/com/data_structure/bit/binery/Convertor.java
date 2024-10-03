package com.data_structure.bit.binery;

public record Convertor(int number) {


    String convertNumberToBinary() {
        return new Count(number).countOfNumber();
    }
}
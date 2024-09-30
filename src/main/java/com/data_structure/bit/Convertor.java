package com.data_structure.bit;

public class Convertor {
    private int number;

    public Convertor(int number) {
        this.number = number;
    }

    String convertNumberToBinary() {
        var countOfNumber = getCountOfNumber();
        var stringBuilder = new StringBuilder();
        int pow = 0;
        while (countOfNumber != -1) {
            if (number - (int) Math.pow(2, pow) >= 0)
                stringBuilder.append(1);
            else
                stringBuilder.append(0);

            number = number - (int) Math.pow(2, countOfNumber);
            countOfNumber--;
            pow++;
        }

        return stringBuilder.toString();
    }

    private int getCountOfNumber() {
        int countOfNumber = 0;
        for (int index = 0; index < number; index++) {
            if ((int) Math.pow(2, index) >= number)
                countOfNumber++;
        }
        return countOfNumber;
    }

}
//        while (countOfNumber != 0) {
//            if (number - (int) Math.pow(2, countOfNumber) == 0)
//                stringBuilder.append(1);
//
//            number = (number - (int) Math.pow(2, countOfNumber));
//            countOfNumber--;
//
//            if (number == 0)
//                stringBuilder.append(0);
//        }
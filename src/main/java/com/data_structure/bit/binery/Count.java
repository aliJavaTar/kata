package com.data_structure.bit.binery;



public record Count(int number) {

    public int calculate() {
        int count = 0;
        int temp = number;
        int index = (number / 2);
        while (temp >= 0 && index >= 0) {
            if (temp - Math.pow(2, index) >= 0) {
                count++;
                temp = temp - (int) Math.pow(2, index);
            }

            index--;

        }
        return count;
    }

}

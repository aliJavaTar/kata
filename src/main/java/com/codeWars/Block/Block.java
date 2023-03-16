package com.codeWars.Block;

public class Block {
    private int[] numbers;

    public Block(int[] numbers) {
        this.numbers = numbers;
    }

    public int getLength() {
        return this.numbers[1];
    }

    public int getWidth() {
        return this.numbers[0];
    }

    public int getHeight() {
        return this.numbers[2];
    }

    public int getVolume() {
        return Math.multiplyExact(numbers[1], numbers[0]) * numbers[2];
    }

    public int getSurfaceArea() {
        return getVolume() * getLength();
    }

}

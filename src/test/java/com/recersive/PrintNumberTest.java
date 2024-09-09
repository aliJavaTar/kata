package com.recersive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintNumberTest {

    @Test
    void print() {
        var printNumber = new PrintNumber();
        printNumber.print(5);
    }

    @Test
    void printReversion() {
        var printNumber = new PrintNumber();
        printNumber.printReversion(5);
    }
}
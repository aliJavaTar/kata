package com.recursive;

import org.junit.jupiter.api.Test;

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
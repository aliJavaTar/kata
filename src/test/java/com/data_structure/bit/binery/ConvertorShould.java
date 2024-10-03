package com.data_structure.bit.binery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertorShould {
    @Test
    void convertNumberToBinary() {
        var convertor = new Convertor(2);
        String result = convertor.convertNumberToBinary();
        assertEquals("10", result);

        convertor = new Convertor(3);
        result = convertor.convertNumberToBinary();
        assertEquals("11", result);

        convertor = new Convertor(5);
        result = convertor.convertNumberToBinary();
        assertEquals("101", result);

        convertor = new Convertor(7);
        result = convertor.convertNumberToBinary();
        assertEquals("111", result);

        convertor = new Convertor(9);
        result = convertor.convertNumberToBinary();
        assertEquals("1001", result);


        convertor = new Convertor(10);
        result = convertor.convertNumberToBinary();
        assertEquals("1010", result);
    }
}
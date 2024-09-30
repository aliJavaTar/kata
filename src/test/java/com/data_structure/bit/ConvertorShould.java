package com.data_structure.bit;

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

        convertor = new Convertor(4);
        result = convertor.convertNumberToBinary();
        assertEquals("100", result);

        convertor = new Convertor(6);
        result = convertor.convertNumberToBinary();
        assertEquals("100", result);

    }
}
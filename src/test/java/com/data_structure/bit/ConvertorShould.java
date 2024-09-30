package com.data_structure.bit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertorShould {
    @Test
    void convertNumberToBinary() {
        var convertor = new Convertor(2);
        String result = convertor.convertNumberToBinary();
        assertEquals("01", result);
    }
}
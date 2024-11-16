package com.data_structure.bit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatePowTowBinaryShould {

    @Test
    void calculateBinary_isPwo_of_two() {
        var calculatePowTowBinary = new CalculatePowTowBinary(4);
        boolean result = calculatePowTowBinary.isPow();
        Assertions.assertTrue(result);
    }

}
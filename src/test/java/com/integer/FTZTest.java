package com.integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FTZTest {

    @Test
    void trailingZeroes() {
        int ftz = new FTZ().trailingZeroes(13);
        assertEquals(2, ftz);


    }
}
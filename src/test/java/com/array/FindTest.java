package com.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindShould {
    @Test
    void find_unique_number_in_list() {
        double[] array = {2, 2, 3, 2, 2};
        var find = new Find(array);
        double uniqueNumber = find.findTheUniqueNumber();
        assertEquals(3, uniqueNumber);
    }
}
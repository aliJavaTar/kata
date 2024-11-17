package com.recursive;

import org.junit.jupiter.api.Test;

class SubsetShould {

    @Test
    void generate_subset_of_text() {
        var subset = new Subset();
        subset.print("abc");
    }
}
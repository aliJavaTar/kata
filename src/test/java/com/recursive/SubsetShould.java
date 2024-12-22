package com.recursive;

import org.junit.jupiter.api.Test;

class SubsetShould {

    @Test
    void generate_subset_of_text() {
        var subset = new Subset();
        subset.print("abcdefe");

//        Assertions.assertThat(Arrays.toString(result))
//                .isEqualTo("[abc, ab, ac, a, bc, b, c, ]");
    }
}
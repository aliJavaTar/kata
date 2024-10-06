package com.data_structure.bit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindTest {

    @Test
    public void test() {
        var find = new Find(10);
        int msb = find.findMSB_performance();
        Assertions.assertThat(msb).isEqualTo(8);
    }
}
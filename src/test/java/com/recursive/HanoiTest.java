package com.recursive;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class HanoiTest {

    @Test
    void hanoi() {
        var hanoi = new Hanoi(2);

        List<String> result = hanoi.calculate();


        assertThat(result).containsExactly("Disk 1 moved from A to B",
                "Disk 2 moved from A to C",
                "Disk 1 moved from B to C"
        );

    }

    @Test
    void hanoi_() {
        var hanoi = new Hanoi(1);

        List<String> result = hanoi.calculate();

        assertThat(result).containsExactly("Disk 1 moved from A to C");

    }

    @Test
    void hanoi__() {
        var hanoi = new Hanoi(3);

        List<String> result = hanoi.calculate();

        assertThat(result).containsExactly(
                "Disk 1 moved from A to C",
                "Disk 2 moved from A to B",
                "Disk 1 moved from C to B",
                "Disk 3 moved from A to C",
                "Disk 1 moved from B to A",
                "Disk 2 moved from B to C",
                "Disk 1 moved from A to C");

    }
}
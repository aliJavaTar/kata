package com.recursive;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TowerOfHanoiShould {

    @Test
    void solveTowerOfHanoiForThreeDisks() {

        var hanoiDto =
                new HanoiDto(3, 'A', 'C', 'B');

        var solver = new HanoiSolver(hanoiDto);

        List<String> result = solver.solve();

        List<String> expected = List.of(
                "Move disk 1 from rod A to rod C",
                "Move disk 2 from rod A to rod B",
                "Move disk 1 from rod C to rod B",
                "Move disk 3 from rod A to rod C",
                "Move disk 1 from rod B to rod A",
                "Move disk 2 from rod B to rod C",
                "Move disk 1 from rod A to rod C"
        );
        assertEquals(expected, result);
    }

    @Test
    void solveTowerOfHanoiForOneDisk() {
        var hanoiDto = new HanoiDto(1, 'A', 'C', 'B');
        var solver = new HanoiSolver(hanoiDto);

        List<String> result = solver.solve();

        assertEquals(List.of("Move disk 1 from rod A to rod C"), result);
    }

    @Test
    void throwExceptionForInvalidDiskCount() {

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new HanoiDto(0, 'A', 'C', 'B')
        );

        assertEquals("Number of disks must be greater than 0.", exception.getMessage());
    }

}
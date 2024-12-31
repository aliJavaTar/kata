package com.recursive;

import java.util.ArrayList;
import java.util.List;

public class HanoiSolver {
    private final HanoiDto configuration;
    private final List<String> moves;

    public HanoiSolver(HanoiDto configuration) {
        this.configuration = configuration;
        this.moves = new ArrayList<>();
    }

    public List<String> solve() {
        moveDisks(configuration.numberOfDisks(), configuration.sourceRod(),
                configuration.destinationRod(), configuration.auxiliaryRod());
        return moves;
    }

    private void moveDisks(int diskCount, char source, char destination, char auxiliary) {
        if (diskCount == 0) {
            return;
        }

        moveDisks(diskCount - 1, source, auxiliary, destination);
        recordMove(diskCount, source, destination);
        moveDisks(diskCount - 1, auxiliary, destination, source);
    }

    private void recordMove(int disk, char fromRod, char toRod) {
        moves.add(String.format("Move disk %d from rod %s to rod %s", disk, fromRod, toRod));
    }
}

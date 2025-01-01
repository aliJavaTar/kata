package com.recursive;

import java.util.ArrayList;
import java.util.List;

public class Hanoi {
    private int disks;
    private List<String> result;

    public Hanoi(int disks) {
        this.disks = disks;
        this.result = new ArrayList<>();
    }

    public List<String> calculate() {
        solve(disks, 'A', 'C', 'B');
        return result;
    }

    private void solve(int disk, char source, char destination, char helper) {

        if (disk == 0) {
            return;
        }

        solve(disk - 1, source, helper, destination);
        result.add("Disk " + disk + " moved from " + source + " to " + destination);
        solve(disk - 1, helper, destination, source);


    }
}

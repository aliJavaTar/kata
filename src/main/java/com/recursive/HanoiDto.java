package com.recursive;

public record HanoiDto(int numberOfDisks, char sourceRod, char destinationRod, char auxiliaryRod) {
    public HanoiDto {
        if (numberOfDisks <= 0) {
            throw new IllegalArgumentException("Number of disks must be greater than 0.");
        }
    }
}
package com.codeWars.dinglemouse;

public class Dinglemouse {

    private static final int HUMAN_ONE_YEAR = 1;
    private static final int HUMAN_TWO = 2;
    private static final int DOG_AND_CAT_ONE = 15;
    private static final int DOG_AND_CAT_TWO = 24;


    public int[] humanYearsCatYearsDogYears(final int humanYears) {
        if (humanYears == HUMAN_ONE_YEAR)
            return new int[]{HUMAN_ONE_YEAR, DOG_AND_CAT_ONE, DOG_AND_CAT_ONE};
        if (humanYears == HUMAN_TWO)
            return new int[]{HUMAN_TWO, DOG_AND_CAT_TWO, DOG_AND_CAT_TWO};

        int ageOfCat = 0;
        int ageOfDog ;
        if (humanYears>2)
            ageOfCat =DOG_AND_CAT_TWO ; ageOfDog=DOG_AND_CAT_TWO;
        for (int index = 3; index <= humanYears; index++) {
            ageOfCat +=  4;
            ageOfDog +=  5;
        }
        return new int[]{humanYears,ageOfCat,ageOfDog};

    }
}

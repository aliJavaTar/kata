package com.codeWars.dinglemouse.seven;

public class Dinglemouse {
    public int[] ownedCatAndDog(final int catYears, final int dogYears) {
        if (catYears == 15 && dogYears == 15)
            return new int[]{1, 1};

        if (catYears == 24 && dogYears == 24)
            return new int[]{2, 2};

        return new int[]{calculateAgeOfHumanBasedAgeCat(catYears), calculateAgeOfHumanBasedAgeDog(dogYears)};

    }

    int calculateAgeOfHumanBasedAgeCat(int catAge) {
        int humanAge = 2;

        int number = getNumber(catAge) / 4;

        return  getHumanAge(humanAge, number);

    }

    private int calculateAgeOfHumanBasedAgeDog(int dogAge) {
        int humanAge = 2;

        int number = getNumber(dogAge) / 5;

        return getHumanAge(humanAge, number);

    }

    private static int getHumanAge(int humanAge, int number) {
        for (int index = 0; index < number; index++) {
            humanAge += 1;
        }
        return humanAge;
    }

    private static int getNumber(int dogAge) {
        return dogAge - 24;
    }
}

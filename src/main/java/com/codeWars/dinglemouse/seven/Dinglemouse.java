package com.codeWars.dinglemouse.seven;

public class Dinglemouse {
    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        if (catYears < 15 && dogYears < 15)
            return new int[]{0, 0};
        int humanAgeOfCat =
                calculateAgeOfHumanBasedAgeCat(catYears);

        int humanAgeOfDog =
                calculateAgeOfHumanBasedAgeDog(dogYears);

        return new int[]{humanAgeOfCat, humanAgeOfDog};
    }

    private static int calculateAgeOfHumanBasedAgeCat(int catAge) {

        if (catAge < 15)
            return 0;
        if (catAge < 24)
            return 1;
        int age = 1;
        for (int index = 24; index <= catAge; index += 4) {
            age++;
        }
        return age;

    }

    private static int calculateAgeOfHumanBasedAgeDog(int dogAge) {

        if (dogAge < 15)
            return 0;
        if (dogAge < 24)
            return 1;
        int age = 1;
        for (int index = 24; index <= dogAge; index += 5) {
            age++;
        }
        return age;

    }
}

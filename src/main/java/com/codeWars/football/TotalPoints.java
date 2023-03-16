package com.codeWars.football;

public class TotalPoints {
    public int points(String[] games) {

        int result = 0;

        for (String game : games) {

            char ourTeam = game.charAt(0);
            char themTeam = game.charAt(2);

            if (ourTeam > themTeam)
                result = result + 3;

            if (ourTeam == themTeam)
                result = result + 1;
        }
        return result;
    }
}

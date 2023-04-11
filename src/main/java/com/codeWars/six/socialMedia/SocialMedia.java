package com.codeWars.six.socialMedia;

public class SocialMedia {

    public static final String AND = " and ";
    public static final String LIKE_THIS = " like this";

    public String whoLikesIt(String... names) {

        if (names.length == 0)
            return "no one likes this";
        else if (names.length == 1) return names[0] + LIKE_THIS;


        if (names.length == 2)
            return names[0] + AND + names[1] + LIKE_THIS;

        if (names.length == 3)
            return names[0] + ", " + names[1] + AND + names[2] + LIKE_THIS;

        int numberOfPeople = names.length - 2;
        return names[0] + ", " + names[1] + AND + numberOfPeople + " others" + LIKE_THIS;

    }
}

package com.codeWars.six.socialMedia;

public class SocialMedia {
    public String whoLikesIt(String... names) {
        if (names.length == 1) {
            if (names[0].isBlank())
                return "no one likes this";
            else return names[0] + " likes this";
        }

        if (names.length == 2)
            return names[0] + " and " + names[1] + " like this";
        return "";
    }
}

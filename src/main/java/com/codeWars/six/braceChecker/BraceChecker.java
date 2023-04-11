package com.codeWars.six.braceChecker;

public class BraceChecker {
    public boolean isValid(String braces) {

        if (braces.length() == 1)
            return false;
        else if (braces.length() == 2)
            return true;
        return false;
    }
}

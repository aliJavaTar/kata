package com.codeWars.six.braceChecker;

public class BraceChecker {

    public boolean isValid(String braces) {

        int countOfBStart = 0;
        int countOfPStart = 0;
        int countOfBracesStart = 0;
        int countOfBracesEnd = 0;
        int countOfPEnd = 0;
        int countOfBEnd = 0;

//        Testing
        for (int index = 0; index < braces.length(); index++) {
            switch (braces.charAt(index)) {
                case '(' -> countOfPStart++;
                case '{' -> countOfBStart++;
                case '[' -> countOfBracesStart++;
                case ')' -> countOfPEnd++;
                case ']' -> countOfBracesEnd++;
                case '}' -> countOfBEnd++;
            }
            if (
                    (countOfBracesEnd > countOfBracesStart || countOfBEnd > countOfBStart || countOfPEnd > countOfPStart)
                            || ((countOfBracesEnd != countOfBracesStart || countOfBEnd != countOfBStart || countOfPEnd
                            != countOfPStart )&& (index == braces.length() - 1))
            )
                return false;
            else if (index < braces.length() - 1 &&
                    (braces.charAt(index) == '(' && (braces.charAt(index + 1) == ']' || braces.charAt(index + 1) == '}'))
                    || (braces.charAt(index) == '[' && (braces.charAt(index + 1) == ')' || braces.charAt(index + 1) == '}'))
                    || (braces.charAt(index) == '{' && (braces.charAt(index + 1) == ')' || braces.charAt(index + 1) == ']'))) {
                return false;
            }

        }
        return true;
    }
}

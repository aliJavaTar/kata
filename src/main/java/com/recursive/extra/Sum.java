package com.recursive.extra;

public class Sum {
//    public String TextReceive(String text) {
//        var empty = new StringBuilder();
//
//        for (int index = text.length() - 1; index >= 0; index--) {
//            empty.append(text.charAt(index));
//        }
//        return empty.toString();
//    }

    public String reverse(String text) {
        if (text.length() == 1)
            return text;

        return  reverse(text.substring(1)) + text.charAt(0);
    }

    public static void main(String[] args) {
        // i  -> l a
        var sum = new Sum();
        var ali = sum.reverse("ali");
        System.out.println(ali);

    }
}

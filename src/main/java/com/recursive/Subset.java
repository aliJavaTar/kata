package com.recursive;

public class Subset {


    public void print(String text) {
        generate(text, 0, "");
    }

    private void generate(String text, int index, String current) {
        if (index == text.length())
        {
            System.out.println(current);
            return;
        }

        generate(text, index + 1, current + text.charAt(index));
        generate(text, index + 1, current);
    }

//    //    "abc" -->  a b c  ab ac  bc abc
//    public void print(String text) {
//        generate(text, 0, "");
//    }
//
//    private void generateSubsets(String text, int index, String current) {
//        if (index == text.length()) {
//            System.out.print(current + " - ");
//            return;
//        }
//        generateSubsets(text, index + 1, current + text.charAt(index));
//        generateSubsets(text, index + 1, current);
//    }
//
//    private void generateSubsets_rec(String text, int index, String current) {
//        if (index == text.length()) {
//            System.out.println(current);
//            return;
//        }
//        generateSubsets_rec(text, index + 1, current + text.charAt(index));
//        generateSubsets_rec(text, index + 1, current);
//    }
//
//    private void generate(String text, int index, String current) {
//        if (index == text.length()) {
//            System.out.println(current);
//            return;
//        }
//        generate(text, index + 1, current + text.charAt(index));
//        generate(text, index + 1, current);
//    }

}

package com;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("ali");
        System.out.println(person.getName());
        Person clone = person.clone();
        System.out.println(clone.getName());
        clone.setName("<UNK>");
        System.out.println(clone.getName());
        System.out.println(person.getName());
    }
}

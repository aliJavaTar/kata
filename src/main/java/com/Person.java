package com;

public class Person implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Person clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            clone.name = this.name;
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

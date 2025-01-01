package com.cqs;

public class CleanCode {
    //Bertrand Meyer
    //Object-Oriented Software Construction Subsequent Edition
//    Queries: Return a result and do not change the observable state of the system (are free of side effects).
//    Commands: Change the state of a system but do not return a value.

    private int count;

//    public int increase() {
//        count++;
//        return count;
//    }

    public void increase() {
        count++;
    }

    public int count() {
        return count;
    }


}

package com.data_structure;

import org.junit.jupiter.api.Test;

import static java.lang.System.*;

class LinkedListTest {

    @Test
    public void test() {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        out.println("____________________________________________________________________");
        myList.get();

    }

}
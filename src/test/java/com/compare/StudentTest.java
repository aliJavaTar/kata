package com.compare;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void test() {
        List<Student> students = new ArrayList<>();   // Step 4: Create a List of Students
        students.add(new Student(40,"Alice"));
        students.add(new Student(55,"Ali"));
        students.add(new Student(65,"Mohammd"));
        students.add(new Student(20,"Mohammd"));
        students.add(new Student(14,"Mohammd"));

        Collections.sort(students);  // Step 5: Sort using compareTo()

        students.forEach(System.out::println);
    }
}
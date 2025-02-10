package com.compare;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student implements Comparable<Student> {
    private int mark;
    private String name;

    public Student(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }
//           -1 if a < b → a should come first.
    //
//            1 if a > b → b should come first.
//            0 if a == b → No change in order.

    /*
      so when first object be entered in first argument as function then if be smaller than second object
      then we see or list to sorted assenging like  -1 if a < b → a should come first. a is first parametr
      so now be as first parametr its  entered and b > a   b > a should come






     */


//        students.add(new Student(40,"Alice"));
//        students.add(new Student(55,"Ali"));
//        students.add(new Student(65,"Mohammd"));
//        students.add(new Student(20,"Mohammd"));
//        students.add(new Student(14,"Mohammd"));

    @Override
    public int compareTo(Student otherStudent) {
        // if this mark is be smaller so return -1  and its first
//        return Integer.compare(otherStudent.getMark(), this.mark);
        return Integer.compare(this.mark,otherStudent.getMark());
    }

    @Override
    public String toString() {
        return "Student{ " +
                "mark= " + mark +
                ", name=' " + name + '\'' +
                '}';
    }
}

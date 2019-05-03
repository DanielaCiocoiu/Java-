/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs8;

// Java program to demonstrate working of Comparator
// interface and Collections.sort() to sort according
// to user defined criteria.
import java.util.*;
import java.lang.*;
import java.io.*;

public class SortArrayUsingComparator {
    public static void runMain(){
        // Driver class
            ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        Collections.sort(ar, new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
    }
}

// A class to represent a student.
class Student {

    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name,
            String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString() {
        return this.rollno + " " + this.name
                + " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student> {

    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}


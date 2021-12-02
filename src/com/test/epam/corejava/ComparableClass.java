package com.test.epam.corejava;

public class ComparableClass implements Comparable<Students> {

    public static void main(String[] args) {
        ComparableClass comparableClass = new ComparableClass();
        Students students = new Students();
        students.setSalary(20000);
        comparableClass.compareTo(students);
    }

    @Override
    public int compareTo(Students students) {
        return students.getSalary() - 1000;
    }
}

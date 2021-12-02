package com.test.epam.corejava;

public class StaticClass {

    static int counter = 0;

    static final int secondCounter=0;

    public static void main(String[] args) {

        increaseCounter();
        System.out.println(counter);
        System.out.println(secondCounter);
    }

    public static void increaseCounter() {
        String s = "Sopan";
        for (int i = 0; i < s.length(); i++) {
            counter++;
            //secondCounter++; this will throw error as Final can not be changed/modified
        }
    }

}

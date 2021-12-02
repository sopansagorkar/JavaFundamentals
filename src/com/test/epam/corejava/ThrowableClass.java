package com.test.epam.corejava;

public class ThrowableClass {

    public static void main(String[] args)
            throws Exception {

        try {

            testException();
        } catch (Throwable e) {

            System.out.println("Exception: "
                    + e.toString());
        }
    }

    // Method which throws Exception
    public static void testException()
            throws Exception {

        throw new Exception(
                "New Exception Thrown");
    }
}
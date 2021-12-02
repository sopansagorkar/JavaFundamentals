package com.test.epam.corejava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) throws IOException {
        divideNumbers(9, 0);
        fileRead(new File(System.getProperty("user.dir") + "/sample.txt"));


    }

    private static void fileRead(File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file.getAbsolutePath());
    }

    private static void divideNumbers(int a, int b) {
        int c;

        try {
            c = a / b;
            System.out.println("Divide result is = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}

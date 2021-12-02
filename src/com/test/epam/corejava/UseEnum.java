package com.test.epam.corejava;

import static com.test.epam.corejava.EnumExamples.*;

public class UseEnum {

    public static void main(String[] args) {
        dayIsLike(SATURDAY);
    }

    private static void dayIsLike(EnumExamples saturday) {
        switch (saturday) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
                System.out.println("Weekends are best.");
                break;
            case SUNDAY:
                System.out.println("Weekends are best but Sunday evening reminds of Monday");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }

    }
}

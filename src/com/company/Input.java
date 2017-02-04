package com.company;

import java.util.Scanner;

/**
 * Collection of methods to get user input; validate numerical input.
 * Convenient methods for turning calls like
 *
 * System.out.println("Please enter the text");
 * String text = scanner.nextLine();
 *
 * into
 *
 * String text = Input.getStringInput("Please enter the text");
 */

public class Input {

    private static Scanner scanner = new Scanner(System.in);   //Global scanner used for all input

    public static int getPositiveIntInput() {
        return getPositiveIntInput(null);
    }

    public static int getPositiveIntInput(String question) {

        if (question != null) {
            System.out.println(question);
        }
        while (true) {
            try {
                String stringInput = scanner.nextLine();
                int intInput = Integer.parseInt(stringInput);
                if (intInput >= 0) {
                    return intInput;
                } else {
                    System.out.println("Please enter a positive number");
                }
            } catch (NumberFormatException fne) {
                System.out.println("Please type a positive number");
            }
        }
    }


    public static double getPositiveDoubleInput() {
        return getPositiveDoubleInput(null);
    }

    public static double getPositiveDoubleInput(String question) {

        if (question != null) {
            System.out.println(question);
        }
        while (true) {
            try {
                String stringInput = scanner.nextLine();
                double doubleInput = Double.parseDouble(stringInput);
                if (doubleInput >= 0) {
                    return doubleInput;
                } else {
                    System.out.println("Please enter a positive number");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Please type a positive number");
            }
        }
    }


    public static String getStringInput() {
        return getStringInput(null);
    }

    public static String getStringInput(String question) {
        if (question != null) {
            System.out.println(question);
        }
        String entry = scanner.nextLine();
        return entry;
    }
}

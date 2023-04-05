package com.edwaldoalmeida.javalivesummary;

import java.util.Scanner;

public class CommandLineUserInteraction {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Scanner scanner = new Scanner(System.in);
            System.out.println("Enter something: ");
            String userInput = scanner.nextLine();
            System.out.println("This is what you typed: " + userInput);
        } catch (Exception e) {
            System.out.println("Something went wrong instantiating the scanner. Exception: " + e);
        }
        // scanner.close();
    }
}

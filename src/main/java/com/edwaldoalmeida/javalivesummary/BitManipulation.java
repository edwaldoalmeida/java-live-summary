package com.edwaldoalmeida.javalivesummary;

public class BitManipulation {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        x = x ^ y; // x now equals 15
        y = x ^ y; // y now equals 5
        x = x ^ y; // x now equals 10
        System.out.println("x: " + x + ", y: " + y); // prints "x: 5, y: 10"
        
    }
}

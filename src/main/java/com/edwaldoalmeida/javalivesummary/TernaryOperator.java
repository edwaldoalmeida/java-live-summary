package com.edwaldoalmeida.javalivesummary;

public class TernaryOperator {
    public static void main(String[] args) {
        boolean fiveGreaterThanFour = 5 > 4 ? true : false;
        System.out.println("Five is greater than four: " + fiveGreaterThanFour);

        int productsSold = 25;
        int result = (productsSold >= 20) ? 13 : 10;
        System.out.println("Result: " + result);
    }
}

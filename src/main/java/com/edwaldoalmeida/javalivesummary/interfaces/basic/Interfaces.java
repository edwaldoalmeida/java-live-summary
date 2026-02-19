package com.edwaldoalmeida.javalivesummary.interfaces.basic;

public class Interfaces {
    public static void main(String[] args) {
        ItalianTraveller italianTraveller = new ItalianTraveller();
        System.out.println(italianTraveller.getLanguageName());
        System.out.println(italianTraveller.speak());
    }
}

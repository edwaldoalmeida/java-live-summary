package com.edwaldoalmeida.javalivesummary.Enums.EnumSingletonPattern;

public class EnumSingleton {
    public static void main(String[] args) {
        DatabaseConnection.INSTANCE.executeQuery("test");

        System.exit(1);
    }
}

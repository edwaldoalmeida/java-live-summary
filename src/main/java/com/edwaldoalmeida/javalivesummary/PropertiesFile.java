package com.edwaldoalmeida.javalivesummary;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
    private static Properties globalProps;

    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        readPropertiesFile();
    }

    public static void readPropertiesFile() throws IOException {
        try (InputStream in = new FileInputStream("db.properties")) {
            globalProps = new Properties();
            globalProps.load(in);
        }
    }
}

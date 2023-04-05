package com.edwaldoalmeida.javalivesummary.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "README.md";
        String absolutePath = new File(fileName).getAbsolutePath();

        // reading and printing to the console
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Line: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error handling file: " + e.getMessage());
        }
    }
}

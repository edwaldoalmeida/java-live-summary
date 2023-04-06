package com.edwaldoalmeida.javalivesummary.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingRead {
    public static void main(String[] args) {
        String originalFilename = "README.md";
        String absoluteOriginalPath = new File(originalFilename).getAbsolutePath();
        
        // reading and printing to the console using try-with
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(absoluteOriginalPath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Line: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error handling file: " + e.getMessage());
        }
    }
}

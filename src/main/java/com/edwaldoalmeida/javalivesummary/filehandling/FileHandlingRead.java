package com.edwaldoalmeida.javalivesummary.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingRead {
    public static void main(String[] args) {
        File originalFilename = new File("README.md");
        String absoluteOriginalPath = originalFilename.getAbsolutePath();
        
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

package com.edwaldoalmeida.javalivesummary.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingReadAndWrite {
    public static void main(String[] args) {
        String originalFilename = "README.md";
        String redactedFilename = "redacted-" + originalFilename;
        String absoluteOriginalPath = new File(originalFilename).getAbsolutePath();
        String absoluteRedactedPath = new File(redactedFilename).getAbsolutePath();
    
        // Array redactedWordsArray = new Array(); // TODO: stopped here!
            
        // using try-catch (now saving the result)
        try {
            BufferedReader originalFileReader = new BufferedReader(new FileReader(absoluteOriginalPath));
            BufferedWriter redactedFileWriter = new BufferedWriter(new FileWriter(absoluteRedactedPath));
            
            String line = originalFileReader.readLine();
            while (line != null) {
                // for (String redactedWord : redacted)
            }
    
        } catch (IOException e) {
            System.out.println("Error handling file: " + e.getLocalizedMessage());
        }
    }
}

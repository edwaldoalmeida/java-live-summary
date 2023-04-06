package com.edwaldoalmeida.javalivesummary.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;

public class FileHandlingReadAndWrite {
    public static void main(String[] args) {
        String originalFilename = "README.md";
        String redactedFilename = "redacted-" + originalFilename;
        String absoluteOriginalPath = new File(originalFilename).getAbsolutePath();
        String absoluteRedactedPath = new File(redactedFilename).getAbsolutePath();
        
        // Array redactedWordsArray = new Array(); // TODO: stopped here!
        String[] redactedWords = {"in"};

        // using try-catch with all stuff in the body
        try {
            BufferedReader originalFileReader = new BufferedReader(new FileReader(absoluteOriginalPath));
            BufferedWriter redactedFileWriter = new BufferedWriter(new FileWriter(absoluteRedactedPath));
            String line = originalFileReader.readLine();
            String redactedLine = "";
            while (line != null) {
                for (String redactedWord : redactedWords) {
                    // redactedLine = line.replace(redactedWord, "REDACTED"); // option1
                    redactedLine = StringUtils.replaceIgnoreCase(line, redactedWord, "REDACTED"); // better!
                    System.out.println("Original line: " + line);
                    System.out.println("Redacted line: " + redactedLine);
                    redactedFileWriter.append(redactedLine).append("\n");
                }
                line = originalFileReader.readLine();
            }
            originalFileReader.close();
            redactedFileWriter.close();
        } catch (IOException e) {
            System.out.println("Error handling file: " + e.getLocalizedMessage());
        }
    }
}

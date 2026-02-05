package com.edwaldoalmeida.javalivesummary.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FileHandlingRead {
    public static void main(String[] args) throws IOException {
        File originalFilename = new File("README.md");
        String absoluteOriginalPath = originalFilename.getAbsolutePath();

        FileReadJava7(absoluteOriginalPath);
        FileReadJava8(absoluteOriginalPath);
    }

    public static void FileReadJava7(String file) throws IOException {
        // reading line-by-line and printing to the console using try-with
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error handling file: " + e.getMessage());
        }

        // reading the entire file and printing line-by-line
        List<String> lines = Files.readAllLines(Path.of(file));
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static void FileReadJava8(String file) throws IOException {
        // reads the file and prints the lines (one at a time?)
        try(Stream<String> stream = Files.lines(Paths.get(file))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}

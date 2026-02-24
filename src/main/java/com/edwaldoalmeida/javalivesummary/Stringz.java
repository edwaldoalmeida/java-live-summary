package com.edwaldoalmeida.javalivesummary;

public class Stringz {
    public static void main(String[] args) {
        String logLine = "[WARNING]: Disk almost full";

        // extract the log message
        String message = logLine.substring(logLine.indexOf(":") + 1).trim();

        // extract the log level
        int openBracket = logLine.indexOf("[");
        int closeBracket = logLine.indexOf("]");
        String logLevel = logLine.substring(openBracket + 1, closeBracket);

        // reformat log line
        String reformatted1 = message + " (" + logLevel + ")";

        // reformat log line (another way)
        String reformatted2 = String.format("%s (%s)", message, logLevel);

        // from int to String
        int i = 10;
        String iString = Integer.toString(i);

        String myString = "hey";
        int myInt = 10;
        float myFloat = 1.23456789f;
        Double myDouble = 1.23456789;
        String reformatted3 = String.format("String: %s, int: %04d, Double: %f, Float: %f", myString, myInt, myDouble, myFloat);

        System.exit(1);
    }

}

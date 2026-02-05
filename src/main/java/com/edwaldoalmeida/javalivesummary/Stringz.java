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
        String reformatted = message + " (" + logLevel + ")";

        // from int to String
        int i = 10;
        String iString = Integer.toString(i);
    }

}

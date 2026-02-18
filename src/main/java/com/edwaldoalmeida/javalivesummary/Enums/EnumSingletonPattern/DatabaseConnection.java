package com.edwaldoalmeida.javalivesummary.Enums.EnumSingletonPattern;

import java.sql.Connection;

public enum DatabaseConnection {
    INSTANCE;

    private Connection connection;

    DatabaseConnection() {
        // initialize connection
        this.connection = createConnection();
    }

    private Connection createConnection() {
        // connection logic here
        return null; // placeholder
    }

    public void executeQuery(String query) {
        System.out.println("execute query using connection: " + query);
    }
}

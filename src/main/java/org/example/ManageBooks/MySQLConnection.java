package org.example.ManageBooks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    private static String url = "jdbc:mysql://localhost:3306/my_database";
    private static String user = "root";
    private static String password = "";

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}

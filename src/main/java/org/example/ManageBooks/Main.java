package org.example.ManageBooks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        //BookManager bookManager = new BookManager();
        //BookConsoleView consoleView = new BookConsoleView(bookManager);
        //consoleView.printMenu();
        String url = "jdbc:mysql://localhost:3306/my_database";
        String user = "root";
        String password = "";

        //connection
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }

        //createBook
        try{
            String sql = "INSERT INTO libros (title, author, isbn) VALUES ('Sapiens', 'Yuval Noah', 'A345')";
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}

package org.example.ManageBooks;

import java.sql.*;
import java.util.List;

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
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        //createBook
        try {
            String sql = "INSERT INTO libros (title, author, isbn) VALUES ('Sapiens', 'Yuval Noah', 'A345')";
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        // seleccionar
        public List<Book> findALL() {

            String sql = " SELECT * FROM books";

            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();

                ResultSet res = statement.executeQuery(sql);

                while (res.next()) {

                    String isbn = res.getString("isbn");
                    String title = res.getString("title");
                    String author = res.getString("author");

                    Book book = new Book(isbn, title, author);
                }
            }catch (SQLException ex){
                System.out.println(ex.getMessage());
            }


            }
        }

        // excoger

    }


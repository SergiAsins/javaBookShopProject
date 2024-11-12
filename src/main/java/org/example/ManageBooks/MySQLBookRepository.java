package org.example.ManageBooks;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLBookRepository {

    // findAll
    public List<Book> findAll () {
        List<Book> bookList = new ArrayList<>();
        String sql = " SELECT * FROM books";
        try {
            Connection connection = MySQLConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                String isbn = res.getString("isbn");
                String title = res.getString("title");
                String author = res.getString("author");
                Book book = new Book(isbn, title, author);
                bookList.add(book);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return bookList;
    }

    public void saveBook(Book book){
        try {
            String sql = "INSERT INTO libros (title, author, isbn) VALUES ('%s', '%s', '%s')".formatted(book.getTitle(), book.getAuthor(), book.getISBN());
            Connection connection = MySQLConnection.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
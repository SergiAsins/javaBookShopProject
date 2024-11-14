package org.example.ManageBooks;

import java.sql.*;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class MySQLBookRepository implements BookRepository{

    @Override
    public void save(Book book) { //Create a Book in DB      //was 'save' before
        try {
            String sql = "INSERT INTO books (title, author, isbn) VALUES ('%s', '%s', '%s')".formatted(book.getTitle(), book.getAuthor(), book.getISBN());
            Connection connection = MySQLConnection.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return Optional.empty();
    }

    public List<Book> findAll() {
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

    @Override
    public void deleteByIsbn(String isbn) {
        try {
            String sql = "DELETE FROM books WHERE isbn= '%s' ".formatted(isbn);
            Connection connection = MySQLConnection.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

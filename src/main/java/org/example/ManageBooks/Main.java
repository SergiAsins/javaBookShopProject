package org.example.ManageBooks;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //BookManager bookManager = new BookManager();
        //BookConsoleView consoleView = new BookConsoleView(bookManager);
        //consoleView.printMenu();

        MySQLBookRepository mySQLBookRepository = new MySQLBookRepository();
        Book book = new Book("Shrek", "Author of Shrek", "A681");
        mySQLBookRepository.saveBook(book);
    }
}


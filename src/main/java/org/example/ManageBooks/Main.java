package org.example.ManageBooks;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        BookConsoleView consoleView = new BookConsoleView(bookManager);
        consoleView.printMenu();
    }
}

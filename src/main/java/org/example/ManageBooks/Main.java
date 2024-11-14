package org.example.ManageBooks;

public class Main {
    public static void main(String[] args) {
        BookRepository inMemoryRepo = new InMemoryBookRepository();
        BookRepository mySQLRepo = new MySQLBookRepository();

        BookManager bookManager = new BookManager(inMemoryRepo);
        BookConsoleView consoleView = new BookConsoleView(bookManager);

        consoleView.printMenu();

        bookManager.changeRepository(mySQLRepo);
    }
}

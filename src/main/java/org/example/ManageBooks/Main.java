package org.example.ManageBooks;

public class Main {
    public static void main(String[] args) {
        BookRepository inMemoryRepo = new InMemoryBookRepository();
        BookRepository mySQLRepo = new MySQLBookRepository();

        BookManager bookManager = new BookManager(inMemoryRepo); // Start with in-memory repo
        BookConsoleView consoleView = new BookConsoleView(bookManager);

        consoleView.printMenu(); // Run application menu

        // To switch repository later, use:
        bookManager.changeRepository(mySQLRepo);
    }
}

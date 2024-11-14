package org.example.ManageBooks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookConsoleView {
    private final Scanner scanner = new Scanner(System.in);
    //bookManager manage the logic of books (services)
    private final BookManager bookManager;

    //bookManager property's constructor
    public BookConsoleView(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    public void printMenu() {
        String menu =
                "1. Add book\n" +
                        "2. View all books\n" +
                        "3. Delete book\n" +
                        "4. Change repository\n" +
                        "5. Exit";

        String option;
        do {
            System.out.println(menu);
            System.out.print("Choose an option: ");
            option = scanner.nextLine();
            handleMenuOption(option);
        } while (!option.equals("5"));
    }

    private void handleMenuOption(String option) {
        switch (option) {
            case "1":
                this.menuAddBook();
                break;
            case "2":
                this.menuViewBooks();
                break;
            case "3":
                this.menuDeleteBook();
                break;
            case "4":
                bookManager.changeRepository();
                break;
            case "5":
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    private void menuViewBooks() {
        List<Book> menuListBook = bookManager.getAllBooks();
        for (Book book : menuListBook){
            System.out.println(book);
        }
    }

    public void menuAddBook() {
        System.out.print("Add Title (required): ");
        String title = scanner.nextLine().trim();
        System.out.print("Add Author (required): ");
        String author = scanner.nextLine().trim();
        System.out.print("Add ISBN (required): ");
        String isbn = scanner.nextLine().trim();
        this.bookManager.addBook(title, author, isbn);
    }

    public void menuDeleteBook() {
        System.out.println("Delete a book:");
        String optionISBN = scanner.nextLine();
        this.bookManager.deleteBook(optionISBN);
    }


}


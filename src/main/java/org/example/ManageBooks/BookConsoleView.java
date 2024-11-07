package org.example.ManageBooks;

import java.util.Scanner;

public class BookConsoleView {
    //bookManager manage the logic of books (services)
    private final BookManager bookManager;

    //bookManager property's constructor
    public BookConsoleView(BookManager bookManager) {
        this.bookManager = bookManager;
    }
    public void printMenu() {
        Scanner scanner = new Scanner(System.in);
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

    private void handleMenuOption(@org.jetbrains.annotations.NotNull String option) {
        switch (option) {
            case "1":
                bookManager.addBook();
                break;
            case "2":
                bookManager.viewBooks();
                break;
            case "3":
                bookManager.deleteBook();
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

}

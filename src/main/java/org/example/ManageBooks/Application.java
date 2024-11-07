package org.example.ManageBooks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Application {
    private final ArrayList<Book> bookList = new ArrayList<>();

    public Application() {
            this.bookList.add(new Book("Robin Hood", "Tom Cruise", "A111"));
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
                addBook();
                break;
            case "2":
                viewBooks();
                break;
            case "3":
                deleteBook();
                break;
            case "4":
                changeRepository();
                break;
            case "5":
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    private void addBook() {
        Scanner scanner = new Scanner(System.in);
        String title, author, isbn;

        do {
            System.out.print("Add Title (required): ");
            title = scanner.nextLine().trim();
            System.out.print("Add Author (required): ");
            author = scanner.nextLine().trim();
            System.out.print("Add ISBN (required): ");
            isbn = scanner.nextLine().trim();

            if (title.isEmpty() || author.isEmpty() || isbn.isEmpty()) {
                System.out.println("All fields are mandatory. Please try again.");
            } else if (!isCorrectISBN(isbn)) {
                System.out.println("This ISBN is not correct. Please insert an uppercase letter and three numbers");
            } else if (isDuplicateISBN(isbn)) {
                System.out.println("This ISBN already exists. Please try again.");
            } else {
                Book book = new Book(title, author, isbn);
                bookList.add(book);
                System.out.println("The book has been added successfully!");
                break;
            }
        } while (true);
    }

    private void viewBooks() {
        if (bookList.isEmpty()) {
            System.out.println("There are no books in the repository.");
        } else {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }

    private void deleteBook() {
        System.out.println("Delete a book:");
        Scanner scanner = new Scanner(System.in);
        String optionISBN = scanner.nextLine();
    }

    private void changeRepository() {
        System.out.println("Change Repository:");
    }

    private boolean isDuplicateISBN(String isbn) {
        for (Book book : bookList) {
            if (book.getISBN().equals(isbn)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isCorrectISBN(String isbn) {
        String pattern = "^([A-Z])(\\d{3})$";
        return Pattern.matches(pattern, isbn);
    }
}

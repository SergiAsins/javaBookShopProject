package org.example.ManageBooks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BookManager {
    private final ArrayList<Book> bookList = new ArrayList<>();

    public void addBook() {
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

    public void viewBooks() {
        if (bookList.isEmpty()) {
            System.out.println("There are no books in the repository.");
        } else {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }

    public void deleteBook() {
        System.out.println("Delete a book:");
        Scanner scanner = new Scanner(System.in);
        String optionISBN = scanner.nextLine();
    }

    public void changeRepository() {
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

package org.example.ManageBooks;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class BookManager {
    private final ArrayList<Book> bookList = new ArrayList<>();

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        String title, author, isbn;

        Book book = new Book(title, author, isbn);
        bookList.add(book);
        System.out.println("The book has been added successfully!");

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

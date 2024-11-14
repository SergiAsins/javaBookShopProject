package org.example.ManageBooks;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    //attributes
    private final ArrayList<Book> bookList = new ArrayList<Book>();
    private BookRepository bookRepository = new MySQLBookRepository();

    //constructor
    public BookManager() {
    }

    //methods
            /* if (bookList.isEmpty()) {
            System.out.println("There are no books in the repository.");
        } else {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }*/

    private static boolean isValidISBN(String isbn) {
        String pattern = "^([A-Z])(\\d{3})$";
        return isbn.matches(pattern);
    }

    public void addBook(String title, String author, String ISBN) {
        Book book = new Book(title, author, ISBN);
        bookList.add(book);
        System.out.println("The book has been added successfully!");
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void deleteBook(String optionISBN) {
        bookList.removeIf(book -> book.getISBN().equals(optionISBN));
    }

    public void changeRepository() {
        System.out.println("Change Repository:");
    }
}

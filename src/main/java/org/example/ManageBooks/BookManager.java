package org.example.ManageBooks;

import java.util.List;

public class BookManager {
    private BookRepository bookRepository;

    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title, String author, String ISBN) {
        if (isValidISBN(ISBN)) {
            Book book = new Book(title, author, ISBN);
            bookRepository.save(book);
            System.out.println("The book has been added successfully!");
        } else {
            System.out.println("Invalid ISBN format. Please try again.");
        }
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void deleteBook(String isbn) {
        bookRepository.deleteByIsbn(isbn);
    }

    public void changeRepository(BookRepository newRepository) {
        this.bookRepository = newRepository;
        System.out.println("Repository switched successfully.");
    }

    private static boolean isValidISBN(String isbn) {
        String pattern = "^([A-Z])(\\d{3})$";
        return isbn.matches(pattern);
    }
}

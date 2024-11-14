package org.example.ManageBooks;

import java.util.List;
import java.util.Optional;

public class BookManager {
    private BookRepository bookRepository;

    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title, String author, String ISBN) {
        // Check all Guards before saving a Book
        if (isInvalidData(title, author, ISBN)) {
            System.out.println("All fields are mandatory. Please try again.");
        } else if (!isValidISBN(ISBN)) {
            System.out.println("This ISBN format is incorrect. Use an uppercase letter followed by three numbers.");
        } else if (isDuplicateISBN(ISBN)) {
            System.out.println("This ISBN already exists. Please use a unique ISBN.");
        } else {
            Book book = new Book(title, author, ISBN);
            bookRepository.save(book);
            System.out.println("The book has been added successfully!");
        }
    }

    private boolean isInvalidData(String title, String author, String ISBN) {
        return title.isEmpty() || author.isEmpty() || ISBN.isEmpty();
    }

    private static boolean isValidISBN(String isbn) {
        String pattern = "^([A-Z])(\\d{3})$";
        return isbn.matches(pattern);
    }

    private boolean isDuplicateISBN(String isbn) {
        Optional<Book> book = bookRepository.findByIsbn(isbn);
        return book.isPresent();
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void deleteBook(String isbn) {
        bookRepository.deleteByIsbn(isbn);
        System.out.println("The book has been deleted successfully!");
    }

    public void changeRepository(BookRepository newRepository) {
        this.bookRepository = newRepository;
        System.out.println("Repository switched successfully.");
    }
}

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

    //Data Book Guards:
    public void guardBook(Book book) {
        if (title.isEmpty() || author.isEmpty() || ISBN.isEmpty()) {
            System.out.println("All fields are mandatory. Please try again.");
        } else if (!isValidISBN(ISBN)) {
            System.out.println("This ISBN is not correct. Please insert an uppercase letter and three numbers");
        } else if (isDuplicateISBN(ISBN)) {
            System.out.println("This ISBN already exists. Please try again.");
        }
    }

    private static boolean isValidISBN(String isbn) {
        String pattern = "^([A-Z])(\\d{3})$";
        return isbn.matches(pattern);
    }

    private boolean isDuplicateISBN(String isbn) {
        Optional<Book> book = bookRepository.findByIsbn(isbn);
        return book.isPresent();
    }
}

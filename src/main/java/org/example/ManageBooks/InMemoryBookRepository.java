package org.example.ManageBooks;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryBookRepository implements BookRepository {
    private final List<Book> booksDb = new ArrayList<>();

    @Override
    public void save(Book book) {
        booksDb.add(book);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(booksDb);
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return booksDb.stream().filter(book -> book.getISBN().equals(isbn)).findFirst();
    }

    @Override
    public void deleteByIsbn(String isbn) {
        booksDb.removeIf(book -> book.getISBN().equals(isbn));
    }
}

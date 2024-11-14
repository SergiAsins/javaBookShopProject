package org.example.ManageBooks;

import java.util.List;
import java.util.Optional;

public class InMemoryBookRepository implements BookRepository {
    //private static List<Book> db = new ArrayList<>();

    @Override
    public void save(Book book) {
    }

    @Override
    public List<Book> findAll() {
        return List.of();
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return Optional.empty();
    }

    @Override
    public void deleteByIsbn(String isb) {
    }
}
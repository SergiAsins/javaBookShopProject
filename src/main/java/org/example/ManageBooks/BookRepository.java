package org.example.ManageBooks;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface BookRepository {
    void save(Book book);

    List<Book> findALL();

    void deleteByIsbn(String isbn);

    Optional<Book> findByIsbn(String isbn);

    ArrayList<Book> findAll();
}

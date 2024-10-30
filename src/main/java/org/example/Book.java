package org.example;

public class Book {
    private String ISBN;
    private String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return
                "ISBN ='" + this.ISBN + '\'' +
                ",\t title ='" + this.title + '\'' +
                ",\t author ='" + this.author + '\'';
    }
}

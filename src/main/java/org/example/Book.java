package org.example;

public class Book {
    private String ISBN;
    private String title;
    private String author;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return
                "Title ='" + this.title + '\'' +
                ",\t author ='" + this.author + '\'' +
                ",\t ISBN ='" + this.ISBN + '\'';
    }
}

package org.example;

public class Book {
    private String id;
    private String title;
    private String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return
                "id ='" + this.id + '\'' +
                ",\t title ='" + this.title + '\'' +
                ",\t author ='" + this.author + '\'';
    }
}

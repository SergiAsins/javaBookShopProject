package org.example;

public class Book {
    public String id;
    public String title;
    public String author;

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

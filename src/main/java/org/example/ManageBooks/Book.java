package org.example.ManageBooks;
import java.util.regex.Pattern;

public class Book {
    private String ISBN;
    private String title;
    private String author;

    //getters:
    public String getTitle() {
        return title;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getAuthor() {
        return author;
    }

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

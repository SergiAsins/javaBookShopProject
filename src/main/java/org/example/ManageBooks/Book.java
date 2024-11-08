package org.example.ManageBooks;

public class Book {
    public String ISBN;
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

    public void guardBook() {
        if (title.isEmpty() || author.isEmpty() || isbn.isEmpty()) {
            System.out.println("All fields are mandatory. Please try again.");
        } else if (!isCorrectISBN(isbn)) {
            System.out.println("This ISBN is not correct. Please insert an uppercase letter and three numbers");
        } else if (isDuplicateISBN(isbn)) {
            System.out.println("This ISBN already exists. Please try again.");
        }
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

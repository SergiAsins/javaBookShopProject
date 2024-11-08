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

    /*public void guardBook() {
        if (title.isEmpty() || author.isEmpty() || ISBN.isEmpty()) {
            System.out.println("All fields are mandatory. Please try again.");
        } else if (!isCorrectISBN(ISBN)) {
            System.out.println("This ISBN is not correct. Please insert an uppercase letter and three numbers");
        } else if (isDuplicateISBN(ISBN)) {
            System.out.println("This ISBN already exists. Please try again.");
        }
    }*/

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

    /*private boolean isDuplicateISBN(String isbn) {
        for (Book book : bookList) {
            if (book.getISBN().equals(isbn)) {
                return true;
            }
        }
        return false;
    }*/

    /*private static boolean isCorrectISBN(String isbn) {
        String pattern = "^([A-Z])(\\d{3})$";
        return Pattern.matches(pattern, isbn);
    }*/
}

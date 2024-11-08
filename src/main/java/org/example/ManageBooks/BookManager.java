package org.example.ManageBooks;
import java.util.ArrayList;

public class BookManager {
    private final ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(String title, String author, String ISBN) {
        Book book = new Book(title, author, ISBN);
        bookList.add(book);
        System.out.println("The book has been added successfully!");
    }

    public ArrayList<Book> getAllBooks() {
        return bookList;

        /*if (bookList.isEmpty()) {
            System.out.println("There are no books in the repository.");
        } else {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }*/
    }

    public void deleteBook(String optionISBN){
        bookList.removeIf(book -> book.getISBN().equals(optionISBN));
    }

    public void changeRepository() {
        System.out.println("Change Repository:");
    }
}

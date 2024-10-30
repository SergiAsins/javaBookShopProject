package org.example.ManageBooks;

import org.example.Book;
import java.util.Scanner;

public class Application {
    public void printMenu() {

        Book book1 = new Book("1", "Harry Potter", "J.K.Rowling");
        Book book2 = new Book("2", "The Road", "Cormac McDonald");
        Book book3 = new Book("3", "The Lord of the Rings I", "J.R.R Tolkien");

        Book[] arrayBooks = {book1, book2, book3};
        Scanner scanner = new Scanner(System.in);

        String menu =
                "1. Add book\n" +
                        "2. View all books\n" +
                        "3. Delete book\n" +
                        "4. Change repository\n" +
                        "5. Exit";

        String chooseOption = "";

        do {
            System.out.println(menu);
            System.out.println("Choose an option: ");
            chooseOption = scanner.next();

            switch (chooseOption) {
                case "1":
                    System.out.println("Option 1: Add book");
                    break;
                case "2":
                    System.out.println("Option 2: View all books");
                    if (arrayBooks.length == 0) {
                        System.out.println("There are no books in the repository.");
                    } else {
                        for (Book book : arrayBooks) {
                            System.out.println(book.toString());
                        }
                    }
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case "3":
                    System.out.println("Option 3: Delete a book");
                    break;
                case "4":
                    System.out.println("Option 4: Change Repository");
                    break;
                case "5":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        } while (!chooseOption.equals("5"));
    }
}

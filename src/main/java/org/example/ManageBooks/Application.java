package org.example.ManageBooks;

import org.example.Book;

import java.util.Scanner;
import java.util.ArrayList;

public class Application {
    private ArrayList<Book> bookList = new ArrayList<>();
    public Application(){
        this.bookList.add(new Book("5","robin hood","tom cruise"));
    }

    public void printMenu() {
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
                    String addTitle, addAuthor, addISBN;
                    // Loop that makes mandatory all fields
                    do {
                        System.out.print("Add Title (required): ");
                        addTitle = scanner.nextLine().trim();
                        System.out.print("Add Author (required): ");
                        addAuthor = scanner.nextLine().trim();
                        System.out.print("Add ISBN (required): ");
                        addISBN = scanner.nextLine().trim();
                        // Verifies that no field is empty
                        if (addTitle.isEmpty() || addAuthor.isEmpty() || addISBN.isEmpty()) {
                            System.out.println("----------------------------------------");
                            System.out.println("All fields are mandatory. Please, try again.");
                            System.out.println("----------------------------------------");
                        } else {
                            break;
                        }
                    } while (true);
                    Book book = new Book(addTitle, addAuthor, addISBN);
                    bookList.add(book);
                    System.out.println("----------------------------------------");
                    System.out.println("The book has been added correctly!");
                    System.out.println("----------------------------------------");
                    break;
                case "2":
                    System.out.println("Option 2: View all books");
                    if (bookList.size()== 0) {
                        System.out.println("There are no books in the repository.");
                    } else {
                        for (Book books : bookList) {
                            System.out.println(books.toString());
                        }
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
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

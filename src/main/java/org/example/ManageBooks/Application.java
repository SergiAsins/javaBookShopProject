package org.example.ManageBooks;

import org.example.Book;

import java.util.Scanner;

public class Application {
    public static void printMenu() {
        Scanner scanner = new Scanner(System.in);
        byte option = 0;

        String[] menu = {
                "1. Add book",
                "2. View all books",
                "3. Delete book",
                "4. Change repository",
                "5. Exit",
        };

        do{
            System.out.println(menu);

        switch(option) {
            case 1:
                System.out.println("Option 1: Add book");
                break;
            case 2:
                System.out.println("Option 2: View all books");
            case 3:
                System.out.println("Option 3: Delete a book");
            case 4:
                System.out.println("Option 4: Change Repository");
            case 5:
                System.out.println("Option 5: Exit");
        }


            Book book1 = new Book("1", "Harry Potter", "J.K.Rowling");
            Book book2 = new Book("2", "The Road", "Cormac McDonald");
            Book book3 = new Book("3", "The Lord of the Rings I", "J.R.R Tolkien");



            /*for (String item : menu) {
                System.out.println(item);
            }

            System.out.print("Select an option: ");

            // Wait for user input
            String input = scanner.nextLine(); //TODO check that it is a number

            try {
                // Guard: Is this really a byte?
                option = Byte.parseByte(input);
            } catch (Exception ex) {
                System.out.println("This is not a valid number.");
                continue;
            }

            if (option < 1 || option > 5) {
                // Is this option within the menu choices?
                System.out.println("That option does not exist in the menu.");
                continue;
            }
            System.out.println("The chosen option is: " + menu[option - 1]);
        }
        scanner.close(); */
    }
}

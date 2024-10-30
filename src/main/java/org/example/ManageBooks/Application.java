package org.example.ManageBooks;

import java.util.Scanner;

public class Application {
    public static void printMenu() {
        Scanner scanner = new Scanner(System.in);
        String[] menu = {
                "1. Add book",
                "2. View all books",
                "3. Delete book",
                "4. Change repository",
                "5. Exit",
        };

        byte option = 0;

        while (option != 5) {
            for (String item : menu) {
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
        scanner.close();
    }
}

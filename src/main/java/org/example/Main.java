package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Technical programming books manager");
        System.out.println("1. Add book");
        System.out.println("2. Look at all books");
        System.out.println("3. Delete Book");
        System.out.println("4. Change Repository");
        System.out.println("5. Exit");
        System.out.println("Choose an option:");

        int chooseMenu = scanner.nextInt();
    }
}

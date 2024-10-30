package org.example.ManageBooks;

import java.util.Scanner;

public class Form {

    String inputIsbn;
    String inputTitle;
    String inputAuthor;

    public Form(String inputIsbn, String inputTitle, String inputAuthor) {
        this.inputIsbn = inputIsbn;
        this.inputTitle = inputTitle;
        this.inputAuthor = inputAuthor;
    }

    @Override
    public String toString() {
        return "Form{" +
                "inputIsbn='" + inputIsbn + '\'' +
                ", inputTitle='" + inputTitle + '\'' +
                ", inputAuthor='" + inputAuthor + '\'' +
                '}';
    }
}

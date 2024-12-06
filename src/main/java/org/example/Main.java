package org.example;

import java.sql.SQLOutput;

/**
 * @author Le Nguyen Tan Alex
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("how to speak chinese" , "alex", 20, "freddy", "1234567890-12");
        book1.toTitleCase();
        System.out.println("Book 1\n" + book1);
    }
}
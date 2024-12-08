package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Le Nguyen Tan Alex
 */
public class Main {
    public static void main(String[] args) {
        Library bookList = new Library();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search book through the library: ");
        String keyword = input.nextLine();

        Book bookpo = new Book("how to speak chinese" , "alex", 20, "freddy", "1234567890-12");
        bookpo.toTitleCase();
        //System.out.println("Book 1\n" + bookpo);

        System.out.println(bookList);
    }
    
}
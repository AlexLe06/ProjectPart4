package org.example;

import java.sql.SQLOutput;

/**
 * @author Le Nguyen Tan Alex
 */
public class Main {
    public static void main(String[] args) {
        Book kaka = new Book("hello baka kaba smelyy" , "alex", 20, "freddy", "1234567890-12");
        kaka.toTitleCase();
        System.out.println(kaka);
    }
}
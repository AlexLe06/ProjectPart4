package org.example;

/**
 * @author Le Nguyen Tan Alex
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String ko = "baka hello";
        Book kaka = new Book("hello baka", "alex", 20, "hitler", "f");
        kaka.toTitleCase();
    }
}
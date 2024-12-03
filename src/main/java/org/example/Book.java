package org.example;

public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private long isbn;

    public Book(){

    }

    public Book(String title){
        this.title = title;
    }

    public Book(String title, String author, double price, String publisher, long isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public Book(Book newBook){
        title = newBook.title;
        author = newBook.author;
        price = newBook.price;
        publisher = newBook.publisher;
        isbn = newBook.isbn;
    }
}

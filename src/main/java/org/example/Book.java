package org.example;

public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    Book(){
    }

    public Book(String title){
        this.title = title;
    }

    public Book(String title, String author, double price, String publisher, String isbn){
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

    public int checkIsbnStatus(){
        int isbn10;
        int isbn13;
        if (isbn == isbn10){
            return 1;
        }
        else if (isbn == isbn13) {
            return 0;
        }
        else {
            return -1;
        }
    }

    public void toTitleCase(){
        char c = title.toUpperCase().charAt(0);
        for (int i = 0; i < title.length(); i++){
            if (title.charAt(i) == ' ')
                title.toUpperCase().charAt(' ' + 1);
            else
                i++;

            title = title;
        }
        System.out.println(title);
    }
}

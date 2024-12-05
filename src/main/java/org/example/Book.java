package org.example;
import javax.swing.*;

//Class Book
public class Book {
    //All data members
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    //Default constructor
    Book(){
    }

    //Constructor with title
    public Book(String title){
        this.title = title;
    }

    //Constructor with all data members
    public Book(String title, String author, double price, String publisher, String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    //Copy constructor
    public Book(Book newBook){
        title = newBook.title;
        author = newBook.author;
        price = newBook.price;
        publisher = newBook.publisher;
        isbn = newBook.isbn;
    }

    //Method that checks Isbn
    public int checkIsbnStatus(){
        if (isbn.length() == 13){
            return 0;
        }
        else if (isbn.length() == 17) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public void toTitleCase() { //To be simplified
        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) == ' ') {
                title = title.substring(0, 1).toUpperCase() + title.substring(1, i + 1) +
                        title.substring(i + 1, i + 2).toUpperCase() +
                        title.substring(i + 2).toLowerCase();
            }
        }
        for (int i = 0; i < author.length(); i++) { //Need fixing
            if (author.charAt(i) == ' ') {
                author = author.substring(0, 1).toUpperCase() + author.substring(1, i + 1) +
                        author.substring(i + 1, i + 2).toUpperCase() +
                        author.substring(i + 2).toLowerCase();
            }
        }
        if (!title.contains(" ")) {
            title = title.substring(0, 1).toUpperCase() + title.substring(1);
        }
        if (!author.contains(" ")) {
            author = author.substring(0, 1).toUpperCase() + author.substring(1);
        }
    }

    public String toString() {
        return String.format(
                "%-9s : %s \n" +
                "%-9s : %s\n" +
                "%-9s : %.2f\n" +
                "%-9s : %ss\n" +
                "%-9s : %s",
                "Title", title, "Author", author,
                "Price", price, "Publisher", publisher,
                "Isbn", isbn);
    }

    public boolean equals(Book book) {
        return (this.title.equals(book.title) &&
                this.author.equals(book.author) &&
                this.price == book.price &&
                this.publisher.equals(book.publisher) &&
                this.isbn.equals(book.isbn));
    }

    public Object clone() throws CloneNotSupportedException {
        Book x = new Book();
        return x;
    }

    //Setter methods
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void setPrice(double newPrice){
        this.price =  newPrice;
    }
    public void setPublisher(String newPublisher){
        this.publisher = newPublisher;
    }
    public void setIsbn(String newIsbn){
        this.isbn = newIsbn;
    }

    //Getter methods
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public String getPublisher(){
        return publisher;
    }
    public String getIsbn(){
        return isbn;
    }
}

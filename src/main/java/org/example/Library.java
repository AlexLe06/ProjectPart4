package org.example;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Le Nguyen Tan Alex
 */
public class Library {
    private ArrayList<Object> books;

    public Library(){
        Book book1 = new Book("harry potter and the sorcerer's stone", "j.k. rowling", 14.99, "Bloomsbury","1338878921");
        Book book2 = new Book("berserk", "kentaro miura", 19.99, "Dark Horse Manga", "978-1593070205");
        Book book3 = new Book("rich dad poor dad", "robert kiyosaki", 26.67, "Plata Publishing", "1612681123");
        Book book4 = new Book("meditations", "marcus aurelius", 16.00, "Penguin Classics", "978-0140449334");
        Book book5 = new Book("the four agreements: a practical guide to personal freedom",
                "don miguel ruiz", 18.95, "Amber-Allen Publishing", "978-1878424310");
    }

    public Library(ArrayList<Object> books){
        this.books = new ArrayList<>(books);
    }

    public Object searchBook(String keyword){

        ArrayList<Object> searchBook = new ArrayList<>(books);

        for (int i = 0; i < searchBook.size(); i++){

        }
        return 1;
    }

    public boolean equals(Library books){
        return this.books.equals(books.books);
    }
}

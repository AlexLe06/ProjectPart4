package org.example;
import java.util.ArrayList;

/**
 * @author Le Nguyen Tan Alex
 */
public class Library {
    private ArrayList<Object> books;

    public Library(){
        this.books = new ArrayList<>(5);
    }

    public Library(ArrayList<Object> books){
        this.books = new ArrayList<>(books);
    }

    public Object searchBook(String keyword){
        ArrayList<Object> searchBook = new ArrayList<>(books);
        for (int i = 0; i < searchBook.size(); i++){

            if (books == keyword)
        }
        return 1;
    }

    public boolean equals(Library books){
        return this.books.equals(books.books);
    }
}

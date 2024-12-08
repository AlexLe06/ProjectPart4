package org.example;
import java.util.ArrayList;



/**
 * @author Le Nguyen Tan Alex
 */
public class Library {
    private ArrayList<Object> books; //Data member

    //Default constructor
    public Library(){
        this.books = new ArrayList<>();

        Book book1 = new Book("harry potter and the sorcerer's stone", "j.k. rowling", 14.99, "Bloomsbury","1338878921");
        Book book2 = new Book("berserk", "kentaro miura", 19.99, "Dark Horse Manga", "978-1593070205");
        Book book3 = new Book("rich dad poor dad", "robert kiyosaki", 26.67, "Plata Publishing", "1612681123");
        Book book4 = new Book("meditations", "marcus aurelius", 16.00, "Penguin Classics", "978-0140449334");
        Book book5 = new Book("the four agreements: a practical guide to personal freedom",
                "don miguel ruiz", 18.95, "Amber-Allen Publishing", "978-1878424310");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
    }

    //Constructor with arraylist
    public Library(ArrayList<Object> books) {
        this.books = new ArrayList<>(books);
    }

    //Copy constructor
    public Library(Library library){
        this.books = library.books;
    }

    //Searches specific book
    public ArrayList<Book> searchBook(String keyword){
        ArrayList<Book> bookSearch = new ArrayList<>();

        for (int i = 0; i < books.size(); i++){
                if (books.get(i).getTitle().contains(keyword.toLowerCase()) ||
                        (books.get(i)).getAuthor().contains(keyword.toLowerCase()))
                {
                bookSearch.add(books.get(i));
            }
        }
        return bookSearch;
    }

    //equals() method
    public boolean equals(Library books){
        return this.books.equals(books.books);
    }

    public String toString() {

        return String.format("%s", books);
    }

    //setter
    public void setBooks(ArrayList<Object> books) {
        this.books = books;
    }

    //getter
    public ArrayList<Object> getBooks() {
        return books;
    }
}

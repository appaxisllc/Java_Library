package com.tts;
import java.util.ArrayList;
public class Library {
    String libraryAddress;
    ArrayList<Book> books;
    public Library(String address) {
        this.libraryAddress = address;
        this.books = new ArrayList();
    }
    public void addBook(Book book) {
        this.books.add(book);
    }
    public void printAddress() {
        System.out.println(this.libraryAddress);
    }
    public void borrowBook(String title) {
        for(Book book:this.books){
            if(title.equals(book.getTitle())){
                if(book.isBorrowed()){
                    System.out.println("Sorry, this book is already borrowed");
                    return;
                }
                else{
                    book.borrowed();
                    System.out.println("You successfully borrowed " + book.getTitle());
                    return;
                }
            }
        }
        System.out.println("Sorry, this book is not in our catalog");
    }
}
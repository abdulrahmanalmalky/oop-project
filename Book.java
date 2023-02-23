package com.mycompany.bookshop;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Book {
    static ArrayList<Book> bookList = new ArrayList();
    private String name;
    private String author;
    private double price;

    Book(){

    }

    public Book(String name , String author , double price){
       this.name = name ;
       this.author = author;
       this.price = price;  
    }

    public void setName(String name){
        this.name = name ;
    }
    
    public String getName(){
        return name ;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    
    public String getAuthor(){
        return author ;
    }

    public void setPrice(double price){
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }
    
    
/*This method receives a name and then searches whether there is a book
in the array with that name or not */
    public static Book getBook(String name){
        for (Iterator<Book> it = bookList.iterator(); it.hasNext();) {
            Book book = it.next();
            if(book.name.equals(name)){
                return book;
            }
        }
        return null;
    }

    /* This method works to update books */
    public static boolean updateBook(Book newBook , Book oldBook){
       if(Book.bookList.size() > 0) {
           int index = -5;
           int i = 0;
           while (i < Book.bookList.size()){
               if (Book.bookList.get(i).getName().equals(oldBook.getName())){
                   index = i;
                   i++;
                   break;
               }
           }
           
           if(index != -5){
                Book.bookList.get(index).setName(newBook.getName());
                Book.bookList.get(index).setAuthor(newBook.getAuthor());
                Book.bookList.get(index).setPrice(newBook.getPrice());
                return true ;
           }
       }
       return false;
    }
}

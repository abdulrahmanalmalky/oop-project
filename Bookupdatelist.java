package com.mycompany.bookshop;
import java.util.Scanner
;
public class Bookupdatelist extends Book {
    public static void  updateBooks (Scanner input){
        
        int choice;
        do{
            System.out.println("******* update Menu *******");
            System.out.println("1 - update Book name");
            System.out.println("2 - update Book author");
            System.out.println("3 - update Book price");
            System.out.println("4 - back to previous menu ");
            System.out.println("5 - Exit ");
            System.out.println("Enter your choice : ");

            choice = input.nextInt();
            if(choice == 1){
                System.out.print("Enter book name : "); 
                String bookName = input.next();
                Book Old = Book.getBook(bookName);
                Book New = Book.getBook(bookName);

                if(Old == null){
                    System.out.println("This book is not found");
                } else { 
                    System.out.println("Enter book new name : "); 
                    String newName = input.next();
                    New.setName(newName);
                    if(Book.updateBook(New, Old)){
                        System.out.println("The modification has been completed");
                    } else {
                       System.out.println("The modification failed"); 
                    }
                }
            } else if(choice == 2){
                System.out.println("Enter book name : ");
                String bookName = input.next();
                Book Old = Book.getBook(bookName);
                Book New = Book.getBook(bookName);
                if(Old == null){
                    System.out.println("This book is not found");
                } else { 
                    System.out.println("Enter book new Author : ");
                    String newAuthor = input.next();
                    New.setAuthor(newAuthor);
                    if (Book.updateBook(New, Old)){
                        System.out.println("The modification has been completed");
                    } else {
                       System.out.println("The modification failed"); 
                    }
                } 
            } else if(choice == 3){
                System.out.println("Enter book name : ");
                String bookName = input.next();
                Book Old = Book.getBook(bookName);
                Book New = Book.getBook(bookName);
                if(Old == null){
                    System.out.println(" This book is not found ");
                } else { 
                    System.out.println(" Enter book new price : ");
                    double newprice = input.nextDouble();
                    New.setPrice(newprice);
                    if(Book.updateBook(New, Old)){
                        System.out.println("The modification has been completed");
                    } else {
                       System.out.println("The modification failed"); 
                    }
                 } 
            } else if(choice == 4){
                Bookshop bs = new Bookshop();
               
            } else if(choice == 5){
                exit();
            } else {
                System.out.println("Wrong selection, please choose (1-5) only.");
            }
        }
        while(choice != 4);
    } 

    public static void exit(){
        System.exit(0);
    }
    
    
}

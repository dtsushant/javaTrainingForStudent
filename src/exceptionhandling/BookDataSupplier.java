package exceptionhandling;

import exceptionhandling.input.InputProvider;
import model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDataSupplier {

    static InputProvider inputProvider = new InputProvider();
    static ArrayList<Book> booklist = new ArrayList<>();


    public static void main(String args[]){
        //Scanner scanner = new Scanner(System.in);

        boolean exit=false;
        int option;


        do{
            System.out.println("Enter A choice :-");
            System.out.println("1 for display all book");
            System.out.println("2 for Add new book");
            System.out.println("3 for Dispaly book by genre");
            System.out.println("4 exit");

            option = inputProvider.nextIntInRange(1,4);

            switch (option){
                case 1:
                    displayAllBook(booklist);
                    break;
                case 2:
                    //booklist.add(addNewBook());
                    Book b = addNewBook();
                    booklist.add(b);
                    break;
                case 3:
                    System.out.println("Enter the genre of the book:-");
                    String genre = inputProvider.next();
                    displayAllBook(getBookByGenre(genre));
                    break;
                case 4:
                    exit=true;
                    break;
            }

        }while (!exit);

        System.out.println("Bye Bye!!!");
    }

    public static Book addNewBook(){

        System.out.println("enter name of the book");
        String bookName = inputProvider.next();
        System.out.println("enter name of the author");
        String author = inputProvider.next();
        System.out.println("enter ISBN number of the book");
        int isbnNo = inputProvider.nextInt();
        System.out.println("enter price of the book");
        double price = inputProvider.nextDouble();
        System.out.println("enter publication of the book");
        String publication = inputProvider.next();
        System.out.println("enter genre of the book");
        String genre = inputProvider.next();

        Book book = new Book();
        book.setAuthor(author);
        book.setName(bookName);
        book.setGenre(genre);
        book.setPrice(price);
        book.setPublication(publication);
        book.setIsbnNo(isbnNo);

        //Book book = new Book(bookName,author,isbnNo,price,publication,genre);
        return book;
    }

    public static void displayAllBook(ArrayList<Book> book){
        for(Book b:book){
            System.out.println("\n\n\nthe name of the book is "+b.getName());
            System.out.println("the Author of the book is "+b.getAuthor());
            System.out.println("the IsbnNo of the book is "+b.getIsbnNo());
            System.out.println("the price of the book is "+b.getPrice());
            System.out.println("the publication of the book is "+b.getPublication());
            System.out.println("the genre of the book is "+b.getGenre());
        }

    }

    public static ArrayList<Book> getBookByGenre(String genre){
        ArrayList<Book> book = new ArrayList<>();
        for(Book b: booklist){
            if(genre.equalsIgnoreCase(b.getGenre()))
                book.add(b);
        }
        return  book;
    }
}

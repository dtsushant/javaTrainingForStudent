package javaobjects;


import javaobjects.fantasy.Book;

public class ObjectMain {
    public static void main(String args){
        Book book = new Book();
        book.name = "Lord of the Rings";
        book.author = "JRR Tolkien";
        book.pages = 2000;
        book.genre = "fantasy";
        book.price = 1500.00;


        Book book1 = createBook("ASOIAF","GRR Martin","fantasy",5000,4000.00);


    }

    public static Book createBook(String name,String author,String genre, Integer pages, Double price){
        Book book = new Book();
        book.name=name;
        book.author = author;
        book.genre= genre;
        book.pages = pages;
        book.price= price;
        return book;
    }
}

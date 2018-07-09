package model;

public class Book {
    private String name;
    private String author;
    private int     isbnNo;
    private double  price;
    private String  publication;
    private String  genre;

    public Book(){

    }

    public Book(String name, String author, int isbnNo, double price, String publication, String genre) {
        this.name = name;
        this.author = author;
        this.isbnNo = isbnNo;
        this.price = price;
        this.publication = publication;
        this.genre = genre;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(int isbnNo) {
        this.isbnNo = isbnNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }




}

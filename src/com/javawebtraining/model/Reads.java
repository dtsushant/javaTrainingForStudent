package com.javawebtraining.model;

public class Reads {
    private Integer id;
    private String name;
    private String author;
    private int     isbnNo;
    private double  price;
    private String  publication;
    private String  genre;

    public Reads(){

    }

    public Reads(String name, String author, int isbnNo, double price, String publication, String genre) {
        this.name = name;
        this.author = author;
        this.isbnNo = isbnNo;
        this.price = price;
        this.publication = publication;
        this.genre = genre;
    }

    public Reads(Integer id, String name, String author, int isbnNo, double price, String publication, String genre) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isbnNo = isbnNo;
        this.price = price;
        this.publication = publication;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

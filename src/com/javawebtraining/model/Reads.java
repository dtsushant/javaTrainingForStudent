package com.javawebtraining.model;

import com.javawebtraining.dbconnection.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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



    public static  ArrayList<Reads> findAll(){
        ArrayList<Reads> booklist = new ArrayList<>();
        Connection con= null;

        try{
            con = Connector.getConnection();
            String sql = "select * from book";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String author = rs.getString("author");
                String genre = rs.getString("genre");
                String publication = rs.getString("publication");
                Double price = rs.getDouble("price");
                int isbnNo = rs.getInt("isbn_no");

                Reads b = new Reads(id,name,author,isbnNo,price,publication,genre);
                booklist.add(b);


            }
            con.close();


        }catch (Exception e){
            System.out.println(e.toString());
        }

        return booklist;

    }

    public boolean save(){
        boolean saveStatus = false;
        Connection con = null;
        try{
            con = Connector.getConnection();
            PreparedStatement stmt = con.prepareStatement("insert into book(name,author,price,isbn_no,publication,genre) values(?,?,?,?,?,?)");

            stmt.setString(1,this.getName());
            stmt.setString(2,this.getAuthor());
            stmt.setDouble(3,this.getPrice());
            stmt.setInt(4,this.getIsbnNo());
            stmt.setString(5,this.getPublication());
            stmt.setString(6,this.getGenre());

            stmt.execute();
            saveStatus = true;
        }catch (Exception ex){
            System.out.println("ex = " + ex);
        }
        return saveStatus;
    }


}

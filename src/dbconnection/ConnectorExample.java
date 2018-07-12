package dbconnection;

import exceptionhandling.input.InputProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectorExample {

    static InputProvider inputProvider = new InputProvider();

    public static void main(String args[]){
        //insertBooks();
        insertBooksPreparedStatement();
        printBooks();
    }

    public static void printBooks(){
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
                int isbnNo = rs.getInt("isbn_no");

                System.out.println();
                System.out.println();
                System.out.println(id);
                System.out.println(author);
                System.out.println(name);
                System.out.println(genre);
                System.out.println(isbnNo);
            }
            con.close();


        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

    public static void insertBooks(){
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

        Connection con = null;
        try{
            con = Connector.getConnection();
            Statement stmt = con.createStatement();
            String sql = String.format("insert into book(name,author,price,isbn_no,publication,genre) values('%s','%s',%f,%d,'%s','%s')",bookName,author,price,isbnNo,publication,genre);
            System.out.println("the sql = "+sql);

            stmt.execute(sql);
        }catch (Exception ex){
            System.out.println("the error"+ex.toString());
        }
    }

    public static void insertBooksPreparedStatement(){
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

        Connection con = null;
        try{
            con = Connector.getConnection();
            PreparedStatement stmt = con.prepareStatement("insert into book(name,author,price,isbn_no,publication,genre) values(?,?,?,?,?,?)");

            stmt.setString(1,bookName);
            stmt.setString(2,author);
            stmt.setDouble(3,price);
            stmt.setInt(4,isbnNo);
            stmt.setString(5,publication);
            stmt.setString(6,genre);

            stmt.execute();
            //String sql = String.format("insert into book(name,author,price,isbn_no,publication,genre) values('%s','%s',%f,%d,'%s','%s')",bookName,author,price,isbnNo,publication,genre);

        }catch (Exception ex){
            System.out.println("the error"+ex.toString());
        }
    }
}

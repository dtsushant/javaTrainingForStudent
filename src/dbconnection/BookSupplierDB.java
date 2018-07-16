package dbconnection;

import exceptionhandling.input.InputProvider;
import model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BookSupplierDB {

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
            System.out.println("4 for Update book");
            System.out.println("5 for Delete book");
            System.out.println("6 Exit");

            option = inputProvider.nextIntInRange(1,6);

            switch (option){
                case 1:
                    displayAllBook(booklist);
                    break;
                case 2:
                    //booklist.add(addNewBook());
                    addNewBook();
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

    public static void addNewBook(){

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

        Connection con = null;
        try{
            con = Connector.getConnection();
            PreparedStatement stmt = con.prepareStatement("insert into book(name,author,price,isbn_no,publication,genre) values(?,?,?,?,?,?)");

            stmt.setString(1,book.getName());
            stmt.setString(2,book.getAuthor());
            stmt.setDouble(3,book.getPrice());
            stmt.setInt(4,book.getIsbnNo());
            stmt.setString(5,book.getPublication());
            stmt.setString(6,book.getGenre());

            stmt.execute();
            //String sql = String.format("insert into book(name,author,price,isbn_no,publication,genre) values('%s','%s',%f,%d,'%s','%s')",bookName,author,price,isbnNo,publication,genre);

        }catch (Exception ex){
            System.out.println("the error"+ex.toString());
        }


    }

    public static void displayAllBook(ArrayList<Book> book){
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

                Book b = new Book(id,name,author,isbnNo,price,publication,genre);
                booklist.add(b);


            }
            con.close();


        }catch (Exception e){
            System.out.println(e.toString());
        }

        for(Book b:book){
            System.out.println("\n\n\nthe id of the book is "+b.getId());
            System.out.println("the name of the book is "+b.getName());
            System.out.println("the Author of the book is "+b.getAuthor());
            System.out.println("the IsbnNo of the book is "+b.getIsbnNo());
            System.out.println("the price of the book is "+b.getPrice());
            System.out.println("the publication of the book is "+b.getPublication());
            System.out.println("the genre of the book is "+b.getGenre());
        }

    }

    public static ArrayList<Book> getBookByGenre(String g){
        ArrayList<Book> book = new ArrayList<>();

        Connection con = null;
        try{
            con = Connector.getConnection();
            String sql = "select * from book where genre like ? ";
           // String sql = "select * from book where genre =? ";

            PreparedStatement statement = con.prepareStatement(sql);
            g ="%"+g+"%";
            statement.setString(1,g);
            ResultSet rs = statement.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String author = rs.getString("author");
                String genre = rs.getString("genre");
                String publication = rs.getString("publication");
                Double price = rs.getDouble("price");
                int isbnNo = rs.getInt("isbn_no");

                Book b = new Book(id,name,author,isbnNo,price,publication,genre);
                book.add(b);


            }
            con.close();


        }catch (Exception e){
            System.out.println(e.toString());
        }


        return  book;
    }
}

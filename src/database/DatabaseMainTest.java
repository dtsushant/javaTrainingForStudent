package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseMainTest {

    public static void main(String args[]){

        insertIntoTest();
//        selectFromTest();
    }

//    public static void insertIntoTest(){
//        Connection con = null;
//
//        try{
//            con = Connector.getConnection();
//            Statement stmt = con.createStatement();
//            String sql = "Insert into test(name,value) values ('fromjava',100);";
//            stmt.execute(sql);
//
//
//        }catch (Exception ex){
//            System.out.println(ex.toString());
//        }
//    }

    public static void insertIntoTest(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter some integer value:");
        String someThing = scan.nextLine();

        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            conn= Connector.getConnection();
            String sql = "Insert into test(name,value) values ('javaclassss',?);";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1 , someThing);
            stmt.execute();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
    }


    public static void selectFromTest(){
        Connection con = null;

        try{
            con = Connector.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from test;";
            ResultSet rs =stmt.executeQuery(sql);

            System.out.println("printing all data ");
            while (rs.next()){
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("value"));
                System.out.println("\n\n");
            }


        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }

}

package com.javawebtraining;

import com.javawebtraining.dbconnection.Connector;
import com.javawebtraining.model.Reads;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@WebServlet(name = "BookDbJSTLServlet",urlPatterns = "/bookJstl")
public class BookDbJSTLServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/reads_jstl.jsp");

        req.setAttribute("readlist",getReads());
        req.setAttribute("example","this is an example");

        rd.forward(req,res);

    }


    private ArrayList<Reads> getReads(){
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

}

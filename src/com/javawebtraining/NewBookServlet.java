package com.javawebtraining;

import com.javawebtraining.model.Reads;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NewBookServlet",urlPatterns ="/new")
public class NewBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String genre = request.getParameter("genre");
        String author = request.getParameter("author");
        String publication = request.getParameter("publication");
        Double price = Double.parseDouble(request.getParameter("price"));
        Integer isbnNo = Integer.parseInt(request.getParameter("isbn"));

        Reads read = new Reads(name,author,isbnNo,price,publication,genre);
        if(read.save())
            response.sendRedirect("/readlist");
        else
            response.sendRedirect("/new");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am at get");
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/main.jsp");
        request.setAttribute("title","Add New | Book Library");
        request.setAttribute("pageName","newBook");

        rd.forward(request,response);
    }
}

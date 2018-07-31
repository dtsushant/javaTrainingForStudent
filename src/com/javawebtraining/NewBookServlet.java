package com.javawebtraining;

import com.javawebtraining.model.Reads;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NewBookServlet",urlPatterns ={"/new","/edit"})
public class NewBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String genre = request.getParameter("genre");
        String author = request.getParameter("author");
        String publication = request.getParameter("publication");
        Double price = Double.parseDouble(request.getParameter("price"));
        Integer isbnNo = Integer.parseInt(request.getParameter("isbn"));


        String requestUri = request.getRequestURI();
        Reads read = null;
        boolean status = false;
        if(requestUri.equals("/new")) {
            read = new Reads(name, author, isbnNo, price, publication, genre);
            status = read.save();
        }else if(requestUri.equals("/edit")){
            Integer id = Integer.parseInt(request.getParameter("id"));
            read = new Reads(id,name, author, isbnNo, price, publication, genre);
            status = read.modify();

        }




        if(status)
            response.sendRedirect("/readlist");
        else
            response.sendRedirect("/new");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("now adding new book");
        String requestUri = request.getRequestURI();

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/main.jsp");

        if(requestUri.equals("/new")) {
            request.setAttribute("title", "Add New | Book Library");
            request.setAttribute("pageName", "newBook");
        }else if(requestUri.equals("/edit")){

            Integer id = Integer.parseInt(request.getParameter("id"));

            Reads r = Reads.get(id);

            request.setAttribute("Title","Edit "+r.getName()+"| Book Library");
            request.setAttribute("book",r);
            request.setAttribute("pageName", "editBook");
        }

        rd.forward(request,response);
    }
}

package com.javawebtraining;

import com.javawebtraining.model.Reads;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HomeServlet",urlPatterns = {"/","/home"})
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Now in home");
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/main.jsp");
        request.setAttribute("title","Home | Book Library");
        request.setAttribute("pageName","home");

        rd.forward(request,response);

    }
}

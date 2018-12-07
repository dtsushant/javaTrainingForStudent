package com.webtraining.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PetsServlet",urlPatterns = {"/pets/add","/pets","/pets/list"})
public class PetsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getRequestURI());
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/main.jsp");

        if(request.getRequestURI().equalsIgnoreCase("/pets")  || request.getRequestURI().equalsIgnoreCase("/pets/list")) {
            request.setAttribute("pageName", "pets");
        }else if(request.getRequestURI().equalsIgnoreCase("/pets/add")) {
            request.setAttribute("pageName", "addPets");
        }
        rd.forward(request,response);
    }
}

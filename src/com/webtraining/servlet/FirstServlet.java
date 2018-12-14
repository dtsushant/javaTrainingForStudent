package com.webtraining.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", urlPatterns = "/first")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("firstpage");
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> hi this is my first page </h1>");
        out.println("<h1> ");
        out.println(request.getParameter("age"));
        out.println(request.getParameter("name"));
        out.println(request.getParameter("id"));
        out.println("</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}

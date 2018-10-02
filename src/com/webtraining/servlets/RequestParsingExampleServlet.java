package com.webtraining.servlets;

import com.webtraining.servlets.com.webtraining.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "RequestParsingExampleServlet" ,urlPatterns = "/reqParse")
public class RequestParsingExampleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println(request.getParameter("name"));
        out.println(request.getParameter("id"));

        out.println(request.getParameter("age"));

        out.println(request.getParameter("gender"));
        out.println("Hi this is post");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pageToOpen = "parse1";

        ArrayList<Student> std = null;

        if(request.getParameter("openPage")!=null){
            pageToOpen= request.getParameter("openPage");
        }

        if(request.getParameter("db")!= null && request.getParameter("db").equalsIgnoreCase("1")){
            std = Student.findAll();
        }else
            std = Student.getStudentList();

        request.setAttribute("stdList",std);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/pages/"+pageToOpen+".jsp");
        requestDispatcher.forward(request,response);
    }
}

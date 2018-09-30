package com.webtraining.servlets;

import com.webtraining.servlets.com.webtraining.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "JSTLUsageServlet",urlPatterns = "/jstlData")
public class JSTLUsageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher reqdispatch = request.getRequestDispatcher("/WEB-INF/pages/jstlStdData.jsp");
        request.setAttribute("variable1","THis is a string data sent from servlet");
        request.setAttribute("variable2",1);
        request.setAttribute("studentData",Student.getStudentList());
        reqdispatch.forward(request,response);
    }
}

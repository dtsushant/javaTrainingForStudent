package com.webtraining.servlets;

import com.webtraining.servlets.com.webtraining.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentServlet",urlPatterns = {"/student","/addStudent"})
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getRequestURI().equals("/addStudent")){
            String fullname = request.getParameter("fullname");
            Integer grade = Integer.parseInt(request.getParameter("grade"));
            Integer age = Integer.parseInt(request.getParameter("age"));
            String gender = request.getParameter("gender");

            Student std = new Student();
            std.setAge(age);
            std.setFullName(fullname);
            std.setGender(gender);
            std.setGrade(grade);
            std.save();

            response.sendRedirect("/student");

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/main.jsp");
        if(request.getRequestURI().equals("/student")) {
            request.setAttribute("page", "studentList");
            request.setAttribute("stdList", Student.findAll());
        }else if(request.getRequestURI().equals("/addStudent")){
            request.setAttribute("page", "addStudent");
        }
        rd.forward(request,response);
    }
}

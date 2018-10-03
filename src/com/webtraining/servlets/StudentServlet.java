package com.webtraining.servlets;

import com.webtraining.servlets.com.webtraining.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentServlet",urlPatterns = {"/student","/addStudent","/editStudent","/deleteStudent"})
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullname = request.getParameter("fullname");
        Integer grade = Integer.parseInt(request.getParameter("grade"));
        Integer age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");

        if(request.getRequestURI().equals("/addStudent")){
            Student std = new Student();
            std.setAge(age);
            std.setFullName(fullname);
            std.setGender(gender);
            std.setGrade(grade);
            std.save();

        }else if(request.getRequestURI().equals("/editStudent")){
            int id = Integer.parseInt(request.getParameter("id"));
            Student std = new Student(id,grade,fullname,age,gender);
            std.update();
        }

        response.sendRedirect("/student");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/main.jsp");
        if(request.getRequestURI().equals("/student")) {
            request.setAttribute("page", "studentList");
            request.setAttribute("stdList", Student.findAll());
            rd.forward(request,response);

        }else if(request.getRequestURI().equals("/addStudent")){
            request.setAttribute("page", "addStudent");
            rd.forward(request,response);

        }else if(request.getRequestURI().equals("/editStudent")){
            Integer id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("studentData",Student.findById(id));
            request.setAttribute("page","editStudent");
            rd.forward(request,response);

        }else if(request.getRequestURI().equals("/deleteStudent")){
            Integer id = Integer.parseInt(request.getParameter("id"));
            Student std =  Student.findById(id);
            std.delete();
            response.sendRedirect("/student");
        }
    }
}

package com.webtraining.servlets;

import com.webtraining.servlets.com.webtraining.model.Result;
import com.webtraining.servlets.com.webtraining.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ResultServlet",urlPatterns = {"/result","/addResult"})
public class ResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("studentId") !=null){
            int id = Integer.parseInt(request.getParameter("studentId"));
            Student std = Student.findById(id);
            if(std!=null){
                String examName = request.getParameter("examName");
                double math = Double.parseDouble(request.getParameter("math"));
                System.out.println(request.getParameter("science"));
                double science = Double.parseDouble(request.getParameter("science"));
                double nepali = Double.parseDouble(request.getParameter("nepali"));
                double english = Double.parseDouble(request.getParameter("english"));
                double socialStudies = Double.parseDouble(request.getParameter("socialStudies"));

                Result r = new Result(examName,std,math,science,english,socialStudies,nepali);
                if(request.getRequestURI().equals("/addResult")){
                    r.save();
                }

                response.sendRedirect("/result?studentId="+std.getId());


            }else {
                response.sendRedirect("/student");
            }

        }else {
            response.sendRedirect("/student");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("studentId") !=null){
            int id = Integer.parseInt(request.getParameter("studentId"));
            Student std = Student.findById(id);

            if(std!=null){
                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/main.jsp");
                request.setAttribute("student",std);

                if(request.getRequestURI().equals("/result")) {
                    request.setAttribute("resultData", Result.findAllByStudent(std));
                    request.setAttribute("page", "result");
                }else if(request.getRequestURI().equals("/addResult")){
                    System.out.println("hello hello ");
                    request.setAttribute("page", "addResult");
                }


                rd.forward(request,response);

            }else {
                response.sendRedirect("/student");
            }

        }else {
            response.sendRedirect("/student");
        }
    }
}

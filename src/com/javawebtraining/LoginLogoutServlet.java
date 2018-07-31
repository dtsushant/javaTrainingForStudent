package com.javawebtraining;

import com.javawebtraining.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginLogoutServlet",urlPatterns = {"/login","/logout"})
public class LoginLogoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User u = new User(username,password);
        if(u.login()){
            HttpSession session = request.getSession();
            session.setAttribute("username",u.getUsername());
            response.sendRedirect("/");
        }else{
            response.sendRedirect("/login");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getRequestURI().equals("/login")){
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/login.jsp");

            rd.forward(request,response);
        }else if(request.getRequestURI().equals("/logout")){
            HttpSession session = request.getSession();
            session.invalidate();
            response.sendRedirect("/login");
        }
    }
}

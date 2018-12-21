package com.webtraining.servlet;


import com.webtraining.model.User;
import com.webtraining.util.FlashMessage;

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
        if(request.getRequestURI().equals("/login")){
            String username = request.getParameter("user");
            String password = request.getParameter("pass");

            User u = User.login(username,password);
            HttpSession session = request.getSession();
            if(u==null){
                FlashMessage.setMessage(session,"loginerror","The username or password you've entered is incorrect");
                response.sendRedirect("/login");
            }else {

                session.setAttribute("username",u.getUsername());
                session.setAttribute("fullName",u.getFullName());
                response.sendRedirect("/dashboard");
            }


        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getRequestURI().equals("/login")){
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/pages/login.jsp");

            rd.forward(request,response);
        }else if(request.getRequestURI().equals("/logout")){
            HttpSession session = request.getSession();
            session.invalidate();
            response.sendRedirect("/login");

        }

    }
}
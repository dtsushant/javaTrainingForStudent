package com.webtraining.servlet;

import com.webtraining.model.Owner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "OwnerServlet",urlPatterns = {"/owner","/owner/add"})
public class OwnerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getRequestURI().equalsIgnoreCase("/owner/add")) {
            String fullname = request.getParameter("fullname");
            String address = request.getParameter("address");
            Integer phoneNo = Integer.parseInt(request.getParameter("phoneNumber"));

            Owner o = new Owner(fullname,address,phoneNo);
            o.save();
            response.sendRedirect("/owner");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/main.jsp");

        if(request.getRequestURI().equalsIgnoreCase("/owner")  || request.getRequestURI().equalsIgnoreCase("/pets/list")) {
            request.setAttribute("pageName", "owner");
            request.setAttribute("ownerList",Owner.findAll());
        }else if(request.getRequestURI().equalsIgnoreCase("/owner/add")) {
            request.setAttribute("pageName", "addOwner");
        }
        rd.forward(request,response);
    }
}

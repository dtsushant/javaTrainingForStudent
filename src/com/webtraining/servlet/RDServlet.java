package com.webtraining.servlet;

import com.webtraining.model.Pets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RDServlet",urlPatterns = "/rd")
public class RDServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/requestDispatchExapmpe.jsp");

        Double d = 7.0 +9.45;
        request.setAttribute("somevalue","this value is set from servlet");
        request.setAttribute("doubleValue",d);

        request.setAttribute("pets",new Pets("Billi","Cat",8,"Black and White",true,7.0));
        rd.forward(request,response);
    }
}

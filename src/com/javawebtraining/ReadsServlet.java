package com.javawebtraining;

import com.javawebtraining.model.Reads;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ReadsServlet" , urlPatterns = "/readlist")
public class ReadsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/main.jsp");
        request.setAttribute("title","Book List | Book Library");
        request.setAttribute("pageName","readlist");
        request.setAttribute("booklist",Reads.findAll());
        System.out.println(Reads.findAll().size());

        rd.forward(request,response);
    }
}

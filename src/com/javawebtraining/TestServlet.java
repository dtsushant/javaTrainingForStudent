package com.javawebtraining;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TestServlet",urlPatterns = {"/th","/thi"})
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("page rendered from servlet");
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>");
        out.println("Hello this is a page rendered from servlet");
        out.println("<br/>from url:-"+request.getRequestURI());
        out.println("</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}

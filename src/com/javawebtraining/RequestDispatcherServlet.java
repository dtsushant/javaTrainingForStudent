package com.javawebtraining;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

@WebServlet(name = "RequestDispatcherServlet",urlPatterns = "/dispatch")
public class RequestDispatcherServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/dispatch.jsp");

        ArrayList<HashMap<String,String>> ahm = new ArrayList<>();

        HashMap<String,String> h1 = new HashMap<>();
        h1.put("name","Sirish ko phul");
        h1.put("author","Parijat");
        h1.put("genre","Romance");
        h1.put("price","90");
        ahm.add(h1);

        HashMap<String,String> h2 = new HashMap<>();
        h2.put("name","Doshi Chasma");
        h2.put("author","BP Koirala");
        h2.put("genre","Nibandha");
        h2.put("price","90");
        ahm.add(h2);


        HashMap<String,String> h3 = new HashMap<>();
        h3.put("name","Basai");
        h3.put("author","GP Mainali");
        h3.put("genre","Romance");
        h3.put("price","90");
        ahm.add(h3);
        ahm.add(h3);


        request.setAttribute("prop1","something from servlet");
        request.setAttribute("bookMap",ahm);
        rd.forward(request,response);

    }
}

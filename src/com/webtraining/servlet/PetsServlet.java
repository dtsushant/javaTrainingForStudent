package com.webtraining.servlet;

import com.webtraining.model.Owner;
import com.webtraining.model.Pets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PetsServlet",urlPatterns = {"/pets/add","/pets","/pets/list"})
public class PetsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getRequestURI().equalsIgnoreCase("/pets/add")) {
            String name = request.getParameter("name");
            String color = request.getParameter("color");
            String type = request.getParameter("type");
            Integer age = Integer.parseInt(request.getParameter("age"));
            Double weight = Double.parseDouble(request.getParameter("weight"));
            Boolean isVaccinated= request.getParameter("isVaccinated").equals("1");
            Owner o = Owner.get(Integer.parseInt(request.getParameter("owner")));

            Pets p = new Pets(name,type,age,color, isVaccinated,weight,o);


            p.save();
            response.sendRedirect("/pets");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getRequestURI());
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/main.jsp");

        if(request.getRequestURI().equalsIgnoreCase("/pets")  || request.getRequestURI().equalsIgnoreCase("/pets/list")) {
            request.setAttribute("pageName", "pets");
            if(request.getParameter("ownerId")!=null){
                request.setAttribute("petList",Pets.findAllByOwnerId(Integer.parseInt(request.getParameter("ownerId"))));
            }else
                request.setAttribute("petList",Pets.findAll());
        }else if(request.getRequestURI().equalsIgnoreCase("/pets/add")) {
            request.setAttribute("ownerList",Owner.findAll());
            request.setAttribute("pageName", "addPets");
        }
        rd.forward(request,response);
    }
}

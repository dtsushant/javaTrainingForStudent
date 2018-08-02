package com.javawebtraining.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebFilter(filterName = "SessionFilter" ,urlPatterns = "/*")
public class SessionFilter implements Filter {

    static ArrayList<String> loginNotRequired= null;

    static{
        loginNotRequired= new ArrayList<>();
        loginNotRequired.add("/login");
        loginNotRequired.add("/logout");
        loginNotRequired.add("/th");
        loginNotRequired.add("/custom.jsp");

    }

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        String requesturi = ((HttpServletRequest) req).getRequestURI();

        if(loginNotRequired.contains(requesturi))
            chain.doFilter(req,resp);
        else {
            HttpSession session = ((HttpServletRequest) req).getSession();
            if(session.getAttribute("username") == null)
                ((HttpServletResponse) resp).sendRedirect("/login");
            else
                chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

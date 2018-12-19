package com.webtraining.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebFilter(filterName = "SessionFilter",urlPatterns = "/*")
public class SessionFilter implements Filter {

    String[] dontNeedLogin = {"/login","/logout","/","/css/*"};

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        String url = request.getRequestURI();
        System.out.println("the url +"+url);
        if (!inArray(url)) {
            if(session.getAttribute("username")!=null) {
                chain.doFilter(req, resp);
            }else {
                response.sendRedirect("/login");
            }
        }else {
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

    private boolean inArray(String url){
        boolean bool = false;
        for(String s : dontNeedLogin){
            if(url.equals(s)){
                bool=true;
                break;
            }
        }
        return bool;
    }

}

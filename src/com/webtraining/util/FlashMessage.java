package com.webtraining.util;

import javax.servlet.http.HttpSession;

public class FlashMessage {

    public static void setMessage(HttpSession session,String title, String message){
        session.setAttribute(title,message);

    }

    public static String getMessage(HttpSession session, String title){
        String message = (String) session.getAttribute(title);
        session.removeAttribute(title);
        return message;
    }
}

package com.webtraining.taglibs;

import com.webtraining.util.FlashMessage;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class FlashMessageTaglib extends SimpleTagSupport {

    String title;
    String type;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type){
        this.type=type;
    }

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        PageContext ctx = (PageContext)getJspContext();
        HttpSession session = ctx.getSession();
        String message = FlashMessage.getMessage(session,title);
        if(type==null)
            type="info";



        if(message!=null) {
            String finalMsg = String.format("<span class='%s'>%s</span>",type,message);
            getJspContext().getOut().println(finalMsg);
        }

    }
}

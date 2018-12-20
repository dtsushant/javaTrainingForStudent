package com.webtraining.taglibs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class BodyWala extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();

        StringWriter sw = new StringWriter();
        getJspBody().invoke(sw);

        String value[] = sw.toString().split(" ");

        for(String s : value){
            if(s.equalsIgnoreCase("error")){
                out.print("<span style='color:red;'> "+s+"</span>");
            }else
                out.print(" "+s);
        }



    }
}

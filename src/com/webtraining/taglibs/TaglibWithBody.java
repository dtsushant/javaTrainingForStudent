package com.webtraining.taglibs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class TaglibWithBody extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();

        StringWriter sw = new StringWriter();
        getJspBody().invoke(sw);

        out.println("<div style='background:red; color:white; width:300px; font-size:15px;'>");
        out.println(sw.toString());
        out.println("</div>");


    }
}


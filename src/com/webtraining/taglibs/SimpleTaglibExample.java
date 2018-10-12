package com.webtraining.taglibs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class SimpleTaglibExample extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out  = getJspContext().getOut();

        out.println("<b>hello hello this here is a simple output from taglib<b/>");
    }
}

package com.javawebtraining.taglibs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class BodyTaglib extends SimpleTagSupport {

    /*
        <db:withbody>
            this is conetent frmo the body
        </db:withbody>
     */
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
       // StringBuilder db = new StringBuilder();
        StringWriter sw = new StringWriter();
        getJspBody().invoke(sw);

        String s = "this content is appended from tablib";

        s+= sw.toString();

        JspWriter out = getJspContext().getOut();

        out.print(s);



    }
}

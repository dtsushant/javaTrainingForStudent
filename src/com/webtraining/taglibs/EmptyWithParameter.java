package com.webtraining.taglibs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class EmptyWithParameter extends SimpleTagSupport {

    Integer multiply;
    Boolean goUpto20 = false;

    public void setMultiply(Integer multiply){
        this.multiply = multiply;
    }

    public void setGoUpto20(Boolean goUpto20){
        this.goUpto20 = goUpto20;
    }

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        int limit = goUpto20?20:10;
        out.print("showing multiplication table of "+multiply+"<br/>");
        for(int i =0; i<=limit;i++){
            String write = String.format(" %d * %d = %d <br/>",multiply,i,multiply*i);
            out.print(write);
        }
    }


}

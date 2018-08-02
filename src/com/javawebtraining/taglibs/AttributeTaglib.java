package com.javawebtraining.taglibs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class AttributeTaglib extends SimpleTagSupport {

    String name;

    Integer iteration;

    public void setIteration(Integer iteration){
        this.iteration = iteration;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        String output = "";
        int iteration = (this.iteration!=null)?this.iteration:5;
        for(int i = 0; i <iteration;i++){
            output +="<b>"+name+"</b><br/>";
        }

        getJspContext().getOut().print(output);

    }
}

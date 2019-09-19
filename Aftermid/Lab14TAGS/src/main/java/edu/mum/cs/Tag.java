package edu.mum.cs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class Tag extends SimpleTagSupport {
    String thecolor;
    String words;

    public void doTag() throws IOException, JspException {
        JspWriter out = getJspContext().getOut();

        if(thecolor != null){
            out.write(String.format("<p style='color: %s'>%s</p>", thecolor, words));
        }else{
            out.write(String.format("<p>%s</p>", words));
        }
    }

    public void setThecolor(String thecolor) {
        this.thecolor = thecolor;
    }

    public void setWords(String words) {
        this.words = words;
    }
}

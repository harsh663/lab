/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

/**
 *
 * @author harsh
 */
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class HeaderHandler extends TagSupport {

    private String align;
    private int border;
    private String bgcolor;
    private String color;
    private String font;
    private String size;

    public HeaderHandler() {
        super();
    }

    public int doStartTag() throws JspException {
        String ss = "<TABLE BGCOLOR=\"" + bgcolor + "\" BORDER=\"" + border +"\"ALIGN =\""+align + "\">";
        ss += "<TR >" + "<TD>";
        ss += "<FONT FACE=\"" + font + "\" COLOR=\"" + color +"\"SIZE =\""+size + "\">";
        
        try {
            pageContext.getOut().write(ss);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return EVAL_BODY_INCLUDE;
    }

    public int doEndTag() throws JspException {
        String es = "</FONT>" + "</TD>" + "</TR>" + "</TABLE>";
        try {
            pageContext.getOut().write(es);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return EVAL_PAGE;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public void setBorder(int border) {
        this.border = border;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

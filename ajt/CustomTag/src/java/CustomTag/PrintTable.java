/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTag;

import java.io.PrintWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author harsh
 */
public class PrintTable extends TagSupport {
    
    int num;
    String color;

    public void setColor(String color) {
        this.color = color;
    }
    

    public void setNum(int num) {
        this.num = num;
    }
    
    @Override
    public int doStartTag()throws JspException{
      
        
        try{
            
            JspWriter out = pageContext.getOut();
            out.println("<br>");
            out.println("<div style='color: "+color+"'>");
            for(int i=0; i<10; i++ ){
               
                out.println((num*i)+"<br>");
            }
            out.println("</div>");

            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OptionallyIncTag;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import javax.servlet.*;

/**
 *
 * @author harsh
 */
public class DebugTag extends TagSupport {

    public int doStartTag() {
        ServletRequest request = pageContext.getRequest();
        String debugFlag = request.getParameter("debug");
        if ((debugFlag != null)
                && (debugFlag.equals("true"))) {
            return (EVAL_BODY_INCLUDE);
        } else {
            return (SKIP_BODY);
        }
    }
}

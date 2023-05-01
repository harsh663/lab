
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/tagLib" prefix="t"%>
<!DOCTYPE html>
<html>

    <body>
        <t:mylib></t:mylib>
        
        <t:Table num="10" color="red"></t:Table>
        <%--<t:Table num="11" color="blue"></t:Table>--%>

            <H1>Using the Debug Tag</H1>
            Top of regular page. Blah, blah, blah. Yadda, yadda, yadda.
            <P><t:debug>
                <B>Debug:</B>
            <UL>
                <LI>Current time: <%= new java.util.Date()%>
                <LI>Requesting hostname: <%= request.getRemoteHost()%>
                <LI>Session ID: <%= session.getId()%>
            </UL>
        </t:debug>
        <P>
            Bottom of regular page. Blah, blah, blah. Yadda, yadda, yadda.

            <t:header align="center" bgcolor="yellow" border="2" color="red" font="Arial" size="20">
                Chapter 7 : Custom Tag Development
            </t:header>
                
    </body>
</html>

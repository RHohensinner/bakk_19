<%-- 
    Document   : stat
    Created on : 09.04.2019, 00:11:07
    Author     : Richard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SearchObj JSP</title>
    </head>
    <body>
    

    <%-- start web service invocation --%><hr/>
    <%
    try {
	org.me.ikarus.CoreWS_Service service = new org.me.ikarus.CoreWS_Service();
	org.me.ikarus.CoreWS port = service.getCoreWSPort();
	// TODO process result here
	String result = port.stat();
        
	out.println("Result: \n" + result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
    <br><br>
    <input type="button" onclick="location.href='index.jsp';" value="Main Menue" />

    </body>
</html>

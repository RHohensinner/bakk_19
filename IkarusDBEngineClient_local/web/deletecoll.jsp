<%-- 
    Document   : newjsp
    Created on : 14.03.2019, 15:30:34
    Author     : Richard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DeleteColl JSP</title>
    </head>
    <body>
    
    <%-- start web service invocation --%><hr/>
    <%
    try {
        String sid = request.getParameter("sid");
        String name = request.getParameter("name");
        
	org.me.ikarus.CoreWS_Service service = new org.me.ikarus.CoreWS_Service();
	org.me.ikarus.CoreWS port = service.getCoreWSPort();
	 // TODO initialize WS operation arguments here
	String ssid = sid;
        String nname = name;
        
	// TODO process result here
	java.lang.String result = port.deletecoll(ssid, nname);
        
	out.println("Result: "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>

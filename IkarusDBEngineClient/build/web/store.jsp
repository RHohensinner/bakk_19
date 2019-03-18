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
        <title>Store Page</title>
    </head>
    <body>
    

    <%-- start web service invocation --%><hr/>
    <%
    try {
        String json_name = request.getParameter("json_name");
        String json_content = request.getParameter("json_content");
        
	org.me.ikarus.CoreWS_Service service = new org.me.ikarus.CoreWS_Service();
	org.me.ikarus.CoreWS port = service.getCoreWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = json_name;
	java.lang.String content = json_content;
	// TODO process result here
	int result = port.store(name, content);
        out.println(name + content);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
    </body>
</html>

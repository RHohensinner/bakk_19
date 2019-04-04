<%-- 
    Document   : newjsp
    Created on : 14.03.2019, 15:30:34
    Author     : Richard
--%>

<%@page import="java.io.FileReader"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Store JSP</title>
    </head>
    <body>
    

    <%-- start web service invocation --%><hr/>
    <%
    try {
        String json_content = request.getParameter("json_content");
        
        //String json_name = request.getParameter("json_name");
        //Object obj = new JSONParser().parse(new FileReader("C:\Users\Richard\Documents\NetBeansProjects\IkarusDBEngineClient\data\" + json_name);
        
	org.me.ikarus.CoreWS_Service service = new org.me.ikarus.CoreWS_Service();
	org.me.ikarus.CoreWS port = service.getCoreWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String content = json_content;
	// TODO process result here
	String result = port.store(content);
        //out.println(content);
	out.println("Result: " + result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
    </body>
</html>

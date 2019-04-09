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
        <title>InsertColl JSP</title>
    </head>
    <body>
    
    <%-- start web service invocation --%><hr/>
    <%
    try {
        String sid = request.getParameter("sid");
        String id = request.getParameter("id");
        
	org.me.ikarus.CoreWS_Service service = new org.me.ikarus.CoreWS_Service();
	org.me.ikarus.CoreWS port = service.getCoreWSPort();
	 // TODO initialize WS operation arguments here
	String ssid = sid;
        String iid = id;
        
	// TODO process result here
	java.lang.String result = port.insertcoll(ssid, iid);
        
	out.println("Result: "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
    <br><br>
    
    <input type="button" onclick="location.href='index.html';" value="Main Menu" />
    <button onclick="goBack()">Back</button>
    <script>
        function goBack() 
        {
            window.history.back();
        }
    </script>  

    </body>
</html>

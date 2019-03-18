<%-- 
    Document   : index
    Created on : 14.03.2019, 14:13:32
    Author     : Richard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to Ikarus DBEngine!</h1>
        
        <input type="button" onclick="location.href='localhost:8080/IkarusDBEngineClient/store.html';" value="Store" />
        
         <a href="/store.html">Visit our HTML tutorial</a> 
        
        <form action="localhost:8080/get.jsp">
                <input type="submit" value="get" />
        </form>
        
        <form action="localhost:8080/delete.jsp">
                <input type="submit" value="delete" />
        </form>
        
        <form action="localhost:8080/makecoll.jsp">
                <input type="submit" value="makecoll" />
        </form>
        
        <form action="localhost:8080/deletecoll.jsp">
                <input type="submit" value="deletecoll" />
        </form>
        
        <form action="localhost:8080/insertcoll.jsp">
                <input type="submit" value="insert" />
        </form>
        
        <form action="localhost:8080/removecoll.jsp">
                <input type="submit" value="remove" />
        </form>
        
        <form action="localhost:8080/reset.jsp">
                <input type="submit" value="RESET" />
        </form>


    </body>
</html>

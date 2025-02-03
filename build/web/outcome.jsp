

<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>.
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Welcome</h1>
        
        <%
        String user = (String)request.getAttribute("user");
        String pass = (String)request.getAttribute("pass");
        String details = (String)request.getAttribute("details");
        
        
        %>
        
        <p>
            <%=pass%><br>
            <%=user%><br>
            <%=details%>

          
            
            
        </p>
        
    </body>
</html>

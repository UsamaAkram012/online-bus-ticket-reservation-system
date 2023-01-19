<%@ page language = "java" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "serviceData.Service" %>
<%
    String data=(String) request.getAttribute("data");
%>
<%
    String session_email=(String)session.getAttribute("pemail");
    if(session_email == null){
        response.sendRedirect("login.jsp");
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
     <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Provider</title>
    <link rel="stylesheet" type="text/css" href="csuccess.css">
    <link href='https://fonts.googleapis.com/css?family=Aclonica' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Allerta Stencil' rel='stylesheet'>
</head>
<body>
      <nav>
            <div class="logo">
                <img src="images/logo.png" width="200">
            </div>
    </nav>
    <h1> 
        <%=
            data
        %>
    </h1>
     <div class="container1">
        <a class="b1" href="<%= request.getContextPath()%>/provider_dashboard.jsp">Back</a>
    </div>
</body>
</html>
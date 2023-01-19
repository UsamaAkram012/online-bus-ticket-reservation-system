<%
    String session_email=(String)session.getAttribute("cemail");
    if(session_email == null){
        response.sendRedirect("login.jsp");
    }
    String name=(String)session.getAttribute("name");
%>
<%@ page language = "java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>customer Dashboard</title>
    <link rel="stylesheet" type="text/css" href="cdashboard.css">
    <link href='https://fonts.googleapis.com/css?family=Aclonica' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Allerta Stencil' rel='stylesheet'>
    <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
</head>
<body>
        <nav>
            <div class="logo">
                <img src="images/logo.png" width="200">
            </div>
        </nav>    
        <h1 class="animate__animated animate__zoomIn">Customer Service Dashbaord</h1>
        <h2 class="welcome animate__animated animate__zoomInLeft">Welcome,</h2>
        <h2 class="name animate__animated animate__zoomInRight"><%=name%></h2>
        <h5 class="animate__animated animate__slideInUp">Being lost in the right direction feels good..!</h5>
    <div class= "container1 animate__animated animate__zoomInUp">  
        <a class="b1" href="<%= request.getContextPath()%>/booking.jsp">Make Booking</a>
        <a class="b1" href="<%= request.getContextPath()%>/deletebooking.jsp">Cancel Booking</a>
    </div> 

    <div class= "container2">   
        <a class="b2" href="<%= request.getContextPath()%>/logout">Logout</a>
    </div>  
</body>
</html>

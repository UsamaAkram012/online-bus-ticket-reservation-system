<%
    String session_email=(String)session.getAttribute("cemail");
    if(session_email == null){
        response.sendRedirect("login.jsp");
    }
%>
<%@ page language = "java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Booking</title>
    <link rel="stylesheet" type="text/css" href="booking.css">
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
    <div>
        <h1 class="animate__animated animate__zoomIn">Customer Service Dashbaord</h1>
        <h5 class="animate__animated animate__slideInUp">Make Booking</h5> 
    </div>  
    <form name= "FindingBooking" action= "FindingBooking" method="post" >
        <div class= "container1 animate__animated animate__zoomInUp">
            <select class="b1" id="departureCity" name="departureCity" required="">
                <option value ="" default hidden placeholder= >Departure City</option>
                    <option value="Lahore">Lahore</option>
                        <option value="Okara">Okara</option>
                            <option value="Sahiwal">Sahiwal</option>
                                <option value="Multan">Multan</option>
                                    <option value="Karachi">Karachi</option>
                                        <option value="Faisalabad">Faisalabad</option>
                                             <option value="Gujranwala">Gujranwala</option>
            </select>
            <select class="b1" id="arrivalCity" name="arrivalCity" required="">
                <option value ="" default hidden placeholder= >Destination</option>
                    <option value="Lahore">Lahore</option>
                        <option value="Okara">Okara</option>
                            <option value="Sahiwal">Sahiwal</option>
                                <option value="Multan">Multan</option>
                                    <option value="Karachi">Karachi</option>
                                        <option value="Faisalabad">Faisalabad</option>
                                             <option value="Gujranwala">Gujranwala</option>
            </select>
        </div>
            <div class= "container2 animate__animated animate__zoomInUp">     
                <button class ="b2" type="submit">Find Now</button>
            </div>  
    </form>
    <div class= "container3">   
        <a class ="b3" href="<%= request.getContextPath()%>/customer_dashboard.jsp">Back</a>
    </div>
</body>
</html>
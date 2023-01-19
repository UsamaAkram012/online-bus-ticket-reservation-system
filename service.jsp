<%
    String session_email=(String)session.getAttribute("pemail");
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
    <title>Add Service</title>
    <link rel="stylesheet" type="text/css" href="addservice.css">
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
        <h1 class="animate__animated animate__zoomIn">Service Provider Dashbaord</h1>
        <h5 class="animate__animated animate__slideInUp">Add Service</h5> 
    </div> 
    <form name= "AddingService" action= "AddingService" method="post" >
        <div class= "container1 animate__animated animate__zoomInUp">
            <%-- <input class="b1" type="email" id="pEmail" name="pEmail" placeholder="Email Address" required=""><br> --%>
            <input class="b1" type="text" id="pName" name="pName" placeholder="Service Name" required=""><br>
            <select class="b1" id="departureCity" name="departureCity" required=""><br>
                <option value ="" default hidden placeholder= >Departure City</option>
                    <option value="Lahore">Lahore</option>
                        <option value="Okara">Okara</option>
                            <option value="Sahiwal">Sahiwal</option>
                                <option value="Multan">Multan</option>
                                    <option value="Karachi">Karachi</option>
                                        <option value="Faisalabad">Faisalabad</option>
                                             <option value="Gujranwala">Gujranwala</option>
            </select>
            <select class="b1" id="arrivalCity" name="arrivalCity" required=""><br>
                <option value ="" default hidden placeholder= >Destination</option>
                    <option value="Lahore">Lahore</option>
                        <option value="Okara">Okara</option>
                            <option value="Sahiwal">Sahiwal</option>
                                <option value="Multan">Multan</option>
                                    <option value="Karachi">Karachi</option>
                                        <option value="Faisalabad">Faisalabad</option>
                                             <option value="Gujranwala">Gujranwala</option>
             </select><br>
             <input class="b1" type="datetime-local" id="departureTime" name="departureTime" placeholder="Date/Time" required=""><br>
             <input class="b1" type="number" id="totalSeat" name="totalSeat" placeholder="Total Seats" required=""><br>
             <input class="b1" type="number" id="fare" name="fare" placeholder="Fare" required="">
        </div>
        <div class= "container2 animate__animated animate__zoomInUp">     
                <button class ="b2" type="submit">Add Service</button>
        </div> 
    </form>
    <div class= "container3">   
        <a class ="b3" href="<%= request.getContextPath()%>/provider_dashboard.jsp">Back</a>
    </div>
</body>
</html>
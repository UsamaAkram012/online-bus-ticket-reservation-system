<%@ page language = "java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>UA Travellers</title>
    <link rel="stylesheet" type="text/css" href="index.css">
    <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"
  />
</head>
<body>
    <header>
        <nav>
            <div class="logo">
                <img src="images/logo.png" width="200">
            </div>
            <div class="menu">
                <a href="#">HOME</a>
                <a href="<%= request.getContextPath()%>/aboutus.jsp">ABOUT US</a>
                <a href="AllBuses">ALL BUSES</a>
                <a href="<%= request.getContextPath()%>/register.jsp">REGISTER</a>
                <a href="<%= request.getContextPath()%>/login.jsp">LOGIN</a>
                <a href="<%= request.getContextPath()%>/contactus.jsp">CONTACT US</a>
            </div>
        </nav>

        <div class="line">
            <div class="box1"></div><br>
            <div class="box2"></div><br>
            <div class="box3"></div>
        </div>

        <div class="container">
            <div class="left animate__animated animate__lightSpeedInLeft">
                <h1>Leave Worries Behind And Enjoy Your Trip..!</h1>
                <h3>With UA Travellers</h3>
            </div>
            <div class="right animate__animated animate__lightSpeedInRight">
                <img src="images/bus.png";>
            </div>
        </div>

        <div class="icon animate__animated animate__jello">
            <img src="images/icon1.png">
            <img src="images/icon2.png">
            <img src="images/icon3.png">
            <img src="images/icon4.png">
        </div>
    </header>
</body>
</html> 
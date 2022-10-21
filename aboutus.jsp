<%@ page language = "java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="aboutus.css">
    <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"
  />
    <title>About US</title>
</head>
<body>
    <nav>
        <div class="logo">
            <img src="images/logo.png" width="200">
        </div>
        <div class="menu">
            <a href="<%= request.getContextPath()%>/index.jsp">HOME</a>
            <a href="<%= request.getContextPath()%>/aboutus.jsp">ABOUT US</a>
            <a href="AllBuses">ALL BUSES</a>
            <a href="<%= request.getContextPath()%>/register.jsp">REGISTER</a>
            <a href="<%= request.getContextPath()%>/login.jsp">LOGIN</a>
            <a href="<%= request.getContextPath()%>/contactus.jsp">CONTACT US</a>
        </div>
    </nav>
    <section class="about">
        <div class="main">
            <img class="right animate__animated animate__lightSpeedInLeft" src="images/bus1.png";>
            <div class="text animate__animated animate__flipInX">
                <h1>About Us</h1>
                <h5>UA Travellers</h5>
                <p>UA Travellers has redefined road travel to a 5 star experience in luxury, entertainment and ambience.Only 21 seats on board. Each seat is 24-inch Club Class luxe design with calf support
                Personal 19-inch entertainment console, for every seat, making your journey full of nonstop entertainment.
                With satellite TV on-the-go, you will not miss your cricket match or EPL football game or your favorite reality show
                Always stay connected with office, family and friends. The battery will not die with charging sockets provided in every seat
                Plug-in power for your tablet and laptop.
                Fresh Food will be provided on board with a wide variety of menus by Salt and Pepper, Kitchen Cuisine & Cherry Cheeks on CASH only option.</p>
                <button ><a href="<%= request.getContextPath()%>/register.jsp">Book Now</a> </button>
          </div>
       </div>
    </section>
</body>
</html>
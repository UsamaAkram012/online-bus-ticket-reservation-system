<%@ page language = "java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="contactus.css">
    <%-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"> --%>
    <title>Contact Us</title>
</head>
<body>
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
            <a href="#">CONTACT US</a>
        </div>
    </nav>
    <section class="contact">
        <div class="content">
            <h2>Contact Us</h2>
            <p>UA Travellers has redefined road travel to a 5 star experience in luxury, entertainment and ambience.</p>
        </div>
        <div class=" container">
            <div class="contactinfo">
                <div class="box">
                    <div class="icon">
                    <img src="images/address.png" width="20">
                    </div>
                    <div class="text">
                        <h3>Address</h3>
                        <p>Canal Road, Lahore <br>Punjab, Pakistan 55600</p>
                    </div>
                </div>

                <div class="box">
                    <div class="icon">
                    <img src="images/phone.png" width="25">
                    </div>
                    <div class="text">
                        <h3>Phone</h3>
                        <p>+92-302-7410175</p>
                    </div>
                </div>

                <div class="box">
                    <div class="icon">
                    <img src="images/email.png" width="35">
                    </div>
                    <div class="text">
                        <h3>Email</h3>
                        <p>admin@uatravellers.com</p>
                    </div>
                </div>
            </div>
            <div class="contactform">
                <form>
                    <h2>Send Message</h2>
                    <div class="inputBox">
                        <input type="text" name="" placeholder="Name" required="required">
                    </div>
                    <div class="inputBox">
                        <input type="text" name="" placeholder="Email" required="required">
                    </div>
                    <div class="inputBox">
                        <textarea  placeholder="Type your Message..." required="required"></textarea>
                    </div>
                    <div class="button">
                        <input type="submit" name="" value="">
                    </div>
                </form>
            </div>
        </div>
    </section>
</body>
</html>
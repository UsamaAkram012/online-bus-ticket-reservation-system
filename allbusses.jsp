<%@ page language = "java" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "serviceData.Service" %>
<%
    ArrayList<Service> data=(ArrayList) request.getAttribute("data");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Buses</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="allbusses.css">
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
        <form>
            <div class="container">
                <table class=" table table-success table-striped">
                    <thead class="table-light">
                        <th>Name</th>
                        <th>Departure City</th>
                        <th>Arrival City</th>
                        <th>Departure Time</th>
                        <th>Available Seats</th>
                        <th>Fare</th>
                    </thead>
                    <tbody>
                        <%
                            for(int i=0;i<data.size();i++){
                                Service obj=(Service) data.get(i);
                        %>
                        <tr>
                            <td><%=obj.getName()%></td>
                            <td><%=obj.getdepartureCity()%></td>
                            <td><%=obj.getarrivalCity()%></td>
                            <td><%=obj.getdepartureTime()%></td>
                            <td><%=obj.getavailableSeats()%></td>
                            <td><%=obj.getfare()%></td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>    
        </form>
    </section>    
    
</body>
</html>
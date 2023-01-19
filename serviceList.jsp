<%@ page language = "java" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "serviceData.*" %>
<%
    ArrayList<Service> data=(ArrayList) request.getAttribute("data");
%>
<% 
String pemail= (String)session.getAttribute("email");
%>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Services List</title>
    <link rel="stylesheet" type="text/css" href="table.css">
    <link href='https://fonts.googleapis.com/css?family=Aclonica' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Allerta Stencil' rel='stylesheet'>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link href='https://fonts.googleapis.com/css?family=Nova Flat' rel='stylesheet'>
</head>
    <body>
        <nav>
            <div class="logo">
                <img src="images/logo.png" width="200">
            </div>
        </nav>
        <section class="about">
            <div class="container1"><h1>Your All Services</h1></div>
            <div class="container">
                <table class="table table-success table-striped">
                    <thead class="table-light">
                        <th>
                            Email
                        </th>
                        <th>
                            Departure City
                        </th>
                        <th>
                            Arrival City
                        </th>
                        <th>
                            Departure Time
                        </th>
                        <th>
                            
                        </th>
                    </thead>
                    <tbody>
                        <%
                            for(int i=0;i<data.size();i++){
                                Service obj=(Service) data.get(i);
                        %>
                        <tr>
                            <td>
                                <%=
                                    obj.getEmail()
                                %>
                            </td>
                            <td>
                                <%=
                                    obj.getdepartureCity()
                                %>
                            </td>
                            <td>
                                <%=
                                    obj.getarrivalCity()
                                %>
                            </td>
                            <td>
                                <%=
                                    obj.getdepartureTime()
                                %>
                            </td>
                            <td>
                            <form action="CancelService" method="post">
                                    <button type="submit" value="<%= obj.getEmail() %>" name="email">Cancel Now</button>
                                        <input name="time" value="<%= obj.getdepartureTime() %>" type="hidden"/>
                                            <input name="cemail" value="<%= pemail %>" type="hidden"/>
                                </form>                    
                            </td>

                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
        <section>    
    </body>
</html>
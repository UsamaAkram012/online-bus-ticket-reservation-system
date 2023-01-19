import java.io.*;
import java.sql.*;
import java.util.*;
import serviceData.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class ConfirmBooking extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
        HttpSession session=request.getSession();
        String session_email=(String)session.getAttribute("cemail");
            if(session_email != null){
                String email=request.getParameter("email");
                String time=request.getParameter("time");
                String semail=request.getParameter("cemail");
                

                ServiceDAO serviceDAO=new ServiceDAO();
                Service result=serviceDAO.getService(email,time);
                
                BookedDAO obj=new BookedDAO();

                String pEmail=result.getEmail();
                String deptCity=result.getdepartureCity();
                String arrCity=result.getarrivalCity();
                String deptTime=result.getdepartureTime();

                Booked book=new Booked(semail,pEmail,deptCity,arrCity,deptTime);
                int rs=obj.insertBookingData(book);
                if (rs>0){
                    request.setAttribute("data","Your Booking has Confirmed");
                    RequestDispatcher rd=request.getRequestDispatcher("csuccess.jsp");
                    rd.forward(request,response);
                }
                else
                    response.sendError(404,"Booking not Confirmed; Server not responding at this moment.Try again later.");
            }
            else
                response.sendRedirect("login.jsp");
	}
}	
import java.io.*;
import java.sql.*;
import java.util.*;
import serviceData.Service;

import javax.servlet.*;
import javax.servlet.http.*;

public class CancelBooking extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
        HttpSession session=request.getSession();
        String session_email=(String)session.getAttribute("cemail");
        if(session_email != null){
            String cemail=request.getParameter("email");
            String time=request.getParameter("time");            
            
            BookedDAO obj=new BookedDAO();

            int r=obj.deleteBookingData(cemail,time);
            if (r>0){
                request.setAttribute("data","Booking Cancel Successfully");
                RequestDispatcher rd=request.getRequestDispatcher("csuccess.jsp");
                rd.forward(request,response);
            }
            else
                response.sendError(404,"Booking can't be deleted; either booking has passed check-in time or server not responding. Try again later.");
        }
         else
            response.sendRedirect("login.jsp");
	}
}	
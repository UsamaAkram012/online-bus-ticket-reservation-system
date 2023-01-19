import java.io.*;
import java.sql.*;
import java.util.*;
import serviceData.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class FindingBooking extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		HttpSession session=request.getSession();
		String session_email=(String)session.getAttribute("cemail");
			if(session_email != null){
				String dept_city=request.getParameter("departureCity");
				String arr_city=request.getParameter("arrivalCity");
				
				Booked b=new Booked();
				b.setdepartureCity(dept_city);
				b.setarrivalCity(arr_city);
				
				BookedDAO obj=new BookedDAO();
				request.setAttribute("data",obj.getProviders(b));
				RequestDispatcher rd=request.getRequestDispatcher("providerList.jsp");
				rd.forward(request,response);
					}
			else
				response.sendRedirect("login.jsp");
	}
}	
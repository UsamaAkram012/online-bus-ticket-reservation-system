import java.io.*;
import java.sql.*;
import java.util.*;
import serviceData.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class FindingDelBooking extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		HttpSession session=request.getSession(false);
		String session_email=(String)session.getAttribute("cemail");
			if(session_email != null){
				String email=request.getParameter("email");
				Booked b=new Booked();
				b.setcEmail(email);
				
				BookedDAO obj=new BookedDAO();
				request.setAttribute("data",obj.getAllBooking(b));
				RequestDispatcher rd=request.getRequestDispatcher("bookingList.jsp");
				rd.forward(request,response);
			}
			else
				response.sendRedirect("login.jsp");
	}
}	
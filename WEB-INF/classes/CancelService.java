import java.io.*;
import java.sql.*;
import java.util.*;
import serviceData.Service;

import javax.servlet.*;
import javax.servlet.http.*;
public class CancelService extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		HttpSession session=request.getSession(false);
		String session_email=(String)session.getAttribute("pemail");
		if(session_email != null){
			String cemail=request.getParameter("email");
			String time=request.getParameter("time");
						
			ServiceDAO obj=new ServiceDAO();

			int r=obj.deleteServiceData(cemail,time);
			if (r>0){
				request.setAttribute("data","Service Deleted Successfully");
				RequestDispatcher rd=request.getRequestDispatcher("psuccess.jsp");
				rd.forward(request,response);
			}
			else
				response.sendError(404,"Service can't be deleted; either this service has been confirmed by any customer or server not responding at this moment.Try again later.");
			}
		else
			response.sendRedirect("login.jsp");
	}
}	
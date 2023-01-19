import java.io.*;
import java.sql.*;
import java.util.*;
import serviceData.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class FindingDelService extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		HttpSession session=request.getSession(false);
		String session_email=(String)session.getAttribute("pemail");
			if(session_email != null){
				String email=request.getParameter("email");
				Service b=new Service();
				b.setEmail(email);
				
				ServiceDAO obj=new ServiceDAO();
				request.setAttribute("data",obj.getAllService(b));
				RequestDispatcher rd=request.getRequestDispatcher("serviceList.jsp");
				rd.forward(request,response);
			}
			else
				response.sendRedirect("login.jsp");
	}
}	
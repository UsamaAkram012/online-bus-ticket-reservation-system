import java.io.*;
import java.sql.*;
import serviceData.Service;

import javax.servlet.*;
import javax.servlet.http.*;

public class AddingService extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		HttpSession session=request.getSession(false);
		String session_email=(String)session.getAttribute("pemail");
			if(session_email != null){
				// String email=request.getParameter("pEmail");
				String dept_city=request.getParameter("departureCity");
				String arr_city=request.getParameter("arrivalCity");
				String name=request.getParameter("pName");
				String dept_time=request.getParameter("departureTime");
				int total_seat=Integer.parseInt(request.getParameter("totalSeat"));
				int fare=Integer.parseInt(request.getParameter("fare"));

				Service ser=new Service();
				ser.setEmail(session_email);
				ser.setName(name);
				ser.setdepartureCity(dept_city);
				ser.setarrivalCity(arr_city);
				ser.setdepartureTime(dept_time);
				ser.settotalSeat(total_seat);
				ser.setfare(fare);

				ServiceDAO obj=new ServiceDAO();
				int result=obj.insertServiceData(ser);
				if (result>0){
					request.setAttribute("data","Service Added Successfully");
					RequestDispatcher rd=request.getRequestDispatcher("psuccess.jsp");
					rd.forward(request,response);
				}
				else
					response.sendError(404,"Service can't be added; either this service exists already or server not responding at this moment. Try again later.");
			}
	else
		 response.sendRedirect("login.jsp");
    }
	
}	
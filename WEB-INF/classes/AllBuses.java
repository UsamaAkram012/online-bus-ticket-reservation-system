import java.io.*;
import java.sql.*;
import java.util.*;
import serviceData.Service;

import javax.servlet.*;
import javax.servlet.http.*;

public class AllBuses extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
	
		BookedDAO obj=new BookedDAO();
		request.setAttribute("data",obj.getBuses());
		RequestDispatcher rd=request.getRequestDispatcher("allbusses.jsp");
		rd.forward(request,response);

	}
}	
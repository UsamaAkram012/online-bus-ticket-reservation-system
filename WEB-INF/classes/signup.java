import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class signup extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
	    String email=request.getParameter("email");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String module=request.getParameter("module");

		Customer cust=new Customer();
		cust.setEmail(email);
		cust.setName(name);
		cust.setPassword(password);

		ServiceProvider sp=new ServiceProvider();
		sp.setEmail(email);
		sp.setName(name);
		sp.setPassword(password);

		if(module.equals("customer")){
			CustomerDAO obj=new CustomerDAO();
			int result=obj.insertCustomerData(cust);
			if(result>0){
				response.sendRedirect("login.jsp");
			}
			else
				response.sendError(404,"User already exists");
		}
		if(module.equals("serviceProvider")){
			ServiceProviderDAO obj=new ServiceProviderDAO();
			int result=obj.insertServiceProviderData(sp);
			if(result>0){
				response.sendRedirect("login.jsp");
			}
			else
				response.sendError(404,"User already exists");
		}

	}
}	
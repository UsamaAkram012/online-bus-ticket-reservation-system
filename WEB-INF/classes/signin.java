import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class signin extends HttpServlet{
	Connection con;
	Statement st;
	ResultSet rs;
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
	    String email=request.getParameter("email");
		String password=request.getParameter("password");
		String module=request.getParameter("module");	

		if(module.equals("customer")){
			Customer cust=new Customer();
				CustomerDAO obj=new CustomerDAO();
				Customer result=obj.obtainCustomerData(email,password);
				if(result==null){
					response.sendError(404,"User not found");
				}
				else{
					HttpSession session=request.getSession();
					session.setAttribute("cemail", email);
					session.setAttribute("name", result.getName());
					response.sendRedirect(request.getContextPath() + "/customer_dashboard.jsp");
					}
		}

		if(module.equals("serviceProvider")){
			ServiceProvider ser=new ServiceProvider();
				ServiceProviderDAO obj=new ServiceProviderDAO();
				ServiceProvider result=obj.obtainServiceProviderData(email,password);
				if(result==null){
					response.sendError(404,"User not found");
				}
				else{
					HttpSession session=request.getSession();
					session.setAttribute("pemail", email);
					session.setAttribute("name", result.getName());
					response.sendRedirect(request.getContextPath() + "/provider_dashboard.jsp");
					}
		}

	} 
}
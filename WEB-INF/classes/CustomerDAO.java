import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletContext;

class CustomerDAO{
    Connection con;
	Statement st;

    public CustomerDAO(){
		String c="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/bookingms1";
		String un="root";
		String up="root";
		try{
	    	Class.forName(c);
	    	con=DriverManager.getConnection(url,un,up);
	    	st=con.createStatement();


	    }catch(SQLException sqex){
	    	 System.out.println(sqex);
	    }
	    catch(Exception ex){
	    	 System.out.println(ex);
        }
    }

    public int insertCustomerData(Customer obj){
        String email=obj.getEmail();
		String name=obj.getName();
		String passward=obj.getPassword();
		int rs=0;
			String query="insert into customer values('"+email+"', '"+name+"','"+passward+"' )";
		try{
			 rs = st.executeUpdate( query );
		}
        catch(SQLException sqex){
			System.out.println("user already exists");
		}
		catch(Exception ex){
	    	 System.out.println(ex);
	    }
        return rs;
    }

	public Customer obtainCustomerData(String email,String password){	
			String cquery="Select * from customer where cEmail='"+email+"' and binary cPassword='"+password+"' ";
			Customer obj=null;
			try{
     			ResultSet rs = st.executeQuery( cquery );
		    	if(rs.next()==true){
					obj=new Customer();
					obj.setEmail(rs.getString("cEmail"));
					obj.setName(rs.getString("cName"));
					obj.setPassword(rs.getString("cPassword"));
				}
     	    }
			catch(SQLException sqex){
				System.out.println(sqex);
			}
			catch(Exception ex){
				System.out.println(ex);
			}
			return obj;
    }

}
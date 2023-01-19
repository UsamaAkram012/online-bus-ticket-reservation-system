import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;
// import javax.servlet.ServletContext;

class ServiceProviderDAO{
    Connection con;
	Statement st;

    public ServiceProviderDAO(){
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

    public int insertServiceProviderData(ServiceProvider obj){
        String email=obj.getEmail();
		String name=obj.getName();
		String passward=obj.getPassword();
		int rs=0;
			String query="insert into serviceprovider values('"+email+"', '"+name+"','"+passward+"' )";
		try{
			 rs = st.executeUpdate( query );
		}
        catch(SQLException sqex){
		}
		catch(Exception ex){
	    	 System.out.println(ex);
	    }
        return rs;
    }

	public ServiceProvider obtainServiceProviderData(String email,String password){	
			String query="Select * from serviceprovider where pEmail='"+email+"' and binary pPassword='"+password+"' ";
			ServiceProvider obj=null;
			try{
     			ResultSet rs = st.executeQuery(query);
		    	if(rs.next()==true){
					obj=new ServiceProvider();
					obj.setEmail(rs.getString("pEmail"));
					obj.setName(rs.getString("pName"));
					obj.setPassword(rs.getString("pPassword"));
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
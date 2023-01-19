import java.io.*;
import java.sql.*;
import java.util.*;
import serviceData.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletContext;

class ServiceDAO{
    Connection con;
	Statement st;

    public ServiceDAO(){
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

    public int insertServiceData(Service obj){
        String email=obj.getEmail();
		String name=obj.getName();
        String dept_city=obj.getdepartureCity();
        String arr_city=obj.getarrivalCity();
        String dept_time=obj.getdepartureTime();
        int total_seat=obj.gettotalSeat();
        int fare=obj.getfare();
		System.out.println(name+email+fare);

		int rs=0;
			String query="insert into service values('"+email+"', '"+dept_city+"','"+arr_city+"','"+total_seat+"','"+total_seat+"','"+fare+"','"+name+"','"+dept_time+"' )";
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

	public int deleteServiceData(String email,String time){
        
		int rs=0;
		try{
			String query="delete from service where pEmail= '"+email+"' and departureTime='"+time+"'";
			 rs = st.executeUpdate( query );
		}
        catch(SQLException sqex){
		}
		catch(Exception ex){
	    	 System.out.println(ex);
	    }
        return rs;
    }

	public List<Service> getAllService(Service obj){
		String email=obj.getEmail();
		ResultSet rs=null;
		List<Service> data=new ArrayList<Service>();
		String query="select * from service where pEmail ='"+email+"'";
		try{
			 rs = st.executeQuery(query);
			 while(rs.next()){
				 Service result=new Service();
				 result.setEmail(rs.getString(1));
				 result.setdepartureCity(rs.getString(2));
				 result.setarrivalCity(rs.getString(3));
				 result.settotalSeat(rs.getInt(4));
				 result.setavailableSeats(rs.getInt(5));
				 result.setfare(rs.getInt(6));
				 result.setName(rs.getString(7));
				 result.setdepartureTime(rs.getString(8));
				 data.add(result);
			 }
		}
        catch(SQLException sqex){
		}
		catch(Exception ex){
	    	 System.out.println(ex);
	    }
			return data;

	} 

	 public Service getService(String email,String time){
		ResultSet rs=null;
		Service result=new Service();
		String query="select * from service where pEmail ='"+email+"' and departureTime = '"+time+"'";
		try{
			 rs = st.executeQuery(query);
			 while(rs.next()){
				 result.setEmail(rs.getString(1));
				 result.setdepartureCity(rs.getString(2));
				 result.setarrivalCity(rs.getString(3));
				 result.setdepartureTime(rs.getString(8));
			 }
		}
        catch(SQLException sqex){
		}
		catch(Exception ex){
	    	 System.out.println(ex);
	    }
			return result;
    }

}
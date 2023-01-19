import java.io.*;
import java.sql.*;
import java.util.*;
import serviceData.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletContext;

class BookedDAO{
    Connection con;
	Statement st;

    public BookedDAO(){
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

    public int insertBookingData(Booked result){
        String cemail=result.getcEmail();
        String pemail=result.getpEmail();
        String deptCity=result.getdepartureCity();
        String arrCity=result.getarrivalCity();
        String deptTime=result.getdepartureTime();
	
		int rs=0;
			String query="insert into booked values('"+cemail+"','"+pemail+"', '"+deptCity+"','"+arrCity+"','"+deptTime+"' )";
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

	public int deleteBookingData(String email,String time){
		int rs=0;
		try{
			String query="delete from booked where cEmail= '"+email+"' and departureTime='"+time+"'";
			 rs = st.executeUpdate( query );
		}
        catch(SQLException sqex){
		}
		catch(Exception ex){
	    	 System.out.println(ex);
	    }
        return rs;
    }

	public List<Service> getProviders(Booked obj){
		String dept_city=obj.getdepartureCity();
        String arr_city=obj.getarrivalCity();
		ResultSet rs=null;
		List<Service> data=new ArrayList<Service>();
		String query="select * from service where departureCity ='"+dept_city+"' and arrivalCity = '"+arr_city+"'";
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

	public List<Booked> getAllBooking(Booked obj){
		String email=obj.getcEmail();
		ResultSet rs=null;
		List<Booked> data=new ArrayList<Booked>();
		String query="select * from booked where cEmail ='"+email+"'";
		try{
			 rs = st.executeQuery(query);
			 while(rs.next()){
				 Booked result=new Booked();
				 result.setcEmail(rs.getString(1));
				 result.setpEmail(rs.getString(2));
				 result.setdepartureCity(rs.getString(3));
				 result.setarrivalCity(rs.getString(4));
				 result.setdepartureTime(rs.getString(5));
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

	public List<Service> getBuses(){
		ResultSet rs=null;
		List<Service> data=new ArrayList<Service>();
		String query="select * from service";
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
			System.out.println(sqex);
		}
		catch(Exception ex){
	    	 System.out.println(ex);
	    }
			return data;
	} 

}
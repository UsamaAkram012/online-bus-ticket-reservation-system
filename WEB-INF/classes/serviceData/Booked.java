package serviceData;
public class Booked{
    private String cEmail;
    private String pEmail;
    private String departureCity;
    private String arrivalCity;
    private String departureTime;

    public Booked(){
        cEmail="";
        pEmail="";
        departureCity="";
        arrivalCity="";
        departureTime="";    
    }
    public Booked(String e,String e2,String dc,String ac,String dt){
        cEmail=e;
        pEmail=e2;
        departureCity=dc;
        arrivalCity=ac;
        departureTime=dt;    
    }
    public void setcEmail(String e){
        this.cEmail=e;
    } 
    public void setpEmail(String e2){
        this.pEmail=e2;
    } 
    public void setdepartureCity(String dc){
        this.departureCity=dc;
    }
    public void setarrivalCity(String ac){
        this.arrivalCity=ac;
    } 
    public void setdepartureTime(String dt){
        this.departureTime=dt;
    }  

    
    public String getcEmail(){
        return this.cEmail;
    }
    public String getpEmail(){
        return this.pEmail;
    }
    public String getdepartureCity(){
        return this.departureCity;
    }
    public String getarrivalCity(){
        return this.arrivalCity;
    }
    public String getdepartureTime(){
        return this.departureTime;
    }
    
} 
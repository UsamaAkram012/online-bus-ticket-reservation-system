package serviceData;
public class Service{
    private String pEmail;
    private String pName;
    private String departureCity;
    private String arrivalCity;
    private String departureTime;
    private int totalSeat;
    private int availableSeats;
    private int fare;

    public Service(){
        pEmail="";
        pName="";
        departureCity="";
        arrivalCity="";
        departureTime=""; 
        totalSeat=0;
        availableSeats=0;
        fare=0;   
    }
    public Service(String e2,String dc,String ac,int ts,int as,int f,String n,String dt){
        pEmail=e2;
        pName=n;
        departureCity=dc;
        arrivalCity=ac;
        departureTime=dt; 
        totalSeat=ts;
        availableSeats=as;
        fare=f;   
    }
    public void setEmail(String e2){
        this.pEmail=e2;
    } 
    public void setName(String n){
        this.pName=n;
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
    public void settotalSeat(int ts){
        this.totalSeat=ts;
    }public void setavailableSeats(int as){
        this.availableSeats=as;
    }
    public void setfare(int f){
        this.fare=f;
    }  



    public String getEmail(){
        return this.pEmail;
    }
    public String getName(){
        return this.pName;
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
      public int gettotalSeat(){
        return this.totalSeat;
    }
      public int getavailableSeats(){
        return this.availableSeats;
    }
      public int getfare(){
        return this.fare;
    }
    
} 
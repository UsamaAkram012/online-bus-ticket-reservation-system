class ServiceProvider{
    private String pEmail;
    private String pName;
    private String pPassword;
    
    public ServiceProvider(){
        pEmail="";
        pName="";
        pPassword="";
    }
    public ServiceProvider(String e,String n,String p){
        pEmail=e;
        pName=n;
        pPassword=p;
    }
    public void setEmail(String e){
        this.pEmail=e;
    } 
    public void setName(String n){
        this.pName=n;
    } 
    public void setPassword(String p){
        this.pPassword=p;
    } 
    public String getEmail(){
        return this.pEmail;
    }
    public String getName(){
        return this.pName;
    }
    public String getPassword(){
        return this.pPassword;
    }
    
} 
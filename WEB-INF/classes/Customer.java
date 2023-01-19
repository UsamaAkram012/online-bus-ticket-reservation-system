class Customer{
    private String cEmail;
    private String cName;
    private String cPassword;

    public Customer(){
        cEmail="";
        cName="";
        cPassword="";
    }
    public Customer(String e,String n,String p){
        cEmail=e;
        cName=n;
        cPassword=p;
    }
    public void setEmail(String e){
        this.cEmail=e;
    } 
    public void setName(String n){
        this.cName=n;
    } 
    public void setPassword(String p){
        this.cPassword=p;
    } 
    public String getEmail(){
        return this.cEmail;
    }
    public String getName(){
        return this.cName;
    }
    public String getPassword(){
        return this.cPassword;
    }
    
} 
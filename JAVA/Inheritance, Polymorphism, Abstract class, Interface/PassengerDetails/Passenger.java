public class Passenger{
    
    private int ticketid;
    private String name,gender,address;
    
    public int getTicketid(){
        return ticketid;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String getAddress(){
        return address;
    }
    public void setTicketid(int id){
        this.ticketid=id;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setGender(String g){
        this.gender=g;
    }
    public void setAddress(String a){
        this.address=a;
    }
    public Passenger(int i,String n,String g,String a){
        this.ticketid=i;
        this.name=n;
        this.gender=g;
        this.address=a;
    }
    public String toString(){
        return "ticketid:"+ticketid+",name:"+name+",gender:"+gender+",address:"+address;
    }
}
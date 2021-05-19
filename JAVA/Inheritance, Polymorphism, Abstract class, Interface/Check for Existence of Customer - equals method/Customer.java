public class Customer{
    
    private String name,panno,emailid;
    private int salary;
    
    public Customer(String n,String p,String e,int sal){
        this.name=n;
        this.panno=p;
        this.emailid=e;
        this.salary=sal;
    }
    
    public boolean equals(Object o){
        Customer c=(Customer) o;
        if(this.panno.equals(c.getPanno()) && this.emailid.equals(c.getEmailid()))
            return true;
        else
            return false;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPanno(String p){
        this.panno=p;
    }
    public String getPanno(){
        return panno;
    }
    public void setEmailid(String e){
        this.emailid=e;
    }
    public String getEmailid(){
        return emailid;
    }
    public void setSalary(int sal){
        this.salary=sal;
    }
    public int getSalary(){
        return salary;
    }
}









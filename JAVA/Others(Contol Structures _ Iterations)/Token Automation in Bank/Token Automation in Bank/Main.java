import java.util.*;
public class Main{
    public static void main (String[] args) {
        
    
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the service type for first customer:");
  String service=sc.next();
  Token t=new Token(service);
  //int anstoken=t.getTokenNumber();
  //int ansCounter=t.getCounterNumber();
  System.out.println("Your Token number is:"+t.getTokenNumber()+" and Counter number is:"+t.getCounterNumber());
  System.out.println("Enter the service type for next customer:");
  String service1=sc.next();
  Token t1=new Token(service1);
  
  System.out.println("Your Token number is:"+t1.getTokenNumber()+" and Counter number is:"+t1.getCounterNumber());
}
}
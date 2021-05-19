import java.util.*;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String service;
        System.out.println("Enter the service type for first customer:");
        service=sc.nextLine();
        
        Token t=new Token(service);
        System.out.println("Your Token number is:"+t.getTokenNumber()+" and Counter number is:"+t.getCounterNumber());
        System.out.println("Enter the service type for next customer:");
        service=sc.nextLine();
        Token t1=new Token(service);
        System.out.println("Your Token number is:"+t1.getTokenNumber()+" and Counter number is:"+t1.getCounterNumber());
    }    
}

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the units consumed");
       float u=sc.nextFloat();
       if(u<=20)
       {
           System.out.println("No Charge");
       }
       else if(u<100&&u>20)
       {    double bill=u*3.5;
           System.out.println("You have to pay Rs."+bill);
       }
       else
       {
           double bill=u*5.0;
           System.out.println("You have to pay Rs."+bill);
       }
        //Fill the code here
    }
    
}
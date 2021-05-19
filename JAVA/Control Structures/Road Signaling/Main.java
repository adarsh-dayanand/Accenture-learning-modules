
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the color");
       String col=sc.nextLine();
       if(col.equals("red"))
       {
           System.out.println("stop");
       }
       else if(col.equals("yellow"))
       {
           System.out.println("proceed with caution");
       }
       else if(col.equals("green"))
       {
           System.out.println("go");
       }
       else
       {
           System.out.println("prepare to go");
       }
        //Fill the code here
    }
    
}
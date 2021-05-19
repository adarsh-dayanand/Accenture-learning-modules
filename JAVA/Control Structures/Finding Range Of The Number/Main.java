
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
        //Fill the code here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        if(n>0&&n<=100)
        {
            System.out.println("Range of the number " +n +" is 0 to 100");
        }
        else if(n>100&&n<=200)
        {
            System.out.println("Range of the number " +n +" is 100 to 200");
        }
        else if(n>200&&n<=500)
        {
            System.out.println("Range of the number " +n +" is 200 to 500");
        }
        else
        {
            System.out.println("Entered number " +n +" is not in the expected range");
        }
    }
    
}
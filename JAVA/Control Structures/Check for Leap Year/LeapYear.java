import java.util.Scanner;
public class LeapYear
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year");
        
        int yr=sc.nextInt();
        
        if(yr>999 && yr<10000)
        {
            if(yr%4==0)
            {
                if(yr%100==0)
                {
                    if(yr%400==0)
                    {
                        System.out.println("Leap Year");
                    }
                    else
                    {
                        System.out.println("Not a Leap Year");
                    }
                }
                else
                {
                    System.out.println("Leap Year");
                }
            }
            else
            {
                System.out.println("Not a Leap Year");
            }
        }
        else
        {
            System.out.println("Invalid Year");
        }
    }
}
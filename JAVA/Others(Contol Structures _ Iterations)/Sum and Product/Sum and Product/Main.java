import java.util.*;
public class Main 
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        Main obj=new Main();
        int a=sc.nextInt();
        if(a>0)
        {
            int b=sc.nextInt();
            if(b>0)
            { int k=obj.rvs(a+b);
                if(k==a*b)
                {
                    System.out.println("You are Lucky! Here Is your Gift.");
                }
                
                else
                {
                    System.out.println("Better Luck Next Time");   
                }
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }
        
        else
        {
            System.out.println("Invalid Input");
        }
    }
     int rvs(int num)
     {int ans=0;
         while(num>0)
         {
             ans=ans*10+num%10;
             num/=10;
         }
         return ans;
     }
}
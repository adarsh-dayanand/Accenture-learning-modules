import java.util.*;
import java.lang.*;
public class FindFactor
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=Math.abs(sc.nextInt());
        if(num==0)
        {
            System.out.println("No Factors");
        }
        else
        {System.out.print("1");
            for(int i=2;i<=num;i++)
            {
                if(num%i==0)
                {
                    System.out.print(", "+i);
                }
            }
        }
    }
}
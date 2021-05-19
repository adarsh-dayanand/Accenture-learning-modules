import java.util.*;
public class Main
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        if(a<=0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Enter the second number:");
            int b=sc.nextInt();
            if(b<=0||b<=a)
            {
                System.out.println("Invalid Input");
            }
            
            else
            {
                System.out.println("Enter the number of terms:");
                int trm=sc.nextInt();
                if(trm<=0)
                {
                    System.out.println("Invalid Input");
                }
                else if(trm==1)
                {
                    System.out.print(a);
                }
                else
                {
                    System.out.print(a+", "+b);
                    int c=0;
                    for(int i=0;i<trm;i++)
                    {
                        c=a*b;
                        a=b;
                        b=c;
                        System.out.print(", "+c);
                    }
                }
            }
        }
    }
}
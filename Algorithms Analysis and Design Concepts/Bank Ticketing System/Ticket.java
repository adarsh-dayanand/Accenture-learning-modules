import java.util.*;
public class Ticket 
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of customer takes the tickets:");
        int n=sc.nextInt();
        if(n>0)
        {
            int[] tickets=new int[n];
            
            System.out.println("The tickets in the system are:");
            for(int i=0;i<n;i++)
            {
                tickets[i]=i+1;
                System.out.print(tickets[i]+" ");
            }
            System.out.println(); 
            System.out.println("Enter the number of tickets served:");
            int served=sc.nextInt();
            
            if(served>0 && served<=n)
            {
                System.out.println("The served tickets are:");
                for(int i=0;i<served;i++)
                {
                    System.out.print(tickets[i]+" ");
                }
                System.out.println();
                
                if(served!=n)
                {
                    System.out.println("The unserved tickets are:");
                    for(int i=served;i<n;i++)
                    {
                        System.out.print(tickets[i]+" ");
                    }
                }
                else
                {
                    System.out.println("No more tickets to be served");
                }
            }
           
        }
        else
        {
            System.out.println("Invalid Number");
        }
        
    }
}
import java.util.*;
public class Main
{
    public static void main (String[] args) {
        int flag=0, k=0, z=0;
        Scanner sc =new Scanner(System.in );
        System.out.println("Enter the first number");
        int f=sc.nextInt();
        System.out.println("Enter the last number");
        int l=sc.nextInt();
        for(int i=f; i<=l; i++)
        {
            for(int j=2; j<i; j++)// this loop increments flag if i is divisible by j
            {
                if(i%j==0)
                {
                    flag++;
                }
            }
            
            if(i==l && (flag!=0 || i%10!=1))//when last number is not a prime
            {
                while(z==0)
                {
                    for(int a=2; a<i; a++)
                    {
                        if(i%a==0)
                        {
                            flag++;
                        }
                    }
                    
                    if(i%10==1 && flag==0)
                    {
                        System.out.print(","+i);
                        z++;
                    }
                    flag=0;
                    i++;
                }
            }
            
            if(i%10==1 && flag==0)//to check for last digit 1 and prime
            {
                if(k==0)
                {
                    System.out.print(i);  
                    k++;
                }
                
                else
                {    
                    System.out.print(","+i);
                }
            }
            flag=0;
        }
        
    }
}
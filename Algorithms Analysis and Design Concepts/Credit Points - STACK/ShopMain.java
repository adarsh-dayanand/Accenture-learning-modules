import java.util.*;

public class ShopMain
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of users:");
        int n=sc.nextInt();
        System.out.println();
        if(n>=1 && n<=1000)
        {
            int[] a=new int[n];
            int temp=0;
            while(temp<n)
            {
                System.out.print("Enter the credit points for user "+(temp+1)+":");
                a[temp]=sc.nextInt();
                if(a[temp]>=1 && a[temp]<=100)
                {
                    temp++;
                    System.out.println();
                }
                else
                {
                    break;
                }
            }
            
            System.out.print("Enter the no. of users to serve: ");
            int k=sc.nextInt();
            
            if(k>=1 && k<n)
            {
                System.out.print("The unserved user's credit points are: ");
                for(int i=(k);i<n;i++)
                {
                    System.out.print(a[i]+" ");
                }
            }
            else if(k==n)
            {
                System.out.println("0 users to serve");
            }
            else
            {
                System.out.println("Invalid no. of users");
            }
            
        }
        else{
            System.out.println("Invalid no. of users");
        }
    }
}
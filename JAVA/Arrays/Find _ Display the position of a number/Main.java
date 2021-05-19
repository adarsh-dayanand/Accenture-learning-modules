
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        System.out.println("Enter the values");
        int[] arr=new int[50];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to find");
        int f=sc.nextInt();
        int flag=0;
        for(i=0;i<n;i++)
        {
            if(f==arr[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {   i=i+1;
            System.out.println(i);
        }
        else
        System.out.println(0);
        //Fill the code here
    }
}
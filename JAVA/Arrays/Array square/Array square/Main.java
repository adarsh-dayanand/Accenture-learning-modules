import java.util.*;
public class Main 
{
    public static void main (String[] args) {
        int i=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int arr2[]=new int[n];
        for(i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    arr2[i]+=arr[j]*arr[j];
                }
            }
        }
        
        for(i=0;i<n;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
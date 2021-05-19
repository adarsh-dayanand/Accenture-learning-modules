import java.util.*;
public class Sum 
{
    int max(int[] arr)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    
    int min(int[] arr)
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Sum obj=new Sum();
        
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        
        if(n>0)
        {
            int[] arr=new int[n];
            
            System.out.println("Enter the elements:");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            System.out.println(obj.max(arr)+obj.min(arr));
        }
        else
        {
            System.out.println("Invalid Array Size");
        }
        
        
        
    }
}
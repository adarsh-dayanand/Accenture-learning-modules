import java.util.*;
public class ArraySort 
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
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
                
                int[] arr1=Arrays.copyOfRange(arr,      0,   (n+1)/2);
                int[] arr2=Arrays.copyOfRange(arr,  (n+1)/2,    n   );
                
                Arrays.sort(arr1);
                //Arrays.sort(arr2, Collections.reverseOrder());
                
                for(int i=0;i<n/2;i++)
                {
                    for(int j=0;j<(n/2)-1;j++)
                    {
                        if(arr2[j]<arr2[j+1])
                        {
                            int temp=arr2[j];
                            arr2[j]=arr2[j+1];
                            arr2[j+1]=temp;
                        }
                    }
                }
                
                int len2=arr1.length+arr2.length;
                int[] res=new int[len2];
                
                System.arraycopy(arr1, 0, res,      0,  (n+1)/2 );
                System.arraycopy(arr2, 0, res, (n+1)/2,     n/2   );
                
                for(int i : res)
                {
                    System.out.println(i);
                }
            }
            else
            {
                System.out.println("Array size should be greater than 0");
            }
    }
}
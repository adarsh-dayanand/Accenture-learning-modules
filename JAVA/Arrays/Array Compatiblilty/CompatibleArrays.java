import java.util.*;
public class CompatibleArrays 
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        //1st array
        System.out.println("Enter the size for First array:");
        int n1=sc.nextInt();
        int flag=0;
        if(n1>0)
        {
            int[] arr1=new int[n1];
            
            System.out.println("Enter the elements for First array:");
            for(int i=0;i<n1;i++)
            {
                arr1[i]=sc.nextInt();
            }
            
            //2nd array
            System.out.println("Enter the size for Second array:");
            int n2=sc.nextInt();
            if(n2>0)
            {
                    int[] arr2=new int[n2];
                    
                    System.out.println("Enter the elements for Second array:");
                    for(int i=0;i<n2;i++)
                    {
                        arr2[i]=sc.nextInt();
                    }
                    
                    if(n1==n2)
                    {
                        for(int i=0; i<n1;i++)
                        {
                            if(arr1[i]>=arr2[i])
                            {
                                flag++;
                            }
                        }
                        
                        if(flag==n1)
                        {
                            System.out.println("Arrays are Compatible");
                        }
                        else
                        {
                            System.out.println("Arrays are not Compatible");
                        }
                        
                    }
                    else
                    {
                        System.out.println("Arrays are Not Compatible");
                    }
            }
            else
            {
                System.out.println("Invalid array size");
            }
        }
        else
        {
            System.out.println("Invalid array size");
        }
    }
}
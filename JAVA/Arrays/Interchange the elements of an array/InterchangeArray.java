import java.util.Scanner;

public class InterchangeArray{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int Size1,Size2, i ;
        
        System.out.println("Enter the number of elements in the first array :");
        Size1 = sc.nextInt();
        if(Size1<=0)
        {
            System.out.println("Invalid range");
            return;
        }
        int [] a = new int[Size1];
        System.out.println("Enter the elements in the first array");
        for(i=0;i<Size1;i++)
        {
            a[i] = sc.nextInt();
            if(a[i]<=0)
            {
                System.out.println("Invalid range");
                return;
            }
        }
        
        System.out.println("Enter the number of elements in the second array :");
        Size2 = sc.nextInt();
        if(Size2<=0)
        {
            System.out.println("Invalid Range");
            return;
        }
        if(Size1 != Size2)
        {
            System.out.println("Unable to swap size differs");
            return;
        }
        int[] b = new int[Size2];
        System.out.println("Enter the elements in the second array");
        for(i=0;i<Size2;i++)
        {
            b[i] = sc.nextInt();
            if(b[i]<=0)
            {
                System.out.println("Invalid range");
                return;
            }
        }
        
        for(i=0;i<Size1;i++)
        {
            a[i] = a[i] + b[i];
            b[i] = a[i] - b[i];
            a[i] = a[i] - b[i];
        }
        
        System.out.println("The first array after swapping is :");
        printAttay(a,Size1);
        System.out.println("\nThe second array after swapping is :");
        printAttay(b,Size2);
    }
    
    public static void printAttay(int[] arr, int size)
    {
        for(int x : arr)
            System.out.print(x+" ");
    }
}
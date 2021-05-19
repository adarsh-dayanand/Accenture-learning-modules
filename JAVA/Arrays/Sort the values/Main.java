import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the array size \n");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i]);
            System.out.println("\n");
        }
        System.out.print(a[n - 1]);
    }
}
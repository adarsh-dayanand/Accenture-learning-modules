import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int n, res,i,j=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the array size \n");
        n = s.nextInt();
        int array[] = new int[n];
        int rev[] = new int[n];
        System.out.println("Enter the values");
        for( i=0; i < n; i++)
        {
            array[i] = s.nextInt();
        }
        for( i=n;i>0 ; i--,j++)
        {
            rev[j] = array[i-1];
            System.out.println(rev[j]);
    
        }
    }
}
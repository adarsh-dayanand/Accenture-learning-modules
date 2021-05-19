import java.util.Scanner;

public class Main
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = in.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        long sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(+ arr[i]);
        }
    }
}
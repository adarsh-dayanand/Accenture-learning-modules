import java.util.Scanner;

public class Highestmark{
    
    static int findMax(int arr[], int low, int high)
    {
        int max = arr[low];
        for(int i=low; i<=high; i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[6];
        for(int j=0;j<6;j++)
        {
            arr[j] = sc.nextInt();
            if(arr[j]<0)
            {
                System.out.println("Invalid Mark");
                return;
            }
        }
        System.out.println("Highest mark is "+findMax(arr,0,5));
    }
}
import java.util.*;

public class DuplicateElement{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        if(n>0){
            int[] a=new int[n+1];
            System.out.println("Enter the array elements:");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Enter the position of the element to be replicated:");
            int k=sc.nextInt();
            if(k<n){
                a[n]=a[k];
                for(int i=0;i<=n;i++){
                    System.out.println(a[i]);
                }
            }
            else{
                System.out.println("Position is greater than the size of an array");
            }
        }
        else{
            System.out.println("Invalid array size");
        }
    }
}
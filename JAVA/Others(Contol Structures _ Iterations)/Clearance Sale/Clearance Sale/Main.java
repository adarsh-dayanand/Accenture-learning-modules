import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the Item:");
        String str=sc.nextLine();
        System.out.println("Enter the price of the item:");
        int p=sc.nextInt();
        System.out.println("Enter the number of items for sale:");
        int n=sc.nextInt();
        int sum=0;
        int x=n;
        int[] k=new int[n];
        for(int i=1;x>0;i++){
            System.out.printf("Enter the number of items sold on Day%d:",i);
            k[i]=sc.nextInt();
            x=x-k[i];
        }
        //int w=k.length;
        System.out.println(str);
        int j=1;
        System.out.println("Day No. of items_available Price");
        for(int i=n;i>0;i--){
            System.out.println("Day"+j+" "+i+" "+p);
            sum=sum+p*k[j];
            if(i<=1)
            break;
            i=i-k[j]+1;
            j++;
            p=(int)(p-0.07*p);
        }
        System.out.println("Total amount of Sales = Rs."+sum);
        
    }
}
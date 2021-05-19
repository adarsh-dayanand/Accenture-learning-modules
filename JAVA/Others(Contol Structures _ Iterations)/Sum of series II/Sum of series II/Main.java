import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n=sc.nextInt();
        System.out.println("Enter the number of terms:");
        int t=sc.nextInt();
        int sum=0;
        for(int i=n;i<t+n;i++){
            sum+=i*(i+1)*(i+2);
        }
        System.out.println(sum);
    }
}
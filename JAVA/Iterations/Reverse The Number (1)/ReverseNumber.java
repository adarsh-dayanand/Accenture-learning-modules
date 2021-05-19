import java.util.*;
public class ReverseNumber{
    public static void main(String args[]){
        int d=0,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Number should be positive");
        }
        else if(n==0){
            System.out.println("Output is:0");
        }
        else{
            while(n>0){
                d=n%10;
                rev=rev*10+d;
                n=n/10;
            }
            System.out.println("Output is:"+rev);
        }
        
    }
}
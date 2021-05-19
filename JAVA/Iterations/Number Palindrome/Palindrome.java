import java.io.*;
import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        int rev=0,d=0,temp;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        temp=num;
        if(num<0){
            System.out.println("Invalid Input");
        }
        else{
            while(num>0){
                d=num%10;
                rev=(rev*10)+d;
                 num=num/10;
            }
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        }
        
    }
}
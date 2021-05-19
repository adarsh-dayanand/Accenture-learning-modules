import java.io.*;
import java.util.*;
public class Triangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for side1");
        int s1=sc.nextInt();
        System.out.println("Enter the value for side2");
        int s2=sc.nextInt();
        System.out.println("Enter the value for side3");
        int s3=sc.nextInt();
        if(s1<=0 || s2<=0 || s3<=0){
            System.out.println("Invalid Input");
            
        }
        else{
            int d=s1+s2;
            int e=s2+s3;
            int f=s3+s1;
            if((d>s3)&&(e>s1)&&(f>s2)){
                System.out.println("Sides form a Triangle");
            }
            else{
                System.out.println("Sides does not form a Triangle");
            }
        }
    }
}
import java.util.*;
import java.io.*;
public class IncomeCal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of hours worked in a day:");
        int hr=sc.nextInt();
        if(hr>=0 && hr<=24){
            int total=(hr * 100 * 365);
            System.out.println("Total income in a year:"+total);
        }
        else{
            System.out.println("Unable to calculate the earnings");
        }
    }
}
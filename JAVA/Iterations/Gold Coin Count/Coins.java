import java.util.*;
import java.io.*;
public class Coins{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        if(age>0){
            System.out.println("Meenu gets "+(age*age*age)+" coins");
        }
        else{
            System.out.println("Invalid Age");
        }
    }
}
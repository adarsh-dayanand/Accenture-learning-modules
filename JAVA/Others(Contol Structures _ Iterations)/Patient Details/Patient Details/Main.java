import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("Enter age:");
        int age=sc.nextInt();
        System.out.println("Enter Gender('M' or 'F'):");
        String gender=sc.next();
        System.out.println("Enter Weight:");
        float weight=sc.nextFloat();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.printf("Weight: %.2f",weight);
    }
}
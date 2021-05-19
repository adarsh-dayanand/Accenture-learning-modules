import java.util.*;
import java.io.*;
public class Customer{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter age:");
        int age=sc.nextInt();
        System.out.println("Enter gender:");
        String gender=sc.next();
        sc.nextLine();
        System.out.println("Hailing from:");
        String from=sc.nextLine();
        System.out.println("Welcome," +name+"!");
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("City:"+from);
    }
}
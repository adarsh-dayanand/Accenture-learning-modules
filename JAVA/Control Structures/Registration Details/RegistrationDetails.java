import java.util.*;
import java.io.*;
import java.lang.*;
public class RegistrationDetails{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your phoneno:");
        String  phone=sc.next();
        System.out.println("Enter your qualification:");
        sc.nextLine();
        String qual=sc.nextLine();
        System.out.println("Enter your email id[Please provide valid id, after registering your registration id will be mailed]:");
        String email=sc.nextLine();
        System.out.println("Enter your noofexperience[if any]:");
        double experience=sc.nextDouble();
        System.out.printf("Dear %s, Thanks for registering in our portal, registration id will be mailed to %s within 2 working days",name,email);
    }
}
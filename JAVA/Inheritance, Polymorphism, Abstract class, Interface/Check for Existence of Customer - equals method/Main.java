import java.util.*;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("Enter the panno:");
        String pan=sc.nextLine();
        System.out.println("Enter the emailid:");
        String emailid=sc.nextLine();
        System.out.println("Enter the salary:");
        int sal=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        String name1=sc.nextLine();
        System.out.println("Enter the panno:");
        String pan1=sc.nextLine();
        System.out.println("Enter the emailid:");
        String emailid1=sc.nextLine();
        System.out.println("Enter the salary:");
        int sal1=sc.nextInt();
        
        Customer c=new Customer(name,pan,emailid,sal);
        Customer c1=new Customer(name1,pan1,emailid1,sal1);
        boolean ans=c1.equals(c);
        if(ans==true)
            System.out.println("Both the objects are equal.");
        else 
            System.out.println("Both the objects are not equal.");
    }
}
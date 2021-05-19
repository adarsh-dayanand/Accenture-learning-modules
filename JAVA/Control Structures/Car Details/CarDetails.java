import java.util.*;
import java.io.*;
public class CarDetails{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the car name:");
        String name=sc.nextLine();
        System.out.println("Enter the car no:");
        int no=sc.nextInt();
        System.out.println("Enter the price:");
        double price=sc.nextDouble();
        System.out.println("Carname:"+name);
        System.out.println("Carno:"+no);
        System.out.printf("Price:%.2f rs only",price);
    }
}
import java.lang.Math;
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the area of terrace");
        int area=sc.nextInt();
        if(area<=0){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println("Enter the diameter of the pot");
            int dia=sc.nextInt();
            if(dia<=0){
                System.out.println("Invalid Input");
            }
            else if(dia>area){
                System.out.println("Invalid Input");
            }
            else{
                double d=(Math.sqrt(area));
                double total=(d/dia)*12;
                System.out.println(Math.round(total));
            }
        }
    }
}
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        float qua=sc.nextFloat();
        if(qua<=0){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println("Enter the distance covered");
            int distance=sc.nextInt();
            if(distance<=0){
                System.out.println("Invalid Input");
            }
            else{
                float  l=(distance/qua);
                double c=(100/l);
                double m=(235.215/c);
                System.out.printf("Liters/100KM %.2f\n",c);
                System.out.printf("Miles/gallons %.2f",m);
            }
        }
    }
}
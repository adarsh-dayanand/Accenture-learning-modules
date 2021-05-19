import java.io.*;
import java.util.*;
public class Gain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Price of old scooter:");
        double old=sc.nextDouble();
        System.out.println("The amount spent for repair:");
        double pair=sc.nextDouble();
        System.out.println("Sold Price:");
        double sold=sc.nextDouble();
        if(old<=0){
            System.out.println("Incorrect Inputs");
        }
        else if(pair<0){
            System.out.println("Incorrect Inputs");
        }
        else if(sold<=0){
            System.out.println("Incorrect Inputs");
        }
        else if(sold<(old+pair)){
            System.out.println("Unable to calculate Gain Percentage");
            
        }
        else{
            double g=0,l=0;
            g=sold-(old+pair);
            l=(g*100)/(old+pair);
            if(l>=0){
                System.out.printf("Gain percentage is %.2f",l);
            }
        }
    }
}
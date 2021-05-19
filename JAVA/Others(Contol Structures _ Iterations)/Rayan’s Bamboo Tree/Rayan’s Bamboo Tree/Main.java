import java.util.*;
import java.io.*;
import java.lang.Math;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int feet=sc.nextInt();
        int count=0;
        int i=3;
        int s=0;
        if(feet<0){
            System.out.println("Bamboo height cannot be negative");
        }
        else if(feet==0){
            System.out.println("Bamboo height cannot be zero");
        }
        else if(feet>10000){
            System.out.println("Bamboo cannot grow more than 10000 feet");
        }
        else{
            while(i<feet){
                i=i*2;
                s=i;
                count+=1;
            }
            if(s==feet){
                System.out.printf("It will take %d years for the Bamboo tree to reach a height %d feet.",count,feet);
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        
    }
}
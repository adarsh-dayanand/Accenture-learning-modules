import java.io.*;
import java.util.*;
public class IncrementCalculation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        int sal=sc.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        float rate=sc.nextFloat();
        if(sal>0 && rate>=1 && rate<=5){
            if(rate>=1 && rate<=3){
                sal+=((sal*10)/100);
            }
            else if(rate>=3.1 && rate<=4){
                sal+=((sal*25)/100);
            }
            else{
                sal+=((sal*30)/100);
            }
            System.out.println(sal);
       }
       else{
           System.out.println("Invalid Input");
       }
    }
}
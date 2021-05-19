import java.io.*;
import java.util.*;
public class FindNumber{
    public static void main(String args[]){
        int fact=1,x=1;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=0){
            System.out.println("Invalid Input");
            
        }
        else{
            while(fact<num){
                x=x+1;
                fact=fact*x;
            }
            if(fact==num){
                System.out.println(x);
            }
            else{
                System.out.println("Sorry,The given number is not a perfect factorial");
            }
        }
    }
}
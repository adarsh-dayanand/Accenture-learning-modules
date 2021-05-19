import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n=sc.nextInt();
        int idx=0;
        if(n==8888 || n<0){
            System.out.println("Invalid Input");
            System.exit(1);
        }
        else{
            int temp=n;
            int[] rev=new int[4];
            if(temp/1000==8){
                temp=temp-(temp/1000)*1000;
                if(temp/100==8){
                    temp=temp-(temp/100)*100;
                    if(temp/10 == 8){
                        temp=temp-(temp/10)*10;
                    }
                }
            }
            while(temp != 0){
                int rem=temp%10;
                if(rem==8){
                    rem=0;
                }
                else if(rem==9){
                    rem=1;
                }
                else{
                    rem=rem+2;
                }
                rev[idx++]=(rem);
                temp=temp/10;
            }
            System.out.print("The second number is: ");
            for(int i=idx-1;i>=0;i--){
                System.out.print(rev[i]);
            }
            
        }
    }
}
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=sc.nextInt();
        System.out.println("Enter the nth number");
        int n2=sc.nextInt();
        int sum=0;
        if(n1<0 || n2<0){
            System.out.println("Invalid Input");
        }
        else{
            for(int i=n1;i<n1+n2;i++){
                sum=sum-i;
                System.out.printf("-%d",i);
                if(i+1<n1+n2){
                    sum=sum+i+1;
                    System.out.printf("+%d",(i+1));
                }
                i++;
            }
            System.out.printf("=%d\n",sum);
            if(sum>=0){
                System.out.println("The sum of the series is a positive number");
                
            }
            else{
                System.out.println("The sum of the series is a negative number");
            }
        }
    }
}
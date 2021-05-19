import java.util.Scanner;
public class LuckyNum
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the car no:");
        int num=sc.nextInt();
        if(num<1000 || num>9999)
        {
            System.out.println(num+" is not a valid car number");
        }
        else
        {int sum=0;
            while(num>0)
            {
                sum+=num%10;
                num/=10;
            }
            if(sum%3==0 || sum%5==0 || sum%7==0)
            {
                System.out.println("Lucky Number");
            }
            else
            {
                System.out.println("Sorry its not my lucky number");
            }
        }
    }
}
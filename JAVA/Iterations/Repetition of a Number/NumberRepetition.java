import java.util.Scanner;
public class NumberRepetition
{
    public static void main (String[] args) {
        int num,key,times,r,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        num=sc.nextInt();
        System.out.println("Enter the key digit ");
        key=sc.nextInt();
        int temp=num;
        while(temp>0)
        {
            r=temp%10;
            if(r==key)
            {
                flag++;
            }
            temp/=10;
        }
        System.out.println(key+" appears "+flag+" times in "+num);
    }
}
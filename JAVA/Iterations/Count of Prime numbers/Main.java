import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting range");
        int low=sc.nextInt();
        System.out.println("Enter ending range");
        int high=sc.nextInt();
        int check,count=0;
        for(int i=low;i<=high;i++)
        {
            check=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                check++;
            }
            if(check==2)
            count++;
        }
        System.out.println(count);
    }
}
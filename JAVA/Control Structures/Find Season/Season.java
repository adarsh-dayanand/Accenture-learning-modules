import java.util.Scanner;
public class Season 
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month:");
            int mon=sc.nextInt();
            if(mon>12||mon<1)
            {
                System.out.println("Invalid month");
            }
            else if(mon>=3&&mon<=5)
            {
                System.out.println("Season:Spring");
            }
            else if(mon>=6&&mon<=8)
            {
                System.out.println("Season:Summer");
            }
            else if(mon>=9&&mon<=11)
            {
                System.out.println("Season:Autumn");
            }
            else if(mon==12||mon==1||mon==2)
            {
                System.out.println("Season:Winter");
            }
    }
}
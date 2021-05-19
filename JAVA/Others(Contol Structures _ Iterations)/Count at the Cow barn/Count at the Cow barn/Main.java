import java.util.*;
public class Main
{
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int hd=sc.nextInt();
        int lg=sc.nextInt();
        int cow=hd,men=0;
        if(lg>(hd*4))
        {
            System.out.println("Invalid Input");
        }
        else if(lg==(hd*4))
        {
            System.out.println("Number of Cows: "+hd);
            System.out.println("Number of Men: 0");
        }
        else
        {
            while(cow>0)
            {
                if(lg<cow*4)
                {
                    cow--;
                    lg-=2;
                    men++;
                }
                else if(lg==cow*4)
                {
                    break;
                }
                /*else
                {
                    System.out.println("Invalid Input");
                    break;
                }*/
            }
            System.out.println("Number of Cows: "+cow);
            System.out.println("Number of Men: "+men);
        }
    }
}
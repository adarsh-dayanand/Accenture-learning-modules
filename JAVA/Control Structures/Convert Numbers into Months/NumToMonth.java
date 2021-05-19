import java.util.*;
public class NumToMonth
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String mon[]={"January", "February", "March","April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if(n>12||n<1)
        {
            System.out.println("No month for the number "+n);
        }
        else
        {
            System.out.println(mon[n-1]);
        }
    }
}
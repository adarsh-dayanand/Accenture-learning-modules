import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        //Fill the code here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int low=sc.nextInt();
        int high=sc.nextInt();
        String sub=str.substring(low,high);
        System.out.println(sub);
    }
}
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        //Fill the code here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String c=sc.nextLine();
        String[] arr=str.split(c,-1);
        for(String a:arr)
        {
            System.out.println(a);
        }
    }
}
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        //Fill the code here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=str.length();
        if(l%2==0)
        System.out.println(l+" Even");
        else
        System.out.println(l+" Odd");
    }
}
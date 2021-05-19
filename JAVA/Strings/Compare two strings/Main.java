import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        //Fill the code here
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(str1.equalsIgnoreCase(str2))
        {
            if(str1.equals(str2))
            System.out.println("Case sensitive");
            else 
            System.out.println("Case insensitive");
        }
        else
        System.out.println("Not equal");
    }
}
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        //Fill the code here
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String sub=sc.nextLine();
        boolean isFound=str.contains(sub);
        if(isFound==true)
        System.out.println(sub+" is contained in a sentence");
        else
        System.out.println(sub+" is not contained in a sentence");
        
    }
}
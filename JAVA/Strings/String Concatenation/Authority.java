import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Authority
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Inmate's name:");
        String in_name=sc.nextLine();
        
        System.out.println("Inmate's father's name:");
        String fa_name=sc.nextLine();
        
        Pattern p=Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(in_name);
        Matcher m1=p.matcher(fa_name);
        
        if(m.find()==false && m1.find()==false)
        {
           System.out.println(((in_name.concat(" ")).concat(fa_name)).toUpperCase()); 
        }
        else
        {
            System.out.println("Invalid name");
        }
    }
}
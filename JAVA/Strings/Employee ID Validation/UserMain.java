import java.util.*;
import java.util.regex.*;

public class UserMain
{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your ID");
        String eid = s.nextLine();
        int l = eid.length();
        if (l==12)
        {
            Pattern pattern = Pattern.compile("[G]{1}[B]{1}[L]{1}/[0-9]{3}/[0-9]{4}");
            Matcher matcher = pattern.matcher(eid);
            if(matcher.matches())
            {
                System.out.println("Login success");
            }
            else
            {
                System.out.println("Incorrect ID");
            }
        }
        else
        {
            System.out.println("Incorrect ID");
        }
    }
}